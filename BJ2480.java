package baekjoon;

import java.util.Scanner;

public class BJ2480 {

	public static void main(String[] args) {
		
		int  price,temp;
		int[] n=new int[3];
		Scanner sc=new Scanner(System.in);
		
		for(int i=0;i<3;i++) {
			n[i]=sc.nextInt();
		}
		
		if(n[0]==n[1] && n[1]==n[2] && n[2]==n[0]) {
			price=10000+n[0]*1000;
		}else if(n[0]!=n[1] && n[1]!=n[2] && n[2]!=n[0]) {
			temp=n[0];
			for(int i=0;i<3;i++) {
				if(n[i]>temp) {temp=n[i];}
				
			}
			
			price=temp*100;
		}else {
			if(n[0]==n[1]) {
				price=1000+n[0]*100;
			}else if(n[1]==n[2]) {
				price=1000+n[1]*100;
			}else price=1000+n[2]*100;
		}
		
		System.out.println(price);
		
		

	}

}
