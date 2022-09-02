import java.util.HashMap;

public class M05 {

    public static void main(String[] args) {

        HashMap<Integer, String> feriadosHashMap = new HashMap<>();

        feriadosHashMap.put(1, "Natal");
        feriadosHashMap.put(2, "Pascoa");
        feriadosHashMap.put(3, "Carnaval");

        System.out.println("Hash map está vazio? " + feriadosHashMap.isEmpty());
    }
}
