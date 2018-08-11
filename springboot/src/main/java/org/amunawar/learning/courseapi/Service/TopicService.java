package org.amunawar.learning.courseapi.Service;

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
public class TopicService {

    @Autowired
    private TopicRepository topicRepository;

    List<Topic> topics = new ArrayList(Arrays.asList(
            new Topic("spring","Spring Framework","Spring Framework Description"),
            new Topic("java","Core Java","Core Java Description"),
            new Topic("javascript","Java Script","Java Script Description")
    ));


    public List<Topic> getAllTopics(){
        List<Topic> topics = new ArrayList<>();
        topicRepository.findAll().forEach(topics::add);
        return topics;
    }

    public Topic getTopicByJava8(String id){
        return topics.stream().filter(topic -> topic.getId().equals(id)).findFirst().get();
    }

    public Topic getTopic(String id){
        Optional<Topic> optionalTopic = topicRepository.findById(id);
        Topic topic = optionalTopic.get();
        return topic;
    }

    public void addTopic(Topic topic) {
        topicRepository.save(topic);
    }

    public void updateTopic(String id, Topic topic) {
        // if row exist then update. else Insert
        topicRepository.save(topic);
    }

    public void deleteTopic(String id) {
        //topics.removeIf(topic -> topic.getId().equals(id));
        topicRepository.deleteById(id);
    }
}
