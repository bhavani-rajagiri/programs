package static_and_NonStatic;




class Static_and_NonStatic_var_Methods{
	
	static int age =100;
	String name="Bhavani G r";
	
	
	public static void printAge()
	{
		System.out.println("Called without creating object, that is by class name: "+ age);
		//System.out.println(name);// can not access non-static "name" (variable) in static method
	}
	
	public void printname()
	{
		System.out.println("Called by without creating object of a class: " +name);
		System.out.println("Called by without creating object of a class (static variable): "+ age); // can access static variable in non-static method
		
	}
}






public class Static_and_Nonstatic {

	public static void main(String[] args) {
		
		Static_and_NonStatic_var_Methods.printAge();
		
		Static_and_NonStatic_var_Methods static_and_NonStatic_var_Methods=new Static_and_NonStatic_var_Methods();
		
		static_and_NonStatic_var_Methods.printname();
		
		
	}

}
