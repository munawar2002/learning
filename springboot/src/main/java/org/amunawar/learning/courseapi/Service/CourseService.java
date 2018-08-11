package org.amunawar.learning.courseapi.Service;

import org.amunawar.learning.courseapi.Model.Course;
import org.amunawar.learning.courseapi.Model.Topic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * Created by sheik on 8/11/2018.
 */
@Service
public class CourseService {

    @Autowired
    private CourseRepository courseRepository;

    public List<Course> getAllCourses(String topicId){
        List<Course> courses = new ArrayList<>();
        courseRepository.findCourseByTopicId(topicId).forEach(courses::add);
        return courses;
    }

    public Course getCourse(String id){
        Optional<Course> optionalCourse = courseRepository.findById(id);
        Course topic = optionalCourse.get();
        return topic;
    }

    public void saveCourse(Course course) {
        courseRepository.save(course);
    }

    public void deleteCourse(String id) {
        courseRepository.deleteById(id);
    }
}
