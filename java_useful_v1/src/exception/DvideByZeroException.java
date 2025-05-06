package exception;

/**
 * 사용자 정의 예외 클래스 만들기
 */
public class DvideByZeroException extends Exception {

    private String message;

    public DvideByZeroException(String message) {
        super(message);
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
