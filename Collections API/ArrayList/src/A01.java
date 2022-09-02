import java.util.ArrayList;

public class A01 {

    public static void main(String[] args) {
        ArrayList<String> coresArrayList = new ArrayList<>();

        coresArrayList.add("Azul");
        coresArrayList.add("Verde");
        coresArrayList.add("Roxo");
        coresArrayList.add("Preto");


        for(int i = 0; i < coresArrayList.size(); i++){
            System.out.println(coresArrayList.get(i).toString());
        }

    }

}
