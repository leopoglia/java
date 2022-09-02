import java.util.TreeMap;

public class T03 {

    public static void main(String[] args) {

        TreeMap<Integer, String> numerosTreeMap = new TreeMap<>();

        numerosTreeMap.put(1, "1");
        numerosTreeMap.put(2, "2");
        numerosTreeMap.put(3, "3");

        if(numerosTreeMap.containsKey(2)){
            System.out.println("Map 2");
        }
    }
}
