import java.util.ArrayList;
import java.util.Iterator;


public class ArrayList_Basics {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList list=new ArrayList();
		list.add("First");
		list.add("Second");
		list.add("third");
		list.add(7);
		
		Iterator i=list.iterator();
		
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
		list.remove(1);
		
		System.out.println("WholeList"+list);
		
		System.out.println("Position 1:"+list.get(1));

	}

}
