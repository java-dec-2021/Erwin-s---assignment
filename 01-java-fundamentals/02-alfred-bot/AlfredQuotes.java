import java.util.Date;
public class AlfredQuotes {
    public String basicGreeting() {
        return "Hello, lovely to see you. How are you?";
    }

    public String guestGreeting(String name, String dayPeriod) {
        String wow = "Good " + dayPeriod + "," + " " + name + "." + " How lovley to see you.";
        return wow;
    }

    public String dateAnnouncement() {
        Date date = new Date();
        return "The current date is: " + date;
    }
    
    public String respondBeforeAlexis(String conversation) {
        int alexisInConvo = conversation.indexOf("Alexis");
        int alfredInConvo = conversation.indexOf("Alfred");
        String alfredResponse = "Right away, sir. She certainly isn't sophisticated enough for that.";
        String alfredResponse2 = "As you wish. But of course, naturally";
        if (alexisInConvo > -1){
            return alfredResponse;
        } else if(alfredInConvo > -1){
            return alfredResponse2;
        }else{
            return "Right. And with that I shall retire.";
        }
    }

}
