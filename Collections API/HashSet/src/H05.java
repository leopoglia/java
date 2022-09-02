import java.util.HashSet;

public class H05 {

    public static void main(String[] args) {

        HashSet<String> horasSet = new HashSet<String>();

        horasSet.add("12:00");
        horasSet.add("13:00");
        horasSet.add("14:00");


        if (horasSet.size() == 0) {
            System.out.println("O set está vazio");
        } else {
            System.out.println("O set não está vazio");
        }
    }
}
