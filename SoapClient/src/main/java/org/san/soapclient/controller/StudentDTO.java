package org.san.soapclient.controller;

import org.san.soapclient.wsdl.Grade;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class StudentDTO {
	private String name;
	private int id;
	private int marks;
	private Grade grade;
}
