package CodeSoftInternShip;

import java.util.Scanner;

public class StudentGradeCalculator {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);


            System.out.print("Enter the number of subjects: ");
            int numSubjects = scanner.nextInt();

            int[] marks = new int[numSubjects];

            for (int i = 0; i < numSubjects; i++) {
                System.out.print("Enter marks for subject " + (i + 1) + ": ");
                marks[i] = scanner.nextInt();
            }

            int totalMarks = 0;
            for (int mark : marks) {
                totalMarks += mark;
            }

            double averagePercentage = (double) totalMarks / (numSubjects * 100) * 100;

            String grade;
            if (averagePercentage >= 90) {
                grade = "A";
            } else if (averagePercentage >= 80) {
                grade = "B";
            } else if (averagePercentage >= 70) {
                grade = "C";
            } else if (averagePercentage >= 60) {
                grade = "D";
            } else {
                grade = "E";
            }

            System.out.println("Total Marks: " + totalMarks);
            System.out.printf("Average Percentage: %.2f%%\n", averagePercentage);
            System.out.println("Grade: " + grade);

            scanner.close();
        }
    }

