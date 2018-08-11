package org.amunawar.learning.courseapi.Service;

import org.amunawar.learning.courseapi.Model.Course;
import org.amunawar.learning.courseapi.Model.Topic;
import org.springframework.data.repository.CrudRepository;

import java.util.List;


/**
 * Created by sheik on 8/11/2018.
 */
public interface CourseRepository extends CrudRepository <Course,String> {

    public List<Course> findCourseByTopicId(String topicId);
    public List<Course> findCourseByName(String name);
    public List<Course> findCourseByDescription(String description);

}
