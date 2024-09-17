package javaMethods;


class Returnsvalue_TakesPrameter{
	
	
	public int volume(int height,int width)
	{
		return height*width;
	}
}






public class TakesPrameter_Returnsvalue {

	public static void main(String[] args) {
		
		Returnsvalue_TakesPrameter Returnsvalue_TakesPrameter=new Returnsvalue_TakesPrameter();
		int volume=Returnsvalue_TakesPrameter.volume(10,10);
		System.out.println(volume);
	}

}
