package week3.day2.homeassignments;

public class SumOfDigitsOnString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "Tes12Le79af65";
		String text2=text;
		int sum = 0,sum2=0;

		text=text.replaceAll("\\D","");
		char[] charArr=text.toCharArray();

		for(char x:charArr){
			sum+=Character.getNumericValue(x);
		}

		System.out.println("Sum="+sum);

		char[] charArr2=text2.toCharArray();

		for(char y:charArr2){
			if(Character.isDigit(y)){
				sum2+=Character.getNumericValue(y);
			}
		}

		System.out.println("Sum2="+sum2);	}

}
