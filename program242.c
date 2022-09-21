#include<stdio.h>
#include<stdlib.h>
#include<unistd.h>
#include<fcntl.h>
#include<string.h>

int main()
{
	char Fname[20];
	char Data[10];
	int iRet = 0;
    int fd = 0;
	
	printf("Enter file name to open\n");
	scanf("%s",Fname);
	
	fd = open(Fname,O_RDWR);
	if(fd == -1)
	{
		printf("Unable to open the file\n");
		return -1;
	}
	printf("File is succesfully opened with FD %d\n",fd);
	
	while((iRet = read(fd,Data,sizeof(Data))) != 0)
	{
		write(1,Data,iRet);
	}

    close(fd);
	
    return 0;                                           
}