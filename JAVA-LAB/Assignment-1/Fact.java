import java.util.*;

class Factorial {
    int fact(int x) {
        int f = 1;
        for (int i = 1; i <= x; i++) {
            f = f * i;
        }
        return f;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int x = sc.nextInt();
        Factorial f = new Factorial();
        int result = f.fact(x);
        System.out.println(x + "! = " + result);
    }

}

// import java.util.*;
// class Factorial {

//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a number : ");
//         int x = sc.nextInt();
//         int f = 1;
//         for (int i = 1; i <= x; i++) {
//             f = f * i;
//         }
//         System.out.println(x + "! = " + f);
//     }

// }



