package ch02_변수;
import java.util.Scanner;
import org.w3c.dom.html.HTMLParagraphElement;

public class day1_study {
    static long sta; // 전역변수
    public static void main(String[] args) {
        //main: 메서드(=함수)
        int score;
        score = 150;
        score = 220;
        System.out.println(score);

        char c = 'a'; //문자형은 문자 딱 1글자만 저장가능
        String s = "hello"; //문자열형은 문자 여러자 저장가능
        System.out.println(c+s);

        //명명규칙(naming convention)
        //예약어(true 등) 사용불가, 숫자시작X, 특수문자는 _와 $만
        //여러 단어 이름은 단어 첫글자 대문자: StringBuffer, LastIndexOf
        //클래스 이름의 첫글자는 항상 대문자
        //상수이름은 대문자, 단어는_로 구분 : MAX_NUMBER
        int x = 40; //일반적인 변수임: 변수-x, 리터럴-40
        final int MAX = 73; //final 붙이면 상수가 됨

        //리터럴과 접미사(l, f, d등)
        long sam = 3; //이러면 에러남
        long sam1 = 3L; //접미사 L(또는 l)을 붙여서 정수3을 long형으로 변환함
        float f = 3.14f;
        double d = 3.14d;

        //전역변수: main 메서드 밖에서 만든 변수 -

        //문자와 문자열
        System.out.println(""+7+7); //문자열 77로 출력
        System.out.println("8"+5); //문자열 + 다른타입 = 문자열 / 다른타입 + 문자열 = 문자열
        System.out.println("8"+5+3); // "85" + 3 -> "853"
        System.out.println(8+5+"3"); //13 + "3" -> 133

        // print
            //printf는? format 가능
            int b_year = 1998;
            System.out.printf("나는 %d년생이다.\n",b_year);
            //println: 줄바꿈해줌
            //print: 전통적인 print
                //지시자: %b 불리언 / %d 10진수 / %f float / %c: char / %s: string
                // \n: 줄바꿈


        //형변환(Casting)
            //boolean을 제외한 7개의 기본형은 서로 형변환 가능. char과 숫자형간 변환은 ASCII code를 통해 변환.
        int ai = 'A';
        System.out.println(ai); //65 출력
            //float -> int: 소수점 이하 숫자 버림.
            //문자:'', 문자열: ""
            // 대소관계
                // byte < short < int < long < float < double
                // char < int : char과 int끼리 계산시 int로 형변환됨

        //변수저장
        int a1 = 4, b1 = 5; //이런식으로 선언하는 것도 가능. 하지만 권장X (구글 코드작성 가이드라인 convention rule 있나봄)

        //변수의 타입
        char ch = 'z';
        System.out.println(ch); //char을 변수에 할당에서 출력하는 것은 권장하지 않는다 (의도치않게 int형으로 형변환이 될 수 있기 때문)

        /*
        참고하세용
        여러줄 주석처리방법
        */

        //문자_덧셈연산
        String name = "Ja" + "va";	// 문자끼리 덧셈은 이어쓰기
        String str = name + 8.0;	// 문자열 + 실수는 실수형이 문자로 바뀌어서 저장됨

        //변수 swapping
        int a11 = 10, a22 = 15;
        System.out.printf("a11 = %d, a22 = %d\n", a11, a22);
        int tmp = a11;
        a11 = a22;
        a22 = tmp;
        System.out.printf("a11 = %d, a22 = %d\n", a11, a22);

        //사용자에게서 입력받기 - java로 백엔드를 할 경우 입력받고 print할 일은 거의 없음. 그러나 학습할 때는 필요.
        //import java.util.Scanner;
        Scanner scanner = new Scanner(System.in);

        System.out.print("두 자리 정수를 입력하시오:");
        String input = scanner.nextLine();
        int num = Integer.parseInt(input); // input을 integer로 바꿔서 num에 저장
        System.out.println("입력내용: " + input);
        System.out.printf("num=%d\n", num);

        // ex11_형변환 참고


    }
}
