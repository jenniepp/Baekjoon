package baekjoon;

import java.util.Scanner;

public class BJ9498 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int score;
		char a;
		score=sc.nextInt();
		
		if(score>=90) {
			a='A';
		}else if(score>=80) {
			a='B';
		}else if(score>=70) {
			a='C';
		}else if(score>=60) {
			a='D';
		}else a='F';
		
		System.out.println(a);
		
		
		
		
		
		
		

	}

}
