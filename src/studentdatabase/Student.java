/*
 * Author: Sheng-fan Wang <wang2147@flinders.edu.au>
 * College of Science and Engineering, Flinders University
 * Copyright (C) 2023, All Rights Reserved
 */

package studentdatabase;

import java.util.ArrayList;

/**
 * A class that represents a Student (Science).
 */
public class Student {
    public final Degree DEGREE = Degree.science;
    protected ArrayList<Result> results = new ArrayList<Result>();
    protected int studentNumber;
    protected String familyName, givenName;

    public Student(int studentNumber, String familyName, String givenName) {
        this.studentNumber = studentNumber;
        this.familyName = familyName;
        this.givenName = givenName;
    }

    public void addResult(Result result) {
        this.results.add(result);
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

    public int getStudentNumber() {
        return studentNumber;
    }

    public String getFamilyName() {
        return familyName;
    }

    public String getGivenName() {
        return givenName;
    }

    @Override
    public String toString() {
        StringBuilder record = new StringBuilder("Academic record for " + givenName + " " + familyName + " (" + studentNumber + ")");
        record.append("\nDegree: " + DEGREE);
        if (!results.isEmpty())
            for (Result result: results)
                record.append("\n" + result);
        return record.toString();
    }
}