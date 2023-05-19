/**
 * What this program does is input how many grades there is. It takes the average of the grades and
 * it finds grades higher than the average
 * @author Daniel Kim
 */
package assg1_kimj19;

import java.util.Scanner;

public class CountGrades {

	public static void main(String[] args) {
		
		int numOfGrades;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of Grades");
		numOfGrades = scan.nextInt();
		// Asks the user to input grades
		int[] grade = new int[numOfGrades];
		int sum = 0;
		for (int i = 0; i < numOfGrades; i++) {
			System.out.println("Enter a grade:");
			grade[i] = scan.nextInt();
			sum = grade[i] + sum;
			// It makes Enter a grade print out as much as the scanner
		}
		System.out.println("The average grade is:" + sum / numOfGrades);
		System.out.println("The grades above the average grades are:");
		int count = 0;
		for (int i = 0; i < numOfGrades; i++) {
			if (grade[i] > sum / numOfGrades) {
				System.out.println(grade[i]);
				count++;
			}

		}
		System.out.println("For a total of " + count + " grades");
		// The calculation to get the average and it shows the grades that are above the average
	}

}
