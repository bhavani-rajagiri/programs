package practice_code;

public class Remove_All_WhiteSpace_in_a_String {

	public static void main(String[] args) {
		 
		String s="Selenium  java Program for  Beginners";
		System.out.println("Before removing space : "+ s);
		
		s=s.replaceAll("\\s", "");//  "\\s" - removes space 
		System.out.println("After removing space :" + s);

	}

}
