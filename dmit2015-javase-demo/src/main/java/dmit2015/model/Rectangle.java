package dmit2015.model;

public class Rectangle {
    
    public double width;
    public double length;

    // Getters and Setters
    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    // No-argument Constructors
    public Rectangle() {
        width = 1;
        length = 1;
    }
    
    // Instance-level returns area of this rectangle
    public double area() {
        return width * length;
    }
    
    public static void main(String[] args) {
        // Create a new rectangle
        Rectangle currentRectangle = new Rectangle();
        // Set width and length values
        currentRectangle.setWidth(5);
        currentRectangle.setLength(3);
        // Show width, length, and area values
        System.out.printf("Width: %.2f, Length: %.2f, Area: %.2f\n",
                currentRectangle.width,
                currentRectangle.length,
                currentRectangle.area());
    }
}
