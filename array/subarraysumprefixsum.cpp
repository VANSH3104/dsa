#include <iostream>
using namespace std;

int substring(int arr[], int n) {
    int prefixsum[100] = {0};
    prefixsum[0] = arr[0];

    // Calculate prefix sums
    for (int i = 1; i < n; i++) {
        prefixsum[i] = prefixsum[i - 1] + arr[i];
    }

    int largestsum = arr[0];

    // Calculate the sum of all subarrays using prefix sums
    for (int i = 0; i < n; i++) {
        for (int j = i; j < n; j++) {
            // Subarray sum from index i to j
            int subarraysum = i > 0 ? prefixsum[j] - prefixsum[i - 1] : prefixsum[j];
            largestsum = max(largestsum, subarraysum);
        }
    }

    return largestsum;
}

int main() {
    int arr[] = {-2, 2, 10, -5, 9, 12, -4, 6};
    int n = sizeof(arr) / sizeof(int);
    int sum = substring(arr, n);
    cout << "Largest sum of subarray is " << sum << endl;

    return 0;
}