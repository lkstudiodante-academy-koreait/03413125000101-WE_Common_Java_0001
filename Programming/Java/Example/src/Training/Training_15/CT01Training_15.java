package Training.Training_15;

/*
 * Java 연습 문제 15
 * - 가위/바위/보 게임 제작하기
 * - 세부 요구 사항은 연습 문제 5 참고
 */

import java.util.Random;
import java.util.Scanner;

public class CT01Training_15 {
	/** 초기화 */
	public static void start(String[] args) {
		Random oRandom = new Random();
		Scanner oScanner = new Scanner(System.in);
		
		int nCount_Win = 0;
		int nCount_Draw = 0;
		
		do {
			System.out.print("숫자 입력 (1. 바위, 2. 가위, 3. 보) : ");
			
			int nSelect_My = oScanner.nextInt();
			int nSelect_Computer = oRandom.nextInt(SELECT_ROCK, SELECT_PAPER + 1);
			
			int nResult = getResult(nSelect_My, nSelect_Computer);
		} while(true);
	}
	
	private static final int RESULT_WIN = 1;
	private static final int RESULT_DRAW = 2;
	private static final int RESULT_LOSE = 3;
	
	private static final int SELECT_ROCK = 1;
	private static final int SELECT_SCISSORS = 2;
	private static final int SELECT_PAPER = 3;
	
	/** 결과를 반환한다 */
	private static int getResult(int a_nSelect_My, int a_nSelect_Computer) {
		// 무승부 일 경우
		if(a_nSelect_My == a_nSelect_Computer) {
			return RESULT_DRAW;
		}
		
		int nSelect_Next = (a_nSelect_My % SELECT_PAPER) + 1;
		return (a_nSelect_Computer == nSelect_Next) ? RESULT_WIN : RESULT_LOSE;
	}
	
	/** 선택 -> 문자열로 변환한다 */
	private static String convertResult_ToStr(int a_nResult) {
		return "";
	}
	
	/** 결과 -> 문자열로 변환한다 */
	private static String convertSelect_ToStr(int a_nSelect) {
		return "";
	}
}
