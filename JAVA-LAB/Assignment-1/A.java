import java.util.*;

class Sum {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in); // Scanner is name of the class and Sc is the object
        System.out.println("Enter a number. :");
        int a = sc.nextInt();
        System.out.println("Enter another number : ");
        int b = sc.nextInt();
        int c = a + b;
        System.out.println("The sum is : " + c);
    }
}