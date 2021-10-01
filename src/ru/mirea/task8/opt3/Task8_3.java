package ru.mirea.task8.opt3;

import java.awt.*;
import javax.swing.*;

public class Task8_3 extends JFrame {
    public static void main(String[] args) {
            JFrame frame = new JFrame();
            frame.add(new ImagePanel());

            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(400, 400);
            frame.setVisible(true);

    }
}

class ImagePanel extends JPanel {

    Image image;
    public ImagePanel() {
        image = Toolkit.getDefaultToolkit().createImage("src/ru/mirea/task8/opt3/cat-dancing.gif");
    }
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (image != null) {
            g.drawImage(image, 0, 0, this);
        }
    }

}

