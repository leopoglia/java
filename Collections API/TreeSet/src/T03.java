import java.util.TreeSet;

public class T03 {

    public static void main(String[] args) {

        TreeSet<String> nuvemSet = new TreeSet<String>();

        nuvemSet.add("Amazon");
        nuvemSet.add("Azure");
        nuvemSet.add("Google");

        TreeSet<String> nuvemSet2 = new TreeSet<String>();

        nuvemSet2 = nuvemSet;

        System.out.println(nuvemSet2);
    }
}
