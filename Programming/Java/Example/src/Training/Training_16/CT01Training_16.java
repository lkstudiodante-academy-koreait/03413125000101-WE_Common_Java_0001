package Training.Training_16;

/*
 * Java 연습 문제 16
 * - 야구 게임 제작하기
 * - 세부 요구 사항은 연습 문제 12 번 참고
 */

import java.util.Random;
import java.util.Scanner;

public class CT01Training_16 {
	/** 초기화 */
	public static void start(String[] args) {
		Scanner oScanner = new Scanner(System.in);
		
		int[] oAnswer = new int[4];
		setupAnswer(oAnswer);
		
		System.out.print("정답 : ");
		printValues(oAnswer);
		
		System.out.println();
		
		do
		{
			System.out.print("정수 (4 개) 입력 : ");
			
			int[] oValues = new int[oAnswer.length];
			String[] oTokens = oScanner.nextLine().split(" ");
			
			for(int i = 0; i < oTokens.length; ++i) {
				oValues[i] = Integer.parseInt(oTokens[i]);
			}
			
			int[] oResults = getResults(oValues, oAnswer);
			
			int nCount_Strike = oResults[IDX_STRIKE_COUNT];
			int nCount_Ball = oResults[IDX_BALL_COUNT];
			
			System.out.printf("결과 : %d Strike, %d Ball\n\n",
					nCount_Strike, nCount_Ball);
			
			// 게임이 종료 되었을 경우
			if(nCount_Strike >= oAnswer.length) {
				break;
			}
		} while(true);
		
		System.out.println("프로그램을 종료합니다.");
	}
	
	private static final int IDX_STRIKE_COUNT = 0;
	private static final int IDX_BALL_COUNT = 1;
	
	/** 정답을 설정한다 */
	private static void setupAnswer(int[] a_oOutAnswer) {
		int nNumValues = 0;
		Random oRandom = new Random();
		
		while(nNumValues < a_oOutAnswer.length) {
			int j = 0;
			int nVal = oRandom.nextInt(1, 10);
			
			for(j = 0; j < a_oOutAnswer.length; ++j) {
				// 값이 존재 할 경우
				if(nVal == a_oOutAnswer[j]) {
					break;
				}
			}
			
			// 값이 존재 할 경우
			if(j < a_oOutAnswer.length) {
				continue;
			}
			
			a_oOutAnswer[nNumValues++] = nVal;
		}
	}
	
	/** 결과를 반환한다 */
	private static int[] getResults(int[] a_oValues, int[] a_oAnswer) {
		int[] oResults = new int[2];
		
		for(int i = 0; i < a_oValues.length; ++i) {
			for(int j = 0; j < a_oAnswer.length; ++j) {
				// 값이 다를 경우
				if(a_oValues[i] != a_oAnswer[j]) {
					continue;
				}
				
				oResults[IDX_STRIKE_COUNT] += (i == j) ? 1 : 0;
				oResults[IDX_BALL_COUNT] += (i != j) ? 1 : 0;
			}
		}
		
		return oResults;
	}
	
	/** 값을 출력한다 */
	private static void printValues(int[] a_oValues) {
		for(int i = 0; i < a_oValues.length; ++i) {
			System.out.printf("%d, ", a_oValues[i]);
		}
		
		System.out.println();
	}
}
