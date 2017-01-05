package chapter01;

import java.util.Scanner;

public class NHelloWorld02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int count = sc.nextInt();
		
		for(int i=0; i<count; i++){
			System.out.println("Hello World");
		}
	}

}
