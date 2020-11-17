import java.util.ArrayList;
import java.util.Arrays;

public class prac11 {
    public static void main(String[] args) {
        LinkedQueue<Integer> lq = new LinkedQueue<Integer>();
        ArrayQueue<Double>aq = new ArrayQueue<Double>();
        lq.offer(1);
        System.out.println(lq);
        lq.offer(2);
        System.out.println(lq.peek());
        System.out.println(lq.poll());
        System.out.println(lq);
        ArrayList<Integer> test = new ArrayList<Integer>(Arrays.asList(10, 20, 30, 40));
        lq.add_multiple(test);
        System.out.println(lq);

        aq.offer(1.4);
        System.out.println(aq);
        aq.offer(2.7);
        System.out.println(aq.peek());
        System.out.println(aq.poll());
        System.out.println(aq);
        ArrayList<Double> test2 = new ArrayList<Double>(Arrays.asList(10.2, 20.3, 30.4, 40.5));
        aq.add_multiple(test2);
        System.out.println(aq);
    }
}
