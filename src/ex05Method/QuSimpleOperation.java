package ex05Method;

import java.util.Scanner;

public class QuSimpleOperation {
	static void arithmetic(int num1,int num2) {
		//static void arithmetic(int a, int b)
		//System.out.printf("덧셈결과 -> %d + %d = %d\n",a,b,(a+b));
		Scanner scanner = new Scanner(System.in);
		System.out.println("덧셈결과 ->"+ (num1 + num2));
		System.out.println("뺄셈결과 ->"+ (num1 - num2));
		System.out.println("곱셈결과 ->" +(num1 * num2));
		System.out.println("나눗셈 몫 ->"+ (num1 / num2));
		System.out.println("나눗셈 나머지 ->" +(num1 % num2));
	}
	public static void main(String[] args) {
		arithmetic(100,77);
		//arithmetic(10,20);

	}




}
