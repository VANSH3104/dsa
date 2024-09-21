#include<iostream>
using namespace std;
void insertionsort(int arr[] , int size){
    for(int i =1;i<=size-1 ; i++){
        int k = arr[i];
        int prev = i-1;
        while(prev>=0 and arr[prev]>k){
            arr[prev+1] = arr[prev];
            prev = prev -1;
        }
        arr[prev+1] = k;
    }
}
int main()
{
    int arr[] = {-2,3,4,-1, 5, -12, 6,1,3};
    int n = sizeof(arr)/sizeof(int);
    insertionsort(arr , n);
    for(auto i : arr){
        cout<<i<<" ";
    }
    return 0;
}