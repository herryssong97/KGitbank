package hipkg;

class Bread{
	private String jong;
	private int price;
	
	public String getJong() {
		return jong;
	}
	
	public void setJong(String jong) {
		this.jong = jong;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public String toString() {
		
		return "���� ������ "+jong+"�̰� ������ "+price+"�� �Դϴ�.";
	}
	
	public Bread() { }
	
	public Bread(String jong, int price) {
		this.jong = jong;
		this.price = price;
	}
}

public class Oop_Bread {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Q) �� ������ ������ �Ӽ����� ������ class�� �����
		// �̸� �����ϰ� ����ϴ� oop ���α׷��� �ۼ��Ͻÿ�
		
		// (����) ������ �Ӽ��� : jong
		//			���� �Ӽ��� : price
		//getter, setter, toString���� �����
		
		Bread bread = new Bread();
		bread.setJong("��ī��");
		bread.setPrice(1000);
		System.out.println(bread);
		
		Bread bread5 = new Bread("ġ�",5000);
		System.out.println(bread5);
		
		
		
		
		
	}

}