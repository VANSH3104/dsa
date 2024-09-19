#include<bits/stdc++.h>
using namespace std;

vector<int> kRotate(vector<int> a, int k){
    // your code  goes here
    vector <int> b;
    int n = a.size();
    k = k%n;
    for (int i =0;i<n; i++){
        if(i<k){
            b.push_back(a[n+i-k]);
        }
        else{
            b.push_back(a[i-k]);
        }
    }
    return b;
    
}
