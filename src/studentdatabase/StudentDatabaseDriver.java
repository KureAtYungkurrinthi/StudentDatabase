/*
 * Author: Sheng-fan Wang <wang2147@flinders.edu.au>
 * College of Science and Engineering, Flinders University
 * Copyright (C) 2023, All Rights Reserved
 */

package studentdatabase;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class StudentDatabaseDriver {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a file name to process: ");
        String fileName = scan.nextLine().trim(); // fileName = "data/testFile.txt"
        Scanner fileReader = new Scanner(new File(fileName));

        String s;
        int prizeCount = 0;
        StudentDatabase studentDB = new StudentDatabase();
        String[] prizeList = new String[10];
        while (fileReader.hasNextLine()) {
            s = fileReader.nextLine();
            if (s.length() > 0)
                switch (s.charAt(0)) {
                    case 'A', 'M', 'S' -> studentDB.addStudent(s);
                    case 'R' -> studentDB.addResult(s);
                    case 'P' -> prizeList[prizeCount++] = s;
                    default -> {
                    }
                }
        }
        for (int i = 0; i < prizeCount; i++)
            studentDB.awardPrize(prizeList[i]);
        studentDB.printRecords();
    }
}
