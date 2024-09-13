#include <iostream>
using namespace std;
int substring (int arr[] , int n){
    int largestsum = 0;
    for(int i =0;i<n;i++){
        for(int j = i ; j<n ; j++){
            int sumnum = 0;
            for(int k = i ; k<=j ; k++){
                sumnum += arr[k];
            }
            largestsum = max(largestsum, sumnum);
        }
    }
    return largestsum;
}
int main()
{
    int arr[]= {-2,2,10,-5,9,12 , -4 , 6};
    int n = sizeof(arr)/ sizeof(int);
    int sum = substring(arr, n);
    cout<<"Largest sum of subarray is "<<sum;

    return 0;
}
