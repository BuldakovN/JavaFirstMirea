package ru.mirea.task8.opt2;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;

public class Task8_2 {
    static BufferedImage image;
    public static void main(String[] args) {
        JFrame frame = new JFrame("Image app");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        try {
            File f = new File("src/ru/mirea/task8/opt2/" + args[0]);
            image = ImageIO.read(f);
        } catch (Exception e) {
            System.out.println("Bad file");
            System.out.println(e.getMessage());
            return;
        }

        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(image, 0, 0, this);
            }

            @Override
            public Dimension getPreferredSize() {
                return new Dimension(image.getWidth(), image.getHeight());
            }
        };
        frame.add(panel, BorderLayout.CENTER);
        frame.pack();
        frame.setVisible(true);
    }
}
