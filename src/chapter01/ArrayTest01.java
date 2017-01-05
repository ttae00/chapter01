package chapter01;

public class ArrayTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		int[] a= new int[4];
		
		a[0]= 10;
		a[1]= 20;
		a[2]= 30;
		a[3]= 40;
		//a[4]=50; //예외발생(ArrayIndexOutOfBound) 
			
		int length= a.length;
		System.out.println(length);
		
		int sum=0;
		for(int i=0; i<length; i++){
			sum += a[i];
		}
		
		System.out.println(sum);
		
		//확장for문 (for~each문)
		for(int value: a){
			System.out.println(value);
		}
	}

}
