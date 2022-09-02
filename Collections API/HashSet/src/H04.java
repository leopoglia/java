import java.util.HashSet;

public class H04 {

    public static void main(String[] args) {

        HashSet<String> timeSet = new HashSet<String>();

        timeSet.add("Palmeiras");
        timeSet.add("São Paulo");
        timeSet.add("Corinthians");
        timeSet.add("Internacional");

        for (int i = 0; i < timeSet.size(); i++) {
            timeSet.remove(i);
            System.out.println("Esvaziou o set " + i);
        }
    }
}
