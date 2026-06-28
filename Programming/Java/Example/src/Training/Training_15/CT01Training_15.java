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
			String oStr_Result = convertResult_ToStr(nResult);
			
			String oStr_MySelect = convertSelect_ToStr(nSelect_My);
			String oStr_ComputerSelect = convertSelect_ToStr(nSelect_Computer);
			
			System.out.printf("결과 : %s (나 - %s, 컴퓨터 - %s)\n\n",
					oStr_Result, oStr_MySelect, oStr_ComputerSelect);
			
			nCount_Win += (nResult == RESULT_WIN) ? 1 : 0;
			nCount_Draw += (nResult == RESULT_DRAW) ? 1 : 0;
			
			// 패배했을 경우
			if(nResult == RESULT_LOSE) {
				break;
			}
		} while(true);
		
		System.out.printf("\n전적 : %d 승 %d 무 1 패\n", nCount_Win, nCount_Draw);
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
	
	/** 결과 -> 문자열로 변환한다 */
	private static String convertResult_ToStr(int a_nResult) {
		switch(a_nResult) {
			case RESULT_WIN:
				return "승리";
				
			case RESULT_DRAW:
				return "무승부";
				
			case RESULT_LOSE:
				return "패배";
		}
		
		return "";
	}
	
	/** 선택 -> 문자열로 변환한다 */
	private static String convertSelect_ToStr(int a_nSelect) {
		switch(a_nSelect) {
			case SELECT_ROCK:
				return "바위";
				
			case SELECT_SCISSORS:
				return "가위";
				
			case SELECT_PAPER:
				return "보";
		}
		
		return "";
	}
}
