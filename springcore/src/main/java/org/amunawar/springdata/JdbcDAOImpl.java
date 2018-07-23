package org.amunawar.springdata;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Component
public class JdbcDAOImpl {

    @Autowired
    private DataSource dataSource;

    private JdbcTemplate jdbcTemplate = new JdbcTemplate();


    public Circle getCircle(int circleId) {
        Connection con = null;
        try {
            con = dataSource.getConnection();
            PreparedStatement ps = con.prepareStatement("Select * from Circle where id = ?");
            ps.setInt(1, circleId);
            Circle circle = null;
            ResultSet resultSet = ps.executeQuery();
            if (resultSet.next()) {
                circle = new Circle(circleId, resultSet.getString("name"));
            }

            resultSet.close();
            ps.close();
            return circle;
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public int getCircleCount(){
        String sql = "select count(*) from circle";
        jdbcTemplate.setDataSource(dataSource);
        List list = jdbcTemplate.queryForList(sql);


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
}
