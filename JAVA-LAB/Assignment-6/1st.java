
import java.util.Scanner;



class First {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers : ");
        float n1 = sc.nextFloat(),n2=sc.nextFloat();
        try {
            float div = n2/n1;
            System.out.println(n2 + "/" + n1 + " = " + div);
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Error!!!");
        }
        
    }
}
