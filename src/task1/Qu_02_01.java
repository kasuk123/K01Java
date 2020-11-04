package task1;

import java.io.IOException;
import java.util.Scanner;

public class Qu_02_01 {

	public static void main(String[] args) throws IOException {
		
	int[] lotton = new int[6];
	for(int i=0; i< lotton.length; i++) {
		lotton[i] = (int)((Math.random()*100)%45)+1;
	}
	for(int j=0; j<lotton.length; j++) {
		System.out.printf("%d ",lotton[j]);
	}
		
		
		
	}	
}
