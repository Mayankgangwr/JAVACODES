package Inheritances;

/*
 * Inheritace here we are going to inherit Parent class Property Inside the
 * child class by use extendes  keyword It's Used to reuse of code
 * There are Four Type of Inheritance
 * 1. it is The Example Of Single Lavel Inheritance
 */
// Shape class is A parent Class Here Color is a property of this class 
class Shape {
    public void Area() {
        System.out.println("Shape Area");
    }
}

// In Tringle Class we have Inherit Shape Class properties By Using extends
class Tringle extends Shape {
    public void Area(int h, int l) {
        float c = .5f;
        float a = (c * h * l);
        System.out.println(a);
    }
}

class EquilateralTringle extends Shape {
    public void Area(int h, int l) {
        float c = .5f;
        float a = (c * h * l);
        System.out.println(a);
    }
}

public class HierarichalInheritances {

    public static void main(String[] args) {
        EquilateralTringle tr = new EquilateralTringle();

        tr.Area(29, 5);
    }
}
