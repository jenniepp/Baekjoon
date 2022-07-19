package baekjoon;

import java.util.Scanner;

public class BJ11720 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String str=sc.next();		//값받기good
		
		int[] arr=new int[n];
		int sum=0;
		
		for(int i=0;i<n;i++) {
			arr[i]=Integer.parseInt(str.substring(i, i+1));//배열에 값넣기
			
			sum+=arr[i];
			
		
		}
		
		
		System.out.println(sum);
		
		

	}

}
