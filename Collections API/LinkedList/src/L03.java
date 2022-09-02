import java.util.Iterator;
import java.util.LinkedList;

public class L03 {

    public static void main(String[] args) {


        LinkedList<String> listasLinkedList = new LinkedList<>();

        listasLinkedList.add("Lista 1");
        listasLinkedList.add("Lista 2");
        listasLinkedList.add("Lista 3");
        listasLinkedList.add("Lista 4");


        Iterator<String> iterator = listasLinkedList.listIterator(2);

        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
