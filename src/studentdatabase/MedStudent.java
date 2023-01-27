/*
 * Author: Sheng-fan Wang <wang2147@flinders.edu.au>
 * College of Science and Engineering, Flinders University
 * Copyright (C) 2023, All Rights Reserved
 */

package studentdatabase;

public class MedStudent extends Student {
    private final Prize[] PRIZES = new Prize[10];
    private int prizeCount = 0;

    public MedStudent(int studentNumber, String familyName, String givenName, String[] prizes) {
        super(studentNumber, familyName, givenName);
        for (int i = 0; i < prizes.length; i++)
            if (prizes[i] != null) {
                this.PRIZES[i] = new Prize(prizes[i]);
                prizeCount++;
            }
        degree = Degree.medicine;
    }

    public void addPrize(String name, String topic, int min) {
        this.PRIZES[prizeCount] = new Prize(name, topic, min);
        prizeCount++;
    }

    @Override
    public String toString() {
        StringBuilder record = new StringBuilder("Academic record for " + givenName + " " + familyName + " (" + studentNumber + ")");
        record.append("\nDegree: " + degree);
        for (int i = 0; i < prizeCount; i++)
            record.append("\nPrize: " + PRIZES[i]);
        if (!results.isEmpty())
            for (Result result: results)
                record.append("\n" + result);
        return record.toString();
    }
}