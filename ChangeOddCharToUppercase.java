package week3.day2.homeassignments;

public class ChangeOddCharToUppercase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test="changeme";

		char[] charArr=test.toCharArray();

		for(int i=0;i<charArr.length-1;i++){
			if(i%2!=0){
				charArr[i]=Character.toUpperCase(charArr[i]);
			}
		}

		System.out.println(charArr);
	}

}
