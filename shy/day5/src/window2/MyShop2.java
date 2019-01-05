package window2;

import java.util.Scanner;

//메소드 형식  public 반환타입 메소드이름(입력값){ 처리내용.....}
// 반환이 없을수도 있다(void), 반환이 있을 수도 있다. Sring, int..... 
public class MyShop2 {

	public static void main(String[] args) {
		int price = 5000;
		Scanner sc = new Scanner(System.in);
		System.out.println("주문하실 인원을 알려주세요");
		System.out.println("주문 인원: ");
		
		int input = sc.nextInt();
		
		Cal2 cal2 = new Cal2();
		int sum = cal2.mul(input, price);
		if (sum >= 20000 ) {System.out.println("내실금액은" + (sum -3000) + "원");
		} else {
			System.out.println("내실금액은"+(sum) + "원");
		}

		}
			
		}
		


