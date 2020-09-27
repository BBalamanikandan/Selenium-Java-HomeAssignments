package week3.day2.homeassignments;

import java.util.Arrays;

public class Anagram {

public static void main(String[] args) {
	String text1 = "stops";
	String text2 = "potss"; 
	

	if(text1.length()==text2.length()){
		char[] charArr1=text1.toCharArray();
		char[] charArr2=text2.toCharArray();
		Arrays.sort(charArr1);
		Arrays.sort(charArr2);
		System.out.println(charArr1);
		System.out.println(charArr2);
	}

}
}