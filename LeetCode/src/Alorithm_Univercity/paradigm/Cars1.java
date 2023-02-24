package Alorithm_Univercity.paradigm;

import java.util.ArrayList;
import java.util.List;

public class Cars1 {
    public static void main(String[] args) {
        List<CarsService> carsServiceList = new ArrayList<>();
        CarsService cars = new CarsService("Yengil aftamabil","Malibu","2018","1.8","200","Uzbekistan","GM Uzbekistan");
        CarsService cars1 = new CarsService("Yengil aftamabil","Nexia 3","2020","1.6","150","Uzbekistan","GM Uzbekistan");
        CarsService cars2 = new CarsService("Yengil aftamabil","Treker","2019","1.5","180","Uzbekistan","GM Uzbekistan");
        CarsService cars3 = new CarsService("Yengil aftamabil","Treblezer","2021","2.0","220","Uzbekistan","GM Uzbekistan");
        carsServiceList.add(cars);
        carsServiceList.add(cars1);
        carsServiceList.add(cars2);
        carsServiceList.add(cars3);
        for (int i = 0; i < carsServiceList.size(); i++) {
            System.out.println((i+1)+"."+carsServiceList.get(i));
        }
    }
}
