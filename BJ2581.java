package baekjoon;

import java.util.Scanner;

public class BJ2581 {

	public static void main(String[] args) {
		
		
		int m, n,sum=0;
		Scanner sc= new Scanner(System.in);
		m=sc.nextInt();
		n=sc.nextInt();
		
		int[] arr=new int[n-m+1];
		
		arr[0]=n;
		for(int i=1;i<arr.length;i++) {
			arr[i]+=arr[i-1];		// 값입력
		}
		int[] arr2=new int[n-m+1];
		for(int i=0;i<arr.length;i++) {
			
			//if(arr[i]==2) 		//2일때 예외니까 따로잡아주기
			for(int j=2;j<arr[i];j++) {
				
				if(arr[i]%j!=0) 
					{arr2[i]=arr[i];
					break;}
				
			}
			
		}
		
		for(int j=0; j<arr2.length;j++) {
			sum+=arr2[j];
		}
			
			System.out.println(sum);
		
		

	}

	
	
}
