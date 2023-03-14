package test;

/*[문항3] 객체지향프로그래밍을 사용하여 아래 처럼 출력결과가 나오는 자바 프로그램을 작성하시오

<조건>
-.main() 있는 클래스 이름은 SooDanClass 로 한다
-. 별도로 Sangpoom 클래스를 만들고 그 안에 작성할 속성(필드)은 상품이름, 상품수량 , 상품단가 3개이며
속성명은 싱품이름은 irum(문자열), 상품수량은 soo(정수), 상품단가는 dan(정수) 으로 작성한다
-. 속성에 대한 getter, setter를 작성한다
- . 상픔이름, 단가, 수량 출력을 위한 toString( ) 을 만든다
단. toString( ) 으로 출력한 결과는 다음과 같은 형식이면 된다
빵 가격은 1000 원 이고 수량은 2 개 입니다

-. 객체를 하나 만들고 setter를 사용하여 상품이름에 빵 , 단가 에 1000 을 넣고
수량에 2 를 넣고 toString( ) 으 사용하여 츨력한다

-. 객체를 또 하나 만들고 setter를 사용하여 상품은 우유 , 단가 1500 , 수량은 3 을 객체에 넣고
toString( ) 을 사용하여 출력한다

-. 이제 2개의 객체에서 각각 수량*단가 하면 각각의 판매금액이 나오므로
getter를 사용하여 빵 과 우유 각각의 판매금액을 구해 출력한다

-. 전체 출력 모양은 다음 보기 와 같다
빵    가격은  1000 원  이고  수량은  2 개 입니다
우유  가격은  1500 원  이고  수량은  3 개 입니다
  빵 판매금액  2000 원
  우유  판매금액  4500 원*/
class Sangpoom{
	private String irum;
	private int soo;
	private int dan;

	public String toString() {
		return irum + " 가격은 " + dan + " 원 이고 수량은 " + soo + "개 입니다";
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
		s1.setIrum("빵");
		s1.setDan(1000);
		s1.setSoo(2);
		System.out.println(s1.toString());
		
		Sangpoom s2 = new Sangpoom();
		s2.setIrum("우유");
		s2.setDan(1500);
		s2.setSoo(3);
		System.out.println(s2.toString());
		
		System.out.println(s1.getIrum() + " 판매금액 " + s1.getDan()*s1.getSoo() + "원");
		System.out.println(s2.getIrum() + " 판매금액 " + s2.getDan()*s2.getSoo() + "원");
		
	} // main end
} // class end
