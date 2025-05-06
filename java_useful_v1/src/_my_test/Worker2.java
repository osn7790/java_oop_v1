package _my_test;

// 인터페이스를 사용해서 쓰레드를 설계
public class Worker2 implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 200; i++) {
            System.out.println(i + "\t");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}


