
import java.util.ArrayList;

class Al {

    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        System.out.println(al);
        al.add("A");
        al.add("B");
        al.add("D");
        al.add(1, "C");
        System.out.println(al.size());
        System.out.println(al);
        al.remove("A");
        al.remove(2);
        System.out.println(al.add("e"));
        // ArrayList<Integer> al = new ArrayList<>();
        // al.add(1);
        // al.add(2);
        // Integer a[] = new Integer[al.size()];
        // a = al.toArray(a);
        // int s=0;
        // for (int i : a) {
        //     System.out.println(i);

        //     s+=i;
        // }
        // System.out.println(s);
        // System.out.println(al.get(0));
    }
}
