import java.io.*;
import java.util.*;

public class URLify
{
	public static void main(String[] args)
	{
		System.out.println("Enter a string and its length");
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int l=sc.nextInt();

		URLify obj=new URLify();
		obj.convertToURL(s,l);
	}

	public void convertToURL(String s, int l)
	{
		String s1=s.trim();
		String s2=s1.replace(" ", "%20");
		System.out.println("URLified string is:"+s2);
	}
}