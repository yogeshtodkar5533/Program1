#include<stdio.h>

void DisplayR()
{
	static int iCnt = 1;
	static char ch = '\0';
	
	if(iCnt <= 5)
	{
		printf("%c\t",ch);
		iCnt++;
		DisplayR();
	}
}

int main()
{
	DisplayR();
	
	return 0;
}