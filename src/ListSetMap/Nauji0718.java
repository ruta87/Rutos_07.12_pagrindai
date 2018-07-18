package ListSetMap;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Nauji0718 {

    public static void main(String[] args) {
        Person person = new Person("Ruta", "Griskoniene", 31, "Kaunas");
            /*person.setName("Ruta");
            person.setSurname("Griskoniene");
            person.setAge(31);
            person.setCity("Kaunas");*/

        Person person1 = new Person("Vytauatas", "Griskonis", 34, "Kaunas");
        Person person2 = new Person("Migle", "Griskonyte", 9, "Raudondvaris");
        Person person3 = new Person("Milda", "Griskonyte", 7, "Raudondvaris");
        List<Person> persons = new ArrayList<>();
        persons.add(person);
        persons.add(person1);
        persons.add(person2);
        persons.add(person3);

        print(persons);

        }

    private static void print(List<Person>persons){
        for (Person p : persons) {
            System.out.println(p.getCity());
        }
    }
}

