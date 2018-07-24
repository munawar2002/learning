package org.amunawar.springdata;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

@Component
public class JdbcDAOImpl {

    @Autowired
    private DataSource dataSource;

    private JdbcTemplate jdbcTemplate = new JdbcTemplate();


//    public Circle getCircle(int circleId) {
//        Connection con = null;
//        try {
//            con = dataSource.getConnection();
//            PreparedStatement ps = con.prepareStatement("Select * from Circle where id = ?");
//            ps.setInt(1, circleId);
//            Circle circle = null;
//            ResultSet resultSet = ps.executeQuery();
//            if (resultSet.next()) {
//                circle = new Circle(circleId, resultSet.getString("name"));
//            }
//
//            resultSet.close();
//            ps.close();
//            return circle;
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        } finally {
//            try {
//                con.close();
//            } catch (SQLException e) {
//                e.printStackTrace();
//            }
//        }
//    }

    public Long getCircleCount(){
        String sql = "select count(*) from circle";
        jdbcTemplate.setDataSource(dataSource);
        List list = jdbcTemplate.queryForList(sql);
        Map map = (Map) list.get(0);
        return (Long) map.get("count(*)");
    }

    public String getCircleName(int circleId){
        String sql = "select name from circle where id = ?";
        jdbcTemplate.setDataSource(dataSource);
        return jdbcTemplate.queryForObject(sql,new Object[]{circleId},String.class);
    }

    public Circle getCircleForId(int circleId){
        String sql = "select * from circle where id = ?";
        jdbcTemplate.setDataSource(dataSource);
        return jdbcTemplate.queryForObject(sql,new Object[]{circleId},new CircleMapper());
    }

    public List<Circle> getAllCircles(){
        String sql = "select * from circle";
        jdbcTemplate.setDataSource(dataSource);
        return jdbcTemplate.query(sql,new CircleMapper());
    }

    public void insertCircle(Circle circle){
        String sql = "Insert into circle (ID,NAME) values (?,?)";
        jdbcTemplate.setDataSource(dataSource);
        jdbcTemplate.update(sql,new Object[]{circle.getId(),circle.getName()});
    }

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public DataSource getDataSource() {
        return dataSource;
    }

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    private static final class CircleMapper implements RowMapper<Circle>{

        public Circle mapRow(ResultSet resultSet, int rowNum) throws SQLException {
            Circle circle = new Circle();
            circle.setId(resultSet.getInt("ID"));
            circle.setName(resultSet.getString("NAME"));
            return circle;
        }
    }

}
