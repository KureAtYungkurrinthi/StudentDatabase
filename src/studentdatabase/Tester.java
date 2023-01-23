/*
 * Author: Sheng-fan Wang <wang2147@flinders.edu.au>
 * College of Science and Engineering, Flinders University
 * Copyright (C) 2023, All Rights Reserved
 */

package studentdatabase;

public class Tester {
    public static void main(String[] args) {
        Student student1 = new Student(1000001, "Smith", "John");
        Student student2 = new MedStudent(1000002, "Waylen", "Paige", "Chemistry Prize 1998", "Lion Award 2000");
        Student student3 = new ArtsStudent(1000003, "Train", "Jordan", "Politics", "Economics");

        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);

        Result result1 = new Result(1000001, "BIOL1000", "HD", 89);
        Result result2 = new Result(1000002, "CHEM1001", "DN");

        System.out.println(result1);
        System.out.println(result2);

    }
}
