package Training.Training_12;

/*
 * Java 연습 문제 12
 * - 야구 게임 제작하기
 * - 1 ~ 9 범위의 수 중에 정답 4 개를 중복되지 않게 추출한다
 * - 사용자로부터 정수 4 개를 입력받아 결과를 판정한다
 * - 사용자로부터 입력 받은 정수가 정답에 있고 위치가 같을 경우 스트라이크
 * - 사용자로부터 입력 받은 정수가 정답에 있지만 위치가 다를 경우 볼
 * - 4 스트라이크가 되면 게임을 종료한다
 *
 * Ex)
 * 정답 : 1 5 2 8
 *
 * 정수 (4 개 입력) : 1 2 5 8
 * 결과 : 2 Strike, 2 Ball
 *
 * 정수 (4 개 입력) : 1 2 5 9
 * 결과 : 1 Strike, 2 Ball
 *
 * 정수 (4 개 입력) : 1 5 2 8
 * 결과 : 4 Strike, 0 Ball
 *
 * 프로그램을 종료합니다.
 */

import java.util.Random;
import java.util.Scanner;

public class CT01Training_12 {
	/** 초기화 */
	public static void start(String[] args) {
		Random oRandom = new Random();
		Scanner oScanner = new Scanner(System.in);
		
		int[] oAnswer = new int[4];
		int nNumValues = 0;
		
		do {
			int i = 0;
			int nVal = oRandom.nextInt(1, 10);
			
			for(i = 0; i < nNumValues; ++i) {
				// 값이 존재 할 경우
				if(nVal == oAnswer[i]) {
					break;
				}
			}
			
			// 값이 존재 할 경우
			if(i < nNumValues) {
				continue;
			}
			
			oAnswer[nNumValues++] = nVal;
		} while(nNumValues < oAnswer.length);
		
		System.out.print("정답 : ");
		
		for(int nVal : oAnswer) {
			System.out.printf("%d, ", nVal);
		}
		
		System.out.println("\n");
		
		do {
			int nCount_Strike = 0;
			int nCount_Ball = 0;
			
			int[] oValues = new int[oAnswer.length];
			
			System.out.print("정수 (4 개 입력) : ");
			
			for(int i = 0; i < oValues.length; ++i) {
				oValues[i] = oScanner.nextInt();
			}
			
			for(int i = 0; i < oValues.length; ++i) {
				int j = 0;
				
				for(j = 0; j < oAnswer.length; ++j) {
					// 값이 존재 할 경우
					if(oValues[i] == oAnswer[j]) {
						break;
					}
				}
				
				nCount_Strike += (i == j && j < oAnswer.length) ? 1 : 0;
				nCount_Ball += (i != j && j < oAnswer.length) ? 1 : 0;
			}
			
			System.out.printf("결과 : %d Strike, %d Ball\n\n", nCount_Strike, nCount_Ball);
			
			// 4 Strike 일 경우
			if(nCount_Strike >= oAnswer.length) {
				break;
			}
		} while(true);
		
		System.out.println("프로그램을 종료합니다.");
	}
}
