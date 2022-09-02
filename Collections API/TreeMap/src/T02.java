import java.util.TreeMap;

public class T02 {

    public static void main(String[] args) {

        TreeMap<Integer, String> naoSeiTreeMap = new TreeMap<>();

        naoSeiTreeMap.put(1, "Não sei 01");
        naoSeiTreeMap.put(2, "Não sei 02");
        naoSeiTreeMap.put(3, "Não sei 03");

        TreeMap<Integer, String> naoSeiTreeMap2 = new TreeMap<>();

        naoSeiTreeMap2.putAll(naoSeiTreeMap);

        System.out.println(naoSeiTreeMap2);
    }
}
