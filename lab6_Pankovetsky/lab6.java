import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class lab6 extends JFrame {
    JPanel east = new JPanel();
    JPanel north = new JPanel();
    JPanel south = new JPanel();
    JPanel west = new JPanel();
    JPanel center = new JPanel();
    Label welcome = new Label("Добро пожаловать в ");
    public lab6()
    {
        setLayout(new BorderLayout());
        add(east, BorderLayout.EAST);
        add(north, BorderLayout.NORTH);
        add(west, BorderLayout.WEST);
        add(south, BorderLayout.SOUTH);
        add(welcome, BorderLayout.CENTER);
        east.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                welcome.setText("Добро пожаловать в Дахране");
            }

            @Override
            public void mouseExited(MouseEvent e) {
                welcome.setText("Добро пожаловать в ");
            }
        });
        west.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                welcome.setText("Добро пожаловать в Джидда");
            }

            @Override
            public void mouseExited(MouseEvent e) {
                welcome.setText("Добро пожаловать в ");
            }
        });
        south.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                welcome.setText("Добро пожаловать в Абха");
            }

            @Override
            public void mouseExited(MouseEvent e) {
                welcome.setText("Добро пожаловать в ");
            }

        });
        north.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                welcome.setText("Добро пожаловать в");
            }

            @Override
            public void mouseExited(MouseEvent e) {
                welcome.setText("Добро пожаловать в ");
            }
        });
        setSize(1280, 720);
    }
    public static void main(String[] args) {
        new lab5().setVisible(true);
    }
}
