package org.amunawar.learning.courseapi.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * Created by sheik on 8/11/2018.
 */
@Entity
public class Course {

    @Id
    private String id;
    private String name;
    private String description;
    @ManyToOne
    @JoinColumn(name = "topic_id")
    private Topic topic;

    public Course() {
    }

    public Course(String id, String name, String description,String topic) {
        super();
        this.id = id;
        this.name = name;
        this.description = description;
        this.topic = new Topic(topic,"","");
    }

    public Topic getTopic() {
        return topic;
    }

    public void setTopic(Topic topic) {
        this.topic = topic;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
