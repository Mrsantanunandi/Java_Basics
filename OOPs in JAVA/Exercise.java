// Todo: Create an class called Employee

class Employee{
    private String name;
    private double salary;
    Employee(String name,double salary){
        this.name=name;
        this.salary=salary;
    }
    public String getDetails()
    {
        return "Name: " + name + ", Salary: " + salary;
    }
}
// Todo- Create a class Manager that:
// - Extends Employee

class Manager extends Employee{
    private String department;
    Manager(String name, double salary,String department) {
        super(name, salary);
        this.department=department;
    }
    @Override
    public String getDetails()
    {
        return super.getDetails()+", Department: " +department;
    }
}
public class Exercise {
    public static void main(String[] args) {
        // Todo: Create Employee and Manager objects
        Employee emp=new Employee("Alice",50000.0);
        Manager m=new Manager("Bob", 80000.0, "IT");

        // Todo: Print their details using getDetails()
        System.out.println(emp.getDetails());
        System.out.println(m.getDetails());
        
    }
}
