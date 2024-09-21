#include <iostream>
using namespace std;

int sumsubstring(int arr[], int n) {
    int cs = 0;
    int ms = 0;
    for(int i =0;i<n ;i++){
        cs = cs +arr[i];
        if(cs<0){
            cs = 0;
        }
        else{
            ms = max(ms,cs);
        }
    }
    return ms;
}

int main() {
    int arr[] = {-2, 2, 10, -5, 9, 12, -4, 6};
    int n = sizeof(arr) / sizeof(int);
    int sum = sumsubstring(arr, n);
    cout << "Largest sum of subarray is " << sum << endl;

    return 0;
}