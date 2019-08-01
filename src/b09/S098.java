package b09;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class S098 {
    public static void main(String[] args) {
        Queue<Integer> q = aQueue();
        System.out.println(q);

        if (q.offer(18)) {
            System.out.println("18 has been added");//printa solo se lo inserisce il 18 (in questo caso non ho limitazioni, quindi lo stamperebbe comunque)
        }

        System.out.println("The first element in queue (or throws): " + q.element());
        System.out.println("Again, the first element (or null): " + q.peek());

        System.out.println("Remove (or throws): " + q.remove());
        System.out.println("Poll (or null): " + q.poll());
    }

    private static Queue<Integer> aQueue() {
        return new LinkedList<>(Arrays.asList(5, -3, -1, 12, 27, 5));
    }
}
