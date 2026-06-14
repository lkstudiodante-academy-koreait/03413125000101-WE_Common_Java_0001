package Training.Training_01;

/*
 * Java 연습 문제 1
 * - 학점 계산 프로그램 제작하기
 * - 사용자로부터 점수를 입력받는다
 * - 입력 받은 점수에 해당하는 학점을 출력한다
 * - 단, 1 의 자리에 따라 세부 학점을 같이 출력한다 (+ Ex. A+, B- 등등...)
 *
 * 세부 학점 범위
 * - 0 ~ 3 : -
 * - 4 ~ 6 : 0
 * - 7 ~ 9 : +
 *
 * Ex)
 * 점수 입력 : 83
 * B- 학점입니다.
 *
 * 점수 입력 : 59
 * F 학점입니다.
 */

import java.util.Scanner;

public class CT01Training_01 {
	/** 초기화 */
	public static void start(String[] args) {
		Scanner oScanner = new Scanner(System.in);
		
		System.out.print("점수 입력 : ");
		int nScore = oScanner.nextInt();
		
		String oGrade = "";
		String oGrade_Detail = "";
		
		// F 학점 일 경우
		if(nScore < 60) {
			oGrade = "F";
		} else {
			// A 학점 일 경우
			if(nScore >= 90) {
				oGrade = "A";
			}
			// B 학점 일 경우
			else if(nScore >= 80) {
				oGrade = "B";
			}
			// C 학점 일 경우
			else if(nScore >= 70) {
				oGrade = "C";
			}
			// D 학점 일 경우
			else {
				oGrade = "D";
			}
			
			int nScore_Detail = nScore % 10;
			
			// + 학점 일 경우
			if(nScore >= 100 || nScore_Detail >= 7) {
				oGrade_Detail = "+";
			} else {
				oGrade_Detail = (nScore_Detail <= 3) ? "-" : "0";
			}
		}
		
		System.out.printf("%s%s 학점입니다.\n", oGrade, oGrade_Detail);
	}
}
