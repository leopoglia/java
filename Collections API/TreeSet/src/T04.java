import java.util.Iterator;
import java.util.TreeSet;

public class T04 {

    public static void main(String[] args) {

        TreeSet<String> arvoresSet = new TreeSet<String>();

        arvoresSet.add("Pinheiro");
        arvoresSet.add("Cipreste");
        arvoresSet.add("Cedro");

        arvoresSet.descendingSet();

        System.out.println(arvoresSet);
    }
}
