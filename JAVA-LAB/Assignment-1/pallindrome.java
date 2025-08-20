import java.util.Scanner;

class Pallindrome {
    boolean isPallindrome(int n) {
        int copy = n, rev = 0;
        while (copy != 0) {
            rev = rev * 10 + (copy % 10);
            copy = copy / 10;
        }
        return n == rev;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        Pallindrome p = new Pallindrome();
        if (p.isPallindrome(n)) {
            System.out.println(n + " is a pallindrome number.");
        } else {
            System.out.println(n + " is not a pallindrome number.");
        }
    }
}
