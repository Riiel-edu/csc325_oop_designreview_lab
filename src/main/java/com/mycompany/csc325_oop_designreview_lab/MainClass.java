/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.csc325_oop_designreview_lab;

import java.util.Scanner;

/**
 *
 * @author MoaathAlrajab
 */
public class MainClass {

 public static void main(String[] args) {
		// ToDo 5: Fix the error

		// ToDo 6: Fix the constructor of the Student class

	    // Todo 7: Create two classes for Freshman and Senior

	    // ToDo 8: The senior class should have a minimum of 85 credits

		// ToDo 9: Add a toString method for the Student class

		// ToDo 10: Add a toString method for the Freshman class

		Student std = new Student("James", (short) 20);

		// ToDo 11: Add a toString method for the Senior class

		Freshman std1 = new Freshman("James", (short) 20, 12); // name, age, credits

	    Senior std2 = new Senior("John", (short) 30, 90);

		// ToDo 12: Set the gpa of the student using the scanner and user
		// 			input and then print the output.
	 	Scanner scanner = new Scanner(System.in);
	 	System.out.println("Enter the freshman's GPA: ");
		String num = scanner.nextLine();
		std1.setGPA(Double.parseDouble(num));

	 	System.out.println("Enter the senior's GPA: ");
        num = scanner.nextLine();
	 	std2.setGPA(Double.parseDouble(num));

		System.out.println(std1);

		System.out.println(std2);

		// ToDo 13: add comments and explain your code

	}

}

