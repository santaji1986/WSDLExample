package org.san.soapclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

//	@Bean
//    CommandLineRunner lookup(StudentClient studentClient) {
//        return args -> {
//            String studentName = "Ajay";
//
//            if (args.length > 0) {
//            	studentName = args[0];
//            }
//            final GetStudentResponse response = studentClient.getStudent(studentName);
//            System.err.println("Id : "+response.getStudent().getId());
//            System.err.println("Name : " + response.getStudent().getName());
//            System.err.println("Marks : " + response.getStudent().getMarks());
//            System.err.println("Grade : " + response.getStudent().getGrade());
//        };
//    }
}
