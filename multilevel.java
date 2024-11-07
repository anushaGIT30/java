class shape2 {
    public void area() {
        System.out.println("it displays area");
    }

}

class Triangle1 extends shape2 {

    public void area(int l, int h) {
        System.out.println(0.5 * l * h);
    }
}

class EquilateralTriangle extends Triangle1 {
    public void area(int l, int h) {
        System.out.println(0.5 * l * h);
    }
}

// this is a multi level inheritancce
// in java multiple inheritance is not supported
public class multilevel {
    public static void main(String[] args) {
        shape2 s = new shape2();
        Triangle1 t = new Triangle1();
        EquilateralTriangle e = new EquilateralTriangle();
        t.area(4, 6);
        e.area(2, 2);
        s.area();
    }
}
