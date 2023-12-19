package Constructors;

public class Defaultconstruct {
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

    public static void main(String[] args) {
        /*
         * Object is a real world entity
         * Syntax:- Class_name obj_name = new Class_name();
         * Defaul Constructor is creating when Object will crate we are Writing
         * Class_name(); atfer new Keyword.
         * its default Constructor.
         */
        Defaultconstruct obj = new Defaultconstruct();
        /*
         * Access Propertis of class
         */
        obj.Name = "Java Programing language";
        obj.Age = 21;
        obj.PrintInfo();

    }
}