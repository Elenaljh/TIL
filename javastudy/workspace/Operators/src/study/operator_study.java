package study;
import java.util.Scanner;

public class operator_study {
    public static void main(String[] args) {
        //수업 필기
        // 단항연산자: +, =, ++, --, ~, ! (변수가 하나만 필요)
        //1. 대입연산자
//        int x, y;
//        x = y = 3;
//        System.out.println(x);
//        System.out.println(y);

        //4. 비트전환연산자
//        byte p = 10;
//        byte n = -10;
//
//        System.out.printf(" p  =%d \t%s%n", p, Integer.toBinaryString(p));
//        System.out.printf("~p  =%d \t%s%n", ~p, Integer.toBinaryString(~p));
//        System.out.printf("~p+1=%d \t%s%n", ~p + 1, Integer.toBinaryString(~p + 1));
//        System.out.printf("~~p =%d \t%s%n", ~~p, Integer.toBinaryString(~~p));
//        System.out.println();
//        System.out.printf(" n  =%d%n", n);
//        System.out.printf("~(n-1)=%d%n", ~(n - 1));

        //나눗셈
        Scanner scn = new Scanner(System.in);
        System.out.println("두자리 정수 입력: ");
        String strX = scn.nextLine();
        int a = Integer.parseInt(strX);
        System.out.printf("십의자리 = %d, 일의자리 = %d", a/10, a%10);

        //13. 비교연산자_문자열
//		문자열의 경우 큰따옴표로 선언한 경우와 new 객체를 이옹하여 선언한 경우에 따라 문자열 비교의 결과가 다르게 나타날 수 있음
//		자세한 내용은 String을 배울때 다룰 예정
//		지금은 문자열 비교시 equals() 메서드를 사용하는것이 좋다는 것만 인지하면 됨
        String str1 = "abc";
        String str2 = new String("abc");
        //boolean: %b
        System.out.printf("\"abc\"==\"abc\" ? %b%n", "abc"=="abc");
        System.out.printf(" str1==\"abc\" ? %b%n",    str1=="abc");
        System.out.printf(" str2==\"abc\" ? %b%n",    str2=="abc");
        System.out.printf("str1.equals(\"abc\") ? %b%n", str1.equals("abc")); //str1=="abc"와 같음
        System.out.printf("str2.equals(\"abc\") ? %b%n", str2.equals("abc"));
        System.out.printf("str2.equals(\"ABC\") ? %b%n", str2.equals("ABC"));
        System.out.printf("str2.equalsIgnoreCase(\"ABC\") ? %b%n", str2.equalsIgnoreCase("ABC")); //equalsIgnoreCase: 대소문자 무시하고 문자열비교
        //String vs new String: https://tomining.tistory.com/195

        //14. 삼항연산자
    }
}
