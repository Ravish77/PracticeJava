package FirstPack;

class Class1
{
	int number1, number2;
	int result;
	
	public void performAdd()
	{
		result= number1+number2;
	}
}

public class PractiseClass {
	
	public static void main(String[] args)
	{
		Class1 obj1 = new Class1();
		obj1.number1=17;
		obj1.number2=34;
		
		obj1.performAdd();
		
		System.out.println(obj1.result);
	}

}
