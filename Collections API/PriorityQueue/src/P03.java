import java.util.PriorityQueue;

public class P03 {

    public static void main(String[] args) {
        PriorityQueue<String> planetasPriorityQueue = new PriorityQueue<>();

        planetasPriorityQueue.add("Mercúrio");
        planetasPriorityQueue.add("Vênus");
        planetasPriorityQueue.add("Terra");


        PriorityQueue<String> planetasPriorityQueue2 = new PriorityQueue<>();

        planetasPriorityQueue2 = planetasPriorityQueue;
    }
}
