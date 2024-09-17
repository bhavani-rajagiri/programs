package javaMethods;



class NoReturnValue_TakesParameter{
	int x,y;
	
	public void add(int a,int b)
	{
		
		x=a;
		y=b;
		int sum=x+y;
				
		System.out.println(sum);
	}
	
}






public class TakesPrameter_NoReturnValue {

	public static void main(String[] args) {
		NoReturnValue_TakesParameter noReturnValue_TakesParameter =new NoReturnValue_TakesParameter();
		noReturnValue_TakesParameter.add(45,78);

	}

}
