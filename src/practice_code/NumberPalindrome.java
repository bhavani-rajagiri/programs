package practice_code;

public class NumberPalindrome {

	public static void main(String[] args) {
	
		int Original_Num=123;
		int num=Original_Num;
		int rev=0;
		
		while(num!=0)
		{
			int rem=num%10;
			rev=rev*10+rem;
		    num=num/10;
		  }
		System.out.println("Reversed number is :"+ rev);
		if(rev==Original_Num)
		{
			System.out.println("Number is palindrome");
		}
		else
		{
			System.out.println("Number is not a palindrome");
		}
		
		}

	}

