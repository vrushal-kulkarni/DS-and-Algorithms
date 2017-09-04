import java.util.*;
import java.io.*;

public class Permutation
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st string s1:");
		String s1=sc.nextLine();
		System.out.println("Enter 2nd string s2:");
		String s2=sc.nextLine();

		Permutation obj = new Permutation();
		boolean result=obj.check_permutation(s1,s2);
		if(result)
			System.out.println("Strings "+s1+" and "+s2+" are permutations of each other");
		else
			System.out.println("Strings "+s1+" and "+s2+" are not permutations of each other");

	}

	public boolean check_permutation(String s1,String s2)
	{
		HashSet<Character> h=new HashSet<Character>();
		int flag =0;
		
		if(s1.length() != s2.length())
			return false;
		else
		{
			for(int i=0;i<s1.length();i++)
			{
				h.add(new Character(s1.charAt(i)));
			}
			for(int j=0;j<s2.length();j++)
			{
				if(!h.contains(s2.charAt(j)))
				{
					flag=1;
					break;
				}
				
			}
			if(flag == 1)
				return false;
			else 
				return true;

		}
	}
}