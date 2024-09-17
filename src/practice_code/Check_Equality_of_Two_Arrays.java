package practice_code;

public class Check_Equality_of_Two_Arrays {

	public static void main(String[] args) {
		
		int array1[]= {1,2,3,4,5};
		int array2[]= {1,2,3,4,5};
		
	//compare the length of arrays
		boolean status=true;
		if(array1.length==array2.length)
		{
			for(int i=0;i<array1.length;i++)
			{
				for(int j=0;j<array2.length;j++) 
				{
					if(array1[i]!=array2[i])
					{
						status = false;
					}
				}
				
			}
		}
		
	else
		{
			status=false;
		}
		
		if(status==true)
		{
			System.out.println("Array values are equal");
		}
		else
		{
			System.out.println("Array values are not equal");
		}
	}

}
