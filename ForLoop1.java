package FirstPack;


class Iter
{
	int i;
	public void iterNumber()
	{
		for(i=0;i<10;i++)
		{
			System.out.println(i);
		}

	}
}

public class ForLoop1 {
	
	public static void main(String[] args)
	{
		Iter object1 = new Iter();
		object1.iterNumber();
	}

}
