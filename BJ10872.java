package baekjoon;

import java.util.Scanner;

public class BJ10872 {

	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		
		int N=sc.nextInt();
		int multi=1;
		
		if(N!=0) {
			for(int i=0;i<N;i++) {
				multi=multi*(N-i);
			
			}
		}
		
		System.out.println(multi);

	}

}
