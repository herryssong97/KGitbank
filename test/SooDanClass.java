package test;

/*[����3] ��ü�������α׷����� ����Ͽ� �Ʒ� ó�� ��°���� ������ �ڹ� ���α׷��� �ۼ��Ͻÿ�

<����>
-.main() �ִ� Ŭ���� �̸��� SooDanClass �� �Ѵ�
-. ������ Sangpoom Ŭ������ ����� �� �ȿ� �ۼ��� �Ӽ�(�ʵ�)�� ��ǰ�̸�, ��ǰ���� , ��ǰ�ܰ� 3���̸�
�Ӽ����� ��ǰ�̸��� irum(���ڿ�), ��ǰ������ soo(����), ��ǰ�ܰ��� dan(����) ���� �ۼ��Ѵ�
-. �Ӽ��� ���� getter, setter�� �ۼ��Ѵ�
- . �����̸�, �ܰ�, ���� ����� ���� toString( ) �� �����
��. toString( ) ���� ����� ����� ������ ���� �����̸� �ȴ�
�� ������ 1000 �� �̰� ������ 2 �� �Դϴ�

-. ��ü�� �ϳ� ����� setter�� ����Ͽ� ��ǰ�̸��� �� , �ܰ� �� 1000 �� �ְ�
������ 2 �� �ְ� toString( ) �� ����Ͽ� �����Ѵ�

-. ��ü�� �� �ϳ� ����� setter�� ����Ͽ� ��ǰ�� ���� , �ܰ� 1500 , ������ 3 �� ��ü�� �ְ�
toString( ) �� ����Ͽ� ����Ѵ�

-. ���� 2���� ��ü���� ���� ����*�ܰ� �ϸ� ������ �Ǹűݾ��� �����Ƿ�
getter�� ����Ͽ� �� �� ���� ������ �Ǹűݾ��� ���� ����Ѵ�

-. ��ü ��� ����� ���� ���� �� ����
��    ������  1000 ��  �̰�  ������  2 �� �Դϴ�
����  ������  1500 ��  �̰�  ������  3 �� �Դϴ�
  �� �Ǹűݾ�  2000 ��
  ����  �Ǹűݾ�  4500 ��*/
class Sangpoom{
	private String irum;
	private int soo;
	private int dan;

	public String toString() {
		return irum + " ������ " + dan + " �� �̰� ������ " + soo + "�� �Դϴ�";
	}
	
	public String getIrum() {
		return irum;
	}
	public void setIrum(String irum) {
		this.irum = irum;
	}
	public int getSoo() {
		return soo;
	}
	public void setSoo(int soo) {
		this.soo = soo;
	}
	public int getDan() {
		return dan;
	}
	public void setDan(int dan) {
		this.dan = dan;
	}
}

public class SooDanClass {
	public static void main(String[] args) {
		
		Sangpoom s1 = new Sangpoom();
		s1.setIrum("��");
		s1.setDan(1000);
		s1.setSoo(2);
		System.out.println(s1.toString());
		
		Sangpoom s2 = new Sangpoom();
		s2.setIrum("����");
		s2.setDan(1500);
		s2.setSoo(3);
		System.out.println(s2.toString());
		
		System.out.println(s1.getIrum() + " �Ǹűݾ� " + s1.getDan()*s1.getSoo() + "��");
		System.out.println(s2.getIrum() + " �Ǹűݾ� " + s2.getDan()*s2.getSoo() + "��");
		
	} // main end
} // class end
