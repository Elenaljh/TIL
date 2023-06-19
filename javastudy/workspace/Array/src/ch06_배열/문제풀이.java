package ch06_배열;
import java.sql.SQLOutput;
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

        //문제5: counting sort
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

//        for (int i = 0; i < 10; i++) {
//            for (int j = 0; j < arr[i]; j++) {
//                System.out.println(i);
//            } //숫자 정렬 알고리즘

        //문제 6: 왼쪽으로 두칸 땡김
//        int[] array = { 1, 2, 3, 4, 5 };
//        int[] arr2 = new int[array.length];
//        int move = 2;
//
//        for (int i = 0; i < array.length; i++) {
//            arr2[i] = array[(i+move) % array.length]; //와 이게 한줄로 되네 와
//         }
//        System.out.println(Arrays.toString(array));
//        System.out.println(Arrays.toString(arr2));

        //문제 7:오른쪽으로 두칸 땡김
//        int[] array = { 1, 2, 3, 4, 5 };
//        int[] arr2 = new int[array.length];
//        int move = 3; //5-오른쪽으로 땡기는 칸 수
//
//        for (int i = 0; i < array.length; i++) {
//            arr2[i] = array[(i+move) % array.length];
//         }
//        System.out.println(Arrays.toString(array));
//        System.out.println(Arrays.toString(arr2));

        // String 메서드 설명
//        String s = "abc";
//        System.out.println(s.charAt(0)); //string을 배열처럼 접근하는 메서드 (파이썬에서는 걍 가능한데ㅜ)

        // 문제 8: 어려움 - hint: 길이가 26인 count 배열을 만든다!!!!
//        Scanner scn = new Scanner(System.in);
//        System.out.println("알파벳 소문자로 된 단어 입력: ");
//        String word = scn.nextLine();
//        int[] count = new int['z' - 'a' + 1]; //이게 핵심임
//
//        for (int i = 0; i < word.length(); i++) {
//            count[word.charAt(i) - 'a']++;
//        }
//
//        for (int i = 0; i < count.length; i++) {
//            if (count[i] != 0) System.out.printf("%c: %d개\n", i+'a', count[i]);
//        }
        // 배열에 char 저장 - 각 char은 아스키코드와 대응
        //

        //문제 9: 어려움 - 복습
//        int x = 0;
//        int cnt = 1;
//
//        for (int i = 0; i < 5; i++) {
//            // 시작위치. 탭이 첫줄은 0개, 둘째줄은 1개, 2, 3, 4
//            for(int j = 0; j < x; j++) {
//                System.out.print("\t");
//            }	// end of for j
//
//            // 탭의 개수와 숫자의 개수의 합은 5.
//            for (int j = x; j < 5 - x; j++) {
//                System.out.printf("%2d\t", cnt++); // <- 이 부분(for의 count를 출력하는게 아니라 따로 변수 만들어 출력)
//            }	// end of for
//
//            // 중간지점 확인. 2보다 작으면 탭이 늘어나고 2보다 크면 줄어듬. <- 이 부분
//            if (i < 2) x++;
//            else x--;
//
//            System.out.println();
//        }	// end of for

        int x = 0;
        int count = 1;

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < x; j++) {
                System.out.printf("\t");
            }

            for (int j = x; j < 5 - x; j++) {
                System.out.printf("%2d\t", count++);
            }

            if (i < 2) {
                x++;
            } else {
                x--;
            }

            System.out.println();
        }





    }

}

