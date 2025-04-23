package com.books;

/**
 * 도서저장 관리 프로그램만들어보기
 * 우선 멤버변수 메소드 만들기
 */
public class Bk {

    private String title; // 제목
    private String author; // 저자
    private int totalPage; // 전체 페이지

    // 생성자 만들어주기 (강제하기위해)

    //public = 어디든 접근할 수 있고 Bk =클래스명을 적은다음 (지정할 매개변수) {
    // }
    public Bk(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // 그리고 멤버변수가 pirvate 이기 때문에 다른클래스에서 접근할 수가 없다.
    // 그래서 setter나 getter을 만들어야 한다.
    // 그러면 다른 클래스에서 읽기전용 또는 수정가능한 변수로 접근 가능하다.

    // 어디든 접근가능하고(=public) 문자열타입(String)으로 맞춰주고
    // 읽기전용으로 getter를 써주고 () 멤버변수는 읽기전용이므로 줄필요없음.
    // 읽기만 하므로 리턴값도 본래의 값
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return getAuthor();
    }

    public int getTotalPage() {
        return totalPage;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

}
