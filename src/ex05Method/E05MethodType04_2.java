package ex05Method;

import java.util.Scanner;

/*
 *시나리오 여러숫자를 입력받고 최대값 구하는 메소드 정의하라. 단, 숫자의 갯수는
 *매개변수로 전달받고 숫자의 갯수 만큼 scanner클래스를 통해 입력받는다
 *숫자중 최댓감을 찾아 반환하도록 한다.
 * 
 */
public class E05MethodType04_2 {

	public static void main(String[] args) {

		int maxValue1 = returnMaxNumber(4);
		System.out.println("최대값1:" + maxValue1);
		
		int maxValue2 = returnMaxNumber(6);
		System.out.println("최대값2:" + maxValue2);
		
	}
	static int returnMaxNumber(int numberCnt)
	{
		Scanner scanner = new Scanner(System.in);
		
		int maxVal = 0;//최대값을 저장할 변수
		for(int i=1; i<=numberCnt; i++) 
		{
			System.out.print("정수를 입력하세여:");
			int inputNum = scanner.nextInt();
			
			if(i==1) 
			{//입력받은 숫자중 첫번째 입력값을 기준값으로 설정.
				maxVal = inputNum;
			}
			else 
			{//두번째 입력값 부터 MaxVal과 비교
				if(maxVal<inputNum)
				{//만약 maxVal보다 입력값이 크다면 입력값 교체
					maxVal = inputNum;
				}
			}//maxVal이 더 크다면 기준값을 유지하면 되므로 else부분은 필요없움
		}
		return maxVal;
		
	}//end of retrunMaxNumber

}






