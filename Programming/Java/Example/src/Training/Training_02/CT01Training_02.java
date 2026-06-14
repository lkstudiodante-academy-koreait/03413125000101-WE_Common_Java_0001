package Training.Training_02;

/*
 * Java 연습 문제 2
 * - 학점 계산 프로그램 제작하기
 * - 요구 사항은 연습 문제 1 번 참고
 * - 단, switch ~ case 조건문만 사용 가능
 */

import java.util.Scanner;

public class CT01Training_02 {
	/** 초기화 */
	public static void start(String[] args) {
		Scanner oScanner = new Scanner(System.in);
		
		System.out.print("점수 입력 : ");
		int nScore = oScanner.nextInt();
		
		String oGrade = "";
		String oGrade_Detail = "";
		
		switch(nScore / 10) {
			case 10:
			case 9:
				oGrade = "A";
				break;
			case 8:
				oGrade = "B";
				break;
			case 7:
				oGrade = "C";
				break;
			case 6:
				oGrade = "D";
				break;
			default:
				oGrade = "F";
				break;
		}
		
		switch(nScore % 10) {
			case 0:
			case 1:
			case 2:
			case 3:
				oGrade_Detail = "-";
				break;
			case 4:
			case 5:
			case 6:
				oGrade_Detail = "0";
				break;
			default:
				oGrade_Detail = "+";
				break;
		}
		
		switch(nScore) {
			case 100:
				oGrade_Detail = "+";
				break;
		}
		
		switch(nScore / 10) {
			case 5:
			case 4:
			case 3:
			case 2:
			case 1:
			case 0:
				oGrade_Detail = "";
				break;
		}
		
		System.out.printf("%s%s 학점입니다.\n", oGrade, oGrade_Detail);
	}
}
