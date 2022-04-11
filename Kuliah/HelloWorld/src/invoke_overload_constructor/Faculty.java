
package invoke_overload_constructor;


public class Faculty extends Employee{
    public static void main(String[] args){
        new Faculty();
    }
    
    public Faculty(){
        System.out.println("(4) Performs Faculti's Tasks ");
    }
    
} 


class Employee extends Person{
    public Employee(){
        this("(2) Invokes Employee's overloaded constructor");
        System.out.println("(3) Performs Employee's tasks ");
    }
    
    public Employee(String s){
        System.out.println(s);
    }
}


class Person {
    public Person(){
        System.out.println("(1) Performs person's task");
    }
}
