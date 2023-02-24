package Alorithm_Univercity.paradigm.amaliy6;

import java.util.Scanner;

public class Days {
        public static void main(String[] strings) {

        Scanner input = new Scanner(System.in);

        int number_Of_DaysInMonth = 0;
        String MonthOfName = "Unknown";

        System.out.print("Input a month number: ");
        int month = input.nextInt();

        System.out.print("Input a year: ");
        int year = input.nextInt();

            switch (month) {
                case 1 -> {
                    MonthOfName = "January";
                    number_Of_DaysInMonth = 31;
                }
                case 2 -> {
                    MonthOfName = "February";
                    if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
                        number_Of_DaysInMonth = 29;
                    } else {
                        number_Of_DaysInMonth = 28;
                    }
                }
                case 3 -> {
                    MonthOfName = "March";
                    number_Of_DaysInMonth = 31;
                }
                case 4 -> {
                    MonthOfName = "April";
                    number_Of_DaysInMonth = 30;
                }
                case 5 -> {
                    MonthOfName = "May";
                    number_Of_DaysInMonth = 31;
                }
                case 6 -> {
                    MonthOfName = "June";
                    number_Of_DaysInMonth = 30;
                }
                case 7 -> {
                    MonthOfName = "July";
                    number_Of_DaysInMonth = 31;
                }
                case 8 -> {
                    MonthOfName = "August";
                    number_Of_DaysInMonth = 31;
                }
                case 9 -> {
                    MonthOfName = "September";
                    number_Of_DaysInMonth = 30;
                }
                case 10 -> {
                    MonthOfName = "October";
                    number_Of_DaysInMonth = 31;
                }
                case 11 -> {
                    MonthOfName = "November";
                    number_Of_DaysInMonth = 30;
                }
                case 12 -> {
                    MonthOfName = "December";
                    number_Of_DaysInMonth = 31;
                }
            }
        System.out.print(MonthOfName + " " + year + " has " + number_Of_DaysInMonth + " days\n");
    }
}
