package ex03operator;

public class E04LogicOperator {
	/*
	 *논리연산자
	 *&&: 논리and .양쪽 모두가 true일 때만 true를 반환 나머지는 false 반환
	 *|| 논리 or 한쪽만 true이면 true 반환 양쪽모두 false 일때만 false 반환
	 *! : 논리 not.반대의 논리를 반환함
	 */

	public static void main(String[] args) {
		int num1=10, num2=20;
		
		boolean result1 = (num1==100 && num2==20);//false
		boolean result2 = (num1<12 || num2>=30);//true
		
		System.out.println("resul1의 결과:"+ result1);
		System.out.println("resul2의 결과:"+ result2);
		
		
		 //num1과 num2가 다를때 true를 반환한다. 따라서 if 블럭이 실행된다.
		if(!(num1==num2)) {
			System.out.println("num1과 num2는 다르다.");
		}
		else {
			System.out.println("num1과 num2는 같다.");
		}
			
		
		
		
		
		
		
		
	}

}
