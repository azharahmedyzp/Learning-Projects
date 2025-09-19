#include<iostream>
using namespace std;
float fahrenheitToCelsius(float f) {
    return (f - 32) * 5.0 / 9;
}

int main() 
{
    float fahrenheit;
    cout << "Enter Temperature in Fahrenheit: ";
    cin >> fahrenheit;
    
    float celsius = fahrenheitToCelsius(fahrenheit);
    cout << "Temperature in Celsius is: " << celsius;
    
    return 0;
}
