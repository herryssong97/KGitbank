package first_test;

/*[����2] Ű����� �������� �Է¹޾� ���� ���̸� ���ϴ� �ڹ� ���α׷��� �ۼ��Ͻÿ�
(����)
- . ���ǳ��̴� 3.14 *�������� ���� ���� ���Ѵ�
-. �޼ҵ� ȣ�⹮�� ����ϵ� �������� ���̸� �������ش�
-. �޼ҵ� ���� ������ ���� ���̸� ���ϵ� ���� ���� ����� ȣ���� �������� return �Ͽ�
���ο��� ���� ���̸� ����Ѵ�*/
import java.util.Scanner;

public class second {
	
	public static float circle(int n) {
		
		return (float) (3.14*(n*n));
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �Է� : ");
		int n = sc.nextInt();
		
		System.out.println(circle(n));
		
	}
}