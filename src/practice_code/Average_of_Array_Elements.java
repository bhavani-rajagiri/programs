package practice_code;

public class Average_of_Array_Elements {

	public static void main(String[] args) {
		
		int array[] = {1,4,6,12,34,45};
		int sum=0;
		int avg=0;
		
		for(int a:array)
		{
			sum=sum+a;
		}
		System.out.println(sum);
		avg=sum/(array.length);
		System.out.println(avg);

	}

}
