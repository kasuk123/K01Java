package bokang;

public class R02for {

	public static void main(String[] args) {

		/*
		 while문
		 : 반복의 횟수가 명확하지 않을 때 주로 사용하는 반복문
		 형식]
		 	반복문을 위한 변수 
		 	while(while문의 실행될 조건) {
		 		실행문;
		 		while문 탈출을 위한 증감식;(++ 혹은 --)
		 	}
		 */
		
		//시나리오] 1~10까지의 합을 구하는 while문을 작성하시오.
		
		int a = 1;
		int sum = 0;
		while(a<=10) {
			sum += a;
		
		a++;
		}
		System.out.println("1~10까지의 합은"+ sum);
		
		
		
		
		/*
		 do~while문
		 	:while문과는 다르게 일단 한번은 실행을 한 후 
		 	탈출을 위한 조건을 체크한다.
		 형식]
		 	초기값;
		 	do {
		 		실행문; <-해당 실행문은 무조건 1번은 실행된다.
		 		증감식;
		 	}
		 	while(조건식);
		 */
	//시나리오] 위에서 만든 프로그램을 do~while문으로 변경하시오.
		
		int b=1;
		int total = 0;
		do {
			total += b;
			b++;
			
		}
		while(b<=10);
		
		System.out.println("1~10까지의 합은"+total);
		
		
		/*
		 for문
			: 반복의 횟수가 정해져서 명확할 때 주로 사용하는 반복문.
		형식]
			for(반복을위한 초기값;반복을위한 조건식 ;증감식 ) {
			실행문;
		 */
		//시나리오]1~10까지의 합을 구하는 for문을 작성하시오
		
		int num = 0;
		for(int c=1 ; c<=10 ; c++) {
			num += c;
		}
			System.out.println("1~10까지의 합은 55");
			
	


		

	/*
	연습문제] 두개의 주사위를 던졌을때 눈의 합이 6이되는 경우를
	모두 출력하는 프로그램을 for문과 if문을 이용하여 작성하시오.
	실행결과]
		1+5=6
		2+4=6
		.......
		5+1=6
	 */
	
	for(int j=1 ; j<=6 ; j++) {//주사위1(1~6까지)
		for(int y=1 ; y<=6 ; y++) {//주사위2(1~6까지)
			if((y+j)==6) {//두눈이 합이 6이될때만
				//결과를 출력한다.
				System.out.printf("%d+%d=%d%n",y,j,(y+j));
			}
		
			
		
	}
				
}
	
	


		 
	
	
		System.out.println("==========연습문제=============");

		/*
		 연습문제)1+(1+2)+(1+2+3)+(1+2+3+4)+...+(1+2+3+...+10)의
		 결과를 계산하는 프로그램을 작성하시오
		 */
			//해법1
			int totalSum1 = 0;
			int totalSum2 = 0;
			
			for(int i=1 ; i<=10 ; i++) {
				totalSum1 += i;//한번 누적했던 값을...
				totalSum2 += totalSum1;//한번 더 누적해서 더한다.
			}
			//System.out.println("totalSum1="+totalSum1);
			System.out.println("totalSum2="+totalSum2);
			
		
			//해법2
			int totalSum3 = 0;
			int totalSum4 = 0;
			for(int i=1 ; i<=10; i++) {
				for(int j=1 ; j<=i ; j++) {
					
					totalSum3 += j;
					
				}
				
				
			}
			System.out.println("totalSum3="+totalSum3);
			
			
			
			
			
			}
			}
		
		
		
	


