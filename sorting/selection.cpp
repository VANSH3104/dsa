#include<iostream>
using namespace std;
void selection(int arr[] , int n){
    for(int i =0;i<n-1;i++){
        int current = arr[i];
        int minValue = i;
        for(int j = i;j<n;j++){
            if(arr[j]<arr[minValue]){
                minValue = j;
            }
        }
        swap(arr[minValue], arr[i]);
    }
}
int main()
{
    int arr[] = {-2,3,4,-1, 5, -12, 6,1,3};
    int n = sizeof(arr)/sizeof(int);
    selection(arr , n);
    for(auto i : arr){
        cout<<i<<" ";
    }
    return 0;
}