import java.util.TreeMap;

public class T05 {

    public static void main(String[] args) {

        TreeMap<Integer, String> numerosTreeMap = new TreeMap<>();

        numerosTreeMap.put(1, "1");
        numerosTreeMap.put(2, "2");
        numerosTreeMap.put(3, "3");

        for (int i = 0; i <= numerosTreeMap.size(); i++){
            if(numerosTreeMap.containsKey(i)){
                System.out.println(i);
            }
        }
    }
}
