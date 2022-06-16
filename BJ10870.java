package baekjoon;

import java.util.Scanner;

public class BJ10870 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		int[] F=new int[21];
		F[0]=0;
		F[1]=1;
		
		for(int i=2;i<=20;i++) {
			F[i]=F[i-1]+F[i-2];
		}
		
		System.out.println(F[n]);
		

	}

}
