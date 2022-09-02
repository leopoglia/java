import java.util.HashMap;

public class M04 {

    public static void main(String[] args) {

        HashMap<Integer, String> dataHashMap = new HashMap<>();

        dataHashMap.put(1, "1 de outubro");
        dataHashMap.put(2, "2 de novembro");
        dataHashMap.put(3, "3 de dezembro");

        dataHashMap.clear();

        System.out.println("dataHashMap foi esvaziado.");
    }
}
