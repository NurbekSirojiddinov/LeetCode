package Alorithm_Univercity.paradigm.amaliy5;

import java.util.*;

public class Person {
        private String name;

        private int age;

        private String gender;

        private String nation;

    public Person(String name, int age, String gender, String nation) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.nation = nation;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", nation='" + nation + '\'' +
                '}';
    }

    public static class Nation {
        public static void main(String[] args) {
            Person person = new Person("Nurbek", 20, "Male", "Uzbek");
            Person person2 = new Person("Doniyor", 24, "Male", "Uzbek");
            Person person3 = new Person("Abror", 26, "Male", "Uzbek");
            Person person4 = new Person("Alisa", 26, "Female", "England");
            List<Person> people = new ArrayList<>(List.of(person, person2, person3, person4));
            List<Person> personList = new ArrayList<>();
            Scanner scanner = new Scanner(System.in);

            System.out.println("1 - Ismi bo`yicha qidirish");
            System.out.println("2 - Yoshi bo`yicha qidirish");
            System.out.println("3 - Jinsi bo`yicha qidirish");
            System.out.println("4 - Millati bo`yicha qidirish");

            System.out.println("Qidirish uchun raqamlardan birini tanlang");
            int number = scanner.nextInt();

            if (number == 1) {
                System.out.print("Ismni kiriting: ");
                String name = scanner.next();

                people.forEach(person1 -> {
                    if (person1.getName().equals(name)) {
                        personList.add(person1);
                    }
                });
            } else if (number == 2) {
                System.out.print("Yoshni kiriting: ");
                int name = scanner.nextInt();

                people.forEach(person1 -> {
                    if (person1.getAge() == name) {
                        personList.add(person1);
                    }
                });
            } else if (number == 3) {
                System.out.print("Jinsni kiriting: ");
                String gender = scanner.next();

                people.forEach(person1 -> {
                    if (person1.getGender().equals(gender)) {
                        personList.add(person1);
                    }
                });
            } else if (number == 4) {
                System.out.print("Millatni kiriting: ");
                String name = scanner.next();

                people.forEach(person1 -> {
                    if (person1.getNation().equals(name)) {
                        personList.add(person1);
                    }
                });
            } else {
                System.out.println("Ko`rsatilgan raqamlardan birini kiritishingiz kerak!!!");
            }
            System.out.println(personList);


            System.out.println("1 - Ismi bo`yicha saralash");
            System.out.println("2 - Yoshi bo`yicha saralash");
            System.out.println("3 - Jinsi bo`yicha saralash");
            System.out.println("4 - Millati bo`yicha saralash");
            System.out.println("Foydalanuvchilarni saralash uchun quyidagilardan birini tanlang");

            int number2 = scanner.nextInt();

            if (number2 == 1) {
                people.sort(Comparator.comparing(Person::getName));
                System.out.println(people);
            } else if (number2 == 2) {
                people.sort(Comparator.comparing(Person::getAge));
                System.out.println(people);
            } else if(number2 == 3) {
                people.sort(Comparator.comparing(Person::getGender));
                System.out.println(people);
            } else if (number2 == 4) {
                people.sort(Comparator.comparing(Person::getNation));
                System.out.println(people);
            } else {
                System.out.println("Ko`rsatilgan raqamlardan birini kiritishingiz kerak!!!");
            }
        }
    }
}
