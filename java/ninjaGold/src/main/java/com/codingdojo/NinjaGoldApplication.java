package com.codingdojo;
import java.text.DateFormat;
import java.util.Date;
import java.util.Random;
import java.util.ArrayList;
import javax.servlet.http.HttpSession;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
@Controller
@SpringBootApplication
public class NinjaGoldApplication {
ArrayList<String> log = new ArrayList<>();
	public static void main(String[] args) {
		SpringApplication.run(NinjaGoldApplication.class, args);
	}
@RequestMapping("/")
public String index(HttpSession session) {
	if(session.getAttribute("logg")== null) {
		session.setAttribute("logg", log);
	}
	if (session.getAttribute("yourGold") == null) {
		// Use setAttribute to initialize the count in session
		session.setAttribute("yourGold", 0);
		}
		return "index.jsp";
	
}
@RequestMapping(value ="/addGold",method=RequestMethod.POST)
	public String addGold(HttpSession session ,@RequestParam(value="quest") String quest) {
	String time =DateFormat.getTimeInstance(3).format(new Date());
	if(quest.equals("gamble")){
		Random r = new Random();
		int amount= r.nextInt(100)-50;	
		if (amount > 0) {
            log.add("you completed a quest and gained "+amount+" gold. "+time+"\n ");
            session.setAttribute("logg", log);
        }else {
            log.add("you failed a quest and lost "+amount+" gold. "+time+"\n");
            session.setAttribute("logg", log);
            }
		
		amount += (Integer)session.getAttribute("yourGold");
		session.setAttribute("yourGold", amount);
	    return "redirect:/";
	}else {
	Random r = new Random();
	   int amount= r.nextInt(10)+10;
	   if (quest.equals("farm")) {
		      log.add("you Entered a farm and gained "+amount+"gold. "+time+"<br/> ");
		      System.out.println(log);
		      session.setAttribute("logg", log);
		    }
		    else if (quest.equals("cave") ) {
		    	log .add("you Entered a cave and gained "+amount+"gold. "+time+"\n ");
		    	session.setAttribute("logg", log);
		    }
		    else if (quest.equals("house")) {
		    	log.add("you Entered a house and gained "+amount+" gold. "+time+"\n ");
		        session.setAttribute("logg", log);
		    } 
	    
	    amount += (Integer)session.getAttribute("yourGold");
	    session.setAttribute("yourGold", amount);
	    return "redirect:/";
	   		}
}
	
	
}
