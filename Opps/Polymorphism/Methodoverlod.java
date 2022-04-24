package Polymorphism;

public class Methodoverlod {
    String Name;
    int Age;

    /*
     * Polymorphim is divided in two type
     * 1.Method Over loading There Is Multiple Method Haveing same name But
     * Parameter Diffrent. All Of these Method Perform Owen
     * perticular task
     */
    public void PrintInfo(String name) {
        System.out.println(name);
    }

    public void PrintInfo(int age) {
        System.out.println(age);
    }

    public void PrintInfo(String name, int age) {
        System.out.println(name);
        System.out.println(age);
    }

    public static void main(String[] args) {
        /*
         * Object is a real world entity
         * Syntax:- Class_name obj_name = new Class_name();
         * here we are passing some value in side object constructor these value
         * Parameterized construct will get and initiale to class variables
         */
        Methodoverlod obj = new Methodoverlod();
        /*
         * Access Propertis of class
         */
        obj.PrintInfo(21);
        obj.PrintInfo("Prince");
        obj.PrintInfo("Prince Daka", 21);

    }

}
