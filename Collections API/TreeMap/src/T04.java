import java.util.TreeMap;

public class T04 {

    public static void main(String[] args) {

        TreeMap<Integer, String> numerosTreeMap = new TreeMap<>();

        numerosTreeMap.put(1, "1");
        numerosTreeMap.put(2, "2");
        numerosTreeMap.put(3, "3");

        if (numerosTreeMap.containsValue("3")) {
            System.out.println("Contains 3");
        }

    }
}
