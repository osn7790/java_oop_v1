package _my_test.inner;

public class OuterClass {

    private int num = 10;

    class InnerClass {

        public void display() {
            System.out.println("inner class display() 호출 " + num);
        }
    }

    public static void main(String[] args) {
        // InnerClass innerClass = new InnerClass();
        // 오류 !!  내부클래스는 무조건 외부클래스객체가 있어야 생성가능
        OuterClass outerClass = new OuterClass();

        OuterClass.InnerClass innerClass = outerClass.new InnerClass();
    }


}
