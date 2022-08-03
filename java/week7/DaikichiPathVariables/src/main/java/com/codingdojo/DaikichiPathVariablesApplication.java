wsxpackage com.codingdojo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DaikichiPathVariablesApplication {

	public static void main(String[] args) {
		SpringApplication.run(DaikichiPathVariablesApplication.class, args);
	}
    @RequestMapping("/")
    // 3. Method that maps to the request route above
    public String index() { // 3
            return "welcome";
    }
    @RequestMapping("/daikitchu/today")
    public String today() {
    	return "today you will find luck in all your endeavors";
    }
    @RequestMapping("/daikitchu/tomorrow")
    public String tommorrow() {
    	return "Tomorrow, an opportunitty will arise, so be sure to be open to new ideas!";
    }
    @RequestMapping("/daikitchu/travel/{City}")
    public String travel(@PathVariable("City") String City) {
    	
    	return"Congratulations! You will soon travel to "+City+"!'.";
    	
    }
    @RequestMapping("/daikitchu/lotto/{number}")
    public String lotto(@PathVariable("number") int number) {
    	if(number%2==0) {
    	return"You will take a grand journey in the near future, but be weary of tempting offers";
    	}else {
    		return "You have enjoyed the fruits of your labor but now is a great time to spend time with family and friends.";
    	}
    }
}
