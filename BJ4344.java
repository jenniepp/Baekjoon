package baekjoon;

import java.util.Scanner;

public class BJ4344 {

	public static void main(String[] args) {
		
		
		Scanner sc= new Scanner(System.in);
		int c=sc.nextInt();
		int n, count=0;
		double sum=0,per,avg;
		
		for(int i=0;i<c;i++) {
			n=sc.nextInt();
			double[] score=new double[n];
			for(int j=0;j<n;j++) {
				score[j]=sc.nextInt();
				
				sum+=score[j];
			}
			
			avg=sum/n;
			
			System.out.println(avg);
			
			for(int j=0;j<n;j++) {
				if(score[j]>avg) count++;
			}
			
			System.out.println(count);
			per=count*100/n;
			
			System.out.printf("%.3f",per);
			
		}
		
		
		

	}

}
