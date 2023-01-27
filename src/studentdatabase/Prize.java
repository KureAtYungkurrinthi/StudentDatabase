/*
 * Author: Sheng-fan Wang <wang2147@flinders.edu.au>
 * College of Science and Engineering, Flinders University
 * Copyright (C) 2023, All Rights Reserved
 */

package studentdatabase;

/**
 * A class to create a Prize and the means to award it.
 */
public class Prize {
    private String name, topic;
    private int min;

    public Prize(String name, String topic, int min) {
        this.name = name;
        this.topic = topic;
        this.min = min;
    }

    public Prize(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public String getName() {
        return name;
    }

    public String getTopic() {
        return topic;
    }

    public int getMin() {
        return min;
    }

    @Override
    public String toString() {
        return name;
    }
}