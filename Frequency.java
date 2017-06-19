import java.io.*;
import java.util.*;

public class Frequency
{
	public static void main(String[] args)
	{
		int[] arr={1,2,4,4,3,6,5,4,6,2};
		HashMap<Integer,Integer> h=new HashMap<Integer,Integer>();
		for(int i=0;i<arr.length;i++)
		{
			if(h.containsKey(arr[i]))
				h.put(arr[i],h.get(arr[i]) + 1);
			else
				h.put(arr[i],1);
		}

		for (int key:h.keySet())
		{
            System.out.println("Frequency of "+key+" is :"+h.get(key));
        }
	}
}