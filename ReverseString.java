package week3.day2.homeassignments;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "feeling good";

		char[] charArr=test.toCharArray();

		for(int i=charArr.length-1;i>=0;i--){
			System.out.print(charArr[i]);
		}
		System.out.println();
		for(int j=test.length()-1;j>=0;j--){
			System.out.print(test.charAt(j));
		}
	}

}
