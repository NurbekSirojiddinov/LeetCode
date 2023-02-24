package Alorithm_Univercity.Graphic;

import javax.swing.*;
import java.awt.*;

public class MainJpaPanel extends JPanel {
    @Override
    public void paint(Graphics g) {
        super.paint(g);

        g.setColor(Color.white);
        g.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 30));
        g.drawString("Hello World", 50, 50);

        g.drawLine(100, 100, 200, 150);
        // g.drawRect(100, 200, 100, 50);
        g.fillRect(100, 200, 100, 50);
        g.fillOval(300, 200, 100, 100);
        g.fillArc(400, 200, 100, 100, 0, 90);
        int[] x = {100, 200, 300};
        int[] y = {400, 300, 400};
        int n = 3;

        g.drawPolygon(x, y, n);
    }

}
