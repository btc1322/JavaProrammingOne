package Chapter7;

import java.util.Scanner;

/**
 * Asks the user for a set of grades and outputs each students letter grade
 * according to a 10 point curve from the highest score
 *
 * @author Brian Charter
 */
public class C7_1 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int numStudents, bestScore = 0;

        System.out.print("Enter the number of students: ");
        numStudents = input.nextInt();
        int[] grades = new int[numStudents];

        System.out.print("Enter " + numStudents + " scores: ");
        for (int i = 0; i < numStudents; i++) {
            grades[i] = input.nextInt();
            if (grades[i] > bestScore) {
                bestScore = grades[i];
            }
        }

        for (int i = 0; i < grades.length; i++) {
            if (grades[i] >= bestScore - 10) {
                System.out.println("Student " + i + " score is " + grades[i] + " and grade is A");
            } else if (grades[i] >= bestScore - 20) {
                System.out.println("Student " + i + " score is " + grades[i] + " and grade is B");
            } else if (grades[i] >= bestScore - 30) {
                System.out.println("Student " + i + " score is " + grades[i] + " and grade is C");
            } else if (grades[i] >= bestScore - 40) {
                System.out.println("Student " + i + " score is " + grades[i] + " and grade is D");
            } else {
                System.out.println("Student " + i + " score is " + grades[i] + " and grade is F");
            }
        }

    }

}
