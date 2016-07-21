package HashTable;

import java.io.BufferedReader;
import java.util.Scanner;

public class SimpleHashTable {

	public static void main(String[] args) {
		String arr[]=new String[20];
		int answer;
		
		do
		{
			
			System.out.println("Enter any string");
			Scanner s=new Scanner(System.in);
			
			
			SimpleHashTable obj=new SimpleHashTable();
			String value=s.nextLine();
			int key=obj.hashfunction(value);
			arr[key]=value;
						
			System.out.println("Do you want to add more strings?\n1.Yes\t2.No");
			answer=s.nextInt();
			
		}while(answer!=2);
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		
		
		
	}
	
	public int hashfunction(String str)
	{
		int value=0;
		
		for (int i=0;i<str.length();i++)
		{
			value=value + Character.getNumericValue(str.charAt(i));
		}
		
		value=value%20;
		
		return value;
	}

}
