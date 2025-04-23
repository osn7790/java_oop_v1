package com.books;

import java.util.Scanner;

public class Mbs {

    static int currentBookIndex2  = 6;

    public static void main(String[] args) {
        // 나눠서 코딩하기
        // 1. 일단 어떻게 프로그램 돌릴지 생각
        // (책이라는 요소를 통으로 묶어서 함께 관리 - 배열
        // 스캐너로 입력값을 받아야하고, 반복이 되어야함.)
        // 이제 표시될 화면을 만들어야하는데 숫자는 안바뀜  -> final
        // 그리고 내가 입력할 글자로 검색과 맞춰야하므로 String으로
        // 만들것은 저장, 전체조회, 선택조회, 전체삭제, 종료
        // 그리고 이제 반복표시므로 while을 사용
        // 그리고 eaqual을 사용해서 입력값과 상수값이 같은지 확인가능하도록
        // equal에 상수를 넣기
        // 그리고 프로그램 종료가능하도록 종료부분에 flag = false 넣기 (true일때만 작동하므로)
        // 이제 메인에 다 넣기에는 너무많음. 함수를 만들어서 데이터를불러올예정
        // 2. (함수 파트로 넘어감)

        Scanner scanner = new Scanner(System.in);
        // 배열준비
        Bk[] bks = new Bk[100];
        // 지금은 공간만 있고 넣지 않았음.
        boolean flag = true;

        //Todo - 춯 삭제하기
        // 샘플 데이터  미리 만들어 두기( 테스트 위해서)

        bks[0] = new Bk("플러터UI실전", "김근호");
        bks[1] = new Bk("무궁화꽃이피었습니다", "김진명");
        bks[2] = new Bk("흐르는강물처럼", "파울로코엘료");
        bks[3] = new Bk("리딩으로리드하라", "이지성");
        bks[4] = new Bk("사피엔스", "유발하라리");
        bks[5] = new Bk("홍길동전", "허균");

        final String SAVE = "1";
        final String SEARCH_ALL = "2";
        final String SEARCH_BY_TITLE = "3";
        final String DELETE_ALL = "4";
        final String END = "5";

        //flag로 true or  false를 통해 흐름 제어 가능.
        while (flag) {
            System.out.println("** 메뉴 선택 **");
            System.out.println("1.저장 2.전체조회 3.선택조회 4. 전체삭제 5.종료");
            // 그리고 입력숫자를 받아야함.
            String selectNumber = scanner.nextLine();
            if (selectNumber.equals(SAVE)) {
                System.out.println(">> 저장하기 <<");
                save2(scanner, bks);

            } else if (selectNumber.equals(SEARCH_ALL)) {
                System.out.println(">> 전체조회 <<");
                readAll2(bks);

            } else if (selectNumber.equals(SEARCH_BY_TITLE)) {
                System.out.println(">> 책 제목으로 조회하기 <<");
                readBytitle2(scanner, bks);

            } else if (selectNumber.equals(DELETE_ALL)) {
                System.out.println(">> 전체 삭제하기 <<");
                deleteAll2(bks);

            } else if (selectNumber.equals(END)) {
                System.out.println(">> 프로그램을 종료합니다 <<");
                flag = false;

            } else {
                System.out.println("잘못된 선택입니다.");
            }
        }


    } // end of main

    // 2. 함수파트 시작
    //    출력에 나올 기능을 만들어야함.(함수)
    // 출력화면에서 선택해서 나올 1~5까지의 값 코딩.
    // 각각의 함수부터 만들기

    // 클래스 안이지만 멤버변수를 사용하지 않으므로 함수
    // 모두접근가능하고(public) 스태틱 메모리 영역에올려(static -사용가능하게 먼저 뜨도록)
    // 리턴데이터타입을 정하고(없으므로 void) 함수명 정하고(save)
    // ()안에 변수가 들어가햠. <- 우리가 찾아야할 것은 뭐다?
    // 각 기능에  들어갈 함수. 우선 출력을 작성해준다.
    // 이제 저안에 들어갈 부분을 생각해보자. 함수이니 매개변수가 들어가야하는데
    // readAll 을 예로들면 책 목록을 불러와야한다.
    // 그래서 Bk[] book 배열을(책장) 들고오고
    //  사용자정의생성자로 넣은 정보(책에 이미적힌내용)도 함께 나올수있다.
    // 아직 지정하지 않았지만 인덱스값에 맞는 내용이 있다면 들고 온다.
    // 그리고 전체 조회에서 불러서 출력되야하는 내용은 이름과 작가이다.
    // (private 멤버변수이므로 접근이 불가능하여 작성해둔 getter에 접근해서불러온다.)
    // 그리고 방어적 코드를 작성을 한다.
    // (이유 : 내용이 없는 칸이 있어서 다음 데이터에 가기전에 강제 프로그램 종료)
    // 그다음 모두 삭제하기 - 전부 빈칸으로(null)로 하면되고 불러올 필요도 없다.(책장정리)
    // 다음 저장하기 - 제목입력하고 저자를 입력해야 저장되도록 출력한다.
    // 입력값을 받기 위해 스캐너를 넣는다.
    // 그럼 붉은색이 되는데 받을 scanner 가 없기떄문에 ()안에 적어준다.
    // 이제 테스트를 위한 데이터를 만들어준다.
    // 그리고 저장하기에 코딩
    // 이제 제목 작가정보가 있으므로 불러오기가능 ( 새로운 객체 )
    // 그런데 참조가 안됨. <- ()안에 들어가지 않았기떄문에 불러올 수 없음.


    public static void save2(Scanner scanner, Bk[] bks) {
        System.out.println("---- save() -----");
        System.out.println("책 제목을 입력하세요");
        String title = scanner.nextLine();
        System.out.println("책 저자를 입력하세요");
        String author = scanner.nextLine();
        Bk newBook = new Bk(title, author);
        if (currentBookIndex2 > bks.length) {
            System.out.println("더이상 저장할 공간이 없습니다");
            return;
        }
        bks[currentBookIndex2] = newBook;
        currentBookIndex2++;
    }

    public static void readAll2(Bk[] book) {
        System.out.println("---- readAll() -----");
        for (int i = 0; i < book.length; i++) {
            if (book[i] != null) {
                System.out.println(book[i].getTitle() + ", " + book[i].getAuthor());
            }
        }
    }

    public static void readBytitle2(Scanner scanner, Bk[] bks) {
        System.out.println("---- readBytitle() -----");
        System.out.println(">> 책 제목을 입력해주세요 <<");
        String title = scanner.nextLine();
        boolean isFind = false;
        for (int i = 0; i < bks.length; i++){
            if (bks[i] != null){
                if (bks[i].getTitle().equals(title.trim())) {
                    System.out.println(bks[i].getTitle() + ", " + bks[i].getAuthor());
                    isFind = true;
                    break;
                }
        }
        }
        if (isFind) {
            System.out.println("해당 제목에 책은 존재하지 않습니다.");
        }
    }

    public static void deleteAll2(Bk[] book) {
        System.out.println("---- deleteAll() -----");
        for (int i = 0; i < book.length; i++) {
            book[i] = null;
        }
    }


} // end of class

