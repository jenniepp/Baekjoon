package baekjoon;

import java.util.Scanner;

public class BJ14681 {

	public static void main(String[] args) {
		
		int x,y,n=0;
		Scanner sc=new Scanner(System.in);
		x=sc.nextInt();
		y=sc.nextInt();
		
		if(x>0) {
			if(y>0) {
				n=1;
			}else if(y<0) {
				n=4;
			}
		}else if(x<0) {
			if(y>0) {
				n=2;
			}else if(y<0) {
				n=3;
			}
		}
		
		System.out.println(n);
		
		
		
		
		
		

	}

}
