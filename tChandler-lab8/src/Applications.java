/* 
 * Treasure Chandler
 * CS 16000-01 02/03, Fall Semester 2024
 * Lab 8
 * 
 * This class provides some Scanner functionality in order
 * for the user to input their own values of the length
 * and width of a rectangle. It also prints the rectangle's
 * calculated area and perimeter in the console (the 
 * "boxes" having hardcoded values are also calculated).
 * Finally, the class also utilizes the equals() method from
 * the Rectangle class to return some logic of comparing two
 * "boxes" with each other.
 */

import java.util.*;     // Needed for the Scanner class

public class Applications {
    /**
     * 
     * @param args      Entered values
     */
    public static void main(String[] args) {
        // Variables declaration
        // Problem 2(a):
        double length;
        double width;
        String str1, str2;

        // Problem 2(b):
        /*
         * Solicits two numbers from the console and saves
         * those variables in the "length" and "width" variables
         */
        Scanner sc = new Scanner(System.in);
        str1 = "What will be the length of your rectangle?";
        str2 = "What will be the width of your rectangle?";

        System.out.println(str1);
        length = sc.nextDouble();

        System.out.println(str2);
        width = sc.nextDouble();

        sc.close();
        
        // Problem 2(c):
        // Declares and instantiates a rectangle object, "box"
        Rectangle box = new Rectangle(length, width);

        // Problem 2(d):
        // Declares and instantiates another rectangle object, "box2"
        Rectangle box2 = new Rectangle();

        // Problem 2(e):
        // Call setLength() and setWidth()
        box2.setLength(90);
        box2.setWidth(20);

        // Problem 2(f):
        // Call displayRectangle() for "box" and "box2"
        str1 = "\"Box's\" dimensions:";
        System.out.println(str1);
        box.displayRectangle();

        str2 = "\"Box2's\" dimensions:";
        System.out.println(str2);
        box2.displayRectangle();

        // Problem 2(g):
        /*
         * Call equals() with box2 as the parameter. 
         * This compares the values between "box" and "box2".
         * The returned boolean will be printed to the console
         */
        str1 = "It is " + box.equals(box2) + " that \"Box\" and \"Box2\" are the same";
        System.out.println(str1);

        // Problem 2(h):
        // Declares and instantiates another rectangle object, "box3"
        Rectangle box3 = new Rectangle();

        // Problem 2(i):
        /*
         * Get the length and width using "box", and assign the
         * local variables "length" and "width" to the values
         * returned by the getter methods
         */
        length = box.getLength();
        width = box.getWidth();

        // Problem 2(j):
        /*
         * Set the length and width using "box3", with the
         * parameters of those methods using the local variables
         * "length" and "width"
         */
        box3.setLength(length);
        box3.setWidth(width);

        // Problem 2(k):
        /*
         * Call equals() with "box", using "box3" for the parameter.
         * This compares the values between "box" and "box3". The
         * returned boolean will be printed to the console
         */
        str1 = "It is " + box.equals(box3) + " that \"Box\" and \"Box3\" are the same";
        System.out.println(str1);

        // Problem 2(l):
        /*
         * Computes the area and perimeter of all of the boxes, along
         * with printing them to the console
         */
        System.out.println("\nArea of \"Box\": " + box.computeArea() + "\n" +
                            "Perimeter of \"Box\": " + box.computePerimeter() +
                            "\n");

        System.out.println("Area of \"Box2\": " + box2.computeArea() + "\n" +
                            "Perimeter of \"Box2\": " + box2.computePerimeter() +
                            "\n");

        System.out.println("Area of \"Box3\": " + box3.computeArea() + "\n" +
                            "Perimeter of \"Box3\": " + box3.computePerimeter() +
                            "\n");

        // Problem 2(m):
        // Declares and instantiates another rectangle object, "box4"
        Rectangle box4 = new Rectangle();
        /*
         * Call setLength() and setWidth() for later printing "box4"'s
         * length and width
         */
        box4.setLength(50);
        box4.setWidth(20);
        // Call displayRectangle() for box4
        str1 = "\"Box4's\" dimensions:";
        System.out.println(str1);
        box4.displayRectangle();
    } // End of main()
} // End of Applications

/*
 * Problem 2(f) comment:
 * 
 * My inputs were 60 and 30, respectively. The parameters for
 * box2.setLength() and box2.setWidth() were 90 and 20, respectively.
 * 
 * The console output shows:
 * The length is: 60.00
 * The width is: 30.00
 * The length is: 90.00
 * The width is: 20.00
 * 
 * So, this means that the field values do correspond to my input.
 */

/*
 * Problem 2(g) comment:
 * 
 * My inputs were 60 and 30, respectively.
 * 
 * The console output shows:
 * false
 * 
 * So, this means both the length and width of "box" is not equal
 * to "box2"'s length and width.
 */

/*
 * Problem 2(k) comment:
 * 
 * My inputs were 60 and 30, respectively.
 * 
 * The console output shows:
 * true
 * 
 * So, this means both the length and width of "box" is equal to
 * "box3"'s length and width.
 */

/*
 * Problem 2(l) comment:
 * 
 * My inputs were 60 and 30, respectively. The parameters for
 * box2.setLength() and box2.setWidth() were 90 and 20, respectively.
 * 
 * The console output shows:
 * Area of box: 1800.0
 * Perimeter of box: 180.0
 *
 * Area of box2: 1800.0
 * Perimeter of box2: 220.0
 *
 * Area of box3: 1800.0
 * Perimeter of box3: 180.0
 */