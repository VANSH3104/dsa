#include<iostream>
using namespace std;
int bubble_sort(int arr[] , int size){
    for(int i =0;i<size ; i++){
        for(int j = 0 ; j<size-i-1 ; j++){
            if(arr[j]>arr[j+1]){
                swap(arr[j], arr[j+1]);
                }
            }
        }
        for(int i =0;i<size;i++){
            cout<<arr[i]<<" ";
        }
    }
    //perfect for sorted too 
#include<bits/stdc++.h>
using namespace std;

vector<int> optimizedBubbleSort(vector<int> v){
    // your code  goes here
    int n = v.size();
    bool k ;
    for(int i =0;i<n-1;i++)
    {
        k = false;
        for(int j =0;j<n-i-1;j++)
        {
            if(v[j]>v[j+1])
            {
                swap(v[j], v[j+1]);
                k= true;
            }
        }
        if(k == false){
            break;
        }
    }
    return v;
    
}
int main()
{
    int arr[] = {-2,3,4,-1, 5, -12, 6,1,3};
    int n = sizeof(arr)/sizeof(int);
    bubble_sort(arr , n);
    return 0;
}