package chapter01;

public class BreakTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num= 1;
		int sum= 0;
		while(true){
			sum= sum + num;
			if(sum> 5000){
				break;
			}
			num++;
		}
		System.out.println(sum);
	}

}
