package _swing;

import javax.swing.*;

/**
 * JLable 이용해서 이미지를 다룰 수 있다.
 * JLable.add(); 메서드를 이용해서 이미지를 겹칠 수 있다.
 * 좌표 기준으로 배치관리자를 셋팅 하려면 null 값을 셋팅 해야 한다.
 */

public class MyFrame extends JFrame {

    private JLabel backgroundMap;
    private JLabel player1;
    private JLabel player2;
    private JLabel player3;


    public MyFrame() {

        initData();
        setInitLayout();
    }

    private void initData() {
        setTitle("JLabel 이용한 이미지 사용 연습");
        setSize(500,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        ImageIcon backgroundIcon = new ImageIcon("images/background.png");
        ImageIcon playerIcon2 = new ImageIcon("images/player2.png");
        ImageIcon playerIcon1 = new ImageIcon("images/image6_rm.png");

        // JLabel
        backgroundMap = new JLabel(backgroundIcon);
        // JLabel
        player1 = new JLabel(playerIcon1);
        player2 = new JLabel(playerIcon2);

        backgroundMap.setSize(500,500);
        backgroundMap.setLocation(0,0);

        player2.setSize(100,100);
        player2.setLocation(100,400);

        player1.setSize(100,100);
        player1.setLocation(400,350);

    }

    private void setInitLayout() {
        // 좌표 기반으로 셋팅이 됨(주의점 - 컴포넌트에 크기 지정, 컴포넌트에 x,y 지정)
        setLayout(null);

        // 루트 패널에 붙이기
        add(player2);
        add(player1);
        add(backgroundMap);

        // 먼저 작성할 경우 버벅일 수 있음.(데이터가 큰 경우)
        setVisible(true);
    }

    // 테스트 코드 작성
    public static void main(String[] args) {
        new MyFrame();



    }

}
