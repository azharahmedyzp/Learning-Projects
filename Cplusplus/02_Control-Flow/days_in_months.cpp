#include<iostream>
using namespace std;
int main() 
{
    int month;
    cout << "Input month number (1-12): ";
    cin >> month;
    
    switch(month) {
        case 1: case 3: case 5: case 7: case 8: case 10: case 12:
            cout << "Total number of days = 31"; break;
        case 4: case 6: case 9: case 11:
            cout << "Total number of days = 30"; break;
        case 2:
            cout << "Total number of days = 28"; break;
        default:
            cout << "Invalid month number";
    }
    return 0;
}
    