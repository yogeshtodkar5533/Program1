#include<stdio.h>

void Jwelersportal(int iweight)
{
 switch(iweight)
 {
  case 1:
   printf("Your bill amount is 4000\n");
   break;

  case 2:
   printf("Your bill amount is 8000\n");
   break;

  case 5:
   printf("Your bill amount is 20000\n");
   break;
   
  case 10:
   printf("Your bill amount is 40000\n");
   break;

  default:
   printf("Invalid weight\n");
 }
}

int main()
 {
  int ivalue=0;

  printf("Enter the gold coin size that you want to purchase\n");
  scanf("%d",&ivalue);

  Jwelersportal(ivalue);
 
  return 0;
 }