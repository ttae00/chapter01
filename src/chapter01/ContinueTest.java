package chapter01;

public class ContinueTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=0; i<= 20; i++){
//			if(i % 2 !=0){
//			System.out.println(i);
//		
//			}
//		}
		if(i%2==0){
			continue;
		}
		if(i%3==0){
			continue;
		}
		System.out.println(i);
		}
	}
}
