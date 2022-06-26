package FirstPack;

public class LinearSearchAlgo 
{
	
	public static int search(int array[], int x)
	{
		int n= array.length;
		for(int i =0; i <n; i ++)
		{
			if (array[i] == x)
				return i;
		}
		return -1;
	}
	public static void main(String[] args) {
		
		int arr[]= {3,44,87,65,45,34,22,98};
		int x=	45;
		
		int result=search(arr, x);
		if (result==-1)
			System.out.print("Element is not present in the array");
		else
			System.out.print("Element is present at the index: "+ result);
			
	}

}
