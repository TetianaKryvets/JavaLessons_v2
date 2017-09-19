package Arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * User: tetiana.kryvets
 * Date: 7/30/17
 */
public class ArrayMethodBinarySearch {

    public static void main (String[] arg ) throws IOException {
    int[] array = {0,3,6,12,8,10,16,23};
    //int n=0;

    //Enter n value manually:
    System.out.println("Enter a value:");
    BufferedReader reader = new BufferedReader( new InputStreamReader(System.in));
    String numa = reader.readLine();
    int n = Integer.parseInt(numa);

    //отсортируем массив
        for (int j = array.length - 1; j >= 2; j--) {
            boolean sorted = true;
            for (int i=0; i<j; i++) {
                if (array[i]>array[i+1]) {        //if you set '<' array will be sorted in the opposite order
                    int temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                    sorted = false;
                }
            }
            if (sorted) {
                break;
            }
        }

        for (int j = 0; j < array.length; j++){
            System.out.print(array[j] + " ");
        }

        //метод золотого сечения
        if (BinarySearch (new int[]{0,3,6,12,8,10,16,23}, n)==-1) System.out.println("Элемент не найден");
        else System.out.println("Элемент - " + BinarySearch (new int[]{0,3,6,12,8,10,16,23}, n));

    }

    public static int BinarySearch(int[] array, int key)
    {
        int left=0, right=array.length, mid;
        while (left<=right)
        {
            mid=left+(right-left)/2;
            if (key<array[mid]) right=mid-1;
            else if (key>array[mid]) left=mid+1;
            else return mid;
        }
        return -1;
    }
  }
