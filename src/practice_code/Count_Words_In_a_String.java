package practice_code;

import java.util.Scanner;

public class Count_Words_In_a_String {

	public static void main(String[] args) {

        int count=1;
        
        Scanner scan=new Scanner(System.in);
		System.out.println("Enter String..");
		String name=scan.nextLine();
        
        //String name="Java Training and Placement";
		
		for(int i=0;i<=name.length()-1;i++)
		{
			if((name.charAt(i)==' ') && (name.charAt(i+1)!=' '))
			{
				count ++;
			}
		}
		
		System.out.println(count);
		
		
		//For hard code values
		/*String name="Bhavani R rajagiri";
		int words = name.split("\\s").length;
		System.out.println(words);*/
	}

}
