class Employee {
    String name;
    int id;
    double basicSalary;
    
    Employee(String name, int id, double basicSalary){
        this.name = name;
        this.id = id;
        this.basicSalary = basicSalary;
    }

    double calculateSalary(){
        return basicSalary;
    }

    public String toString(){
        return "Employee : " + name + " (" + id + ") " + "Salary : " + calculateSalary();
    }
}

class Manager extends Employee {
    double bonus;
    Manager(String name, int id, double basicSalary, double bonus){
        super(name, id, basicSalary);
        this.bonus = bonus;
    }

    @Override
    double calculateSalary(){
        double salary = basicSalary + bonus;
        return salary;    
    }
    
    @Override
    public String toString(){
        return "Manager : " + name + " (" + id + ") " + "Salary : " + calculateSalary();
    }
}

public class Main {
    public static void main(String[] args){
        
    Employee one = new Employee("Sam", 2, 5000);
    Manager two = new Manager("John", 12, 7000, 3000);
    
    System.out.println(one.toString());
    System.out.println(two.toString());
    }
}