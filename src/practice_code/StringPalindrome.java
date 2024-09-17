package practice_code;

public class StringPalindrome {

	public static void main(String[] args) {
		
		String actual="GADAG";
		String reversed="";
		String copy=actual;
		
		for(int i=actual.length()-1; i>=0;i--)
		{
			reversed=reversed+actual.charAt(i);
		}
		System.out.println("Reversed String is :"+ reversed);
		
		if(actual.equals(reversed))
		{
			System.out.println("String is Palindrome");
		}
		else
		{
			System.out.println("String is not a Palindrome");
		}

	}

}
