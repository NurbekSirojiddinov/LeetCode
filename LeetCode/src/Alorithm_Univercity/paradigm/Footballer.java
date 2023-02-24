package Alorithm_Univercity.paradigm;

import java.util.*;

public class Footballer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, List<Player>> map = new HashMap<>();
        List<Player> players = new ArrayList<>();

        Player player1 = new Player();
        player1.setName("Messi");
        player1.setGoals(800);
        player1.setYellow_cards(4);
        player1.setYellow_cards(26);

        Player player2 = new Player();
        player2.setName("Halland");
        player2.setGoals(322);
        player2.setYellow_cards(4);
        player2.setRed_cards(1);

        Player player3 = new Player();
        player3.setName("Mbappe");
        player3.setRed_cards(2);
        player3.setYellow_cards(78);
        player3.setGoals(400);

        players.add(player1);
        players.add(player2);
        players.add(player3);
        System.out.println("Quydagilardan birini tanlang(tartib raqam bo`yicha):");
        System.out.println("1.Gollar soni bo`yicha");
        System.out.println("2.Saqriq kartochkalar soni bo`yicha");
        System.out.println("3.Qizil kartochkalar soni bo`yicha");
        int num = scanner.nextInt();
        if (num == 1) {
            System.out.println(player1.getName() + " " + player1.getGoals());
            System.out.println(player2.getName() + " " + player2.getGoals());
            System.out.println(player3.getName() + " " + player3.getGoals());
        } else if (num == 2) {
            System.out.println(player1.getName() + " " + player1.getYellow_cards());
            System.out.println(player2.getName() + " " + player2.getYellow_cards());
            System.out.println(player3.getName() + " " + player3.getYellow_cards());
        } else if (num == 3) {
            System.out.println(player1.getName() + " " + player1.getRed_cards());
            System.out.println(player2.getName() + " " +  " " + player2.getRed_cards());
            System.out.println(player3.getName() + " " + player3.getRed_cards());
        } else {
            System.out.println(map);
        }
    }
}
