#include<iostream>
using namespace std;
int main() 
{
    int matrix1[3][3], matrix2[3][3], sum[3][3];
    
	cout << "INPUT THE ELEMENTS OF THE SQUARE MATRIX OF (3x3)" << endl;    
    cout << "\nInput elements in the first matrix:" << endl;
    for(int i = 0; i < 3; i++) {
        for(int j = 0; j < 3; j++) {
            cout << "[" << i << "][" << j << "]: ";
            cin >> matrix1[i][j];
        }
    }
    
    cout << "\nInput elements in the second matrix:" << endl;
    for(int i = 0; i < 3; i++) {
        for(int j = 0; j < 3; j++) {
            cout << "[" << i << "][" << j << "]: ";
            cin >> matrix2[i][j];
        }
    }
    
    // Adding matrices
    for(int i = 0; i < 3; i++) {
        for(int j = 0; j < 3; j++) {
            sum[i][j] = matrix1[i][j] + matrix2[i][j];
        }
    }
    
    // Displaying results
    cout << "\nThe First matrix is:" << endl;
    for(int i = 0; i < 3; i++) {
        for(int j = 0; j < 3; j++) {
            cout << matrix1[i][j] << " ";
        }
        cout << endl;
    }
    
    cout << "\nThe Second matrix is:" << endl;
    for(int i = 0; i < 3; i++) {
        for(int j = 0; j < 3; j++) {
            cout << matrix2[i][j] << " ";
        }
        cout << endl;
    }
    
    cout << "\nThe Addition of two matrix is:" << endl;
    for(int i = 0; i < 3; i++) {
        for(int j = 0; j < 3; j++) {
            cout << sum[i][j] << " ";
        }
        cout << endl;
    }
    
    return 0;
}
