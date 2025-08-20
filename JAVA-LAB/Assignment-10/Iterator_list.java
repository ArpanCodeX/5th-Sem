
import java.util.*;

class Itr {

    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        System.out.println(al);
        al.add("A");
        al.add("B");
        al.add("D");
        al.add(1, "C");
        System.out.println(al.size());
        System.out.println(al);

        Iterator<String> iterate = al.iterator();
        while (iterate.hasNext()) {
            System.out.print(iterate.next() + "  ");
        }
        ListIterator<String> iter = al.listIterator();
        while (iter.hasNext()) {
            String element = iter.next();
            iter.set(element + "+");
        }
        System.out.println(iterate.hasNext());
        // System.out.println(al);
        iterate = al.iterator();
        while (iterate.hasNext()) {
            System.out.print(iterate.next() + " ");

        }
        iterate.hashCode();
        while (iter.hasPrevious()) {
            System.out.print(iter.previous() + " ");

        }
    }
}
