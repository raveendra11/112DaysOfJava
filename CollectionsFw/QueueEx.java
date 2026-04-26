import java.util.PriorityQueue;
import java.util.Queue;

public class QueueEx{

    public static void main(String[] args){
        
        Queue<Integer> pq = new PriorityQueue<>();
        
        pq.add(50);
        pq.add(20);
        pq.add(40);
        pq.add(10);
        pq.add(30);
        
        System.out.println("PriorityQueue elements: " + pq);
    }
}
