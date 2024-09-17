package Polymorphism;


class TestOverloading{
	
	public void add(int a, int b)
	{
		int add=a+b;
		System.out.println(add);
	}
	public int add(int a, int b, int c)
	{
		return a+b+c;
	}
	public void add(double a, int b)
	{
		double addition=a+b;
		System.out.println(addition);
	}
	public double add(int b, double a)
	{
		return a+b;
	}
	
}


public class OverloadingTest {

	public static void main(String[] args) {
		TestOverloading testOverloading=new TestOverloading();
		testOverloading.add(2, 3);
		int sum=testOverloading.add(2, 3, 6);
		System.out.println(sum);
		testOverloading.add(1.0, 3);
		double returnSum=testOverloading.add(2, 3.0);
		System.out.println(returnSum);
		
	}

}
