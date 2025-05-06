package thread;

public class BankAccountMainTest {

    //메인쓰레드
    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount();
        Father father = new Father(bankAccount);
        Mother mother = new Mother(bankAccount);

        // 아버지가 먼저 입금 요청
        father.start();
        // 어머니가 출금 요청
        mother.start();


        // 입금, 출금, 동일한 계좌에서 처리 중이다.
        // 10만원 + 1만원 - 5천원 ==> 10만 5천원
        // 주의! 멀티스레딩 프로그램을 구성할 때 race condition 상태를 만들어 낼 수 있다.

        // rece condition
        // 의도치 않은 결과가 나타날 수 있다.


    } // end of main

} // end of class
