package com.java_assignments;

import java.util.Scanner;

public class task1 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Student ID: ");
		int studentId = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Student Name: ");
		String studentName = sc.nextLine();
		System.out.println("Enter Marks (0 to 100): ");
		int marks = sc.nextInt();
		System.out.println("Fee Status? (true/false): ");
		boolean feeStatus = sc.nextBoolean();
		
		System.out.println("--------------------------------------------");
		
		System.out.println("Student (pass/fail)");
		boolean isPassed;
        if (marks >= 40) {
            isPassed = true;
            System.out.println("Student Passed");
        } else {
            isPassed = false;
            System.out.println("Student Failed");
        }
        
        System.out.println("Student Grade");
        char grade;
        if (marks >= 85) {
            grade = 'A';
        } else if (marks >= 70) {
            grade = 'B';
        } else if (marks >= 50) {
            grade = 'C';
        } else {
            grade = 'D';
        }
        System.out.println("Grade: " + grade);

        System.out.println("Student Certificate Eligibility");
        boolean certificateEligible;
        if (isPassed && feeStatus) {
            certificateEligible = true;
            System.out.println("Eligible for Certificate");
        } else {
            certificateEligible = false;
            System.out.println("Not Eligible for Certificate");
        }

        System.out.println("Student Course Allocation");
        String course;
        switch (grade) {
            case 'A':
                course = "Data Science";
                break;
            case 'B':
                course = "Java Full Stack";
                break;
            case 'C':
                course = "Web Development";
                break;
            case 'D':
                course = "Basic Programming";
                break;
            default:
                course = "Counselling";
        }
        System.out.println("Course: " + course);

        
        System.out.println("\n STUDENT DETAILS");
        System.out.println("Student ID & Student Name: " + studentId + " - " + studentName);
        System.out.println("Marks: " + marks + " (" + (isPassed ? "Passed" : "Failed") + ")");
        System.out.println("Grade: " + grade);
        System.out.println("Fee Paid Status: " + feeStatus);
        System.out.println("Certificate Eligibility: " + certificateEligible);
        System.out.println("Allocated Course: " + course);

        sc.close();
		
		
	}

}