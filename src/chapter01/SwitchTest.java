package chapter01;

public class SwitchTest {

	public static void main(String[] args) {
		
		int month=10;
		int days=0;
		
		//switch
		switch(month){
			case 1: {
				days= 31;
				System.out.println("31일");
				break;
			}
			case 2: {
				days= 30;	
				break;
						}
			case 3: {
				days= 31;
				break;
			}
			case 4: {
				days= 30;
				break;
			}
			case 5: {
				days= 31;
				break;
			}
			case 6: {
				days= 30;
				break;
			}
			case 7: {
				days= 31;
				break;
			}
			case 8: {
				days= 31;
				break;
			}
			case 9: {
				days= 30;
				break;
			}
			case 10: {
				days= 31;
				break;
			}
			case 11: {
				days= 30;
				break;
			}
			case 12: {
				days= 31;
				break;
			}
			default : {
				System.out.println("해당월이 없습니다.");
			}
		}
		
		System.out.println(month + "월은"+ days + "일까지 있습니다") ;
	}
}
		
		


