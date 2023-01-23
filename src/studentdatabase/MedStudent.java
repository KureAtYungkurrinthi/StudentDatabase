/*
 * Author: Sheng-fan Wang <wang2147@flinders.edu.au>
 * College of Science and Engineering, Flinders University
 * Copyright (C) 2023, All Rights Reserved
 */

package studentdatabase;

public class MedStudent extends Student {
    public final Degree DEGREE = Degree.medicine;
    private String[] prizes;

    public MedStudent(int studentNumber, String familyName, String givenName, String ... prizes) {
        super(studentNumber, familyName, givenName);
        this.prizes = prizes;
    }

    @Override
    public String toString() {
        String record = "Academic record for %s %s(%d)".formatted(givenName, familyName, studentNumber);
        record += "\nDegree: " + DEGREE;
        for (String prize: prizes)
            record += "Prize: " + prize;
        return record;
    }
}