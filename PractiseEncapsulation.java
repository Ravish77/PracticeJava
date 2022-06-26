package FirstPack;


class Ravish
{
	//Encapsulation
	private int age=24;
	private String name = "Ravish";
	private String place= "Honnavar";
	
	
	public Ravish()   //constructor
	{
		System.out.println("In Constructor");
	}
	
	
	//method to overcome encrypted data
	
	public String getName()
	{
		return name;
	}

	public int getAge()
	{
		return age;
	}
	

	public String getPlace()
	{
		return place;
	}

	
}




public class PractiseEncapsulation {
	
	public static void main(String[] args) {
		
		Ravish obj1; 					 //creating a object reference  from class Ravish
		obj1= new Ravish(); 			 //assigning values of class Ravish to created object
		
		
		
		/*
		 * we can also rewrite the above object creating code as
		 * Ravish obj1 = new Ravish();
		 */
		
		
		
		String result = obj1.getPlace();  // calling a function and assigning the returned value to 'result' variable
		System.out.println(result);  
		
	}

}
