package _object;

public class EBook {

    private int bookTypeId;
    private String title;
    private String author;

    public EBook(int bookTypeId, String title, String author) {
        this.bookTypeId = bookTypeId;
        this.title = title;
        this.author = author;
    }

    // toString() 메서드 재정의

    @Override
    public String toString() {
        return "title : " + title + " , " + "authhor : " + author;
    }


    // equals() 메서드 재정의

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof EBook) {
            return true;
        } else {
            return false;
        }
    }

    // hashCode() 메서드 재정의
    @Override
    public int hashCode() {
        return bookTypeId;
    }

    public static void main(String[] args) {

        EBook ebook1 = new EBook(1,"모두가 할 수 있는 플러터 UI 실전", "김근호");

    }


}
