package Constructors;

public class NonparaMeterized {
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
     * In Non-Paraneterized Constructor there is no Parameter passing and Performing
     * a task which is included
     * inside the constructor And How many time You will create onj. that much times
     * Constructor will call.
     */
    NonparaMeterized() {
        System.out.println("NonparaMeterized Constructor has Called");
    }

    public static void main(String[] args) {
        /*
         * Object is a real world entity
         * Syntax:- Class_name obj_name = new Class_name();
         */
        NonparaMeterized obj = new NonparaMeterized();
        /*
         * Access Propertis of class
         */
        obj.Name = "Java Programing language";
        obj.Age = 21;
        obj.PrintInfo();

    }
}