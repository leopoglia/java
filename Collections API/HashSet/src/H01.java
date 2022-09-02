import java.util.HashSet;

public class H01 {
    public static void main(String[] args) {

        HashSet<String> set = new HashSet<String>();

        set.add("one");
        set.add("two");
        set.add("three");

        for (String s : set) {
            System.out.println(s);
        }

    }
}
