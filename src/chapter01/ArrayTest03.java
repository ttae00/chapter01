package chapter01;

public class ArrayTest03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//배열의 초기화(리터럴 대입)
		
		
		int[] a= {10,20,30,40};
		
		int[] b= new int[] {10,20,30,40};//비추천
//		
//		int[] a= new int[4];
//		a[0]=10;
//		a[1]=20;
//		a[2]=30;
//		a[3]=40;
		
		for(int i=0; i<a.length; i++){
			System.out.println(a[i]);
		}
		
		//오류 
		//int[] c;
		//c = {10,20,30,40};
	}

}
