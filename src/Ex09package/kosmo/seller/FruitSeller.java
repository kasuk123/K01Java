package Ex09package.kosmo.seller;

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

	

