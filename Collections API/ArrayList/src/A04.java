import java.util.ArrayList;

public class A04 {
    public static void main(String[] args) {

        ArrayList<String> stringArrayList = new ArrayList<>();

        stringArrayList.add("a");
        stringArrayList.add("b");
        stringArrayList.add("c");


        for(int i = 0; i < stringArrayList.size(); i++){
            if(stringArrayList.get(i).equals("b")){
                System.out.println("B -> " + i);
            }
        }
    }
}
