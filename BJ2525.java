package baekjoon;

import java.util.Scanner;

public class BJ2525 {

	public static void main(String[] args) {
		
		//입력
		int H,M,A,H1,M1,fin;
		
		Scanner sc=new Scanner(System.in);
		H=sc.nextInt();
		M=sc.nextInt();
		
		A=sc.nextInt();
				
		
		//출력
		fin=(H*60)+M+A;
		H1=fin/60;
		M1=fin-(H1*60);
		
		if(H1>23) {
			H1=H1-24;
			}
		
		System.out.printf("%d %d",H1,M1);
		
		
		
		
		
		

	}

}
