import java.util.Scanner;

class FirstProgram {
    public static void main(String[] args) {
        float n1,n2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number:");
        n1 = sc.nextFloat();
        System.out.println("Enter second number:");
        n2 = sc.nextFloat();
        try{
            float div=n1/n2;
            System.out.println("Division is: " + div);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed."+e);
        }

    }
}