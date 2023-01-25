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

        student1.addResult(new Result(1000001, "COMP1000", "PS", 55));
        student1.addResult(new Result(1000001, "COMP1001", "DN", 77));
        student1.addResult(new Result(1000001, "HIST1234", "HD"));

        student2.addResult(new Result(1000002, "BIOL1000", "HD", 89));
        student2.addResult(new Result(1000002, "CHEM1001", "DN"));

        student3.addResult(new Result(1000003, "PHYS1010", "HD", 93));

        System.out.println(student1);
        System.out.println();
        System.out.println(student2);
        System.out.println();
        System.out.println(student3);
        System.out.println();

    }
}