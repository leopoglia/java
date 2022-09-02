import java.util.ArrayList;

public class A03 {

    public static void main(String[] args) {


        ArrayList<String> stringArrayList = new ArrayList<>();


        stringArrayList.add("String 01");
        stringArrayList.add("String 02");
        stringArrayList.add("String 03");
        stringArrayList.add("String 04");
        stringArrayList.add("String 05");
        stringArrayList.add(0, "String 06");

        for (int i = 0; i < stringArrayList.size(); i++) {
            System.out.println(stringArrayList.get(i));
        }

    }
}
