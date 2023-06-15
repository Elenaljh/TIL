package ch06_배열;

import java.util.Arrays;

public class ex07_다차원배열 {
	public static void main(String[] args) {
//		2차원 배열
//		선언 방법
//		타입[][] 변수이름 	int[][] score;
//		타입 변수이름[][];	int score[][];
//		타입[]변수이름[];	int[] score[];
		int[][] score = {
				  { 100, 100, 100 }
				, { 20, 20, 20 }
				, { 30, 30, 30 }
				, { 40, 40, 40 }
		};
		int sum = 0;

		for (int i = 0; i < score.length; i++) {
			for (int j = 0; j < score[i].length; j++) {
				System.out.printf("score[%d][%d]=%d%n", i, j, score[i][j]);

				sum += score[i][j];
			}
		}

		System.out.println("sum=" + sum);
	}

}
