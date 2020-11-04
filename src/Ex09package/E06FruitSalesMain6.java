package Ex09package;

/*
연습문제] 해당 프로그램을 아래의 지시에 따라 패키지로 
구분하여 정상 실행되도록 변경하시오.

FruitSeller 클래스 -> ex09package.kosmo.seller 패키지에 묶는다.
FruitBuyer4 클래스 -> ex09package.kosmo.buyer 패키지에 묶는다.

두 클래스를 적당히 import하여 정상동작할수 있도록 
FruitSalesMain4 클래스를 구성한다.
 */


 class FruitSeller4{
	
	int numOfApple;//판매자의 사과 보유갯수
	int myMoney;//판매수익
	int apple_price;//사과의 단가
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
class FruitBuyer4{
	
	int myMoney;
	int numOfApple;
	
	public void initMembers(int _myMoney, int _numOfApple) {
		myMoney = _myMoney;
		numOfApple = _numOfApple;
		
	}
	
	public void buyApple(FruitSeller4 seller, int money) {
		numOfApple += seller.saleApple(money);
		myMoney -= money;
	}
	
	public void showBuyResult() {
		System.out.println("[구매자]현재잔액:"+myMoney);
		System.out.println("[구매자]사과갯수:"+numOfApple);
	}
	
}
public class E06FruitSalesMain6 {

	public static void main(String[] args) {

		/*
		 초기화메소드를 정의하였으므로, 각각 성격이 다른 객체들을
		 생성할 수 있다.
		 */
		//판매자1
		FruitSeller4 seller1 = new FruitSeller4();
		seller1.initMembers(0, 100, 1000);
		
		//판매자2
		FruitSeller4 seller2 = new FruitSeller4();
		seller2.initMembers(0, 80, 500);
		
		FruitBuyer4 buyer = new FruitBuyer4();
		buyer.initMembers(10000, 0);
		
		System.out.println("구매행위가 일어나기전의 상태");
		seller1.showSaleResult();
		seller2.showSaleResult();
		buyer.showBuyResult();
		
		//판매자1, 판매자2에게 각각 5000원을 지불하고 구매
		buyer.buyApple(seller1, 5000);
		buyer.buyApple(seller2, 5000);
		
		System.out.println("구매행위가 일어난 후의 상태");
		seller1.showSaleResult();
		seller2.showSaleResult();
		buyer.showBuyResult();
	}

}
