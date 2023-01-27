/*
 * Author: Sheng-fan Wang <wang2147@flinders.edu.au>
 * College of Science and Engineering, Flinders University
 * Copyright (C) 2023, All Rights Reserved
 */

package studentdatabase;

import java.util.ArrayList;
import java.util.Collections;

/**
 * A class that represents a Student (Science).
 */
public class Student {
    protected Degree degree;
    protected ArrayList<Result> results = new ArrayList<Result>();
    protected int studentNumber;
    protected String familyName, givenName;

    public Student(int studentNumber, String familyName, String givenName) {
        this.studentNumber = studentNumber;
        this.familyName = familyName;
        this.givenName = givenName;
        this.degree = Degree.science;
    }

    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public void setGivenName(String givenName) {
        this.givenName = givenName;
    }

    public void addResult(Result result) {
        this.results.add(result);
    }

    public int getStudentNumber() {
        return studentNumber;
    }

    public String getFamilyName() {
        return familyName;
    }

    public String getGivenName() {
        return givenName;
    }

    public int getAverageMarkPerTopic(String topic, int min) {
        ArrayList<Integer> topicMarks = new ArrayList<Integer>();
        for (Result result: results)
            if (result.getTopic().contains(topic))
                topicMarks.add(result.getMark());
        if (topicMarks.size() == 0)
            return -1;
        else {
            Collections.sort(topicMarks, Collections.reverseOrder());
            int totalMark = 0;
            for (int i = 0; i < min; i++)
                totalMark += topicMarks.get(i);
            return totalMark / min;
        }
    }

    @Override
    public String toString() {
        StringBuilder record = new StringBuilder("Academic record for " + givenName + " " + familyName + " (" + studentNumber + ")");
        record.append("\nDegree: " + degree);
        if (!results.isEmpty())
            for (Result result: results)
                record.append("\n" + result);
        return record.toString();
    }
}