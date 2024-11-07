
class pen {
    String color;
    String type; // like gelpen,ball pen;

    public void Write() {
        System.out.println("the pen is writing");
    }

    public void printColor() {
        System.out.println("the color is:" + this.color);
        // this can be used to refer current class instance variable.
    }
}

public class oops {
    public static void main(String[] args) {
        // creating object
        pen Pen1 = new pen();
        Pen1.color = "blue";
        Pen1.type = "gel";
        pen Pen2 = new pen();
        Pen2.color = "black";
        Pen2.type = "ballpoint";

        Pen1.Write();
        Pen1.printColor();
        Pen2.printColor();

    }
}
