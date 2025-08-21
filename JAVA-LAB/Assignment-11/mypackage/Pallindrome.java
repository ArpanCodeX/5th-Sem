package mypackage;

import java.util.Scanner;

public class Pallindrome {

    public static void main(String[] args) {
        Reverse ob = new Reverse();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        if (ob.reverse(n) == n) {
            System.out.println(n + " is a pallindrome number.");
        } else {
            System.out.println(n + " is not a pallindrome number.");
        }
        Myclass ob1 = new Myclass();
        ob1.show();
    }
}
