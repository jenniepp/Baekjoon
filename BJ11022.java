package baekjoon;

import java.util.Scanner;

public class BJ11022 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int t, a=0, b=0, c=0;
		
		t=sc.nextInt();
		
		for (int i=1;i<=t;i++) {
			
			 a = sc.nextInt();
			 b = sc.nextInt();
	            c = a + b;

	            System.out.println("Case #" + i +": " + a + " + " + b + " = " + c);
			
			
		}
				
		
		
		
	}
}


