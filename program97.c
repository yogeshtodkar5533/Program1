#include<stdio.h>

void Display(int iRow , int iCol)
{
	int i=0,j=0;
	char ch='\0';
	
	for(i=1,ch='A';i<=iRow;i++,ch++)
	{
	  for(j=1;j<=iCol;j++)
	  {
		 	printf("%c\t",ch);
      }
    printf("\n");
	}
}

int main()
{
	int iValue1=0,iValue2=0;
	
	printf("Enter the rows \n");
	scanf("%d",&iValue1);
	
	printf("Enter the columns \n");
	scanf("%d",&iValue2);
	
	Display(iValue1,iValue2);
	
	return 0;
}