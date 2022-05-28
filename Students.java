package week3.day1;

public class Students {
	
	//getStudentInfo by passing id argument alone
	public void getStudentInfo(int id)
	{
		System.out.println("student id: "+id);
	}
	
	//getStudentInfo by passing by id & name
	
	public void getStudentInfo(int id,String name)
	{
		System.out.println("student id: "+id);
		System.out.println("student name :"+name);
	}
	
	//getStudentInfo by passing by email and phoneNumber
	
	public void getStudentInfo(String email,long phoneNumber)
	{
			System.out.println("student email: "+email);
			System.out.println("student PhoneNumber :"+phoneNumber);
	}

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Students std=new Students();
		std.getStudentInfo(1001);
		std.getStudentInfo(10012, "Vino");
		std.getStudentInfo("vinodhinichandrakasan@gmail.com", 8212782890l);

	}

}
