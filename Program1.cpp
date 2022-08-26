#include<iostream>
using namespace std;

template <class T>
T Addition(T no1,T no2)
{
	T Ans;
	Ans = no1 + no2;
	return Ans;
}

int main()
{
	int No1 = 10,No2 = 20;	
	int ret = 0;	
	ret = Addition(No1,No2);	
	cout<<"Addition is : "<<ret<<endl;	
	
	float fNo1 = 10.0,fNo2 = 20.0;	
	float fret = 0.0;	
	fret = Addition(fNo1,fNo2);	
	cout<<"Addition is : "<<fret<<endl;	
	
	return 0;
}