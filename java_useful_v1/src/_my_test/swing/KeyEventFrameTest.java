package _my_test.swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.security.Key;

public class KeyEventFrameTest extends JFrame implements KeyListener {

    private final int FRAME_SIZE = 500;
    private JTextArea textArea;

    // 생성자
    public KeyEventFrameTest() {
        initData();
        setInitLayout();
        addEventListener();
    }


    // 들어갈 데이터

    private void initData() {
        setSize(FRAME_SIZE, FRAME_SIZE);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);

        textArea = new JTextArea();

    }

    // 배치 관리자

    private void setInitLayout() {
        setLayout(new FlowLayout());
        add(textArea);
        setVisible(true);
    }

    // 이벤트 리스너 -- 추상클래스로부터 구현되었기떄문에 가능.
    private void addEventListener() {
        textArea.addKeyListener(this);


    }


    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {
        System.out.println("KeyCode : " + e.getKeyCode());
        if (e.getKeyCode() == KeyEvent.VK_UP) {
            System.out.println("화살표 위 이벤트 발생");
        } else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            System.out.println("화살표 아래 이벤트 발생");
        } else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            System.out.println("화살표 왼쪽 이벤트 발생");
        } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            System.out.println("화살표 오른쪽 이벤트 발생");
        }
    }


    public static void main(String[] args) {
        new KeyEventFrameTest();
    }

}
