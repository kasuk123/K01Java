package ex10accessmodifier;

class FruitSeller{
	
	private int numOfApple;//판매자의 사과 보유갯수
	private int myMoney;//판매수익
	private int apple_price;//사과의 단가
	/*
	 상수에서 변수로 변경함.
	 클래스의 멤버상수로 정의하는 경우 선언과 동시에
	 초기화해야 하므로 상수는 초기값이 없는 형태로는
	 선언이 불가능함.
	 */
	
	/*
	apple_price를 상수에서 변수로 변경한 이유는 상수는 단 한번만
	초기화되는 특성때문에 일반적인 멤버메소드내에서는 초기화 할 수 없다.
	멤버메소드는 개발자가 원할 때 언제든지 호출할 수 있으므로,상수의
	특성과는 맞지 않기 때문이다.
	 */
	public void initMembers(int money, int appleNum, int price) {
		myMoney = money;
		numOfApple = appleNum;
		apple_price = price;
	}
	
	public int saleApple(int money) {
		int num = money / apple_price;
		numOfApple -= num;
		myMoney += money;
		return num;
	}
	
	public void showSaleResult() {
		System.out.println("[판매자]남은사과갯수:"+numOfApple);
		System.out.println("[판매자]판매수익:"+myMoney);
	}
}
class FruitBuyer{
	
	int myMoney;
	int numOfApple;
	
	public void initMembers(int _myMoney, int _numOfApple) {
		myMoney = _myMoney;
		numOfApple = _numOfApple;
		
	}
	
	public void buyApple(FruitSeller seller, int money) {
		numOfApple += seller.saleApple(money);
		myMoney -= money;
	}
	
	public void showBuyResult() {
		System.out.println("[구매자]현재잔액:"+myMoney);
		System.out.println("[구매자]사과갯수:"+numOfApple);
	}
	
}
public class E03InfomationHiding {

	public static void main(String[] args) {

		/*
		 초기화메소드를 정의하였으므로, 각각 성격이 다른 객체들을
		 생성할 수 있다.
		 */
		//판매자1
		FruitSeller seller1 = new FruitSeller();
		seller1.initMembers(0, 100, 1000);
		
		//판매자2
		FruitSeller seller2 = new FruitSeller();
		seller2.initMembers(0, 80, 500);
		
		FruitBuyer buyer = new FruitBuyer();
		buyer.initMembers(10000, 0);
		
		System.out.println("구매행위가 일어나기전의 상태");
		seller1.showSaleResult();
		seller2.showSaleResult();
		buyer.showBuyResult();
		
		//판매자1, 판매자2에게 각각 5000원을 지불하고 구매
		buyer.buyApple(seller1, 5000);
		buyer.buyApple(seller2, 5000);
		/*
		 아래의 코드는 문법적으로는 오류가 없으나 지불금액과 구매한 사과의
		 관계가 전혀 맞지 않는 논리적 오류가 발생되었다.
		 즉, 코드(메소드)로 구현한 규칙이 완전히 무너지게된다.
		 객체지향 프로그래밍에서는 이런 오류를 범하지 않기 위해 "정보은닉"을
		 하도록 규정하고 있다.
		 */
		

		System.out.println("구매행위가 일어난 후의 상태");
		seller1.showSaleResult();
		seller2.showSaleResult();
		buyer.showBuyResult();
		
		/*
		 멤버변수를 private으로 선언하면 외부클래스에서는 접근이 불가능하므로
		 아래 코드는 에러가 발생된다.
		 즉, 멤버변수의 정보은닉을 통해 비정상적인 접근을 차단하고, 멤버메소드를 통해서만
		 구매가 이뤄질 수 있또록 구현한다.
		 */
		
//		seller1.myMoney += 1000;//판매자1에게 1000원을 지불하고
//		seller1.numOfApple -= 50;//사과 50개를 구매했다.
//		buyer.numOfApple += 50;
//		
//		seller2.myMoney +=1000;//판매자2에게 1000원을 지불하고
//		seller2.numOfApple-=70;//사과 70개를 구매했다.
//		buyer.numOfApple += 70;//하지만 구매자의 보유금액은 차감되지 않았다.
		
		
		
	}

}
