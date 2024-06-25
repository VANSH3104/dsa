package dsa;

class ArrayWithInsertion {
    int[] arr;

    public ArrayWithInsertion(int size) {
        this.arr = new int[size];
    }

    public void insert(int location, int value) {
        try {
            arr[location] = value;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception: Index out of bound");
        }
    }

    public void display() {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // array traversal
    public void traversalArray() {
        try {
            for (int i = 0; i < arr.length; i++) {
                System.out.println(i + ":" + arr[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception: Index out of bound");
        }
    }

    public void searching(int value) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                System.out.println(value + " found at index " + i);
            }
            else {
                System.out.println("not found");
            }
        }
    }
    public void deletion(int loc) {
        if (loc < 0 || loc >= arr.length) {
            System.out.println("Invalid deletion index");
            return;
        }

        // Shift elements to the left starting from loc
        for (int i = loc; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }

        arr[arr.length - 1] = Integer.MIN_VALUE; 
        display();
    }

}

public class insertion2 {
    public static void main(String[] args) {
        ArrayWithInsertion array = new ArrayWithInsertion(3);
        array.insert(0, 1);
        array.insert(1, 2);
        array.insert(2, 3);
        array.display(); // Output: 1 2 3
        array.traversalArray(); // Output
        array.searching(2);
        array.deletion(0);
        array.searching(3);
    }
}
