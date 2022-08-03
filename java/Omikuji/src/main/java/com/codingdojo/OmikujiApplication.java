package com.codingdojo;

import javax.servlet.http.HttpSession;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@SpringBootApplication
public class OmikujiApplication {

	public static void main(String[] args) {
		SpringApplication.run(OmikujiApplication.class, args);
	}
@RequestMapping("/omikuji")
public String index(HttpSession session ) {
	return "index.jsp";
}
@RequestMapping(value ="/send", method=RequestMethod.POST)
public String information(  HttpSession session   ,@RequestParam(value="name") String name
		,@RequestParam(value ="city")String City  , @RequestParam(value="pick") int number
		,@RequestParam(value="hobby") String hoppy, @RequestParam(value="note") String note
		,@RequestParam(value ="creature")String creature) {
	
	session.setAttribute("name", name);
	session.setAttribute("City",City);
	session.setAttribute("number",number);
	session.setAttribute("hoppy",hoppy);
	session.setAttribute("creature",creature);
	session.setAttribute("note",note);
	System.out.println(session.getAttribute("number"));
	return"redirect:/omikuji/show ";
}
@RequestMapping("/omikuji/show ")
public String show(HttpSession session) {
	return "show.jsp";
}
}
