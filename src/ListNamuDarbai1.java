import java.util.Set;
import java.util.TreeSet;

public class ListNamuDarbai1 {
    public static void main(String[] args) {
        Set<Integer> skaiciai = new TreeSet<>();

        skaiciai.add(1);
        skaiciai.add(15);
        skaiciai.add(20);
        skaiciai.add(12);
        skaiciai.add(5);
        skaiciai.add(9);

        for (Integer skaicius : skaiciai){
            if (skaicius >= 5 && skaicius <= 10){
                System.out.println(skaicius);
            }
        }
    }
}
