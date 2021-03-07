package org.san.soapserver.config;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

import io.san.org.soapserver.Grade;
import io.san.org.soapserver.Student;

@Component
public class StudentRepository {
	private static final Map<String, Student> studentList = new HashMap<>();

	@PostConstruct
	public void initData() {
		Student student1 = new Student();
		student1.setId(1);
		student1.setName("Ajay");
		student1.setMarks(80);
		student1.setGrade(Grade.A);

		studentList.put(student1.getName(), student1);

		Student student2 = new Student();
		student2.setId(2);
		student2.setName("Vijay");
		student2.setMarks(60);
		student2.setGrade(Grade.B);

		studentList.put(student2.getName(), student2);

		Student student3 = new Student();
		student3.setId(3);
		student3.setName("Sujay");
		student3.setMarks(50);
		student3.setGrade(Grade.C);

		studentList.put(student3.getName(), student3);
	}

	public Student findStudent(String name) {
		Assert.notNull(name, "The Student's name must not be null");
		return studentList.get(name);
	}
}
