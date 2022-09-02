import java.util.HashSet;
import java.util.Iterator;

public class H02 {

    public static void main(String[] args) {

        HashSet<String> set = new HashSet<String>();

        set.add("four");
        set.add("six");
        set.add("eight");

        Iterator<String> iterator = set.iterator();

        for (int i = 0; i < set.size(); i++) {
            System.out.println(iterator.next());
        }

    }
}
