import java.util.Scanner;
public class StringCompression
{
	public void compression(String str)
	{
		char s=str.charAt(0);
		String output="";
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)==s)
				count++;
			else
			{
				output+=s+Integer.toString(count);
				s=str.charAt(i);
				count=1;
			}
		}
		output+=s+Integer.toString(count);
		System.out.println(output);
	}

	public static void main(String args[])
	{
		StringCompression c=new StringCompression();
		System.out.println("Enter the string:");
		String string=new Scanner(System.in).nextLine();
		c.compression(string);
	}
}	