package Alorithm_Univercity.paradigm.amaliy_6_Q_N;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Ishchilar ishchilar_1 = new Ishchilar("Qurbonmurodov Nurbek Ilhom o`g`li ",21,"Erkak","2 yil","Uzbek","Qashqadaryo v. Qamashi t.");
        Ishchilar ishchilar_2 = new Ishchilar("Quvondiqov Norpo`lat Muzaffar o`g`li ",20,"Erkak","1 yil","Uzbek","Jizzax v. Gallaorol t.");
        Ishchilar ishchilar_3 = new Ishchilar("Axmadjonov Eliboy Asliddin o`g`li ",21,"Erkak","3 yil","Uzbek","Jizzax v. Baxmal t.");
        Ishchilar ishchilar_4 = new Ishchilar("Poyonov Ravshan Zoxid o`g`li ",20,"Erkak","3 oy","Uzbek","Samarqand v. Xatirchi t.");
        Ishchilar ishchilar_5 = new Ishchilar("Sodiqova Sevara Shukurjon qizi ",20,"Ayol","7 yil","Uzbek","Farg`ona v. Buvayda t.");
        Ishchilar ishchilar_6 = new Ishchilar("Fayzullayev Nurlilla Siroj o`g`li ",21,"Erkak","2 yil","Uzbek","Qashqadaryo v. Qamashi t.");
        Ishchilar ishchilar_7 = new Ishchilar("Qurbonmurodov Jo`rabek Ilhom o`g`li ",17,"Erkak","1 yil","Uzbek","Qashqadaryo v. Qamashi t.");
        Ishchilar ishchilar_8 = new Ishchilar("Qurbonmurodov Nurbek Ilhom o`g`li ",21,"Erkak","2 yil","Uzbek","Qashqadaryo v. Qamashi t.");
        Ishchilar ishchilar_9 = new Ishchilar("Ganiyev Tursinxon Akmal o`g`li ",21,"Erkak","2 yil","Uzbek","Navoiy v. Sog`bo`lasizlar t.");

        List<Ishchilar> ishchilars = new ArrayList<>(List.of(ishchilar_1, ishchilar_2, ishchilar_3, ishchilar_4, ishchilar_5, ishchilar_6, ishchilar_7, ishchilar_8, ishchilar_9));

        System.out.println("Ishchilarni umumiy ro`yxati");
        ishchilars.forEach(System.out::println);


        ishchilars.sort(Comparator.comparing(Ishchilar::getFIO));

        System.out.println("So`rt qilingandan keyingi ro`yxati");
        ishchilars.forEach(System.out::println);
    }
}

