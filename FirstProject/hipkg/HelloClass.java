package hipkg; // 패키지

public class HelloClass { // 클래스
	
	// 속성 : 상태, 특징
	// 메소드 : 행동
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 오늘부터 달리기 100분 ==>  화면 출력 
		System.out.println("오늘부터 달리기 100분");
		System.out.println("아하 그렇구나!");
	}

}
/*
 * 원래 다시말해서 즉 이것을 실행하려면 
 * javac HelloClass ==> compile 
 * (HelloClass.java ==> HelloClass.class)
 * 
 * java HelloClass
 * dos모드 winkey + R cmd 엔터
 * 
 * a = 100
 * move 100 to a;	100을 a로 옮겨
 * 
 * 자바의 번역 과정
 * 										jitter
 * 										jit compiler
 * 				compile					just-in-time compiler
 * AA.java(영어) ========> 기계어(byte code) ================> window, linux, unix
 * 											interpreter
 */
