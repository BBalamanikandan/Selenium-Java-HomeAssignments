package week3.day2.homeassignments;

public class CharOccurance {

	public static void main(String[] args) {
		String str = "welcome to chennai";

		int count=0;

		char[] charArr=str.toCharArray();

		for(int i=0;i<charArr.length;i++){
		if(charArr[i]=='e'){
		count+=1;
		}
		}

		System.out.println(count+" times char e present in the given string "+str);
	}

}
