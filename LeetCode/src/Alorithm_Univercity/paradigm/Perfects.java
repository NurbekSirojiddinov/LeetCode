package Alorithm_Univercity.paradigm;

import java.util.*;

public class Perfects {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        Student student = new Student();
        Map<String, List<Student>> listMap = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        Student student1 = new Student();
        student1.setSinf("5-sinf");
        student1.setName("Qurbonmurodov Nurbek");
        student1.setGrade(5);
        students.add(student1);
        Student student2 = new Student();
        student2.setSinf("5-sinf");
        student2.setName("Sirojiddinov Nurbek");
        student2.setGrade(5);
        Student student3 = new Student();
        student3.setSinf("3-sinf");
        student3.setName("Rahmonov Humoyun");
        student3.setGrade(3);
        students.add(student1);
        students.add(student2);
        students.add(student3);
        listMap.put("Ona-tili", students);

        student1.setGrade(4);
        student1.setGrade(4);
        student1.setGrade(2);

        List<Student> students1 = new ArrayList<>();
        students1.add(student1);
        students1.add(student2);
        students1.add(student3);
        listMap.put("Matematika", students1);

        student1.setGrade(3);
        student1.setGrade(2);
        student1.setGrade(5);

        List<Student> students2 = new ArrayList<>();
        students2.add(student1);
        students2.add(student2);
        students2.add(student3);
        listMap.put("Tabiatshunoslik", students2);

        System.out.println("Quydagi fanlardan birini tanlang(tartib raqam bo`yicha):");
        System.out.println("1.Ona-tili");
        System.out.println("2.Matematika");
        System.out.println("3.Tabiatshunoslik");
        int num = scanner.nextInt();
        if (num == 1) {
            System.out.println("Ona-tili");
            System.out.println(student1.getName()+" " + student1.getGrade());
            System.out.println(student2.getName()+" " + student2.getGrade());
            System.out.println(student3.getName()+" " + student3.getGrade());
        }else if(num == 2) {
            System.out.println("Matematika");
            System.out.println(student1.getName()+" " + student1.getGrade());
            System.out.println(student2.getName()+" " + student2.getGrade());
            System.out.println(student3.getName()+" " + student3.getGrade());
        } else if(num==3) {
            System.out.println("Tabiatshunoslik");
            System.out.println(student1.getName()+" " + student1.getGrade());
            System.out.println(student2.getName()+" " + student2.getGrade());
            System.out.println(student3.getName()+" " + student3.getGrade());
        }else {
            System.out.println(listMap);
            System.out.println("Bunday fan mavjud emas!!");
        }

    }
}
