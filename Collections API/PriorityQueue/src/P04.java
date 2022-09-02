import java.util.PriorityQueue;

public class P04 {

    public static void main(String[] args) {
        PriorityQueue<String> floresPriorityQueue = new PriorityQueue<>();

        floresPriorityQueue.add("Rosa");
        floresPriorityQueue.add("Margarida");
        floresPriorityQueue.add("Tulipa");

        floresPriorityQueue.offer("Girassol");

        System.out.println(floresPriorityQueue);
    }
}
