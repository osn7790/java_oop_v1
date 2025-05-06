package exception;

public class ExceptionTest1 {

    public static void main(String[] args) {

        // 사용자 정의 예외 클래스 사용해 보기
        int result = 0;

        Calc2 calc2 = new Calc2();

        try {
            calc2.divide(10, 0);
        } catch (DvideByZeroException e) {
            throw new RuntimeException(e);
        }

    }

}

class Calc2 {

    public int divide(int n1, int n2) throws DvideByZeroException {
        int result = 0;
        try {
            result = n1 / n2;
        } catch (Exception e) {
            throw new DvideByZeroException("0으로 나누지 마세요");
        }
        return result;
    }
}
