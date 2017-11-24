package Arrays;

/**
 * Created with IntelliJ IDEA.
 * User: tetiana.kryvets
 */

//TASK: Sorting of array using Pusirek method
public class ArraySortingPusirek {
    public static void main (String[] arg) {
        //int[] arr;
        int[] arr = {19,0,-5,6,2,14,1,8,7,13};


        for (int j = arr.length - 1; j >= 2; j--) {
            boolean sorted = true;
            for (int i=0; i<j; i++) {
                if (arr[i]>arr[i+1]) {        //if you set '<' array will be sorted in the opposite order
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                    sorted = false;
                }
            }
            if (sorted) {
                break;
            }
        }

        for (int j = 0; j < arr.length; j++){
        System.out.print(arr[j] + " ");
        }

    }
}
