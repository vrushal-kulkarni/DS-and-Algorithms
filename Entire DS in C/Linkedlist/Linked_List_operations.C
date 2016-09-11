//Basic linked list operations

#include<stdio.h>
typedef struct Student
{
	int rno;
	char name[20];
	struct Student *next;
}Stud;

Stud* CreateNode()
{
	Stud *record;
	record=(Stud*)malloc(sizeof(Stud));
	printf("\n\n\t Enter Roll No ");
	scanf("%d",&record->rno);
	printf("\n\n\t Enter Name ");
	flushall();
	gets(record->name);
	record->next=NULL;
	return record;
}

Stud* AddEnd(Stud *head)
{
	Stud *newnode,*move;
	newnode=CreateNode();
	if(head==NULL)
		head=newnode;
	else
	{
		move=head;
		while(move->next!=NULL)
			move=move->next;
		move->next=newnode;
	}
	return head;
}

Stud* DelBeg(Stud *head)
{
	Stud *temp;
	temp=head;
	head=head->next;
	free(temp);
	printf("\n\n\t Deleted ");
	return head;
}

Stud* AddMid(Stud *head,int pos)
{
	int i;
	Stud *move,*newnode;
	newnode=CreateNode();
	if(pos==1)
	{
	   newnode->next=head;
	   head=newnode;
	}
	else
	{
	   move=head;
	   for(i=1;i<pos;i++)
		  move=move->next;
	   newnode->next=move->next;
	   move->next=newnode;
	}
	return head;
}

Stud* Rev(Stud *head)
{
  Stud *curr,*prev,*New;
  prev=head;
  for(curr=prev->next;curr!=NULL;)
  {
	  New=curr->next;
	  curr->next=prev;
	  prev=curr;
	  curr=New;
  }
  head->next=NULL;
  head=prev;
  return head;

}

Stud* Sort(Stud *head)
{

   Stud *temp,*tag;
   int newrno;
   char newname[20];
   for(temp=head;temp!=NULL;temp=temp->next)
   {
	  for(tag=temp->next;tag!=NULL;tag=tag->next)
	  {
		   if(temp->rno>tag->rno)
		   {
			  newrno=temp->rno;
			  temp->rno=tag->rno;
			  tag->rno=newrno;

			  strcpy(newname,temp->name);
			  strcpy(temp->name,tag->name);
			  strcpy(tag->name,newname);
		   }
	  }
   }
   return head;
}

void Display(Stud *head)
{
	 Stud *move;
	 move=head;
	 printf("\n\n\t Add\t Rno\t Name\tNext");
	 while(move!=NULL)
	 {
		 printf("\n\n\t %u\t%d\t%s\t%u",move,move->rno,move->name,move->next);

		 move=move->next;
	 }
}

void main()
{
	int ch;
	Stud *head=NULL;
	clrscr();
	while(ch!=0)
	{
		 printf("\n\n\t\t1. Add End\
				   \n\t\t2. Add Mid\
				   \n\t\t3. Display\
				   \n\t\t4. Delete Beg\ \
				   \n\t\t5. Rev\
				   \n\t\t6. Sort\
				   \n\t\t0. Exit\
				   \n\t Enter Your choice ");
		 scanf("%d",&ch);
		 switch(ch)
		 {
			case 1:
				  head=AddEnd(head);
				  break;
			case 3:

				  Display(head);
				  break;
			case 2:
				 {
				   int pos;
				   printf("\n\n\t Enter The Pos ");
				   scanf("%d",&pos);
				   head=AddMid(head,pos);
				  }
				  break;
			case 4:
			head=DelBeg(head);
			break;
			case 5:
				 head=Rev(head);
				 break;
			case 6:
				 head=Sort(head);
				 break;
		 }
	}
	getch();
}
