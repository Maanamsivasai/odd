package com.anp.abstractc;
import java.util.Scanner;

public class StudentsGrade {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);

		
		        String[] studentNames = new String[10];
		        double[] attendancePercentages = new double[10];

		        for (int i = 0; i < 10; i++) {
		            System.out.print("Enter the name of student " + (i + 1) + ": ");
		            studentNames[i] = sc.nextLine();
		            System.out.print("Enter the attendance percentage for " + studentNames[i] + ": ");
		            attendancePercentages[i] = sc.nextDouble();
		            sc.nextLine(); 
		        }

		        System.out.println("\nStudent Grades:");

		        for (int i = 0; i < 10; i++) {
		            String grade;
		            double attendance = attendancePercentages[i];

		            switch ((int) attendance / 10) {
		                case 10:
		                case 9:
		                    grade = "A";
		                    break;
		                case 8:
		                    grade = "B";
		                    break;
		                case 7:
		                    grade = "C";
		                    break;
		                case 6:
		                    grade = "D";
		                    break;
		                default:
		                    grade = "E";
		                    break;
		            }

		            System.out.println(studentNames[i] + ": " + grade);
		        }

		        sc.close();
		    }
		}
