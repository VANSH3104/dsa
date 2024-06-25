package dsa;

class array_dim{
    int arr[]= null;
    public array_dim(int size){
        this.arr = new int[size];
        // for (int i = 0; i < arr.length; i++) {
        //     arr[i]=0;
        // }
    }
    public void insert(int location,int value)
    {
        try{
            if(arr[location] == 0)
            {
                arr[location] = value;
                System.out.println("inserted successfully");
            }
            else 
            {
                System.out.println("not inserted");
            }   
            }
        catch (ArrayIndexOutOfBoundsException e){
                System.out.println("exception : index out of bound");
        }
    }
    
}
public class incertion{
    public static void main(String[] args) {
        array_dim dim = new array_dim(10);
        dim.insert(2, 3);
        dim.insert(1, 6);
        dim.insert(1, 7);
        dim.insert(11, 11);
    }
}    
