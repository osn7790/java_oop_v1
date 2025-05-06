package _my_test;

public class _Replace {



    public static void main(String[] args) {


        String a = "\"무궁화화화 꽃이 피화었습니다.\"";

        // replace - 이 문자열에서 oldChar의 모든 변수를 newChar로 대체한 문자열을 반환합니다.
        // 같은 글자나 단어는 전부 같이 바꿔 버림.
        a=a.replace("화","궁");
        System.out.println(a);

        // replaceAll - 주어진 정규 표현식과 일치하는 문자열의 각 하위 문자열을 주어진 대체 문자열로 대체합니다.
        // 문자만 가능하고 특수문자는 일반글자도 전부 특수문자로 바꿔버림.
        String a1 = "무궁화.꽃이.피었.습니다";
        a1=a1.replaceAll(".","/");
        System.out.println(a1);

        // replaceFirst - 여러개가 같아도 젤 첫글자만 바꿈
        String a2 = "무궁화화화 꽃이 피었습니다.";
        a2=a2.replaceFirst("화","강");
        System.out.println(a2);

        String a3 = "무궁화가 이이쁘쁘게게 피었습니다.";
        a3=a3.replace("게","을");
        System.out.println(a3);

    }




}
