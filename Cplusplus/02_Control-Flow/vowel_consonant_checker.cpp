#include<iostream>
using namespace std;
int main()
{
	char ch;
	cout << "Enter an Alphabet: ";
	cin >> ch;
	
	switch(ch){
		case'a': case'e': case'i': case'o': case'u':
		case'A': case'E': case'I': case'O': case'U':
			cout << "\'" << ch << "\' is a Vowel."; break;
		default:
            if(isalpha(ch))
                cout << "\'" << ch << "\' is a Consonant";
            else
                cout << "\'" << ch << "\' is not an Alphabet";

	}
}
