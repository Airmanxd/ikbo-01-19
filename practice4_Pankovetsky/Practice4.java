package com.company;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Practice4 extends JFrame {
    JButton team1 = new JButton("AC Milan");
    JButton team2 = new JButton("Real Madrid");
    int score1 = 0;
    int score2 = 0;
    JLabel result = new JLabel("Result: " + score1 + " X " + score2);
    JLabel last_scorer = new JLabel("Last scorer : N/A");
    Label winner = new Label("Winner: DRAW");
    public Practice4()
    {
        setLayout(new BorderLayout());
        add(team1, BorderLayout.WEST);
        add(team2, BorderLayout.EAST);
        add(result, BorderLayout.CENTER);
        add(last_scorer, BorderLayout.SOUTH);
        add(winner, BorderLayout.NORTH);
        team1.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                score1 += 1;
                result.setText("Result: " + score1 + " X " + score2);
                last_scorer.setText("Last scorer : AC Milan");
                if (score1 > score2)
                {
                    winner.setText("Winner: AC Milan");
                }
                if (score2 == score1)
                {
                    winner.setText("Winner: Draw");
                }
                if(score1 < score2)
                {
                    winner.setText("Winner: Real Madrid");
                }
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });
        team2.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                score2 += 1;
                result.setText("Result: " + score1 + " X " + score2);
                last_scorer.setText("Last scorer : Real Madrid");
                if (score1 > score2)
                {
                    winner.setText("Winner: AC Milan");
                }
                if (score2 == score1)
                {
                    winner.setText("Winner: Draw");
                }
                if(score1 < score2)
                {
                    winner.setText("Winner: Real Madrid");
                }
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });
        setSize(500, 500);
    }
    public static void main(String[] args)
    {
        new Practice4().setVisible(true);
    }
}
