import java.util.*;

class Employee {
    String name;
    int eid;
    float salary;

    Employee(String name, int eid, float salary) {
        this.name = name;
        this.eid = eid;
        this.salary = salary;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Eid: " + eid);
        System.out.println("Salary: " + salary);
    }
}

class Payrole extends Employee {
    float allowence;
    float deduction;
    float netSalary;

    Payrole(String name, int eid, float salary, float allowence, float deduction) {
        super(name, eid, salary);
        this.allowence = allowence;
        this.deduction = deduction;
    }

    void cal() {
        netSalary = salary + allowence - deduction;
    }

    void displayPayrole() {
        display(); 
        System.out.println("Allowance: " + allowence);
        System.out.println("Deduction: " + deduction);
        System.out.println("Net Salary: " + netSalary);
    }
}

class SimpleInheritence{

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Details");
        String name=sc.nextLine();
        int eid=sc.nextInt();
        float salary=sc.nextFloat();
        float allowence=sc.nextFloat();
            float deduction=sc.nextFloat();

	Payrole obj = new Payrole(name, eid, salary, allowence, deduction);
	obj.cal();
	obj.displayPayrole();
}}

