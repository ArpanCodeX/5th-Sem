
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
    }
}
