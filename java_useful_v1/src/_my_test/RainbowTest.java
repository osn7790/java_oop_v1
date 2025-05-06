package _my_test;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RainbowTest extends JFrame implements ActionListener {


    private JButton[] buttons;
    private JPanel panel1;
    private JPanel panel2;
    Color colors[] = {Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN, Color.BLACK, Color.CYAN, Color.MAGENTA};

    public RainbowTest() {
        initData();
        setInLayout();
        addEventListen();
    }

    public void initData() {
        setSize(700, 700);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel1 = new JPanel();
        panel2 = new JPanel();
        buttons = new JButton[7];
        for (int i = 0; i < buttons.length; i++) {
            buttons[i] = new JButton("버튼" + (i + 1));
        }

    }

    public void setInLayout() {
        setLayout(new GridLayout(2, 1));

        panel1.setLayout(null);
        add(panel1);
        add(panel2);

        panel2.setSize(700, 350);
        panel1.setSize(700, 350);


        for (int i = 0; i < buttons.length; i++) {
            panel1.add(buttons[i]);
            buttons[i].setSize(100, 100);
            buttons[i].setLocation(100 * i, 0);

        }


        setVisible(true);
    }

    public void addEventListen() {
        for (int i = 0; i < buttons.length; i++) {
            buttons[i].addActionListener(this);
        }

    }


    @Override
    public void actionPerformed(ActionEvent e) {


        for (int i = 0; i < buttons.length; i++) {
            if (e.getSource() == buttons[i]) {
                panel2.setBackground(colors[i]);
            }
        }
    }

    public static void main(String[] args) {

        new RainbowTest();
    }

}
