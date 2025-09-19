#include<iostream>
using namespace std;
int main()
{
    int num;
    while (true) {
        cout << "Enter a number between 1-99 (0 to exit): ";
        cin >> num;

        if (num == 0) {
            cout << "Exit" << endl;
            break;
        }
    
        if (num < 1 || num > 99) {
            cout << "Invalid! Please enter a number between 1-99." << endl;
            continue;
        }

        if (num < 20) {
            switch(num) {
                case 1: cout << "One" << endl; break;
                case 2: cout << "Two" << endl; break;
                case 3: cout << "Three" << endl; break;
                case 4: cout << "Four" << endl; break;
                case 5: cout << "Five" << endl; break;
                case 6: cout << "Six" << endl; break;
                case 7: cout << "Seven" << endl; break;
                case 8: cout << "Eight" << endl; break;
                case 9: cout << "Nine" << endl; break;
                case 10: cout << "Ten" << endl; break;
                case 11: cout << "Eleven" << endl; break;
                case 12: cout << "Twelve" << endl; break;
                case 13: cout << "Thirteen" << endl; break;
                case 14: cout << "Fourteen" << endl; break;
                case 15: cout << "Fifteen" << endl; break;
                case 16: cout << "Sixteen" << endl; break;
                case 17: cout << "Seventeen" << endl; break;
                case 18: cout << "Eighteen" << endl; break;
                case 19: cout << "Nineteen" << endl; break;
            }
        }
        else { 
            int tens = num / 10;
            int units = num % 10;

            switch(tens) {
                case 2: cout << "Twenty"; break;
                case 3: cout << "Thirty"; break;
                case 4: cout << "Forty"; break;
                case 5: cout << "Fifty"; break;
                case 6: cout << "Sixty"; break;
                case 7: cout << "Seventy"; break;
                case 8: cout << "Eighty"; break;
                case 9: cout << "Ninety"; break;
            }

            if (units != 0) {
                cout << " ";
                switch(units) {
                    case 1: cout << "One"; break;
                    case 2: cout << "Two"; break;
                    case 3: cout << "Three"; break;
                    case 4: cout << "Four"; break;
                    case 5: cout << "Five"; break;
                    case 6: cout << "Six"; break;
                    case 7: cout << "Seven"; break;
                    case 8: cout << "Eight"; break;
                    case 9: cout << "Nine"; break;
                }
            }
            cout << endl;
        }
    }
    return 0;
}
