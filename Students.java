package week3.day1.homeassignments;

public class Students {

	
		// TODO Auto-generated method stub

		public void getStudentInfo(String id) {
			// TODO Auto-generated method stub
			System.out.println("Student ID   : "+id);
		}
		public void getStudentInfo(String sid, String name) {
			// TODO Auto-generated method stub
			System.out.println("Student ID   : "+sid);
			System.out.println("Student Name : "+name);
		}
		public void getStudentInfo(String eml, long phno) {
			// TODO Auto-generated method stub
			System.out.println("Student Email : "+eml);
			System.out.println("Student Phone : "+phno);
		}
		
		public static void main(String[] args) {
			Students s1=new Students();
			s1.getStudentInfo("S001");
			s1.getStudentInfo("S001","RAJA");
			s1.getStudentInfo("Rajkumar120@gmail.com","9876543210L");
		}
	

}
