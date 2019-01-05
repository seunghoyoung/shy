package window2;

public class TV {
	//정적인 특징: 모양이 사각형, 받침대
	String shape;
	boolean stand;
	//동적인 특징: 채널변경, TV를 켜다
    public void change(int ch) {
   System.out.println(ch + "번호로 채널 변경하다."); 
   }
    public void turnOn() {
   System.out.println("TV를 켜다"); 
   }
}

