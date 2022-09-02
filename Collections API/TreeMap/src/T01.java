import java.util.TreeMap;

public class T01 {

    public static void main(String[] args) {

        TreeMap<Integer, String> desenhoTreeMap = new TreeMap<>();

        desenhoTreeMap.put(1, "Monalisa");
        desenhoTreeMap.put(2, "O grito");
        desenhoTreeMap.put(3, "Desenho no quadro da sala B209 do senai as 21:45 do dia 01/09/2022");

        System.out.println(desenhoTreeMap);
    }
}
