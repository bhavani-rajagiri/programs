package inheritance;

class Parent
{
	public void add(int a, int b)
	{
		int sum =a+b;
		System.out.println(sum);
	}
}
	class Child extends Parent
	{
		
		public void add_decimals()
		{
			double f1=1.9;
			double f2=1.0;
			double sum=f1+f2;
			System.out.println(sum);
		}
    }
public class Single_Inheitance 
{

	public static void main(String[] args) 
	{
		
		Child c = new Child();//constructor
		c.add(2,4);
		c.add_decimals();

	}

}
