package chapter01;

import java.util.Scanner;

public class NHelloWorld01 {
	public static void main(String[] args){
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("count: ");
		int count =sc.nextInt();
		
		int i=0;
		while(i < count){
			System.out.println(
					i+ "Hello World");
			i++;
		}
		sc.close();
		
	}
}
