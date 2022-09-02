import java.util.Iterator;
import java.util.PriorityQueue;

public class P02 {

    public static void main(String[] args) {
        PriorityQueue<String> setasPriorityQueue = new PriorityQueue<>();

        setasPriorityQueue.add("↑");
        setasPriorityQueue.add("→");
        setasPriorityQueue.add("↓");
        setasPriorityQueue.add("←");

        Iterator<String> iterator = setasPriorityQueue.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }



    }
}
