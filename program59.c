#include<stdio.h>

void Display(int Arr[])
{
 int iCnt=0;
 
 printf("Elements of array are :\n");
 
 for(iCnt=0;iCnt<5;iCnt++)
 {
  printf("%d\n",Arr[iCnt]);
 }
	
}

int main()
{
 auto int Brr[5];
 register int iCnt=0;
 
 printf("Enter elements :\n");
 
 for(iCnt=0;iCnt < 5;iCnt++)
 {
  scanf("%d",&Brr[iCnt]);
 }
 
 Display(Brr);
 
 return 0;
}