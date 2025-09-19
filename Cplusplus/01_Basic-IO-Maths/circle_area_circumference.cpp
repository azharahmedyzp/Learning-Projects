#include<iostream>
#include<cmath>
using  namespace std;
int main( )
{
	float radius;
	cout << "Enter the value of radius: ";
	cin >> radius;
	
	double area = M_PI * pow(radius, 2);
	double circumference = 2 * M_PI * radius;
	
	cout << "The area of the circle is " << area << endl
	<< "The circumference of the circle is " << circumference;
	return 0;
}
