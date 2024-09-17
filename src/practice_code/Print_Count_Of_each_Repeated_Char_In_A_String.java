package practice_code;

public class Print_Count_Of_each_Repeated_Char_In_A_String {

	public static void main(String[] args) {
		
		String s="Javaselenium";
		char ch[]=s.toCharArray();
		
		int count=0;
		int count_char=0;
		
		for(int i=0;i<s.length();i++)

		{
			for(int j=i+1;j<s.length();j++) {
				if(ch[i]==ch[j])
				{
					System.out.println("Repeated char are : " + ch[j]);
					count ++;
					
					
					if(count>2 && )
					{
						count_char++;
					}
				}
				  
				
			    }
			}
			
			System.out.println("Duplicate char count :" +count);
			System.out.println(count_char);
	}

}
