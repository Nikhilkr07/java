// Association example

public class Employee {
    String name;
    int age;
    Address add;

    Employee(String name, int age){
        this.name = name;
        this.age = age;
        add = new Address("Ranchi","jharkhand","India");
    }

    void show(){
        System.out.println("Name of Employee : "+name);
        System.out.println("Age of Employee : "+age);
        System.out.println("Address of Employee : "+add.city+" "+add.state+" "+add.country);
    }

    public static void main(String[] args) {
        Employee e = new Employee("Nikhil", 19);
        e.show();
    }
}

class Address{
    String city,state,country;

    Address(String city, String state, String country){
        this.city = city;
        this.state = state;
        this.country = country;
    }
}

// class Salary{

// }
