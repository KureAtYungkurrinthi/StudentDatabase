/*
 * Author: Sheng-fan Wang <wang2147@flinders.edu.au>
 * College of Science and Engineering, Flinders University
 * Copyright (C) 2023, All Rights Reserved
 */

package studentdatabase;

public class ArtsStudent extends Student {
    private String major, minor;

    public ArtsStudent(int studentNumber, String familyName, String givenName, String major, String minor) {
        super(studentNumber, familyName, givenName);
        this.major = major;
        this.minor = minor;
        degree = Degree.arts;
    }

    @Override
    public String toString() {
        StringBuilder record = new StringBuilder("Academic record for " + givenName + " " + familyName + " (" + studentNumber + ")");
        record.append("\nDegree: " + degree);
        record.append("\nMajor: " + major);
        record.append("\nMinor: " + minor);
        if (!results.isEmpty())
            for (Result result: results)
                record.append("\n" + result);
        return record.toString();
    }
}