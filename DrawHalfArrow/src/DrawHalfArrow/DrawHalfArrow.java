//package DrawHalfArrow;

/*
Developer: Tyler Ellis
*/



import java.util.Scanner;
    public class DrawHalfArrow {
        public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int arrowBaseHeight = 0;
        int arrowBaseWidth = 0;
        int arrowHeadWidth = 0;

        System.out.println("Enter arrow base height: ");
        arrowBaseHeight = scnr.nextInt(); // base height

        System.out.println("Enter arrow base width: ");
        arrowBaseWidth = scnr.nextInt(); // base width
        System.out.println("Enter arrow head width: ");
        arrowHeadWidth = scnr.nextInt(); // head width
        while (arrowHeadWidth <= arrowBaseWidth) { // loop
        System.out.println("Enter arrow head width: ");
        arrowHeadWidth = scnr.nextInt(); // head width
        }
        /*
        Drawing the base
        */
        for (int x= 0; x< arrowBaseHeight; x++) { // loop to reached base height
        for (int y = 0; y < arrowBaseWidth; y++) { // loop to reached base width
        System.out.print("*"); 
        }
        System.out.println("");
        }
        /*
        Drawing the head
        */
        for (int x= arrowHeadWidth; x> 0; x--) {
        for (int y = 0; y < x; y++) { // will loop until it reaches the value of x
        System.out.print("*");
        }
        System.out.println("");
        }
        return;
    }
}