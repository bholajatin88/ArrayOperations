import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[] {10, 20, 50, 21, 40, 35, 31, 29, 8 , 1};
        Operations operations = new Operations(arr);
        operations.displayReverseArray();
        operations.displaySortedArray(true);
        operations.displaySortedArray(false);
        operations.displayOddEven(true);
        operations.displayOddEven(false);
        operations.displaySum();
    }
}

class Operations {
    int[] array;
    Operations(int[] arr) {
        this.array = arr;
    }

    //Method to print array in reverse order
    public void displayReverseArray() {
        System.out.print("The array elements in reverse order are: ");
        for(int i= this.array.length-1; i >=0; i--) {
            System.out.print(this.array[i] + " ");
        }
        System.out.println();
    }

    //Method for sorting array elements in both ascending and descending
    public void displaySortedArray(boolean asc) {
        int[] arr = Arrays.copyOf(this.array, this.array.length);
        int temp;
        for(int i = 1; i < arr.length; i++) {
            for(int j=i; j > 0;j--) {
                if((asc && arr[j] < arr[j-1]) || (!asc && arr[j] > arr[j-1])) {
                    temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
        if(asc) System.out.print("The sorted array elements are: ");
        else System.out.print("The reverse sorted array elements are: ");
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    //display odd and even elements of array
    public void displayOddEven(boolean odd) {
        if(odd) System.out.print("The odd array elements are: ");
        else System.out.print("The even array elements are: ");
        for(int i=0;i<this.array.length;i++) {
            if(odd) {
                if(this.array[i] % 2 == 1) {
                    System.out.print(this.array[i] + " ");
                }
            }
            else if(this.array[i] % 2 == 0) {
                System.out.print(this.array[i] + " ");
            }
        }
        System.out.println();
    }

    //display sum of all the elements of array
    public void displaySum() {
        int sum = 0;
        for(int i=0;i<this.array.length;i++) {
           sum += this.array[i];
        }
        System.out.print("The sum of elements of array is: " + sum);
        System.out.println();
    }
}
