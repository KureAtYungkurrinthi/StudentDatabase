/*
 * Author: Sheng-fan Wang <wang2147@flinders.edu.au>
 * College of Science and Engineering, Flinders University
 * Copyright (C) 2023, All Rights Reserved
 */

package studentdatabase;

public class Result {
    private int studentNumber;
    private String topicCode;
    private String grade;
    private int mark;

    public Result(int studentNumber, String topicCode, String grade) {
        this.studentNumber = studentNumber;
        this.topicCode = topicCode;
        this.grade = grade;
    }

    public Result(int studentNumber, String topicCode, String grade, int mark) {
        this.studentNumber = studentNumber;
        this.topicCode = topicCode;
        this.grade = grade;
        this.mark = mark;
    }

    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }

    public void setTopicCode(String topicCode) {
        this.topicCode = topicCode;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    public int getStudentNumber() {
        return studentNumber;
    }

    public String getTopicCode() {
        return topicCode;
    }

    public String getGrade() {
        return grade;
    }

    public int getMark() {
        return mark;
    }

    @Override
    public String toString() {
        return topicCode + " " + grade + ((mark == 0) ? "" : " " + mark);
    }
}
