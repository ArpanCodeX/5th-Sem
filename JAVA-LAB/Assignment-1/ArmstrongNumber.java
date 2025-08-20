import java.util.Scanner;

class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        int copy = n, dig = 0;
        while (copy != 0) {
            dig++;
            copy = copy / 10;
        }
        int arm = 0;
        copy = n;
        while (copy != 0) {
            arm += (int) Math.pow((copy%10), dig);
            copy /= 10;
        }

        System.out.println(n + " is " + ((n == arm) ? "a " : "not a ") + "armstrong number.");
    }
}
