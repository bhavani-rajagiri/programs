package practice_code;

public class Calculate_the_Sum_of_an_Array {

	public static void main(String[] args) {
		
		int array[]= {1,5,7,8,9};
		int sum=0;
		
		for(int i=0;i<=array.length-1; i++)
		{
			sum=sum+array[i];
			
		}
		System.out.println(sum);

	}

}
