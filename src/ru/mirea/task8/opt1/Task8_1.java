package ru.mirea.task8.opt1;

import javax.swing.*;
import java.awt.*;
import java.util.Random;


public class Task8_1 {
    public static void main(String args[]){
        JFrame root = new JFrame("Task8");
        root.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel a = new JPanel();
        a.setLayout(new BorderLayout());
        Color[] colors = new Color[]{Color.red, Color.blue, Color.yellow, Color.gray, Color.green, Color.pink};
        Random rand = new Random();
        for (int i=0; i<20; i++){
            switch ((int)(Math.random()*2)) {
                case 0:
                    a.add(new Rectangle(
                            rand.nextInt(200),
                            rand.nextInt(200),
                            rand.nextInt(50)+50,
                            rand.nextInt(50)+50,
                            colors[rand.nextInt(colors.length)]
                    ));
                    break;
                case 1:
                    a.add(new Circle(
                            rand.nextInt(200),
                            rand.nextInt(200),
                            rand.nextInt(50)+50,
                            colors[rand.nextInt(colors.length)]
                    ));
                    break;
                default:
                    break;
            }
        }
        a.setSize(500, 500);
        a.setVisible(true);
        root.setContentPane(a);
        root.pack();
        root.setLocationRelativeTo(null);
        root.setVisible(true);
        root.setSize(500,500);

    }
}
