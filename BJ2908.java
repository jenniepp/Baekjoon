package baekjoon;

import java.util.Scanner;

public class BJ2908 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		String num1=sc.next();
		String num2=sc.next();		//두숫자를 문자로 받기
		
		String[] num1str=new String[3];
		String[] num2str=new String[3];
		
		
		for(int i=0;i<num1str.length;i++) {
			num1str[i]=num1.substring(i, i+1);
			num2str[i]=num2.substring(i, i+1);
			
		}
		
		
		String temp1=num1str[0];
		num1str[0]=num1str[2];
		num1str[2]=temp1;
		
		String temp2=num2str[0];
		num2str[0]=num2str[2];
		num2str[2]=temp2;
		
		
		int a=100*Integer.parseInt(num1str[0])+10*Integer.parseInt(num1str[1])+Integer.parseInt(num1str[2]);
		int b=100*Integer.parseInt(num2str[0])+10*Integer.parseInt(num2str[1])+Integer.parseInt(num2str[2]);
		
		if(a>=b){System.out.println(a);}
		else System.out.println(b);
		
		
		
		

	}

}
