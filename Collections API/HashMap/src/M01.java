import java.util.HashMap;

public class M01 {
    public static void main(String[] args) {
        HashMap<String, String> estadosHashMap = new HashMap<>();

        estadosHashMap.put("AC", "Acre");
        estadosHashMap.put("AL", "Alagoas");
        estadosHashMap.put("AP", "Amapá");

        for(int i = 0; i < estadosHashMap.size(); i++) {
            System.out.println(estadosHashMap.get(i));
        }
    }
}
