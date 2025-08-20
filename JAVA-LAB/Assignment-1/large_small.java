import java.util.Scanner;

class LargeSmall {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();

        int greatest = (a > b && a > c) ? a : (b > c ? b : c);
        int smallest = (a < b && a < c) ? a : (b < c ? b : c);

        System.out.println(greatest + " is the greatest number. And " + smallest + " is the smallest number.");
    }
}
