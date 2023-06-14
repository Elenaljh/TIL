package ch05_반복문;
import java.util.Scanner;

public class 문제풀이 {
    public static void main(String[] args) {
        //1. 트리만들기
//         int floor = 5;
//         for (int i=floor; i>0; i--) {
//             for (int j = 1; j<i; j++) {
//                 System.out.print(" ");
//             }
//             for (int k = 0; k <= floor-i; k++) {
//                 System.out.print("*");
//             }
//             for (int l = 0; l < floor-i; l++) {
//                 System.out.print("*");
//             }
//             System.out.print('\n');
//         }
//        System.out.println("Merry Christmas");

        //2. 구구단
//         for (int i = 2; i<10; i++) {
//             for (int j = 1; j<10; j++) {
//                 System.out.printf("%d x %d = %d\n", i, j, i*j);
//             }
//         }
        //3. while문
//        int num = 0, sum = 0;
//        Scanner scn = new Scanner(System.in);
//        System.out.println("숫자를 입력하세요: ");
//        num = Integer.parseInt(scn.nextLine());
//        while(num!=0) {
//            sum += (num%10);
//            System.out.printf("sum=%d num=%d\n", sum, num);
//            num/=10;
//        }
//        System.out.println("각 자리수의 합: " + sum);

        //4. 문제
        int sum = 0;
        for (int i=1; i<=20; i++) {
            if (i%2==0||i%3==0) {
                continue;
            }
            sum += i;
        }
        System.out.println(sum);
    }
}
