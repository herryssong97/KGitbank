package test;

/*[����1] 1���� 50������ �� �� 3�� ��� �Ǵ� 7�� ����� ���� ���Ͽ� ����ϴ� �ڹ� ���α׷��� �ۼ��Ͻÿ�*/
public class first {
	public static void main(String[] args) {
		for (int i = 1; i < 51; i++) {
			if (i%3==0 || i%7==0) {
				System.out.print(i + " ");
			}
		}
	}
}
