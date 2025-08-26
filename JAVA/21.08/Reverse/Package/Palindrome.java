package Package;
import java.util.Scanner;

class Palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ClassRev ob=new ClassRev();
        int p=ob.reverseNum(n);
        if(p==n){
            System.out.println("Number is Palindrome");
        }else{
            System.out.println("Not");
        }
    }
}
