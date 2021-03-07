
package org.san.soapclient.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

@Configuration
public class StudentConfiguration {

	@Bean
	public Jaxb2Marshaller marshaller() {
		Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
		marshaller.setContextPath("org.san.soapclient.wsdl");
		return marshaller;
	}

	@Bean
	public StudentClient studentClient(Jaxb2Marshaller marshaller) {
		StudentClient client = new StudentClient();
		client.setDefaultUri("http://localhost:8080/services");
		client.setMarshaller(marshaller);
		client.setUnmarshaller(marshaller);
		return client;
	}

}
