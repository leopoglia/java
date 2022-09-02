import java.util.LinkedList;

public class L01 {
    public static void main(String[] args) {
        LinkedList<String> coresLinkedList = new LinkedList<>();

        coresLinkedList.add("Azul");
        coresLinkedList.add("Verde");
        coresLinkedList.add("Roxo");
        coresLinkedList.add("Preto");

        for(int i = 0; i < coresLinkedList.size(); i++) {
            System.out.println(coresLinkedList.get(i));
        }
    }
}
