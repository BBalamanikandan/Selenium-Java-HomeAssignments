package week3.day2.homeassignments;

public class IntersectionOnIntegerArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] Arr1={3,2,11,4,6,7};
		int[] Arr2={1,2,8,4,9,7};

		for(Integer x:Arr1){
			for(Integer y:Arr2){
				if(x==y){
					System.out.println(x);
				}
			}
		}
	}

}
