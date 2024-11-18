/* Treasure Chandler
 * CS 16000-01 02/03, Fall Semester 2024
 * Lab 8
 * 
 * This class provides functionality for creating a rectangle shape.
 * It retrieves its length and width, calculates its area and perimeter,
 * and displays the values of its length and width in the console.
 */

public class Rectangle {
    // Variables declaration
    // Problem 1(a):
    private double length;
    private double width;

    // Problem 1(b):
    /**
     * Accesses the rectangle's length
     * @return      Returns the rectangle's length
     */
    public double getLength() {
        return this.length;
    } // End of getLength()

    /**
     * Updates the rectangle's length
     * @param recLength     Returns the rectangle's length
     */
    public void setLength(double recLength) {
        /*
         * Only updates the length if the "recLength" parameter
         * is not negative. Otherwise, set it to zero
         */
        this.length = (recLength > 0) ? (this.length = recLength) : (this.length = 0);
    } // End of setLength()

    /**
     * Accesses the rectangle's witdh
     * @return      Returns the rectangle's width
     */
    public double getWidth() {
        return this.width;
    } // End of getWidth()

    /**
     * Updates the rectangle's width
     * @param recWidth      Returns the rectangle's width
     */
    public void setWidth(double recWidth) {
        /*
         * Only updates the length if the "recLength" parameter
         * is not negative. Otherwise, set it to zero
         */
        this.width = (recWidth > 0) ? (this.width = recWidth) : (this.width = 0);
    } // End of setWidth()

    // Problem 1(c):
    /**
     * Computes the area of the rectangle
     * @return      Returns the calculated area of the rectangle
     */
    public double computeArea() {
        return this.length * this.width;
    } // End of the computeArea()

    // Problem 1(d):
    /**
     * Computes the perimeter of the rectangle
     * @return      Returns the calculated perimeter of the rectangle
     */
    public double computePerimeter() {
        return 2 * (length + width);
    } // End of computePerimeter()

    // Problem 1(e):
    /**
     * Returns a string message revealing the length and width of the rectangle
     */
    public String toString() {
        return String.format("The length is: %.2f\n" + 
                                "The width is: %.2f\n",
                                length, width);
    } // End of toString()

    // Problem 1(f):
    /**
     * Prints the value of toString() to the console
     */
    public void displayRectangle() {
        System.out.println(toString());
    } // End of displayRectangle()

    // Problem 1(g):
    /**
     * Compares the "length" and width "variables" to the "other" parameter
     * @param other     Value to compare the current length and width to
     * @return          Returns if length and with equal the value of the "other" parameter
     */
    public boolean equals(Rectangle other) {
        return length == other.length && width == other.width;
    } // End of equals()

    // Problem 1(h):
    /**
     * Initializer constructor for Rectangle
     * @param len       Rectangle length
     * @param w         Rectangle width
     */
    public Rectangle(double len, double w) {
        length = len;
        width = w;
    } // End of constructor Rectangle

    /**
     * Default constructor for Rectangle
     */
    public Rectangle() {

    } // End of constructor Rectangle
} // End of Rectangle