/* 
Developer: Tyler Ellis
Date: 5/20/2018
Name: AppleOrangeInventory.java
Discription: simple program to keep track of Apples and Oranges. If inventory
is to low, program will order more. 
*/
package AppleCount;

import java.util.Scanner;

public class AppleCount {
    public static void main(String[] args) {
//Set up all variables in order to save data needed.
        int apples_on_hand = 0;
        int oranges_on_hand = 0;
        int apples_needed = 0;
        int oranges_needed = 0;
        int apples_order = 0;
        int orange_order = 0;
        int new_orange_order = 0;
        int new_apple_order = 0;
// String variables used for yes/no questions.        
        String apple_answer = "";
        String orange_answer = "";
        String answer_a = "";
        String answer_o = "";
        
// Count current inventory on hand. 
        Scanner scnr = new Scanner(System.in);
        System.out.println("How many apples are on hand?");
        apples_on_hand = scnr.nextInt();
        
        System.out.println("How many Oranges are on hand?");
        oranges_on_hand = scnr.nextInt();
        
// Compare to how many Should be in Stock verses how many ARE in stock        
        System.out.println("How many apples should be on hand?");
        apples_needed = scnr.nextInt();
        
        System.out.println("How many Oranges should be on hand?");
        oranges_needed = scnr.nextInt();
        
// Decide whether or not you would like to order more Inventory.        
        if(apples_needed >= apples_on_hand){
            System.out.println("Would you like to order more apples?");
            apple_answer = scnr.next();
        } else { 
            System.out.println("More apples in stock than what is required.");
        }
        
        if(apple_answer.equals("yes")){
            System.out.println("How many would you like to order?");
            new_apple_order = scnr.nextInt();
        } else if(apple_answer.equals("no")){ 
            System.out.println("No apples Ordered.");
        }        

// Determine how much more Inventory you would like to order.         
        if(apple_answer.equals("yes")){
        System.out.println("To verify, You would like to order "+new_apple_order+" more apples?"); // Verify the amount you want to order.
        answer_a = scnr.next();

// Final Verification and successful order prompt. 
        if(answer_a.equals("yes")){
            System.out.println(new_apple_order+" apples ordered."+"\n");

// Determine how much more Inventory you would like to order.         
        if(oranges_needed >= oranges_on_hand){
            System.out.println("Would you like to order more Oranges?"); 
            orange_answer = scnr.next();
        } else { 
            System.out.println("More Oranges in stock than what is required.");
        }

// Determine how much more Inventory you would like to order.         

        if(orange_answer.equals("yes")){
            System.out.println("How many would you like to order?");
            new_orange_order = scnr.nextInt();
        } else if(orange_answer.equals("no")){ 
            System.out.println("No oranges Ordered."+"\n");
        }        
        
        if(orange_answer.equals("yes")){
        System.out.println("To verify, You would like to order "+new_orange_order+" more oranges?"); // Verify the amount you want to order.
        answer_o = scnr.next();

        if(answer_o.equals("yes")){
            System.out.println(new_orange_order+" oranges ordered.");
        }// TODO code application logic here
        }
      }
    }
  }
}