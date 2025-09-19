#include<iostream>
using namespace std;
long hms_to_secs(int h, int m, int s) {
    return h * 3600L + m * 60 + s;
}

int main() 
{
    int hours, mins, secs;
    
    do {
        cout << "Enter Hours: ";
        cin >> hours;
        if(hours > 24) {
            cout << "Wrong Value" << endl;
            continue;
        }
        
        cout << "Enter Min: ";
        cin >> mins;
        if(mins > 60) {
            cout << "Wrong Value" << endl;
            continue;
        }
        
        cout << "Enter Sec: ";
        cin >> secs;
        if(secs > 60) {
            cout << "Wrong Value" << endl;
            continue;
        }
        
        break;
    } while(true);
    
    long total = hms_to_secs(hours, mins, secs);
    cout << "The Value in Seconds is: " << total << endl;
    cout << "Exiting Program";
    
    return 0;
}
