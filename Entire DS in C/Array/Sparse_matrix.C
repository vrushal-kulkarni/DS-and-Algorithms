//Create sparse matrix form a normal matrix
//Sparse matrix-row, column and that element(if non-zero)

int i,j;

int** AllocateMem(int r,int c)
{
   int **a;
   a=(int**)malloc(sizeof(int*)*r);
   for(i=0;i<r;i++)
	  a[i]=(int*)malloc(sizeof(int)*c);
   return a;
}
void Accept(int **a,int r,int c)
{
	printf("\n\n\t Accept Array ");
	for(i=0;i<r;i++)
	{
	   printf("\n Enter %d Eel ",c);
	   for(j=0;j<c;j++)
		 scanf("%d",&a[i][j]);
	}
}
void Display(int**a,int r,int c)
{
	printf("\n\n\t Array Is ");
	for(i=0;i<r;i++)
	{
	   printf("\n\n");
	   for(j=0;j<c;j++)
		  printf("  %d",a[i][j]);
	}
}

int NonZero(int **a, int r,int c)
{
	 int cnt=0;

	 for(i=0;i<r;i++)
	 {
	   for(j=0;j<c;j++)
		{
		  if(a[i][j]!=0)
		  {
			cnt++;
		  }
		}
	 }
	 return cnt;
}

void CreateSparse(int **org,int **sp,int r,int c)
{
	int k=1;
	for(i=0;i<r;i++)
	{
	   for(j=0;j<c;j++)
	   {
		   if(org[i][j]!=0)
		   {
			  sp[k][0]=i;
			  sp[k][1]=j;
			  sp[k][2]=org[i][j];
			  k++;
		   }
	   }
	}
	sp[0][0]=r;
	sp[0][1]=c;
	sp[0][2]=k-1;
}









void main()
{
   int **org,**sp;
   int row,col,ch,ele;
   clrscr();


   printf("\n\n\t Enter row And Col ");
   scanf("%d%d",&row,&col);

   while(ch!=0)
   {
	   printf("\n\n\t\t 1. Accept Array\
				 \n\t\t 2. Display Array\
				 \n\t\t 3. Create And  Dsipaly Sparse\
				 \n\t Enter Your Choice ");
	   scanf("%d",&ch);
	   switch(ch)
	   {
		  case 1:
			   org=AllocateMem(row,col);
			   Accept(org,row,col);
			   break;
		  case 2:
			   Display(org,row,col);
			   break;
		  case 3:
			   ele=NonZero(org,row,col);
			   sp=AllocateMem(ele+1,3);
			   CreateSparse(org,sp,row,col);
			   Display(sp,ele+1,3);
			   break;
	   }
}
   getch();
}


