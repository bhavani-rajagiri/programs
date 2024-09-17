package practice_code;

public class Max_and_Min_values_in_Array {

	public static void main(String[] args) {
	
		int array[] = {90,4,6,12,45,67};
		
		int max = array[0];
		int min = array[0];
		for(int i=0;i<=array.length-1;i++)
		{
			if(array[i]>max)
			{
				max=array[i];
			}
		}
     
		System.out.println("Maxium value in the array is : " + max);
		for(int i=0;i<=array.length-1;i++)
		{
			if(array[i]<min)
			{
				min=array[i];
			}
		}
		System.out.println("Minimum value in the array is : " +min);
		
	}

}
