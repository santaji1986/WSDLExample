
package org.san.soapclient.config;

import org.san.soapclient.wsdl.GetStudentRequest;
import org.san.soapclient.wsdl.GetStudentResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

public class StudentClient extends WebServiceGatewaySupport {

	private static final Logger log = LoggerFactory.getLogger(StudentClient.class);

	public GetStudentResponse getStudent(String studentName) {

		GetStudentRequest request = new GetStudentRequest();
		request.setName(studentName);

		log.info("Requesting Student info for " + studentName);

		GetStudentResponse response = (GetStudentResponse) getWebServiceTemplate()
				.marshalSendAndReceive("http://localhost:8080/services/students", request,
						new SoapActionCallback(
								"http://org.san.io/soapserver/GetStudentRequest"));

		return response;
	}

}
