#include<iostream>
using namespace std;
int main ()
{
	float num1, num2;
	
	cout << "Enter first number : "; 
	cin >> num1;
	cout << "Enter second number : ";
	cin >> num2;
	
	cout << num1 << " + " << num2 << " = " << num1 + num2 << endl
		 << num1 << " - " << num2 << " = " << num1 - num2 << endl
	 	 << num1 << " * " << num2 << " = " << num1 * num2 << endl
		 << num1 << " / " << num2 << " = " << num1 / num2 << endl
		 << (int)num1 << " % " << (int)num2 << " = " << (int)num1 % (int)num2 << endl;
	return 0;	
}
