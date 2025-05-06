package _swing;

import org.w3c.dom.ls.LSOutput;

import javax.swing.*;
import java.awt.*;

public class BorderLayoutEx extends JFrame {

    // 멤버변수
    JButton[] buttons;
    String[] directions = {BorderLayout.WEST, BorderLayout.EAST, BorderLayout.CENTER,
            BorderLayout.NORTH, BorderLayout.SOUTH};


    // 생성자
    public BorderLayoutEx() {
        setTitle("borderLayout연습");
        setSize(600, 600);
        setVisible(true); //false 하면 존재는 하나 보이지 않음.
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        initData();
        setInitLayout(); // 순서를 바꾸면 nullpoint Exception 뜸. 왜냐? buttons의 값이 없기 때문에

    }

    //메서드
    private void initData() {
        buttons = new JButton[5];
        // for 구문으로 수정하세요
        for(int i = 0; i < buttons.length; i++) {
            buttons[i] = new JButton("buttons" + (i + 1));

//            buttons[0] = new JButton();
//            buttons[1] = new JButton();
//            buttons[2] = new JButton();
//            buttons[3] = new JButton();
//            buttons[4] = new JButton();
        }
    }

    private void setInitLayout() {
        // 배치 관리자 (보더레이아웃)
        // BorderLayout 은 컴포넌트들을 동서남북가운데 로 배치 시켜주는 레이아웃이다.
        setLayout(new BorderLayout());

        // 프레임(패널)
        // 우리가 생성한 Jbutton 객체를 프레임에 붙이다.
        // for 구문으로 수정하세요
        for(int i = 0; i < buttons.length; i++) {

            BorderLayout[] borderLayouts = new BorderLayout[5];

            add(buttons[i], directions[i]);
        }

//        add(buttons[0], BorderLayout.WEST);
//        add(buttons[1], BorderLayout.EAST);
//        add(buttons[2], BorderLayout.CENTER);
//        add(buttons[3], BorderLayout.NORTH);
//        add(buttons[4], BorderLayout.SOUTH);

    }


}
