package Alorithm_Univercity.Graphic;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Merriedpeople {
    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();

        Person person = new Person();
        person.setName("Vali");
        person.setFamilyasi("Valiyev");
        person.setUylangan(true);

        Person person2 = new Person();
        person2.setName("Nurbek");
        person2.setFamilyasi("Valiyev");
        person2.setUylangan(true);

        Person person3 = new Person();
        person3.setName("Asliddin");
        person3.setFamilyasi("Valiyev");
        person3.setUylangan(false);
        list.add(person);
        list.add(person2);
        list.add(person3);
        System.out.println("\n\n\n");

        System.out.println(list.stream().filter(person1 -> person1.uylangan).collect(Collectors.toList()));
    }
}
