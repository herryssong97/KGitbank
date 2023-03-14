package first_test;

/*[문항1] 1부터 50까지의 수 중 3의 배수 또는 7의 배수인 수를 구하여 출력하는 자바 프로그램을 작성하시오*/
public class first {
	public static void main(String[] args) {
		for (int i = 1; i < 51; i++) {
			if (i%3==0 || i%7==0) {
				System.out.print(i + " ");
			}
		}
	}
}
