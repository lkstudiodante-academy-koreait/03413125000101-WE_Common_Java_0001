package Training.Training_05;

/*
 * Java 연습 문제 5
 * - 가위/바위/보 게임 제작하기
 * - 사용자로부터 가위/바위/보 중 하나의 선택을 입력 받는다
 * - 컴퓨터는 랜덤하게 선택한다
 * - 사용자가 승리하거나 무승부 일 경우 다시 게임을 재진행한다
 * - 사용자가 패배했을 경우 전적을 출력 후 프로그램을 종료한다
 *
 * Ex)
 * 정수 입력 (1. 바위, 2. 가위, 3. 보) : 1
 * 결과 : 승리 (나 - 바위, 컴퓨터 - 가위)
 *
 * 정수 입력 (1. 바위, 2. 가위, 3. 보) : 1
 * 결과 : 무승부 (나 - 바위, 컴퓨터 - 바위)
 *
 * 정수 입력 (1. 바위, 2. 가위, 3. 보) : 1
 * 결과 : 패배 (나 - 바위, 컴퓨터 - 보)
 *
 * 전적 : 1 승 1 무 1 패
 * 프로그램을 종료합니다.
 */

import java.util.Random;
import java.util.Scanner;

public class CT01Training_05 {
	/** 초기화 */
	public static void start(String[] args) {
		final int RESULT_WIN = 1;
		final int RESULT_DRAW = 2;
		final int RESULT_LOSE = 3;
		
		final int SELECT_ROCK = 1;
		final int SELECT_SCISSORS = 2;
		final int SELECT_PAPER = 3;
		
		Random oRandom = new Random();
		Scanner oScanner = new Scanner(System.in);
		
		int nCount_Win = 0;
		int nCount_Draw = 0;
		
		do {
			System.out.print("정수 입력 (1. 바위, 2. 가위, 3. 보) : ");
			
			int nSelect_My = oScanner.nextInt();
			int nSelect_Computer = oRandom.nextInt(SELECT_ROCK, SELECT_PAPER + 1);
			
			int nResult = 0;
			
			// 무승부 일 경우
			if(nSelect_My == nSelect_Computer) {
				nResult = RESULT_DRAW;
			} else {
				int nSelect_Next = (nSelect_My % SELECT_PAPER) + 1;
				nResult = (nSelect_Next == nSelect_Computer) ? RESULT_WIN : RESULT_LOSE;
			}
			
			String oStr_MySelect = (nSelect_My == SELECT_ROCK) ?
					"바위" : (nSelect_My == SELECT_SCISSORS) ? "가위" : "보";
			
			String oStr_ComputerSelect = (nSelect_Computer == SELECT_ROCK) ?
					"바위" : (nSelect_Computer == SELECT_SCISSORS) ? "가위" : "보";
			
			String oStr_Result = (nResult == RESULT_WIN) ?
					"승리" : (nResult == RESULT_DRAW) ? "무승부" : "패배";
			
			System.out.printf("결과 : %s (나 - %s, 컴퓨터 - %s)\n\n",
					oStr_Result, oStr_MySelect, oStr_ComputerSelect);
			
			nCount_Win += (nResult == RESULT_WIN) ? 1 : 0;
			nCount_Draw += (nResult == RESULT_DRAW) ? 1 : 0;
			
			// 패배했을 경우
			if(nResult == RESULT_LOSE) {
				break;
			}
		} while(true);
		
		System.out.printf("전적 : %d 승 %d 무 1 패\n", nCount_Win, nCount_Draw);
		System.out.println("프로그램을 종료합니다.");
	}
}
