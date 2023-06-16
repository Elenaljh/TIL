package ch06_배열;
import java.util.Arrays;
import java.util.Scanner;

public class 문제풀이 {
    public static void main(String[] args) {
        //문제1
//        int sum = 0;
//        int sum1 = 0;
//        for (int i = 1; i <= 10; i++) {
//            sum1 = sum1 + i;
//            sum = sum + sum1;
//        }
//        System.out.println(sum);

        //문제2
//        int sum = 0;
//        int i = 1;
//        while (sum!=100) {
//            if (i % 2 == 0) {
//                sum = sum - i;
//            } else {
//                sum = sum + i;
//            }
//            i++;
//        } //end of while (조건문, 반복문 작성시 어디에서 끝나는지 표시해주면 가독성이 좋다)
//        System.out.println(i-1);
//
//        int sum1 = 0;
//        int s = 1;
//        int num = 0;
//        for (int j = 1;; j++, s = -s) { //증감식을 이용할 수 있다.
//            num = s * i;
//            sum += num;
//            if (sum == 100)
//                break;
//        }
//        System.out.println(num);

        //문제3
        // 2x + 4y = 10의 모든 해를 구하시오. x, y는 음이 아닌 정수이다.
//        for (int x = 0; x < 6; x++) {
//            for (int y = 0; y < 3; y++) {
//                if (2*x + 4*y == 10) {
//                    System.out.printf("x=%d y=%d\n", x, y);
//                } //end of if
//            } //end of inner for
//        } //end of outer for

        //문제4
//        Scanner sc = new Scanner(System.in);
//        int[] arr = new int[5];
//        int sum = 0;
//
//        for (int i=0; i < arr.length; i++) {
//            System.out.println("정수를 입력하세요: ");
//            arr[i] = Integer.parseInt(sc.nextLine()); //배열의 i번째 인덱스에 입력된 값 저장
//            sum += arr[i]; //sum에 i번째 인덱스 값 더함
//        }//end of for
//        System.out.printf("배열의 합: %d",sum);

        //문제5
//        Scanner scanner = new Scanner(System.in);
//        int[] arr = new int[10];
//
//        for (int i = 0; i < 10; i++) {
//            System.out.println("0~9 사이의 숫자를 입력하시오: ");
//            int num = scanner.nextInt();
//            arr[num] += 1;
//        }
//
//        for (int j = 0; j < 10; j++) {
//            System.out.printf("%d:%d개 ", j, arr[j]);
//        }


    }

}
