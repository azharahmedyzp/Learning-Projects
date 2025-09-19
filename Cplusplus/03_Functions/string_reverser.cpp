#include<iostream>
using namespace std;
void reversit(char str[]) {
    int len = 0;
    while (str[len] != '\0') {
        len++;
    }
    
    for (int i = 0; i < len/2; i++) {
        char temp = str[i];
        str[i] = str[len-1-i];
        str[len-1-i] = temp;
    }
}

int main()
{
    char input[100];
    cout << "Enter a String: ";
    cin.getline(input, 100);
    
    reversit(input);
    cout << "Reversed: " << input;
    
    return 0;
}
