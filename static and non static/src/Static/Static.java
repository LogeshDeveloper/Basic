package Static;

public class Static {
	
	static{
		//static block
		System.out.println("I m learning in FITA");
		}
	public static void main(String[] args) {
		//Main function
		System.out.println("hello");
		CallingStatic callingStaticObj = new CallingStatic();
		callingStaticObj.m1();
		CallingStatic.m2();
		Arthematic ArthematicObj = new Arthematic();
		int resultadd = ArthematicObj.add(10, 10);
		int resultsub = ArthematicObj.sub(13, 3);
		int resultdiv = ArthematicObj.div(10, 2);
		System.out.println("Result for Addition"+resultadd);
		System.out.println("Result for Subtraction"+resultsub);
		System.out.println("Result for Division"+resultdiv);
		

	}
	
	

}
