package static_and_NonStatic;

class Test_Static_var_Methods{
	
	 static String name="Bhavani";
	 static int age=20;
	 static  String Ph_no="1234567890";
	 
	 
	 public static void getName()
	 {
		 System.out.println(name);
	 }
	 public static void getAge()
	 {
		 System.out.println(age);
	 }
	 public static void getPhNo()
	 {
		 System.out.println(Ph_no);
	 }
}

public class StaticTest {

	public static void main(String[] args) {
		
		Test_Static_var_Methods.getName();
		Test_Static_var_Methods.getAge();
		Test_Static_var_Methods.getPhNo();
	}

}
