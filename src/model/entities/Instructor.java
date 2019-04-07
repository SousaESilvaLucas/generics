package model.entities;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Instructor extends User{
	
	private Set<Course> courses = new HashSet<>();
	
	public Instructor(Integer idNumber) {
		super(idNumber);
		// TODO Auto-generated constructor stub
	}

	public Set<Course> getCourses() {
		return courses;
	}

	public Set <Student> uniqueStudents() {
		Set <Student> uniqueStudents = new LinkedHashSet<Student>();
		for (Course course : courses) {
			uniqueStudents.addAll(course.getStudents());
		}
		return uniqueStudents;
	}
	
	
}
