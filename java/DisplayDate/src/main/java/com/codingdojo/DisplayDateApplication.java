package com.codingdojo;

import org.springframework.boot.SpringApplication;
import java.util.Date;
import java.text.DateFormat;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
@SpringBootApplication
@Controller
public class DisplayDateApplication {

	public static void main(String[] args) {
		SpringApplication.run(DisplayDateApplication.class, args);
	}
@RequestMapping("/")
public String index() {
	return "index.jsp";
}
@RequestMapping("/Time")
public String Date(Model model) {
	
    
	 String   date = DateFormat.getTimeInstance(3).format(new Date());

model.addAttribute("Date", date);

return "Time.jsp";
}

@RequestMapping("/Date")
public String Time(Model model) {
	
	String date = DateFormat.getDateInstance(0).format(new Date());
model.addAttribute("Date", date);

return "Time.jsp";
}
}
