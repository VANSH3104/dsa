package dsa;
import java.util.*;
class array2d{
    int arr[][] = null ;
    public array2d(int row, int col){
        this.arr = new int [row][col]; 
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = Integer.MIN_VALUE; //initialize all elements with Min Value of Integer Data type
            }
        }
    }
    //incertion  in the matrix
    public void insert(int r , int c ,int  val) {
        try{
            if(arr[r][c] != Integer.MIN_VALUE ) {
                System.out.println("Element is already present at Row " + r+1 +" and Column "+ c+1);
            }
            else{
                arr[r][c] = val;
                System.out.println("Element sucessfully changed");
            }
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Row or Column Index out of Bounds Exception : Check your indices ");
        }
    }
    //accessing the array
    public  void access(int r , int c ){
        try{
            System.out.println("value is :"+arr[r][c]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Row or colums are out of array");
        }
}
//triversing of array
public void triverse() {
    for(int row =0;row<arr.length;row++)
    {
        for(int col =0 ;col<arr[0].length;col++)
        {
            System.out.print(arr[row][col]+"\t");
        }System.out.println();
        }
    }
    //searching
    public void searching(int num)
    {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if(arr[i][j]== num)
                {
                    System.out.println("number found at :"+i+"\t"+j);
                    return;
                }
            }
        }
        System.out.println("not found");
    }
    //delete
    public void delete(int row ,int column)
    {
        try{
            System.out.println("sucessfully deleted");
            arr[row][column] = Integer.MIN_VALUE;
        }catch(ArrayIndexOutOfBoundsException e )
        {
            System.out.println("invalid index");
        }
    }
}




public class twodarray {
    public static void main(String[] args) {
        array2d  a = new array2d(3,3);
        a.insert(0, 0, 10);
        a.insert(1, 4, 45);
        System.out.println(Arrays.deepToString(a.arr));
        a.access(0, 0);
        a.triverse();
        a.searching(10);
        a.delete(0, 0);
        a.triverse();

    }
    
}
