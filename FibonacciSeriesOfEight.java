package week1.day1.homeassignments;

public class FibonacciSeriesOfEight {

	public static void main(String[] args) {
		int rangeNumber=8,firstNumber=0,secondNumber=1,sumValue=0;
		
		System.out.println("input(range): "+rangeNumber);
		System.out.print("Output: ");
		
		for(int i=1;i<=rangeNumber;i++) {
			
			if(i!=8) {
				System.out.print(firstNumber+",");
			}else {
				System.out.print(firstNumber);
			}
				
			sumValue=firstNumber+secondNumber;
			firstNumber=secondNumber;
			secondNumber=sumValue;
		}	
	}
}
