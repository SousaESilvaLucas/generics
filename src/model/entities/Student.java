package model.entities;

import java.util.HashSet;
import java.util.Set;

public class Student extends User {

	private Set<Course> courses = new HashSet<>();

	public Student(Integer idNumber) {
		super (idNumber);	
	}

	public Set<Course> getCourses() {
		return courses;
	}
}
