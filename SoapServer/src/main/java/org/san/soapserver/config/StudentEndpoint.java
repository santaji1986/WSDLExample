package org.san.soapserver.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import io.san.org.soapserver.GetStudentRequest;
import io.san.org.soapserver.GetStudentResponse;

@Endpoint
public class StudentEndpoint {
	private static final String NAMESPACE_URI = "http://org.san.io/soapserver";

	private StudentRepository studentRepository;

	@Autowired
	public StudentEndpoint(StudentRepository studentRepository) {
		this.studentRepository = studentRepository;
	}

	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "getStudentRequest")
	@ResponsePayload
	public GetStudentResponse getCountry(@RequestPayload GetStudentRequest request) {
		GetStudentResponse response = new GetStudentResponse();
		response.setStudent(studentRepository.findStudent(request.getName()));

		return response;
	}
}
