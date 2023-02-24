package Alorithm_Univercity.Graphic;

import javax.swing.*;
import java.awt.*;

public class Main extends  JFrame {
    Main() {
        setSize(1000, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        MainJpaPanel panel = new MainJpaPanel();
        panel.setBackground(Color.black);
        add(panel);
    }

    public static void main(String[] args) {
        new Main().setVisible(true);
    }
}