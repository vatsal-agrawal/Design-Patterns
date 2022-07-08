package Structural.Composite;

import java.util.ArrayList;
import java.util.List;

public class Topic {
    List<Topic> topics = new ArrayList<>();
    List<Lecture> lectures = new ArrayList<>();

    String name;

    public Topic(String name) {
        this.name = name;
    }

    public void addTopic(Topic topic){
        topics.add(topic);
    }

    public void addLecture(Lecture lecture){
        lectures.add(lecture);
    }

    public void printall(){
        for(Lecture lecture : lectures){
            System.out.println(lecture);
        }
        for (Topic topic: topics){
            System.out.println(topic);
        }
    }

    @Override
    public String toString() {
        return "Topic{" +
                "name='" + name + '\'' +
                '}';
    }

    public List<Topic> getTopics() {
        return topics;
    }

    public void setTopics(List<Topic> topics) {
        this.topics = topics;
    }

    public List<Lecture> getLectures() {
        return lectures;
    }

    public void setLectures(List<Lecture> lectures) {
        this.lectures = lectures;
    }
}
