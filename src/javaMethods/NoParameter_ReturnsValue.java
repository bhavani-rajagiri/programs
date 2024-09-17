package javaMethods;



class ReturnsValue_NoParameter{
	
	int x=3;
	int y=7;
	
	
	public int multiplication() {
		return x*y;
	}
}

public class NoParameter_ReturnsValue {

	public static void main(String[] args) {
		
		ReturnsValue_NoParameter returnsValue_NoParameter=new ReturnsValue_NoParameter();
		
		int mul=returnsValue_NoParameter.multiplication();
		System.out.println(mul);
		
	}

}
