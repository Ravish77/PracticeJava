package FirstPack;

public class PrintPattern1 {
	
	public static void main(String[] args)
	{
		for (int i=1; i<=10; i++)
		{
			for (int j=1;j<=8; j++)
			{
				for (int k=1;k<=6; k++)
				{
					for (int m=1; m<=4; m++)
					{
						System.out.print(m + " ");
					}
					System.out.println();
				
				}
				System.out.println();
				
			}
			
			System.out.println();
		}
		
	}

}
