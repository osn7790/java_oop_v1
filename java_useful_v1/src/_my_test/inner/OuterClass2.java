package _my_test.inner;

public class OuterClass2 {

    public void display() {

        class LocalInnerClass {
            void printMessage() {
                System.out.println("안녕 나는 지역 내부 클래스 메서드야 ~");
            }
        }

        // LocalInnerClass 생성
        LocalInnerClass inner = new LocalInnerClass();
        inner.printMessage();

    }

    public static void main(String[] args) {

        OuterClass2 outerClass2 = new OuterClass2();
        outerClass2.display();

    }

}
