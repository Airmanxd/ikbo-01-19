import java.util.ArrayDeque;
import java.util.Scanner;

public class prac7 {
    public static String game()
    {
        ArrayDeque<Integer> deq1 = new ArrayDeque<Integer>();
        ArrayDeque<Integer> deq2 = new ArrayDeque<Integer>();
        int temp, temp2, i;
        Scanner in = new Scanner(System.in);
        for(i = 0 ; i < 5; i++)
        {
            temp = in.nextInt();
            if(temp == 0)
                temp+=10;
            deq1.addFirst(temp);
        }
        for(i = 0 ; i < 5; i++)
        {
            temp = in.nextInt();
            if(temp == 0)
                temp+=10;
            deq2.addFirst(temp);
        }
        for(i = 0; i < 106; i++)
        {
            if(deq1.peek() == null)
                return "second " + i;
            if(deq2.peek() == null)
                return "first " + i;
            if(deq1.getFirst() < deq2.getFirst())
            {
                deq2.addLast(deq2.pollFirst());
                deq2.addLast(deq1.pollFirst());
            }
            else
            {
                deq1.addLast(deq1.pollFirst());
                deq1.addLast(deq2.pollFirst());
            }
        }
        return "botva";
    }

    public static void main(String[] args) {
        System.out.println(game());
    }
}
