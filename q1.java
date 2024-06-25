package dsa;

import java.lang.reflect.Array;

public class q1 {
    public static void main(String[] args) {
        q1 ob = new q1();
        int [] customarray = {1,3,4,5,6};
        ob.printpair(customarray);
        ob.reverse(customarray);

    }
    void printpair(int arr[]){ 
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.println(arr[i]+","+arr[j]);
            }
        }
}
    void reverse(int[] arr)
    {
        int left =0;
        int right = arr.length-1;
        while(left<right)
        {
            int k = arr[left];
            arr[left] = arr[right];
            arr[right]=k;
            left++;
            right--;
        }
        System.out.println( "Reversed array is:");
        printpair(arr);
    }
}
