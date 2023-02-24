package Alorithm_Univercity.paradigm.amaliy_6_Q_N;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<Quiz> questions = question();

        String[] answer = new String[4];

        int count = 1;
        for (int i = 0; i < questions.size(); i++) {
            System.out.println(count++ + ". " + questions.get(i).getQuestion());
            int a = 65;
            for (int j = 0; j < 3; j++) {
                System.out.println((char) a + ") " + questions.get(i).getOptions().get(j));
                a++;
            }
            System.out.print("Javobni tanlang : ");
            String choice = scanner.nextLine();
            answer[i] = choice;

        }

        int count_1 = 1;

        for (int i = 0; i < questions.size(); i++) {
            if (questions.get(i).getAnswer().equals(answer[i])) {
                System.out.println(count_1 + ") " + answer[i] + " ✅");
            } else {
                System.out.println(count_1 + ") " + answer[i] + " ❌");
            }

            count_1++;
        }


    }

    private static List<Quiz> question() {
        List<Quiz> questions = new ArrayList<>();

        Quiz question_1 = new Quiz();
        question_1.setQuestion("Nortoy kim ?");
        List<String> quiz_1 = new ArrayList<>();
        quiz_1.add("U hechkim");
        quiz_1.add("U xotinini eri");
        quiz_1.add("U ukasini akasi");
        question_1.setAnswer("A");
        question_1.setOptions(quiz_1);

        Quiz question_2 = new Quiz();
        question_2.setQuestion("Toshkent teleminorasining balandligi qancha ?");
        List<String> quiz_2 = new ArrayList<>();
        quiz_2.add("330 metr ");
        quiz_2.add("300 metr");
        quiz_2.add("375 metr");
        question_2.setAnswer("C");
        question_2.setOptions(quiz_2);

        Quiz question_3 = new Quiz();
        question_3.setQuestion("AQSH poytaxti ?");
        List<String> quiz_3 = new ArrayList<>();
        quiz_3.add("New York");
        quiz_3.add("Washington");
        quiz_3.add("Los Angeles");
        question_3.setAnswer("B");
        question_3.setOptions(quiz_3);

        Quiz question_4 = new Quiz();
        question_4.setQuestion("Germaniya poytaxti ?");
        List<String> quiz_4 = new ArrayList<>();
        quiz_4.add("Berlin");
        quiz_4.add("Bavariya");
        quiz_4.add("Brussel");
        question_4.setAnswer("A");
        question_4.setOptions(quiz_4);

        questions.add(question_1);
        questions.add(question_2);
        questions.add(question_3);
        questions.add(question_4);
        return questions;
    }
}
