#include<iostream>
using namespace std;
int main ( )
{
	int r;
	float v;
	
	cout << " Enter the value of radius : " << endl;
	cin >> r;

	v =  4.0/3.0 * 3.14159 * (r*r*r);
	
	cout << "Volume = " << v ;
return 0; 
}
