package baekjoon;

import java.util.Scanner;

public class BJ10950 {

	public static void main(String[] args) {
		
		int i, t;Scanner sc=new Scanner(System.in);
		
		t=sc.nextInt();
		int[] num1=new int[t];
		int[] num2=new int[t];
		
		for(i=0;i<t;i++) {
			num1[i]=sc.nextInt();
			num2[i]=sc.nextInt();
			
		}
		
		for(i=0;i<t;i++) {
		System.out.println(num1[i]+num2[i]);
		}	

	}

}
