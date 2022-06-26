package FirstPack;

public class Fibonocii {
	
	public static void main(String[] args) {
		
		fib(10);
		
	}
	
	public static  void fib(int n)
	{
		int first_element=0;
		int second_element=1;
		
		if(n==1)
			System.out.println("Fibonocii series for 1 element is : 0");
		else if(n==2)
			System.out.println("Fibonocii series for 2 elements are : 0, 1");
		else
		{
			System.out.print("Fibonocii series for "+ n +" elements are : ");
			System.out.print(first_element+ ", ");
			System.out.print(second_element+ ", ");
			for(int i=2; i<n; i++)
			{
				int third_element= first_element+second_element;
				System.out.print(third_element+ ", ");
				first_element=second_element;
				second_element=third_element;
				
			}
			
		}
		
		
		
	}

	
}
