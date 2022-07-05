package baekjoon;

import java.util.Scanner;

public class BJ2884 {

	public static void main(String[] args) {
		
		
		int H, M, H1, M1;
		int alarm;
		
		Scanner sc=new Scanner(System.in);
		H=sc.nextInt();
		M=sc.nextInt();
		
		alarm=(H*60+M)-45;
		
		if (alarm>=0) {
			H1=alarm/60;
			M1=alarm%60;
			
		}else {
			H1=23;
			M1=M+15;
			
		}
		
		
		
		System.out.printf("%d %d",H1,M1);
		
		
	}

}
