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
		
		return "빵의 종류는 "+jong+"이고 가격은 "+price+"원 입니다.";
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
		
		//Q) 빵 종류와 가격을 속성으로 가지는 class를 만들고
		// 이를 생성하고 사용하는 oop 프로그램을 작성하시오
		
		// (조건) 빵종류 속성명 : jong
		//			가격 속성명 : price
		//getter, setter, toString까지 만든다
		
		Bread bread = new Bread();
		bread.setJong("모카빵");
		bread.setPrice(1000);
		System.out.println(bread);
		
		Bread bread5 = new Bread("치즈빵",5000);
		System.out.println(bread5);
		
		
		
		
		
	}

}