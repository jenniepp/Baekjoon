package baekjoon;

import java.util.Scanner;

public class BJ10871 {

	public static void main(String[] args) {
		
		
		//정수n개로 이루어진 수열a와 정수 x
		// a에서 x보다 작은 수를 모두 출력하는 프로그램
		
		int x,n,i;
		int[] num;
		
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		x=sc.nextInt();
		
		num=new int[n];
		
		for(i=0;i<n;i++) {
			num[i]=sc.nextInt();
			
		}
		
		if(x>num[i]) System.out.printf("%d ",num[i]);
		
		
		
	
		
		
		
		
		
		
		
		
		
		

	}

}
