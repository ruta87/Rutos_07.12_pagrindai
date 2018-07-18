import java.util.Set;
import java.util.TreeSet;

public class SetExample {
    public  static void main(String[] args) {
        Set<String> names = new TreeSet<>();

        names.add("Jonas");
        names.add("Ruta");
        names.add("Antanas");
        names.add("Azuolas");
        names.add("Jonas");

        System.out.println(names.size());
        //nuo java 8 versijos, names = SET,
        names.forEach(System.out:: println);
    }
}
