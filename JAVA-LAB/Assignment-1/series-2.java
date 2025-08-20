
// 9. 1 + 1/2! - 1/3! + 1/4! - ----- 1/n!
// import java.util.Scanner;

// class Series2 {
//     int fact(int x) {
//         int f = 1;
//         for (int i = 1; i <= x; i++) {
//             f = f * i;
//         }
//         return f;
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a number : ");
//         int n = sc.nextInt();
//         Series2 f = new Series2();
//         float s = 0;

//         for (int i = 1; i <= n; i++) {
//             if (i % 2 == 0) {

//                 s += (1.0 / (float) f.fact(i));
//                 System.out.print(" + " + 1 + "/" + i + "!");

//             } else {
//                 if (i == 1) {
//                     s += (1.0 / (float) f.fact(i));
//                     System.out.print(1 + "!");
//                 } else {
//                     s -= (1.0 / (float) f.fact(i));
//                     System.out.print(" - " + 1 + "/" + i + "!");
//                 }
//             }
//             if (i == n) {
//                 System.out.println(" = " + s);
//             }
//         }

//     }
// }

import java.util.Scanner;

class Series2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        int f = 1;
        float s = 0;

        for (int i = 1; i <= n; i++) {
            f *= i;
            if (i % 2 == 0) {
                s += (1.0 / (float) f);
                System.out.print(" + " + "1/" + i + "!");

            } else {
                
                if (i == 1) {
                    s += (1.0 / (float) f);
                    System.out.print("1");
                } else {
                    s -= (1.0 / (float) f);
                    System.out.print(" - " + "1/" + i + "!");
                }
            }

        }
        System.out.println(" = " + s);

    }
}
