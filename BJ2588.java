package baekjoon;

import java.util.Scanner;

public class BJ2588 {

	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		
		int third,fourth,fifth,result;
		
		third=num1*(num2%10);
		fourth=num1*((num2/10)%10);
		fifth=num1*(num2/100);
		
		result=third+(fourth*10)+(fifth*100);
				
		
		
				
		System.out.println(third);
		System.out.println(fourth);
		System.out.println(fifth);
		System.out.println(result);
		
		
		
		
		
		

	}

}
