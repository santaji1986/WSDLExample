package org.san.soapclient.controller;

import org.san.soapclient.config.StudentClient;
import org.san.soapclient.wsdl.GetStudentResponse;
import org.san.soapclient.wsdl.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	@Autowired
	private StudentClient studentClient;

	@RequestMapping(path = "/hello")
	private String hello(@RequestParam(required = false) String name) {
		return "Hello " + name;
	}

	@RequestMapping(path = "/getStudentInfo")
	private StudentDTO getStudentInfo(@RequestParam(required = false) String studentName) {
		final GetStudentResponse response = studentClient.getStudent(studentName);
		Student student = response.getStudent();
		return new StudentDTO(student.getName(), student.getId(), student.getMarks(), student.getGrade());

	}

}
