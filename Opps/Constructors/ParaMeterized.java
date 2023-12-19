package Constructors;

public class ParaMeterized {
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
     * In Paraneterized Constructor there are passing Parameters and Performing
     * a task which is included(Initializing values).
     * inside the constructor And How many time You will create onj. that much times
     * Constructor will call.
     */
    ParaMeterized(String name, int age) {
        this.Name = name;
        this.Age = age;
    }

    public static void main(String[] args) {
        /*
         * Object is a real world entity
         * Syntax:- Class_name obj_name = new Class_name();
         * here we are passing some value in side object constructor these value
         * Parameterized construct will get and initiale to class variables
         */
        ParaMeterized obj = new ParaMeterized("Java Programing language", 21);
        /*
         * Access Propertis of class
         */
        obj.PrintInfo();

    }
}