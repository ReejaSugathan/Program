package sort;
import java.util.*;
public class BubbleSort 
{
	public static void main(String[] arg)
	{
		int i,j,size,swap;
		Scanner s=new Scanner(System.in);
		
		System.out.print(" Enter the Array size: ");
		size=s.nextInt();
		int arr[]=new int[size];
		
		System.out.print(" Enter the Array: ");
		for(i=0;i<arr.length;i++)
			{
			arr[i]=s.nextInt();  // insert array
			}
		System.out.print(" The before sorting the Array elements: ");
		for(i=0;i<arr.length;i++)
			{
			System.out.print(" "+arr[i]);  // print before array
			}
		System.out.println();
		System.out.print(" The after sorting the Array elements: ");
		
		for (i = 0;i<size-1;i++)       //sort
			{  
			for (j=0;j<size-i-1; j++)
			{
				if (arr[j] > arr[j+1])   /* For descending order use swapping*/ 
				{
					swap       = arr[j];
					arr[j]   = arr[j+1];
					arr[j+1] = swap;
				}
			} 
			}
		for(i=0;i<arr.length;i++)
			{
			System.out.print(" "+arr[i]);  // print after sort array
			}
			
	}
}
