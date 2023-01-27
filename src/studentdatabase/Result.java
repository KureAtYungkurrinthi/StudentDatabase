/*
 * Author: Sheng-fan Wang <wang2147@flinders.edu.au>
 * College of Science and Engineering, Flinders University
 * Copyright (C) 2023, All Rights Reserved
 */

package studentdatabase;

public class Result {
    private String topic;
    private String grade;
    private int mark;

    public Result(String topic, String grade) {
        this.topic = topic;
        this.grade = grade;
    }

    public Result(String topic, String grade, int mark) {
        this.topic = topic;
        this.grade = grade;
        this.mark = mark;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    public String getTopic() {
        return topic;
    }

    public String getGrade() {
        return grade;
    }

    public int getMark() {
        return mark;
    }

    @Override
    public String toString() {
        return topic + " " + grade + ((mark == 0) ? "" : " " + mark);
    }
}
