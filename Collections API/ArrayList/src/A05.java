import java.util.ArrayList;

public class A05 {
    public static void main(String[] args) {

        ArrayList<String> stringArrayList = new ArrayList<>();

        stringArrayList.add("a");
        stringArrayList.add("b");
        stringArrayList.add("c");
        stringArrayList.add("d");
        stringArrayList.add("e");
        stringArrayList.add("f");

        stringArrayList.remove(5);
        stringArrayList.add(5, "g");


    }
}
