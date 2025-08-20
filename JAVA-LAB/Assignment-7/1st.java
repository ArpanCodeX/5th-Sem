import java.util.*;

class First{
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.print("Enter an index to see the element : ");
        int idx = sc.nextInt();
        try {
            System.out.println("The element at index "+idx +" is "+arr[idx]);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        finally{
            // System.out.println(arr[8]);
            System.out.println("This is finally Block!");
        }
    }

}