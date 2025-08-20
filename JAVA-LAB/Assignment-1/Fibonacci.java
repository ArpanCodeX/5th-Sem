// 10. Fibonacci

// import java.util.Scanner;

// class Fibonacci {
//     void fibo(int n) {
//         int a = 0, b = 1;
//         for (int i = 0; i < n; i++) {
//             System.out.print(a + " ");
//             int temp = a + b;
//             a = b;
//             b = temp;
//         }
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter  a number : ");
//         int num = sc.nextInt();
//         Fibonacci f = new Fibonacci();
//         f.fibo(num);
//     }
// }
// 10. Fibonacci

import java.util.Scanner;

class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter  a number : ");
        int n = sc.nextInt();
        int a = 0, b = 1;
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            int temp = a + b;
            a = b;
            b = temp;
        }
    }
}  