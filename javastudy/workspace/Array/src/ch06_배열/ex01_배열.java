package ch06_배열;

import java.util.Arrays;

public class ex01_배열 {
	public static void main(String[] args) {
//		배열
//		같은 타입의 여러 변수를 하나의 묶음으로 다루는 것
		
//		선언
//		타입[] 변수이름. ex) int[] scores;
//		타입 변수이름[]; ex) int scores[];
		
//		생성
//		변수이름 = new 타입[길이];	
//		ex) scores = new int[10]; 길이가 10인 int 배열 생성
		
//		배열의 인덱스
//		인덱스의 범위는 0부터 길이-1까지
		
//		배열 길이 확장하는 방법
//		1. 더 큰 배열을 새로 만든다.
//		2. 기존의 배열 내용을 새로운 배열에 복사한다
		
		int[] score = new int[5];
        int k = 1;

        score[0] = 50;
        score[1] = 60;
        score[k + 1] = 70; // score[2] = 70
        score[3] = 80;
        score[4] = 90;
        


        // for문으로 배열의 모든 요소를 출력한다.
        for (int i = 4; i >= 0; i--) {
            System.out.println("score[" + i + "]:" + score[i]);
        }
        
        for(int x: score) {
        	System.out.println(x);
        }
        
	}
}
