
import java.util.*;

class Linked_List {

    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();
        System.out.println(ll);
        ll.add("A");
        ll.add("B");
        ll.add("D");
        ll.add(1, "C");
        System.out.println(ll.size());
        System.out.println(ll);
        ll.remove("A");
        ll.remove(2);
        System.out.println("Remove index 2 : " + ll);
        System.out.println(ll.add("E"));
        String val = ll.get(2);
        ll.set(2, val + "changed");
        System.out.println(ll);
        // ArrayList<Integer> ll = new ArrayList<>();
        // ll.add(1);
        // ll.add(2);
        // Integer a[] = new Integer[ll.size()];
        // a = ll.toArray(a);
        // int s=0;
        // for (int i : a) {
        //     System.out.println(i);

        //     s+=i;
        // }
        // System.out.println(s);
        // System.out.println(ll.get(0));
    }
}
