package io.rajesh.hello;

public class Topic {
	private Number topicNumber;
	private String topicName;
	
	public Topic() {

	}
	
	public Topic(Number topicNumber, String topicName) {
		super();
		this.topicNumber = topicNumber;
		this.topicName = topicName;
	}
	public Number getTopicNumber() {
		return topicNumber;
	}
	public void setTopicNumber(Number topicNumber) {
		this.topicNumber = topicNumber;
	}
	public String getTopicName() {
		return topicName;
	}
	public void setTopicName(String topicName) {
		this.topicName = topicName;
	}
}
