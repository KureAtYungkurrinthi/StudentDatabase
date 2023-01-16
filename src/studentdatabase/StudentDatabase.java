package studentdatabase;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentDatabase {

    private final ArrayList<Student> studentDatabse;

    public StudentDatabase() {
        studentDatabse = new ArrayList<>();
    }

    public void addStudent(String s) {
        Scanner vars = new Scanner(s);
        vars.useDelimiter(",");
        switch (s.charAt(0)) {
            case 'A' -> {

            }
            case 'M' -> {

            }
            case 'S' -> {

            }
        }
    }


    public Student findStudent(String ID) {

        return null;
    }

    public void addResult(String s) {

    }

    public void awardPrize(String prize, String template, int topicsRequired) {

    }

    public void printRecords() throws IOException {

    }

    public void clearRecords() {
        studentDatabse.clear();
    }

}
