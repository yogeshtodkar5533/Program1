//class chya aata method define 

#include<iostream>
using namespace std;

struct node
{
	int data;
	struct node *next;
};

typedef struct node NODE;
typedef struct node* PNODE;
typedef struct node** PPNODE;

class SinglyCLL
{
	private:
	  PNODE Head;
	  PNODE Tail;
	  
	public:
	  SinglyCLL()
	  {
		  Head=NULL;
		  Tail=NULL;
	  }
	  
	  void InsertFirst(int no)
	  {
		  
	  }
	  
	  void InsertLast(int no)
	  {
		  
	  }
	  
	  void InsertATPos(int no, int pos)
	  {
		  
	  }
	  
	  void DeleteFirst()
	  {
		  
	  }
	  
	  void DeleteLast()
	  {
		  
	  }
	  
	  void DeleteATPos(int pos)
	  {
		  
	  }
	  
	  void Display()
	  {
		  
	  }
	  
	  int Count()
	  {
		  return 0;
	  }
};

int main()
{
	SinglyCLL obj;
	
	return 0;
}