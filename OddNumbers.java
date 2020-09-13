package week1.day1.homeassignments;

public class OddNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Input  : range of numbers (starting to end) [1 to 20]");
		System.out.print("Output : Printing only odd numbers[");
		for(int i=1;i<=20;i++) {
			if(i%2!=0) {
				if(i!=19) {
					System.out.print(i+",");
				}else{
					System.out.print(i);
				}
			}
		}
		System.out.print("]");
	}

}
