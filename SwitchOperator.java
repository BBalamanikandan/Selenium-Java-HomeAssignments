package week1.day2.homeassignments;

public class SwitchOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1=10,n2=5;
		String operation="sub";
		
		System.out.println("Input : "+n1+","+n2+" and "+operation);
		System.out.print("Output  : ");
		
		switch (operation) {

			case "add": System.out.print(n1+n2); break;
			case "sub": System.out.print(n1-n2); break;
			case "mul": System.out.print(n1*n2); break;
			case "div": System.out.print(n1/n2); break;
			default: 
				System.out.print(n1%n2);
				System.out.print(n1^n2);
				
		}
		
		
	}

}
