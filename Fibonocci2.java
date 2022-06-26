package FirstPack;

public class Fibonocci2 {
	
	public static void main(String[] args) {
		int first_element=0, second_element=1;
		int n=10;
		 System.out.println("Fibonocii Series for " +n + " numbers are:" );
		 
		 
		 
		 for (int i=0;i<n;i++)
		 {
			 System.out.print(first_element+" ");
			 int third_element=second_element+first_element;
			 first_element=second_element;
			 second_element=third_element;
		 }
		 
	}

}
