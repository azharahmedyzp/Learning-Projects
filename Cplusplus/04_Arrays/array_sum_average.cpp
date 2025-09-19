#include<iostream>
using namespace std;
int main() 
{
    int a[5], sum = 0;
    float avg;
    
    cout << "Enter 5 elements for array:" << endl;
    for(int i = 0; i < 5; i++) {
        cout << "a[" << i << "]: ";
        cin >> a[i];
        sum += a[i];
    }
    
    avg = (float)sum / 5;
    cout << "Sum: " << sum << endl;
    cout << "Average: " << avg;
    
    return 0;
}
