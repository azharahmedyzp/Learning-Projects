#include<iostream>
using namespace std;
int main( )
{
	float F, K;
	
	cout << "Enter the temperature in kelvin : ";
	cin >> K;
	
	F = (K - 273.15) * 9/5 + 32;
	cout << "Temperature in Fahrenhite : " << F ;
	
return 0;
}
