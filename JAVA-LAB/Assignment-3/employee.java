import java.util.*;

class Employee {
    String name;
    int emp_ID;
    float salary;

    Employee(String name, int emp_ID, float salary) {
        this.name = name;
        this.emp_ID = emp_ID;
        this.salary = salary;
    }

    void displayInfo() {
        System.out.println("\nEmployee Name : " + name);
        System.out.println("Employee ID : " + emp_ID);
        System.out.println("Employee Salary : " + salary + "");
    }
}

class PayRole extends Employee {
    float allowance, deduction;

    PayRole(String name, int emp_ID, float salary, float allowance, float deduction) {
        super(name, emp_ID, salary);
        this.allowance = allowance;
        this.deduction = deduction;
    }

    float calculateNetSalary() {
        // basic + allow - deduction
        return salary + allowance - deduction;
    }

    void displayInfo() {
        super.displayInfo();
        System.out.println("Allowance : " + allowance);
        System.out.println("Deduction : " + deduction);
        System.out.println("Net Salary : " + calculateNetSalary());
    }
}

class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String name;
        int id;
        float salary, allowance, deduction;
        System.out.print("Enter employee name : ");
        name = sc.nextLine();
        System.out.print("Enter employee Id : ");
        id = sc.nextInt();
        System.out.print("Enter employee salary : ");
        salary = sc.nextFloat();

        System.out.print("Enter employee allowance : ");
        allowance = sc.nextFloat();
        System.out.print("Enter employee deduction : ");
        deduction = sc.nextFloat();

        PayRole emp1 = new PayRole(name, id, salary, allowance, deduction);
        emp1.displayInfo();
    }
}