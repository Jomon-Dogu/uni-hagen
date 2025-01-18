import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> l1 = new LinkedList<String>(); // Corrected variable name
        List<Integer> l2 = new LinkedList<Integer>();
        l1.add("wrw"); // Use the correct variable name
        System.out.println(l1); // Print the list to verify


        l2.add(4);
        l2.add(3);
        l2.add(5);

        System.out.println(l2);

        List<Integer> l3 = l2.subList(1, 3);    // fromIndex: Der Startindex (inklusive) der Teilliste. In diesem Fall ist es Index 1.
                                                // toIndex: Der Endindex (exklusive) der Teilliste. In diesem Fall ist es Index 3.
        System.out.print(l3);
    }
}
