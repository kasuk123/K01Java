package ex08class;
class Triangle{
	int height;//높이
	int bottom;//밑변
	
	//밑변과 높이를 초기화하는 멤버메소드
	void init(int b, int a) {
		height = a;
		bottom = b;
	}
	//삼각형의 넓이를 구하는 멤버메소드
	public double getArea() {
		return (bottom * height/2);
	}
	//밑변을 초기화
	public void setBottom(int a){
		bottom = a;
	}
	//높이를 설정
	public void setHeight(int b) {
		height = b;
	}
}
public class QuTriangle {
	
	public static void main(String[] args)
	{
		Triangle t = new Triangle();
		t.init(10, 17); //밑변10, 높이17로 초기화
		System.out.println("삼각형의 넓이 : " + t.getArea());
		t.setBottom(50);//밑변 50으로 변경
		t.setHeight(14);//높이 14로 변경
		System.out.println("삼각형의 넓이 : " + t.getArea());
	}

}
