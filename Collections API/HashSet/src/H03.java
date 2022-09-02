import java.util.HashSet;

public class H03 {

    public static void main(String[] args) {

        HashSet<String> JogadorDeFutebolset = new HashSet<String>();

        JogadorDeFutebolset.add("Ronaldo");
        JogadorDeFutebolset.add("Messi");
        JogadorDeFutebolset.add("Neymar");

        System.out.println("Número de jogadores: " + JogadorDeFutebolset.size());
    }
}
