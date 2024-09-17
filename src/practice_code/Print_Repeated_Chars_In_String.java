package practice_code;

public class Print_Repeated_Chars_In_String {

	public static void main(String[] args) {
		
		String name="Javagndselenium";
		char[] ch=name.toCharArray();
		
		
		for(int i=0;i<name.length();i++)
		{
		  for(int j=i+1;j<name.length();j++)
		  {
			  if(ch[i]==ch[j])
			  {
				 System.out.println(ch[j]);
			  }   
		  }
		   
		}
		
		//System.out.println("Total number of duplicate chars are : "+count);
		
	}

}
