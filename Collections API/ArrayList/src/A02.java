import java.util.ArrayList;
import java.util.Iterator;

public class A02 {
    public static void main(String[] args) {

        ArrayList<String> stringArrayList = new ArrayList<>();

        stringArrayList.add("a");
        stringArrayList.add("b");
        stringArrayList.add("c");
        stringArrayList.add("d");
        stringArrayList.add("e");
        stringArrayList.add("f");


        Iterator<String> iterator = stringArrayList.iterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
