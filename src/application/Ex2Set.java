package application;

import java.util.Scanner;

import model.entities.Course;
import model.entities.Instructor;
import model.entities.Student;

public class Ex2Set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		Instructor Alex = new Instructor(100);
		
		System.out.print("How many students for course A? ");
		int nA = sc.nextInt();	
		Course A = new Course("A", Alex);
		for (int i = 1; i <= nA; i++) {
			A.enrollStudent(new Student(sc.nextInt()));
		}
		
		System.out.print("How many students for course B? ");
		int nB = sc.nextInt();	
		Course B = new Course("B", Alex);
		for (int i = 1; i <= nB; i++) {
			B.enrollStudent(new Student(sc.nextInt()));
		}
		
		System.out.print("How many students for course C? ");
		int nC = sc.nextInt();	
		Course C = new Course("C", Alex);
		for (int i = 1; i <= nC; i++) {
			C.enrollStudent(new Student(sc.nextInt()));
		}
		
		System.out.println("Total students: " + Alex.uniqueStudents().size());
		

		sc.close();
	}

	
}
