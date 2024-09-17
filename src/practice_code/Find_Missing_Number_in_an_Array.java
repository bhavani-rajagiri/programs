package practice_code;

public class Find_Missing_Number_in_an_Array {

	public static void main(String[] args) {
		
		
		int array[] = {11,12,13,15,16,17,18,19,20};
		int sum1=0;
		int sum2=0;
		
		//find sum of all numbers in given array
		
		for(int a:array)
		{
			sum1=sum1+a;
			
		}
         System.out.println("Sum of given array numbers : " + sum1);
         
         //find sum of numbers between 11 to 20
         for(int i=11;i<=20;i++)
         {
        	 sum2=sum2+i;
         }
         
         System.out.println("Sum of numbers between 11 to 20 : " + sum2);
         System.out.println("Missing number is: "+ (sum2-sum1));
	}

}
