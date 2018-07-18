package SecondTask;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListNamuDarbai {
    public static void main(String[] args) {

        List<String> vardai = new LinkedList<>();

        vardai.add("Ruta");
        vardai.add("Vytautas");
        vardai.add("Saulius");
        vardai.add("Migle");
        vardai.add("Milda");

        for (String vardas : vardai){
            if (vardas.length() > 6) {
                System.out.println(vardas);
            }

        }

    }
}
