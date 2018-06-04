import java.util.Scanner;
import java.lang.Math; // needed for math functions

public class PaintEstimator{
    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);
        double wallHeight = 0.0;
        double wallWidth = 0.0;
        double wallArea = 0.0;
        double gallonsPaintNeeded = 0.0;
        int cansNeeded = 0;

        final double one_gallon_covers=350; // known constants
        final double gallonsPerCan = 1.0;


        // Height input
        System.out.println("Enter wall height (feet): ");
        wallHeight=scnr.nextDouble();

        // Width input
        System.out.println("Enter wall width (feet): ");
        wallWidth=scnr.nextDouble();

        wallArea=wallWidth*wallHeight; // wall area

        System.out.println("Wall area: "+wallArea+" square feet"); // area of the wall

        gallonsPaintNeeded = wallArea/one_gallon_covers; // paint needed

        System.out.print("Paint needed: "+gallonsPaintNeeded+" gallons"+"\n"); // number of gallons needed
        
        System.out.println("Cans needed: "+Math.round(gallonsPaintNeeded)+" can(s)"); //rounding the remainder
        
        return;
    }
}