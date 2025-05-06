package thread;

public class Wokrer2MainTest {

    // 메인 쓰레드
    public static void main(String[] args) {

        // 상속을 활용한 쓰레드 생성
        // Worker worker1 = new Worker("워커1");
        // worker1.start();

        // 인터페이스를 구현한 쓰레드 확인
        Worker2 worker2 = new Worker2();
        // 인터페이스를 사용했을 때 start() 메서드가 없어서 실제 동작을 못 시키고 있다.
        // worker2.start();
        Thread subT1 = new Thread(worker2); // worker2가 Worker2라는 새로운 객체이고, 이 worker2 메서드안에는 run 명령어가 있다.
        subT1.start();


    } // end of main

} // end of class
