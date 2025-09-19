#include<iostream>
#include<cmath>
using namespace std;
int main()
{
	float A, B;
	cout << "Enter the value of two equal sides of a triangle: ";
	cin >> A;
	cout << "Enter the value of base of a triangle: ";
	cin >> B;
	
	double area = 0.5 * B * sqrt(pow(A, 2) - pow(B, 2)/4 );
	
	cout << "Hence, the area of a tringle is " << area;
	return 0;
}
