package org.san.soapserver.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TestController {

	@RequestMapping(path = "hello")
	private String hello(@RequestParam(required = false) String name) {
		return "Hello " + name;
	}

}
