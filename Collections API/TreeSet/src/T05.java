import java.util.TreeSet;

public class T05 {

    public static void main(String[] args) {

        TreeSet<String> marcasSet = new TreeSet<String>();

        marcasSet.add("Apple");
        marcasSet.add("Samsung");
        marcasSet.add("Xiaomi");


        System.out.println("Primeiro -> " + marcasSet.first());
        System.out.println("Ultimo -> " + marcasSet.last());

    }
}
