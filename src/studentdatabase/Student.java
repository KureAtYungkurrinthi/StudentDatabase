/*
 * Author: Sheng-fan Wang <wang2147@flinders.edu.au>
 * College of Science and Engineering, Flinders University
 * Copyright (C) 2023, All Rights Reserved
 */

package studentdatabase;

/**
 * A class that represents a Student (Science).
 */
public class Student {
    public final Degree DEGREE = Degree.science;
    private int studentNumber;
    private String familyName, givenName;

    public Student(int studentNumber, String familyName, String givenName) {
        this.studentNumber = studentNumber;
        this.familyName = familyName;
        this.givenName = givenName;
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
        return "Academic record for %s %s(%d)\nDegree: %s".formatted(givenName, familyName, studentNumber, DEGREE);
    }
}