package baekjoon;

import java.util.Scanner;

public class BJ2292 {

	public static void main(String[] args) {
		
		int n, std, std1, a=1, fin=0;
		
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
			
			do {
				std=6*a*(a+1)/2;
				if(n>=std) {
					fin=a;
					
				}
				
				
			}while(n<=std);
				
		if(n==1) { fin=1;}
			
		
		System.out.println(fin);
		

	}

}
