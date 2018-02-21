package io.trishu.springbootstarter.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {

	private List<Topic> topics = new ArrayList<>(Arrays.asList(
				new Topic("java", "Java Course", "java course description"),
				new Topic("spring", "Spring Course", "Spring course description"),
				new Topic("javascript", "Javascript Course", "Javascript course description")
				));
	
	public List<Topic> getAllTopics(){
		return topics;
	} 
	
	public Topic getTopic(String id) {
		return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
	}

	public void addTopic(Topic topic) {
		topics.add(topic);
	}

	public void updateTopic(String id, Topic topic) {
		for(int i=0; i<topics.size(); i++) {
			if(topics.get(i).getId().equals(id))
				topics.set(i, topic);
		}
	}

	public void deleteTopic(String id) {
		for(int i=0; i<topics.size(); i++) {
			if(topics.get(i).getId().equals(id))
				topics.remove(topics.get(i));
		}
	}
}
