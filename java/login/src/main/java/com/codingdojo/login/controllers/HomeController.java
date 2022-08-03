package com.codingdojo.login.controllers;


import java.lang.ProcessBuilder.Redirect;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.codingdojo.login.model.LoginUser;
import com.codingdojo.login.model.User;
import com.codingdojo.login.service.UserService;
    
@Controller
public class HomeController {
    
    @Autowired
    private UserService userServ;
    
    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("newUser", new User());
        model.addAttribute("newLogin", new LoginUser());
        return "index.jsp";
    }
    
    @PostMapping("/register")
    public String register(@Valid @ModelAttribute("newUser") User newUser, 
            BindingResult result, Model model, HttpSession session) {
        userServ.register(newUser, result);
        if(result.hasErrors()) {
        	
            model.addAttribute("newLogin", new LoginUser());
            return "index.jsp";
        }
        session.setAttribute("user_id", newUser.getId());
        return "redirect:/home";
    }
    
    @PostMapping("/login")
    public String login(@Valid @ModelAttribute("newLogin") LoginUser newLogin, 
            BindingResult result, Model model, HttpSession session) {
        User user = userServ.login(newLogin, result);
        if(result.hasErrors()) {
            model.addAttribute("newUser", new User());
            return "index.jsp";
        }
        session.setAttribute("user_id", user.getId());
        return "redirect:/home";
    }
    @RequestMapping("/home")
    public String home(HttpSession session , Model model) {
    	if(session.getAttribute("user_id")!=null){
    		User user= userServ.findById((Long)session.getAttribute("user_id"));
    		model.addAttribute("s",user);
    		return "home.jsp";
    	}else {
    		return "Redirect:/";
    	}
    }
    @RequestMapping("/logout")
    public String logout(HttpSession session){
    	session.removeAttribute("user_id");
    	return "redirect:/";
    }
    
}

