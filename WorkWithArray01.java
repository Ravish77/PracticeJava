package FirstPack;

public class WorkWithArray01 {
	
	public static void main(String[] args) {
		
		int nums1[] = new int[4];		// One Dimensional Array
		nums1[0] = 7;
		nums1[1] = 8;
		nums1[2] = 2;
		nums1[3] = 5;
		
		int nums2[][] = {{5,3,7},{9,3,1},{6,5,9}};   // 2 Dimensional Array
		
		
		//jagged arrag- rows are fixed, columns are variable
		int nums3[][] = {								
							{2,7,8},
							{3,8,1,9},
							{2,0}	
						};
		
		
		//Printing 1D array
		
		System.out.println("Single Dimensional array: ");
		for(int z=0;z<4;z++)
		{
			
			System.out.print(nums1[z]+ " ");
		}
		
		System.out.println();
		System.out.println();
		
		
		//Printing 2-D array
		
		System.out.println("Two Dimensional array: ");
		for(int i=0;i<nums2.length;i++)
		{
			for(int j=0;j<nums2[i].length; j++)
			{
				System.out.print(nums2[i][j]+ " ");
			}
			System.out.println();
			
		}
		System.out.println();
		
		
		
		//Printing jagged array
		
		System.out.println("Jagged Array:");
		for(int m=0;m<nums3.length;m++)
		{
			for(int n=0;n<nums3[m].length;n++)
			{
				System.out.print(nums3[m][n] + " ");
				
			}
			System.out.println();
		}
		
		
		
		
	}

}
