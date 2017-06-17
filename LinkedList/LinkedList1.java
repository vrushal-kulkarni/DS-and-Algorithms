class LinkedList1
{
	Node head;

	static class Node
	{
		int data;
		Node next;
		boolean visited;
		Node(int d)
		{
			data=d;
			next=null;
			visited=false;
		}
	}	

	public static void main(String[] args)
	{
		LinkedList1 list=new LinkedList1();
		list.head=new Node(10);
		Node second=new Node(20);
		Node third=new Node(30);
		Node fourth=new Node(40);
		Node fifth=new Node(50);


		list.head.next=second;
		second.next=third;
		third.next=fourth;
		fourth.next=fifth;

		list.add();
		list.delete();

		System.out.println("\nOriginal Linked List is:");
		list.traverse();

		System.out.println("\nReverse of linked list is:");

		list.reverse();

		list.traverse();

		System.out.println("\nAgain Original Linked List is:");

		list.reverse();

		list.traverse();

		System.out.println("\nList after swaping 20 and 40 is:");


		list.swap(20,40);

		list.traverse();

		fifth.next=second;

		list.detectloop();

		System.out.println("\nList after rotating by two nodes and removing loop:");

		list.rotate(2);

		list.traverse();

		int l=list.length();
		System.out.println("\nLength of Linked List is:"+l);




	}

	public void rotate(int k)
	{
		Node current=head;
		Node new_head=null;
		int i=1;
		while(i<k)
		{
			current=current.next;
			i=i+1;
		}
		new_head=current;
		while(current.next!=null)
		{
			current=current.next;
		}
		current.next=head;

		head=new_head.next;
		new_head.next=null;
	}

	public void detectloop()
	{
		Node n=head;
		boolean flag=false;
		while(n.next.visited!=true && n.next!=null)
		{
			n.next.visited=true;
			n=n.next;
			if(n.next.visited)
			{
				flag=true;
				break;
			}
		}
		if(flag)
		{
			n.next=null;
			System.out.println("Loop detected");
		}
		else
			System.out.println("No loop detected");
	}

	public void reverse()
	{
		Node prev=null;
		Node current=head;
		Node next=null;
		while(current!=null)
		{
			next=current.next;
			current.next=prev;
			prev=current;
			current=next;
		}
		head=prev;
	}


	public void swap(int x,int y)
	{
		Node prevX=null,currX=head;
		Node prevY=null,currY=head;
		while(currX.data!=x)
		{
			prevX=currX;
			currX=currX.next;
		}
		//System.out.println("prevX:"+prevX.data+"currX:"+currX.data);

		while(currY.data!=y)
		{
			prevY=currY;
			currY=currY.next;
		}
		//System.out.println("prevY:"+prevY.data+"currY:"+currY.data);

		prevX.next=currY;
		prevY.next=currX;
		currX.next=currY.next;
		currY.next=prevY;

	}

	public void add()
	{
		Node i=head;
		Node n=new Node(10);
		while(i.next!=null)
		{	
			i=i.next;
		}
		i.next=n;
		n.next=null;
	}

	public void delete()
	{
		Node n=head;
		while(n.next.data!=10)
		{
			n=n.next;
		}
		n.next=n.next.next;

	
	}

	public int length()
	{
		Node l=head;
		int length=0;
		while(l!=null)
		{
			length++;
			l=l.next;
		}
		return length;
	}

	public void traverse()
	{
		Node node=head;
		while(node != null)
		{
			System.out.print(""+node.data+"-->");
			node=node.next;
		}
		System.out.println("\n");
	}
}