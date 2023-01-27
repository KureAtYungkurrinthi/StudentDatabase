/*
 * Author: Sheng-fan Wang <wang2147@flinders.edu.au>
 * College of Science and Engineering, Flinders University
 * Copyright (C) 2023, All Rights Reserved
 */

package studentdatabase;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentDatabase {
    private final ArrayList<Student> studentDatabase = new ArrayList<>();

    public void addStudent(String s) {
        Scanner vars = new Scanner(s);
        vars.useDelimiter(",");
        char c = vars.next().charAt(0);
        int studentNumber = vars.nextInt();
        String familyName = vars.next();
        String givenName = vars.next();
        switch (c) {
            case 'A' -> {
                String major = vars.next();
                String minor = vars.next();
                studentDatabase.add(new ArtsStudent(studentNumber, familyName, givenName, major, minor));
            }
            case 'M' -> {
                String[] prizes = new String[10];
                int prizeCount = 0;
                while (vars.hasNext()) {
                    prizes[prizeCount] = vars.next();
                    prizeCount++;
                }
                studentDatabase.add(new MedStudent(studentNumber, familyName, givenName, prizes));
            }
            case 'S' -> studentDatabase.add(new Student(studentNumber, familyName, givenName));
        }
    }

    public Student findStudent(int ID) {
        for (Student student: studentDatabase)
            if (student.getStudentNumber() == ID)
                return student;
        return null;
    }

    public void addResult(String s) {
        Scanner vars = new Scanner(s);
        vars.useDelimiter(",");
        char c = vars.next().charAt(0);
        int studentNumber = vars.nextInt();
        String topic = vars.next();
        String grade = vars.next();
        for (Student student : studentDatabase)
            if (student.getStudentNumber() == studentNumber)
                student.addResult(vars.hasNextInt() ? new Result(topic, grade, vars.nextInt()) : new Result(topic, grade));
    }

    public void awardPrize(String s) {
        Scanner vars = new Scanner(s);
        vars.useDelimiter(",");
        char c = vars.next().charAt(0);
        String prizeName = vars.next();
        String prizeTopic = vars.next();
        int prizeMin = vars.nextInt();
        int highScore = -1;
        int highStudent = -1;
        for (int i = 0; i < studentDatabase.size(); i++) {
            if (studentDatabase.get(i).degree == Degree.medicine) {
                int averageMark = studentDatabase.get(i).getAverageMarkPerTopic(prizeTopic, prizeMin);
                if (averageMark > highScore) {
                    highScore = averageMark;
                    highStudent = studentDatabase.get(i).studentNumber;
                }
            }
        }

        if (highStudent != -1) {
            MedStudent medStudent = (MedStudent) this.findStudent(highStudent);
            medStudent.addPrize(prizeName, prizeTopic, prizeMin);
        }

    }

    public void printRecords() throws IOException {
        String fileName = "data/record.txt";
        PrintWriter outFile = new PrintWriter(fileName);
        outFile.print(this.toString());
        outFile.close();
    }

    @Override
    public String toString() {
        StringBuilder output = new StringBuilder();
        for (Student student: studentDatabase)
            output.append(student).append("\n\n");
        return output.toString();
    }

    public void clearRecords() {
        studentDatabase.clear();
    }
}
