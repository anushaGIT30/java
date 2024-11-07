class Shape1 {
    public void area() {
        System.out.println("The area is called");
    }

    class Triangle extends Shape1 { // Changed to 'Triangle' for convention
        public void area(int l, int h) {
            System.out.println(0.5 * l * h); // Fixed area calculation
        }
    }
}

// it is a single inheritance
public class inh {
    public static void main(String[] args) {
        Shape1 shape1 = new Shape1();
        Shape1.Triangle tri = shape1.new Triangle(); // Correctly instantiate the inner class
        tri.area(2, 3); // Call the area method with parameters
    }
}
