public class prac8 {
    public static void main(String[] args) {
        WaitList<String> wait_test = new WaitList<String>();
        BoundedWaitList<String> bounded_test = new BoundedWaitList<String>(3);
        UnfairWaitList<String> unfair_test= new UnfairWaitList<String>();
        wait_test.add("First");
        wait_test.add("Second");
        wait_test.add("Third");
        System.out.println(wait_test);
        wait_test.remove();
        System.out.println(wait_test);
        System.out.println(wait_test.contains("First"));
        System.out.println(wait_test.isEmpty());

        bounded_test.add("One");
        bounded_test.add("Two");
        bounded_test.add("Three");
        bounded_test.add("Four");
        System.out.println(bounded_test);
        System.out.println(bounded_test.getCapacity());

        unfair_test.add("1");
        unfair_test.add("2");
        unfair_test.add("3");
        System.out.println(unfair_test);
        unfair_test.moveToBack("2");
        System.out.println(unfair_test);
    }
}
