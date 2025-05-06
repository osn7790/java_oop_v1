package _object;

//import java.lang.Object;
//import java.lang.*;

// java.lang.* 패키지도 자동으로 넣어준다.

/**
 * Object 최상위 클래스 대한 이해
 * 기본적으로 Object 클래스 상속을 받는다.
 * 자바는 Object 클래스(모든 클래스의 최상위 클래스)를 제외 하고
 * 단일 상속만을 제공한다.
 */
// public class Book extends Object
public class Book {

    private int bookTypeID;
    private String title;
    private String author;

    public Book(int bookTypeID, String title, String author) {
        this.bookTypeID = bookTypeID;
        this.title = title;
        this.author = author;
    }

    @Override
    public boolean equals(Object obj) {
        // 재정의 해 보자.
        if (obj instanceof Book) {
            // Book 타입이 맞다면 추가적으로 , 제목이 같다면 같은 책으로 판단하곘다.
            if (this.title.equals(((Book) obj).title) && this.author.equals(((Book) obj).author)) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    // equals() 메서드를 재정의할 때는 hashCode() 메서드 재정의 해주어야
    // 의도하지 않은 동작을 막을 수 있다.

    @Override
    public int hashCode() {
        // hashCode -> 이 객체의 고유한 정수값을 만들어서 독립적인 녀석을 보장하는 정수값
        return bookTypeID;
    }


    // showInfo();
//    @Override
//    public String toString() {
//        return "title : " + title + " , " + "author : " + author;
//    }

    // 테스트 코드
    public static void main(String[] args) {

        // 물리적 객체 주소값은 다르지만 eqauls() 메서드를 재정의해서
        // 논리적으로 책 이름과 저자 이름이 같으면 같은 녀석으로 바라 보게
        // 프로그램을 만들어 주세요.

        // 책 제목과 그리고 저자 이름이 같다면 논리적으로 같은 책으로 판별하자.
        Book book1 = new Book(1, "데미안", "헤르만헤세");
        Book book2 = new Book(1, "데미안", "헤르만헤세");
        Book book3 = new Book(2, "자바", "홍길동");
        Book book4 = new Book(1, "데미안", "파울로코엘료");
        String str1 = new String("데미안");

        System.out.println(book1.toString());
        System.out.println(book2.toString());
        System.out.println(str1.toString());

        boolean result1 = book1.equals(book2);
        boolean result2 = book1.equals(str1);
        boolean result3 = book1.equals(book3);
        boolean result4 = book1.equals(book4);


        System.out.println("result1 : " + result1);
        System.out.println("result2 : " + result2);
        System.out.println("result3 : " + result3);
        System.out.println("result4 : " + result4);

    }
}
