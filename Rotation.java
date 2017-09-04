import java.io.*;
import java.util.*;

public class Rotation
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st string:");
		String s1=sc.nextLine();
		System.out.println("Enter 2nd string:");
		String s2=sc.nextLine();

		Rotation obj=new Rotation();
		boolean result=obj.string_rotation(s1,s2);
		if(result)
			System.out.println("String "+s1+" is a rotation of "+s2);
		else
			System.out.println("String "+s1+" is not a rotation of "+s2);			

	}

	public boolean string_rotation(String s1, String s2)
	{
		char[] c1=s1.toCharArray();
		char[] c2=s2.toCharArray();
		Arrays.sort(c1);
		Arrays.sort(c2);
		String s3=new String(c1);
		String s4=new String(c2);
		if(!s3.equals(s4))
			return false;
		else
		{
			String s1s1= s1 + s1;		//s1=xy..s2=yx..s1s1=xyxy
			if(s1s1.contains(s2))
				return true;
			else
				return false;
		}
	}
}