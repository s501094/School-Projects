//package TextMsgExpander;
/*
Developer: tylere
 */
import java.util.Scanner;
 
public class TextMsgExpander {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String BFF = "best friend forever";
        String IDK = "I don't know";
        String JK = "just kidding";
        String TMI = "too much information";
        String TTYL = "talk to you later";
        String userLine = "";
        
        // Prompt user for text
        System.out.println("Enter text: ");
        userLine = scnr.nextLine();
        System.out.println("You entered: " + userLine);
        System.out.println("");

          // Check for abbreviations
        if (userLine.indexOf("BFF")!= -1) {
            System.out.println("Replaced \"BFF\" with \"best friend forever\".");
            userLine = userLine.replace("BFF", "best friend forever");
            } 
        if (userLine.indexOf("IDK")!= -1){
            System.out.println("Replaced \"IDK\" with \"I don't know\".");
            userLine = userLine.replace("IDK", "I don't know");
            }
        if (userLine.indexOf("JK")!= -1){
            System.out.println("Replaced \"JK\" with \"just kidding\".");
            userLine = userLine.replace("JK", JK);
            }
        if (userLine.indexOf("TMI")!= -1){
            System.out.println("Replaced \"TMI\" with \"too much information\".");
            userLine = userLine.replace("TMI", "too much information");
            }
        if (userLine.indexOf("TTYL")!= -1){
            System.out.println("Replaced \"TTYL\" with \"talk to you later\".");
            userLine = userLine.replace("TTYL", "talk to you later");
            }
        System.out.println("");
        System.out.println("Expanded: " + userLine);
        return;     
    }
}
