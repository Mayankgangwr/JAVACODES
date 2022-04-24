//Class is the Blue Print of an object which hold properties
public class Javaclass {
    String Name;
    int Age;

    /*
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
         */
        Javaclass obj = new Javaclass();
        /*
         * Access Propertis of class
         */
        obj.Name = "Java Programing language";
        obj.Age = 21;
        obj.PrintInfo();

    }
}
