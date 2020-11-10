import java.util.ArrayList;
import java.util.LinkedList;

public class Lab7 {
    public static void main(String[] args) {
        //===================================== Arraylist tests=================================//
        ArrayList<String> arraylist_test = new ArrayList<String>(3);
        String test = "Sample text1", test2 = "Sample text2";
        arraylist_test.add(test);
        System.out.println(arraylist_test);
        arraylist_test.add(test2);
        System.out.println(arraylist_test);
        arraylist_test.add("third line");
        System.out.println(arraylist_test.get(2));
        System.out.println("Index of test2 line in the arraylist: " + arraylist_test.indexOf(test2));
        arraylist_test.remove(test);
        System.out.println(arraylist_test);
        arraylist_test.set(1, test);
        System.out.println(arraylist_test);
        System.out.println("========================================");
        //===================================== Linkedlist tests=================================//
        LinkedList<String> linkedlist_test = new LinkedList<String>();
        linkedlist_test.add("Middle");
        linkedlist_test.addLast("Second to last");
        linkedlist_test.addFirst("Second");
        System.out.println(linkedlist_test);
        linkedlist_test.addFirst("First");
        linkedlist_test.addLast("Last");
        System.out.println(linkedlist_test);
        System.out.println(linkedlist_test.peekFirst());
        System.out.println(linkedlist_test.peekLast());
        linkedlist_test.removeFirst();
        System.out.println(linkedlist_test);
    }
}
