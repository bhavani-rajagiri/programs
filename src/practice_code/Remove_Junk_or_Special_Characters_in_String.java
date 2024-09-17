package practice_code;

public class Remove_Junk_or_Special_Characters_in_String {

	public static void main(String[] args) {
		
		String s = "!@#$%^&* java $%^&**(()) selenium *&%$#@! training";
		String updatedString=s.replaceAll("[^a-zA-Z0-9]", "");//^ tells except a-z,A-Z,0-9 remove all special chars 
		System.out.println(updatedString);

	}

}
