package io.rajesh.hello;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {
	private List<Topic> topics = new ArrayList<>(Arrays.asList(new Topic(100,"Topic1"), new Topic(200,"Topic2")));
	public List<Topic> getTopics() {
		return topics;
	}
	
	public Topic getTopic(int id) {
		Topic result = null;
		for (int i=0;i<topics.size();i++) {
			Topic ele = topics.get(i);
			if(ele.getTopicNumber().equals(id)) {
				result = ele;
			}
		}
		return result;	
	}
	
	public void setTopic(Topic topic) {
		topics.add(topic);
	}

	public String updateTopic(Topic topic, int id) {
		String result = "failed";
		for (int i=0;i<topics.size();i++) {
			Topic ele = topics.get(i);
			if(ele.getTopicNumber().equals(id)) {
				 topics.set(i, topic);
				 result = "success";
			}
		}
		return result;
		
	}
}
