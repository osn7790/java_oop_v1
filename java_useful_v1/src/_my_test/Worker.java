package _my_test;

// 상속을 통해서 Thread 구현
public class Worker {

    // 메인함수 및 테스트코드
    public static void main(String[] args) {

        WorkerExteds worker1 = new WorkerExteds("워커상속버젼");
        worker1.start();

    }


}


class WorkerExteds extends Thread {

    private String name;

    public WorkerExteds(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println( name + " : " + i);
            try {
                Thread.sleep(500);
            } catch (Exception e1) {

            }
        }
    }
}

