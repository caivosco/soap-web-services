package com.in28minutes.soap.webservices.soapcoursemanagement.soap.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Component;

import com.in28minutes.soap.webservices.soapcoursemanagement.soap.bean.Course;

@Component
public class CourseDetailsService {
	
	public enum Status {
		Success, Failure;
	}
	
	private static List<Course> courses = new ArrayList<>();
	
	static {
		
		Course course1 = new Course(1, "Spring", "UNI Peru");
		courses.add(course1);
		
		Course course2 = new Course(2, "Spring MVC", "CEPS UNI");
		courses.add(course2);
		
		Course course3 = new Course(3, "Spring Boot", "CTIC UNI");
		courses.add(course3);
		
		Course course4 = new Course(4, "Spring Data JPA", "FIEE UNI");
		courses.add(course4);
		
	}
	
	public Course findById(int id) {
		for(Course course:courses) {
			if(course.getId()==id)
				return course;
		}
		return null;
	}
	
	public List<Course> findAll() {
		return courses;
	}
	
	public Status deleteById(int id) {
		
		Iterator<Course> iterator = courses.iterator();			
		while (iterator.hasNext()) {
			Course course = iterator.next();
			if (course.getId() == id) {
				courses.remove(course);
				return Status.Success;
			}			
		}
		return Status.Failure;
	}
	
	

}
