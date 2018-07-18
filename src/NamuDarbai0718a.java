import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class NamuDarbai0718a {
    public static void main(String[] args){
        List<String> kolekcijos = new ArrayList<>();

        kolekcijos.add("Mano");
        kolekcijos.add("Musu");
        kolekcijos.add("Tavo");
        kolekcijos.add("Jusu");
        kolekcijos.add("Kiekvieno");
        kolekcijos.add("Sito");
        kolekcijos.add("Niekeno");
        kolekcijos.add("Kazkieno");
        kolekcijos.add("Nezinau");
        kolekcijos.add("Galbut");
        //kolekcijos.remove(0);

        System.out.println(kolekcijos);

        Iterator<String> iterator = kolekcijos.iterator();
        int i = 0;
        while (iterator.hasNext()){
            iterator.next();
            if(i % 2 ==0){
                iterator.remove();
            }
            i++;
        }

        System.out.println(kolekcijos);
    }
}
