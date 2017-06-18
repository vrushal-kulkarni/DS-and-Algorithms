import java.util.*;
import java.io.*;

public class Is_unique
{
	public static void main(String[] args)
	{
		System.out.println("Enter a string:");
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		System.out.println("Entered string is:"+str);
		Is_unique obj=new Is_unique();
		boolean result=obj.unique(str);
		if(result)
			System.out.println(str+" is a unique string");
		else
			System.out.println(str+" is not a unique string");
	}

	public boolean unique(String s)
	{
		HashSet<Character> h=new HashSet<Character>();
		Character[] c=new Character[s.length()];
		for(int j=0;j<s.length();j++)
		{
			c[j]=new Character(s.charAt(j));
		}
		for(int i=0;i<c.length;i++)
		{
			h.add(c[i]);
		}
		if(h.size() == s.length())
			return true;
		else 
			return false;

	}

}