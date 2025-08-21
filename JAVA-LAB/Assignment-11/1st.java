
import java.util.*;
import mypackage.Reverse;
class Main {

    public static void main(String[] args) {
        Reverse ob1 = new Reverse();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        System.out.println("Reverse of " + n + " is : " +ob1.reverse(n));
    }
}
