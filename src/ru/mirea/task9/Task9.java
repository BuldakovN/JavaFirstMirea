package ru.mirea.task9;

import javax.swing.*;
import javax.swing.JButton;
import javax.swing.JComponent;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Task9 {
    protected static int firstScore=0, secondScore=0;
    public static void main(String[] args) {
        JFrame root = new JFrame();
        JPanel panel = new JPanel();
        root.setContentPane(panel);
        root.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        root.setLayout(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();

        JLabel result = new JLabel("0 x 0");
        JLabel lastScorer = new JLabel("N/A");
        JLabel winner = new JLabel("Winner: Draw");

        JButton button1 = new JButton("Мадрид");
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                firstScore+=1;
                result.setText(firstScore + " x " + secondScore);
                lastScorer.setText("Мадрид");
                if (firstScore>secondScore){winner.setText("Winner: Мадрид");}
                else if(firstScore<secondScore){winner.setText("Winner: Милан");}
                else{winner.setText("Winner: DRAW");}
            }
        });
        button1.setSize(10,50);
        panel.add(button1, constraints);


        JButton button2 = new JButton("Милан");
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                secondScore+=1;
                result.setText(firstScore + " x " + secondScore);
                lastScorer.setText("Милан");
                if (firstScore>secondScore){winner.setText("Winner: Мадрид");}
                else if(firstScore<secondScore){winner.setText("Winner: Милан");}
                else{winner.setText("Winner: DRAW");}
            }
        });
        button2.setSize(10,50);
        panel.add(button2, constraints);

        constraints.gridy=1;
        panel.add(result, constraints);
        panel.add(lastScorer, constraints);

        constraints.gridy=2;
        constraints.gridwidth=2;
        panel.add(winner, constraints);

        root.setSize(200,200);
        root.setVisible(true);
    }
}
