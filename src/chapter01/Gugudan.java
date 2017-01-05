package chapter01;

public class Gugudan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		for(int i=1; i<=9; i++ ){
			for(int j=1; j<=9; j++){
				System.out.print(j+" * "+i +"\t");	
				if(j==9){
					System.out.print("\n");
				}
			}
		}
	}

}
