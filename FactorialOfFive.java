package week1.day1.homeassignments;

public class FactorialOfFive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int num=5,i,fact=1;
		System.out.println("Input  : "+num);
		System.out.print("Output : ");
		
		for(i=num;i>0;i--) {
			if(i!=1) {
				System.out.print(i+"*");
			}else {
				System.out.print(i);
			}
			fact*=i;
		}
		System.out.print("="+fact);
	}

}
