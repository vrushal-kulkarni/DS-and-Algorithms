import java.lang.*;
import java.util.*;

public class Reverse_String
{
	public static void main(String[] args)
	{
		String str="abcd";
		Reverse_String obj=new Reverse_String();
		obj.method1(str);
		obj.method2(str);
		obj.method3(str);
		obj.method4(str);
		obj.method5(str);


	}

	public void method1(String str)
	{
		StringBuilder input=new StringBuilder();
		input.append(str);
		input.reverse();
		System.out.println("(Method1) Reverse of the string "+str+" is:"+input);
	}

	public void method2(String str)
	{
		char[] ch=str.toCharArray();
		Stack<Character> s=new Stack<>();
		String s1="";
		char c;
		StringBuilder sb=new StringBuilder();

		for(int i=0;i<ch.length;i++)
		{
			s.push(ch[i]);
		}

		for(int i=0;i<ch.length;i++)
		{
			c=s.pop();
			sb=sb.append(c);
		}	
		System.out.println("(Method2) Reverse of the string "+str+" is:"+sb);
	}

	public void method3(String str)
	{
		char[] ch=str.toCharArray();
		StringBuilder sb=new StringBuilder();

		for(int i=(ch.length)-1;i>=0;i--)
		{
			sb=sb.append(ch[i]);
		}
		System.out.println("(Method3) Reverse of the string "+str+" is:"+sb);

	}

	public void method4(String str)
	{
		char[] ch=str.toCharArray();
		List<Character> list=new ArrayList<>();
		StringBuilder sb=new StringBuilder();

		for(int i=0;i<ch.length;i++)
		{
			list.add(ch[i]);
		}
		Collections.reverse(list);

		//ListIterator li=list.listiterator();
		for(char c:list)
		{
			sb=sb.append(c);
		}

		System.out.println("(Method4) Reverse of the string "+str+" is:"+sb);

	}

	public void method5(String str)
	{
		char[] ch=str.toCharArray();
		char temp;
		int right=ch.length-1;
		StringBuilder sb=new StringBuilder();


		for(int left=0;left<right;left++,right--)
		{
			temp=ch[left];
			ch[left]=ch[right];
			ch[right]=temp;
		}

		for(int i=0;i<ch.length;i++)
		{
			sb=sb.append(ch[i]);
		}

		System.out.println("(Method 5) Reverse of the string "+str+" is:"+sb);

	}
}

























