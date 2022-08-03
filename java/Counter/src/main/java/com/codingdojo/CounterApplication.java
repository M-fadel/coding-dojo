package com.codingdojo;

import javax.servlet.http.HttpSession;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@SpringBootApplication
@Controller
public class CounterApplication {

	public static void main(String[] args) {
		SpringApplication.run(CounterApplication.class, args);
	}
@RequestMapping("/your_server")
public String index(HttpSession session) {
	if (session.getAttribute("count") == null) {
		// Use setAttribute to initialize the count in session
		session.setAttribute("count", 0);
		}
		else {
		// increment the count by 1 using getAttribute and setAttribute
			int counter = (Integer)session.getAttribute("count");
			session.setAttribute("count", counter+1);
		}
		return "index.jsp";
		
}
@RequestMapping("/your_server/counter")
public String counter(HttpSession session) {
	
		return "counter.jsp";
		
}
}
