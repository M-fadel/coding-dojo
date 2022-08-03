package com.codingdojo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@Controller
public class HopperReceiptApplication {

	public static void main(String[] args) {
		SpringApplication.run(HopperReceiptApplication.class, args);
	}

	// class definition and imports here...
    @RequestMapping("/")
    public String index(Model model) {
        
        String name = "hello Hopper";
        String itemName = "irone wire";
        double price = 5.25;
        String description = "nano machines son.";
        String vendor = "savage 24";
    
    	// Your code here! Add values to the view model to be rendered
        model.addAttribute("name", name);
        model.addAttribute("item", itemName);
        model.addAttribute("price", price);
        model.addAttribute("des",description);
        model.addAttribute("ven", vendor);
        return "index.jsp";
    }
    //...
    

}
