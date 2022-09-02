import java.util.PriorityQueue;

public class P01 {
    public static void main(String[] args) {
        PriorityQueue<String> coresPriorityQueue = new PriorityQueue<>();

        coresPriorityQueue.add("Azul");
        coresPriorityQueue.add("Amarelo");
        coresPriorityQueue.add("Vermelho");

        System.out.println(coresPriorityQueue);
    }
}
