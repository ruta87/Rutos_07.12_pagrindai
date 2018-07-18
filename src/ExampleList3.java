import java.util.*;

public class ExampleList3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> vardai = new ArrayList<>();

        for (int i = 0; i < 5; i++){
            System.out.println("Prasau ivesti nauja " +i+ "varda");
            String vardas = scanner.nextLine();
            vardai.add(vardas);
        }
        Collections.sort(vardai);

        vardai.forEach(System.out :: println);

    }
}
