package practice_code;

public class Convert_String_to_Array {

	public static void main(String[] args) {
		
		String name="Bhavani g Rajagiri";
		char array[]=name.toCharArray();
		
		for(char ch:array)
		{
			System.out.println(ch);
		}
	}

}
