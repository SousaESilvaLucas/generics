package model.entities;

import java.util.HashSet;
import java.util.Set;

public class Course {
	private String courseName;
	private Instructor instructor;
	private Set<Student> students = new HashSet<>();
	
	public Course(String courseName, Instructor instructor) {
		this.courseName = courseName;
		this.instructor = instructor;
		instructor.getCourses().add(this);
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public Instructor getInstructor() {
		return instructor;
	}

	public void setInstructor(Instructor instructor) {
		this.instructor = instructor;
	}

	public Set<Student> getStudents() {
		return students;
	}

	public void enrollStudent (Student student) {
		students.add(student);
		student.getCourses().add(this);
	}
	
	public void removeStudent (Student student) {
		students.remove(student);
		student.getCourses().remove(this);
	}
}
