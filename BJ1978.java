package baekjoon;

import java.util.Scanner;

public class BJ1978 {

	public static void main(String[] args) {
		
		int n, count=0, result=0;
		Scanner sc= new Scanner(System.in);
		n=sc.nextInt();
		
		int[] arr=new int[n];
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
	
		
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]==2) count=1;		//2일때 예외니까 따로잡아주기
			for(int j=2;j<arr[i];j++) {
				count=1;
				if(arr[i]%j==0)
					{count=count*0;
					break;
					}
				
				
			}
			
			if(count!=0) result++;
		
		}
		
		System.out.println(result);

	}

}
