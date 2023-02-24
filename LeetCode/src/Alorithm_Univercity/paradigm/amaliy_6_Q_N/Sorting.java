package Alorithm_Univercity.paradigm.amaliy_6_Q_N;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Sorting {
        public static void main(String[] args) {
            List<Integer> list = new ArrayList<>();
            list.add(1);
            list.add(98);
            list.add(21);
            list.add(14);
            list.add(18);
            list.add(134);
            list.add(135);
            list.add(34);
            list.add(178);
            list.add(19);

            System.out.print("Listdagi elementlar :");
            list.forEach(integer -> System.out.print(integer+", "));

            list.sort(Comparator.naturalOrder());

            list.remove(list.size() - 1);
            System.out.println();
            System.out.print("Katta element o`chirilgandan so`ng: ");
            list.forEach(integer -> System.out.print(integer+", "));

        }
}
