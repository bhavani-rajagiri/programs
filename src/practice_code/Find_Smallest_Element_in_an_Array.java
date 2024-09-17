package practice_code;

public class Find_Smallest_Element_in_an_Array {

	public static void main(String[] args) {
		
		
		int array[]= {100,23,34,12,45,65};
		
		//Arrays.sort(array);
		//System.out.println(array[0]);
		
		
		
		
		int smallest = array[0];
		
	/*	for(int i=1;i<=array.length-1;i++)
		{
			if(array[i]<smallest)
			{
				smallest=array[i];
			}
		}
		
		System.out.println(smallest);
		*/
		
		for(int i =0; i<=array.length-1;i++)
		{
			if(array[i]<smallest) {
				smallest=array[i];
				
			}
		}
		System.out.println(smallest);
	}

}
