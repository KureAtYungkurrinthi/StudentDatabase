/*
 * Author: Sheng-fan Wang <wang2147@flinders.edu.au>
 * College of Science and Engineering, Flinders University
 * Copyright (C) 2023, All Rights Reserved
 */

package studentdatabase;

public class ArtsStudent extends Student {
    public final Degree DEGREE = Degree.arts;
    private String major, minor;

    public ArtsStudent(int studentNumber, String familyName, String givenName, String major, String minor) {
        super(studentNumber, familyName, givenName);
        this.major = major;
        this.minor = minor;
    }

    @Override
    public String toString() {
        String record = super.toString();
        record += "\nMajor: " + major;
        record += "\nMinor: " + minor;
        record += "\n";
        return record;
    }
}