package FirstPack;

public class PrintPattern3 {
	public static void main(String[] args) {
		for (int i=0;i<7;i++)
		{
			for(int j=0; j<7; j++)
			{
				if(i==0)
					System.out.print("* ");
				else if(j==3)
					System.out.print("      *");
			}
			System.out.println();
		}
	}

}
