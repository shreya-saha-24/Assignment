import java.util.Scanner;
public class PairOfArray
{
	public void pairArray(int[] arr,int target)
	{
		int n=arr.length;
		for(int i=0;i<n;i++)
			for(int j=i+1;j<n;j++)
				if(arr[i]+arr[j]==target)
					System.out.println(arr[i]+","+arr[j]);
	}
	
	public static void main(String args[])
	{
		PairOfArray pa=new PairOfArray();
		System.out.println("Enter the size:");
		int n=new Scanner(System.in).nextInt();
		int[] array=new int[n];
		for(int i=0;i<n;i++)
			array[i]=new Scanner(System.in).nextInt();
		
		System.out.println("Enter the target:");
		int target=new Scanner(System.in).nextInt();
		pa.pairArray(array,target);
	}
}