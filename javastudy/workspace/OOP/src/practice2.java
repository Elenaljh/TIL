import java.util.*;
public class practice2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Rabbit");
        list.add("Tiger");
        list.add("Frog");
        list.add("Dog");
        list.add("Cat");

        ListIterator<String> it = list.listIterator();

        while(it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();

        while(it.hasPrevious()) {
            System.out.print(it.previous() + " ");
        }
    }
}
