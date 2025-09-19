#include<iostream>
using namespace std;
int main() 
{
    int arr[10], i, small, loc = 0;
    
    for(i = 0; i < 10; i++) {
        cout << "Enter element No." << i+1 << ": ";
        cin >> arr[i];
    }
    
    small = arr[0];
    for(i = 1; i < 10; i++) {
        if(arr[i] < small) {
            small = arr[i];
            loc = i;
        }
    }
    
    cout << "The smallest element is: " << small << " at position " << loc;
    return 0;
}
