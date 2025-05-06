package _my_test;

import javax.swing.*;
import java.awt.*;

public class MyPaintFrame extends JFrame {

    private Mypanel mypanel;

    public MyPaintFrame() {
        initData();
        setInitLayout();

    }

    private void initData() {
        setTitle("집만들기");
        setSize(800,800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        mypanel = new Mypanel();
    }
    private void setInitLayout() {
        super.add(mypanel);

    }

    static class Mypanel extends JPanel {

        @Override
        public void paint(Graphics g) {
            super.paint(g);

            g.drawLine(25,25, 50, 65); // 오른대각선
            g.drawLine(50,65,75 , 25); // 왼쪽
            g.drawLine(25,25, 75, 25); // 가로 선

            g.drawLine(50,15, 25, 50); // 왼쪽대각선
            g.drawLine(50,15, 75, 50); // 왼쪽대각선
            g.drawLine(25,50, 75, 50); // 가로선

            g.drawRect(250,250,250,250); //집
            g.drawLine(375, 125, 250, 250); // 지붕
            g.drawLine(375, 125, 500, 250); // 지붕

            g.drawLine(425, 125, 425, 175); // 꿀뚝
            g.drawLine(425, 125, 450, 125);
            g.drawLine(450, 125, 450, 200);

            g.drawLine(425, 125, 450, 125); //굴뚝무늬
            g.drawLine(425, 135, 450, 135); //굴뚝무늬
            g.drawLine(425, 145, 450, 145); //굴뚝무늬
            g.drawLine(425, 155, 450, 155); //굴뚝무늬
            g.drawLine(425, 165, 450, 165); //굴뚝무늬
            g.drawLine(425, 175, 450, 175); //굴뚝무늬
            g.drawLine(435, 185, 450, 185); //굴뚝무늬

            g.drawRoundRect(345,175,60,60,90,90); // 지붕창문
            g.drawRoundRect(340,170,70,70,90,90); // 지붕창문
            g.drawLine(345, 205,405,205);
            g.drawLine(375, 175,375,235);

            g.drawRoundRect(400,300,50,50,0,0); //창틀

            g.drawLine(400,325,450,325); // 창살
            g.drawLine(425,300,425,350);

            g.drawRoundRect(275,350,52,130,0,0); //문
            g.drawRoundRect(283,415,10,10,90,90); //문손잡이
            g.drawRect(280,360,16,45); //문 무늬 1
            g.drawRect(305,360,16,45); //문 무늬 2
            g.drawRect(280,410,15,65); //문 무늬 3
            g.drawRect(305,410,15,65); //문 무늬 4

            g.drawLine(250,500,195,800); // 길
            g.drawLine(335,500,385,800); // 길


        }
    } // end of static inner class

    public static void main(String[] args) {

        new MyPaintFrame();
    }

}
