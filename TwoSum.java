//Test
import java.io.*;

public class TwoSum
{
	public static void main(String[] args)
	{
		TwoSum obj=new TwoSum();
		int[] nums = {2, 7, 11, 15};
		int target = 22;
		int[] a=new int[2];
		a= obj.twoSum(nums,target);
		System.out.println("a[0]:"+a[0]+"a[1]:"+a[1]);
	}
	
	public int[] twoSum(int[] nums, int target) {
        int r=0,flag=0;
        int[] a=new int[2];
        for(int i=0;i<nums.length;i++)
        {
            r=target-nums[i];
            for(int j=i+1;j<nums.length;j++)
            {
                if(nums[j]==r)
                {
                    a[0]=i;
                    a[1]=j;
                    flag=1;
                    break;
                }
            }
            if(flag == 1)
            	break;
        }
        return a;
        
    }
}
