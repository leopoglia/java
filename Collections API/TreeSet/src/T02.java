import java.util.Iterator;
import java.util.TreeSet;

public class T02 {
    public static void main(String[] args) {
        TreeSet<String> windowsSet = new TreeSet<String>();

        windowsSet.add("Windows 7");
        windowsSet.add("Windows 8");
        windowsSet.add("Windows 10");

        Iterator<String> iterator = windowsSet.iterator();

        for (int i = 0; i < windowsSet.size(); i++) {
            System.out.println(iterator.next());
        }
    }
}
