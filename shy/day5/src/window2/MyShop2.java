package window2;

import java.util.Scanner;

//�޼ҵ� ����  public ��ȯŸ�� �޼ҵ��̸�(�Է°�){ ó������.....}
// ��ȯ�� �������� �ִ�(void), ��ȯ�� ���� ���� �ִ�. Sring, int..... 
public class MyShop2 {

	public static void main(String[] args) {
		int price = 5000;
		Scanner sc = new Scanner(System.in);
		System.out.println("�ֹ��Ͻ� �ο��� �˷��ּ���");
		System.out.println("�ֹ� �ο�: ");
		
		int input = sc.nextInt();
		
		Cal2 cal2 = new Cal2();
		int sum = cal2.mul(input, price);
		if (sum >= 20000 ) {System.out.println("���Ǳݾ���" + (sum -3000) + "��");
		} else {
			System.out.println("���Ǳݾ���"+(sum) + "��");
		}

		}
			
		}
		


