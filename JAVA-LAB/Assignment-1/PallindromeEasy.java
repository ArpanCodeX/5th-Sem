import java.util.*;

class Pallindrome {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        int copy = n, rev = 0;
        while (copy != 0) {
            rev = rev * 10 + (copy % 10);
            copy = copy / 10;
        }
        System.out.println(n + " is " + ((n == rev) ? "a " : "not a ") + "pallindrome number.");
    }
}
