package hipkg;

import java.util.Scanner;

public class Method1type {
	public static void main(String[] args) {
		// Q. 2023년이 윤년인지 알아내는 프로그램을 작성하시오.

		/*
		 * 윤년 : 365.2422일
		 * 0.2422*4 = 0.9688 = 약 1일 
		 * 100년에 평년으로
		 * 400년에 1번은 윤년으로
		 * 
		 * 윤년은?
		 * 4로 나누어 떨어지고
		 * 100으로 나누어 떨어지지 않거나
		 * 400으로 나누어 떨어지는 해
		 */		
//		year();
//		passyear(2021);
//		System.out.println(nextyear());
		String a = nextyear();
		System.out.println(a);
		// ㄴ a = "윤년평년 처리 끝";
		
	}// main end
	
	private static String nextyear() {
		Scanner sc = new Scanner(System.in);
		String y = "평년";
		
		System.out.print("년도를 입력하세요 : ");
		int year = sc.nextInt();
		
		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			y = "윤년";
		} 
//		System.out.printf("%s년은 %s입니다.\n", year, y);
		return "윤년평년 처리 끝";
//		return y;
	}

	public static void year() {

		Scanner sc = new Scanner(System.in);
		String y = "평년";
		
		System.out.print("년도를 입력하세요 : ");
		int year = sc.nextInt();
		
		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			y = "윤년";
		} 
		System.out.printf("%s년은 %s입니다.", year, y);
	}
	
	public static void passyear(int i) {
		String y = "평년";
		
		if (i % 4 == 0 && i % 100 != 0 || i % 400 == 0) {
			y = "윤년";
		} 
		System.out.printf("%s년은 %s입니다.", i, y);
	}
}
