package baekjoon;

import java.util.Scanner;

public class BJ2839 {

	public static void main(String[] args) {
		
		
		Scanner sc= new Scanner(System.in);
		int N=sc.nextInt();
		
		int amount1=0, amount2=0, result=-1;
		
		
		
		for(int i=(N/5);i>=0;i--) {
			amount1=i;					
			amount2=(N-amount1*5)/3;
			
			if(N==(amount1*5)+(amount2*3)) {
				result=amount1+amount2;
				break;
			}
		}
		
			
		System.out.println(result);	
		

	}

}
