// import java.util.Scanner;

// class StarPattern {
//     void xStar(int n) {
//         for (int i = 1; i <= n; i++) {
//             for (int j = 1; j <= n; j++) {
//                 System.out.print((i == j || (n - i + 1) == j ? "*" : " ") + " ");
//             }
//             System.out.println();
//         }
//     }
//     void diamondStar(int n){
//         int mid = n / 2; // center index

//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < n; j++) {
//                 // Manhattan distance from center
//                 if (Math.abs(mid - i) + Math.abs(mid - j) <= mid) {
//                     System.out.print("* ");
//                 } else {
//                     System.out.print("  ");
//                 }
//             }
//             System.out.println();
//         }
//     }

        
    

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter an odd number : ");
//         int n = sc.nextInt();
//         StarPattern s = new StarPattern();
//         s.xStar(n);
//         s.diamondStar(n);
//     }
// }

import java.util.Scanner;

class StarPattern {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an odd number : ");
        int n = sc.nextInt();
        int mid = n / 2; // center index

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // Manhattan distance from center
                if (Math.abs(mid - i) + Math.abs(mid - j) <= mid) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
