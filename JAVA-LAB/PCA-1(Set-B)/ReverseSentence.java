
import java.util.*;

class ReverseSentence {

    // String reverseWord(String w) {
    //     String re = "";
    //     for (int i = 0; i < w.length(); i++) {
    //         re = re + w[i];
    //     }
    //     return re;
    // }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // String s = "Mohandas Karamchand Gandhi";
        System.out.print("Write your sentence : ");
        String s = sc.nextLine();
        String[] li = s.split(" ");
        String re = "";
        for (int i = li.length - 1; i >= 0; i--) {
            re = re + li[i] + " ";
        }
        System.out.println(re);

    }
}
