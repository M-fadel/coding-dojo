import java.util.*;
public class AlfredQuotes {
    
    public String basicGreeting() {
        // You do not need to code here, this is an example method
        return "Hello, lovely to see you. How are you?";
    }
        public String guestGreeting(String name) {
            // YOUR CODE HERE
            return "Hello,"+name+"how was your day?";
        }
        
        public String dateAnnouncement() {
            // YOUR CODE HERE
            String dateNow = "Its\t"+ new Date();
            return dateNow;
        }
        
        public String respondBeforeAlexis(String conversation) {
        // YOUR CODE HERE
        
        Random rand = new Random();
        int answer = rand.nextInt(4);
        if (answer == 0) {
            return "i don't understand";
        }
        if (answer == 1) {
            
            return "waite a minute ill search the web for it";
        }
        if (answer == 2) {
            return "have u checked under the bed?";
        }
        if (answer == 3){
            return "your question is far beyond my computing power";
        }
        return "can you repeat this in robotic";
    }
        
        
        // NINJA BONUS
        // See the specs to overload the guessGreeting method
    // SENSEI BONUS
    // Write your own AlfredQuote method using any of the String methods you have learned!
    

}