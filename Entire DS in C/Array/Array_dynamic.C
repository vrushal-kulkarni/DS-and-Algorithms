
//Dynamic array allocation using pointers

int** AllocateMem(int,int);
void Accept(int**,int, int);
void Display(int**,int,int);
void main()
{
   int **a,row,col;
   clrscr();
   printf("\n\n\t Enter row And Col ");
   scanf("%d%d",&row,&col);

   a=AllocateMem(row,col);
   Accept(a,row,col);
   Display(a,row,col);

   getch();
}
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



