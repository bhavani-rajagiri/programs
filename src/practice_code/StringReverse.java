package practice_code;

public class StringReverse {

	public static void main(String[] args) {
		
		String actual="Bhavani";
		String reversed="";
		
		for(int i=actual.length()-1;i>=0;i--)
		{
			reversed=reversed+actual.charAt(i);
		}
		System.out.println(reversed);
		
		

	}

}
