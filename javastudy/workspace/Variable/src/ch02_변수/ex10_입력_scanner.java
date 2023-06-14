package ch02_변수;

import java.util.Scanner;

public class ex10_입력_scanner {
    public static void main(String[] args) {
//		입력
        Scanner sc = new Scanner(System.in);
        System.out.println("정수를 입력하세요.");
//		Scanner 객체를 이용하여 한 줄 단위로 입력 받음
        String input = sc.nextLine();
//		입력받은 문자열을 정수로 변환. 이때 ex13_입력.java숫자가 아닌 것이 섞여있으면 안됨.
        int x = Integer.parseInt(input);
        System.out.println(x);

//		변환 없이 정수 바로 입력 받기
        System.out.println("정수를 입력하세요.");
        x = sc.nextInt();
        System.out.println(x);


        sc.nextLine(); //개행문자 제거
        System.out.println("정수를 입력하세요.");
        input = sc.nextLine();
        //sc.nextInt()사용하면 사용자가 enter눌렀을 때 입력된 \n이 제거되지 않기 때문에
        // 다음에 쓰인 sc.nextLine()에 개행문자가 자동으로 입력되어 오류발생
        //해결방법: sc.nextInt 사용 후 sc.nextLine 사용해서 개행문자 제거한 후 다시 sc.nextLine 사용하기
        x = Integer.parseInt(input);
        System.out.println(x);

//		System.out.println("정수를 입력하세요.");
//		x = sc.nextInt();
//		System.out.println(x);

    }
}