package first_test;

/*[문항2] 키보드로 반지름을 입력받아 원의 넓이를 구하는 자바 프로그램을 작성하시오
(조건)
- . 원의넓이는 3.14 *반지름의 제곱 으로 구한다
-. 메소드 호출문을 사용하되 반지금의 길이를 전달해준다
-. 메소드 정의 문에서 원의 넓이를 구하되 원의 넓이 출력은 호출한 메인으로 return 하여
메인에서 원의 넓이를 출력한다*/
import java.util.Scanner;

public class second {
	
	public static float circle(int n) {
		
		return (float) (3.14*(n*n));
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("반지름 입력 : ");
		int n = sc.nextInt();
		
		System.out.println(circle(n));
		
	}
}