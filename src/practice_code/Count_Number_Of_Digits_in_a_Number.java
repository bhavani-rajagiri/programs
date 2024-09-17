package practice_code;

public class Count_Number_Of_Digits_in_a_Number {

	public static void main(String[] args) {
		
		int number = 123;
		int count=0;
		
		while(number!=0)
		{
			number=number/10; //devide the number by 10 to eliminate last digit
			count++;
		}
      System.out.println("Number of digits in a number : " + count);
	}

}
