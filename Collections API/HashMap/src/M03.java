import java.util.HashMap;

public class M03 {

    public static void main(String[] args) {

        HashMap<Integer, String> letrasHashMap = new HashMap<>();

        letrasHashMap.put(1, "A");
        letrasHashMap.put(2, "B");
        letrasHashMap.put(3, "C");

        HashMap<Integer, String> letrasHashMap2 = new HashMap<>();

        letrasHashMap2.put(4, "D");
        letrasHashMap2.put(5, "E");
        letrasHashMap2.put(6, "F");


        letrasHashMap2.putAll(letrasHashMap);


        System.out.println(letrasHashMap2);
    }
}
