class Shape3Example {
    public void printArea() {
        System.out.println("area is calculated");
    }

}

class rectangle extends Shape3Example {
    public void printArea(int l, int b) {
        System.out.println("the area of rectangle is: " + l * b);
    }
}

class circle extends Shape3Example {
    public void printArea(int r) {
        System.out.println("the area of circle is:" + (3.14) * r * r);
    }
}

public class hirarchial {
    public static void main(String[] args) {

        Shape3Example se = new Shape3Example();
        rectangle r = new rectangle();
        circle c = new circle();
        se.printArea();
        r.printArea(3, 4);
        c.printArea(3);
    }

}