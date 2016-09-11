//Circular Linked List operations


#include<stdio.h>

typedef struct CLink
{
   int data;
   struct CLink *next;
}Node;

Node* CreateNode();
Node* AddEnd(Node*);
void Display(Node*);

Node* Delete(Node *head,int ele)
{
	Node *move,*temp;
	if(head->data==ele)
	{
	  temp=head;
	  move=head;
	  while(move->next!=head)
		 move=move->next;
	  move->next=head->next;
	  head=head->next;
	  free(temp);
	}
	else
	{
	  move=head;
	  while(move->next->data!=ele)
		 move=move->next;
	  temp=move->next;
	  move->next=temp->next;
	  free(temp);
	}
	return head;
}

void main()
{
   int ch;
   int ele;
   Node *head=NULL;
   clrscr();
   while(ch!=0)
   {
	   printf("\n\n\t1. Add Node\
				 \n\t2. Dipslay\
				 \n\t3. Delete\
				 \n\t0. Exit\
				 \n Enter Your chocie ");
	   scanf("%d",&ch);
	   switch(ch)
	   {
		 case 1:
			  head=AddEnd(head);
			  break;
		 case 2:
			  Display(head);
			  break;
		 case 3:
			 printf("\n\n\t Enter Data To Delete ");
			 scanf("%d",&ele);
			 head=Delete(head,ele);
			 break;
	   }
   }
   getch();
}

Node* CreateNode()
{
	Node *record;
	record=(Node*)malloc(sizeof(Node));
	printf("\n\n\t Enter Data ");
	scanf("%d",&record->data);
	record->next=NULL;
	 return record;
}

Node* AddEnd(Node* head)
{
	Node *newnode,*move;
	newnode=CreateNode();
	if(head==NULL)
	{
		head=newnode;
		newnode->next=head;
	}
	else
	{
		move=head;
		while(move->next!=head)
		   move=move->next;
		move->next=newnode;
		newnode->next=head;
	}
	return head;
}

void Display(Node *head)
{
   Node *move;
   move=head;
   while(move->next!=head)
   {
	  printf("\n\n\t %u\t %d\t %u",move,move->data,move->next);
	  move=move->next;
   }
   if(move->next==head)
	   printf("\n\n\t %u\t %d\t %u",move,move->data,move->next);
}