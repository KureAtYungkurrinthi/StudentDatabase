package studentdatabase;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentDatabase {
    private final ArrayList<Student> studentDatabase = new ArrayList<Student>();

    public void addStudent(String s) {
        Scanner vars = new Scanner(s);
        vars.useDelimiter(",");
        char c = vars.next().charAt(0);
        switch (c) {
            case 'A' -> {
                studentDatabase.add(new ArtsStudent(vars.nextInt(), vars.next(), vars.next(), vars.next(), vars.next()));
            }
            case 'M' -> {
                studentDatabase.add(new MedStudent(vars.nextInt(), vars.next(), vars.next(), vars.next()));
            }
            case 'S' -> {
                studentDatabase.add(new Student(vars.nextInt(), vars.next(), vars.next()));
            }
        }
    }

    public Student findStudent(String ID) {
        for (Student student: studentDatabase)
            if (student.getFamilyName().equals(ID) || student.getGivenName().equals(ID))
                return student;
        return null;
    }

    public void addResult(String s) {
        Scanner vars = new Scanner(s);
        vars.useDelimiter(",");
        char c = vars.next().charAt(0);
        int studentNumber = vars.nextInt();
        String topicCode = vars.next();
        String grade = vars.next();
        for (Student student : studentDatabase)
            if (student.getStudentNumber() == studentNumber)
                student.addResult(vars.hasNextInt() ? new Result(studentNumber, topicCode, grade, vars.nextInt()) : new Result(studentNumber, topicCode, grade));
    }

//    public void awardPrize(String prize, String template, int topicsRequired) {
//
//    }

    public void printRecords() throws IOException {
        for (Student student: studentDatabase)
            System.out.println(student + "\n");
    }

    @Override
    public String toString() {
        StringBuilder output = new StringBuilder();
        for (Student student: studentDatabase)
            output.append(student).append("\n");
        return output.toString();
    }

    public void clearRecords() {
        studentDatabase.clear();
    }
}
