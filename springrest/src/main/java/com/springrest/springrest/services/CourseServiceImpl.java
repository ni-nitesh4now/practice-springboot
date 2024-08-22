package com.springrest.springrest.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springrest.springrest.entities.Course;


@Service
public class CourseServiceImpl implements CourseService {
	
	List<Course> list;
	
	public CourseServiceImpl(){
		list = new ArrayList<>();
		list.add(new Course(145, "Java Core", "This is for core java concepts"));
		list.add(new Course(144, "Java begginer", "This is for core java begginer "));
	}
	
	@Override
	public List<Course> getCourses() {
		return list;
	}

	@Override
	public Course getCourse(long courseId) {
		Course c=null;
		for(Course course:list) {
			if(course.getId()==courseId) { 
				c=course;
				break;
			
			}
		}
		return c;

	}

	@Override
	public Course addCourse(Course course){
		
		list.add(course);
		return course;
	}

}
