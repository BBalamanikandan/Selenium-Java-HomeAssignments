package week1.day2.homeassignments;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int input=13,count=0;
		
		for (int i = 1; i<=input; i++) {
			if(input%i==0) {
				count+=1;
			}
		}
		
		if (count==2) {
			System.out.println("Prime");
		}else {
			System.out.println("Not a Prime");
		}
	}

}
