package chapter01;

public class Swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			int n1 = 10;
			int n2 = 30;
	        

			// Q1: n1값이 항상 큰 값이 되도록, 필요할 경우 n1과 n2를 교체하라.
			if((n1> n2) != true){
				int temp= n1;
				n1 = n2;
				n2= temp;
				System.out.println("n1: " + n1);
				System.out.println("n2: " + n2);
			}else{
				System.out.println("n1: " + n1);
				System.out.println("n2: " + n2);
			}
		

			// Q2: 최대값을 판별하는 조건을 완성해 보세요.
			int a1 = 100;
			int a2 = 103;
			int a3 = 54;

			if (a1 > a2 && a2 > a3) {
				System.out.println(a1 +"가 최대값");
			}else if(a2 >a1 && a2 >a3){
				System.out.println(a2 +"가 최대값");
			}
			else {
				System.out.println(a3+ "가 최대값");
			}
			
			if(a1>=a2){
				if(a1>=a3){
					System.out.println("최대값은 "+ a1);
				}else {
					//a3 >a1 >a2  
					System.out.println("최대값은 "+ a3);
				}
			}else{
				if(a2>= a3){
					System.out.println("최대값은" + a2);
				}else{
					//a3>a2>a1
					System.out.println("최대값은 "+ a3);
				}
			}
		   
		}

}


