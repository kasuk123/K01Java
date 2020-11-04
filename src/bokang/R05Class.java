package bokang;

import Bookangsub.Checkcard1;
import Bookangsub.Checkcard2;
import Bookangsub.Checkcard3;

public class R05Class {

	public static void main(String[] args) {

		//체크카드 클래스 ver01
		/*
		 숫자를 구분할때 구분자로 언더바를 사용할수 있다.
		 JDK7.0부터 지원되었으며 숫자사이에 쓰는것만 허용된다.
		 잘못된방법] 
		 	3._14159
		 	123_456_
		 	_123_456
		 	위와같이 언더바로 시작하거나 끝날수 없고, 소수점과
		 	연결해서도 사용할수 없다.
		 */
		Checkcard1 cc1 = new Checkcard1();
		cc1.cardNumber = 1111_2222_3333_4444L;
		cc1.owner = "홍길동";
		cc1.balance = 10000;
		cc1.point = 0;
		
		//5000원결제
		cc1.payment(5000);
		//10000원결제
		cc1.payment(10000);
		//현재상태 출력
		cc1.showState();
		
		/**************************************************/
		//객체생성후 초기화메소드를 통해서 멤버변수 초기화
		Checkcard2 cc2 = new Checkcard2();
		cc2.initMembers(1234_5678_9012_3456L, "김홀둥", 3000, 0);
		
		//인자생성자를 통해 객체생성과 동시에 멤버변수 초기화
		Checkcard2 cc3 = new Checkcard2
				(9876_5432_1098_7654L,"혀누",10000,0);
		
		cc2.charge(8000);
		cc2.payment(9000);
		cc2.showState();
		
		cc3.charge(8000);
		cc3.payment(9000);
		cc3.showState();
		
		//cc2.balance = 9900;
		//cc2.owner = "아무개";
		
		//정보은닉된 멤버 접근시에는 setter를 통해서만 가능
		cc2.setBalance(9900);
		cc2.setOwner("아무개");
		cc2.showState();
		
		
		
		Checkcard3 cc4 = new Checkcard3(1234_5678_1234_5678L, "김말떵", 7000, 0);
		cc4.showState();
		

				
		
		
		
		
		
		
	}

}
