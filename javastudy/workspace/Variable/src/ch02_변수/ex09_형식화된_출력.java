package ch02_변수;

public class ex09_형식화된_출력 {
    public static void main(String[] args) {
//		%b boolean 형식으로 출력
//		%d 10진(decimal) 정수 형식으로 출력
//		%o 8진(octal) 정수 형식으로 출력
//		%x %X 16진(hexa-decimal) 정수 형식으로 출력
//		%f 부동 소수점 형식으로 출력
//		%g 실수형 출력. 간략하게
//		%e %E 지수 표현식 형식으로 출력
//		%c 문자로 출력
//		%s 문자열로 출력

        String url = "www.naver.com";
        double d = 1.23456789;
        int x = 4;
        System.out.printf("x=%d%n", x);
        System.out.printf("d=%f%n", d);
        System.out.printf("d=%14.10f%n", d); // 전체 14자리 중 소수점 10자리
        System.out.printf("[12345678901234567890]%n");
        System.out.printf("[%s]%n", url);
        System.out.printf("[%20s]%n", url);
        System.out.printf("[%-20s]%n", url); // 왼쪽 정렬
        System.out.printf("[%.8s]%n", url); // 왼쪽에서 8글자만 출력
        System.out.printf("x = %d, d = %f, url = %s", x, d, url);
    }
}