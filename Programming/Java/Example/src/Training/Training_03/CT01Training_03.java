package Training.Training_03;

/*
 * Java 연습 문제 3
 * - 업/다운 게임 제작하기
 * - 1 ~ 99 범위의 숫자 1 개를 추출한다
 * - 사용자로부터 숫자를 입력 받아 정답 여부를 검사한다
 * - 정답이 아닐 경우 수를 비교해서 가이드 메세지를 출력한다
 * - 정답을 맞췄을 경우 프로그램을 종료한다
 *
 * Ex)
 * 정답 : 85
 *
 * 정수 입력 (1 ~ 99) : 95
 * 정답은 95 보다 작습니다.
 *
 * 정수 입력 (1 ~ 99) : 80
 * 정답은 80 보다 큽니다.
 *
 * 정수 입력 (1 ~ 99) : 85
 * 프로그램을 종료합니다.
 */

import java.util.Random;
import java.util.Scanner;

public class CT01Training_03 {
	/** 초기화 */
	public static void start(String[] args) {
		Random oRandom = new Random();
		Scanner oScanner = new Scanner(System.in);
		
		int nAnswer = oRandom.nextInt(1, 100);
		System.out.printf("정답 : %d\n\n", nAnswer);
		
		do {
			System.out.print("정수 입력 (1 ~ 99) : ");
			int nVal = oScanner.nextInt();
			
			// 정답 일 경우
			if(nVal == nAnswer) {
				break;
			}
			
			String oMsg = (nVal < nAnswer) ? "큽니다." : "작습니다.";
			System.out.printf("정답은 %d 보다 %s\n\n", nVal, oMsg);
		} while(true);
		
		System.out.println("프로그램을 종료합니다.");
	}
}
