package Alorithm_Univercity.paradigm;

public class Player {
    private String name;
    private int goals;
    private int yellow_cards;
    private int red_cards;

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", goals=" + goals +
                ", yellow_cards=" + yellow_cards +
                ", red_cards=" + red_cards +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGoals() {
        return goals;
    }

    public void setGoals(int goals) {
        this.goals = goals;
    }

    public int getYellow_cards() {
        return yellow_cards;
    }

    public void setYellow_cards(int yellow_cards) {
        this.yellow_cards = yellow_cards;
    }

    public int getRed_cards() {
        return red_cards;
    }

    public void setRed_cards(int red_cards) {
        this.red_cards = red_cards;
    }
}
