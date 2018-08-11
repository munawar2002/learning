package org.amunawar.learning.courseapi.Service;

import org.amunawar.learning.courseapi.Model.Topic;
import org.springframework.data.repository.CrudRepository;


/**
 * Created by sheik on 8/11/2018.
 */
public interface TopicRepository extends CrudRepository <Topic,String> {

}
