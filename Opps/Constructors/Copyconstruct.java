package Constructors;

public class Copyconstruct {
    String Name;
    int Age;

    /*
     * Constructor It is use to value Initialize . there is no return type,
     * It called One at Object Creating.
     * Method is use to particuler task . Its Helps to reuse black of code
     * Syntax:- modifir_name Return_type Method_name( Arguments){}
     */
    public void PrintInfo() {
        System.out.println(this.Name);
        System.out.println(this.Age);
    }

    /*
     * In Copy Constructor there are passing other Constructor and Performing
     * a task which is included(Initializing values).
     * inside the constructor And How many time You will create onj. that much times
     * Constructor will call.
     */
    Copyconstruct(Copyconstruct obj2) {
        this.Name = obj2.Name;
        this.Age = obj2.Age;
    }

    Copyconstruct() {

    }

    public static void main(String[] args) {
        /*
         * Object is a real world entity
         * Syntax:- Class_name obj_name = new Class_name();
         * here we are passing some value in side object constructor these value
         * Parameterized construct will get and initiale to class variables
         */
        Copyconstruct obj = new Copyconstruct();
        /*
         * Access Propertis of class
         */
        obj.Name = "Java Programing language";
        obj.Age = 21;
        Copyconstruct obj2 = new Copyconstruct(obj);
        obj2.PrintInfo();
    }
}