package hipkg;

class Parents{
//	int diamond; // �Ӽ�
	protected int diamond; // protected : ��Ӱ��迡���� ��� ������ ���� ������
	public void money() { // �޼ҵ�
		System.out.println("�θ�� ����");
	}
} // Parents-class-end

class Baby extends Parents{
	public void car() {
		diamond = 3;
		System.out.println("�ڳ�� �θ��θ�");
	}
} // Baby-class-end



public class Parents_extends{
	public static void main(String[] args) {
		Parents p1 = new Parents();
		p1.money(); // ��ü.�޼ҵ�()
		
		Baby b1 = new Baby();
		b1.money(); // ��ü.�޼ҵ�()
		b1.car(); // ��ü.�޼ҵ�()
		System.out.println(b1.diamond);

		
		
		
		
		
		
		
		
		
		
		/*
		 * ���
		 * 1) 100% ���
		 * 2) �ڳ��� ����� �θ�� ���ų� �� ����
		 * 3) ����� keyword�� extends
		 * 		A extends B -----------> A �� B�κ��� ��ӹ޴´�
		 * 		A is kind of B 			�ڳ�  �θ�
		 * 		fish extends Animal
		 */
	}
}
