package window2;
//강아지 객체를 표현하는 방법
//틀은 클레스를 통해서 만든다
public class Dog {
	//정적인 상태는 변수를 쓴다
	boolean tail;
	int leg;
	//동적인 상태는 함수(메소드)를 쓴다
	public void bark() {
		System.out.println("멍멍!!");
	}
	public void shake() {
		System.out.println("꼬리를 흔들다");
	}

}
