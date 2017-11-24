package Arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * User: tetiana.kryvets
 * Date: 7/25/17
 * Time: 9:08 AM
 */

//TASK: Search number of element (index) by element value

public class ArrayFindIndexOfElementByElementValue {

    public static void main (String[] arg ) throws IOException {

        int[] array = {0,3,-6,12,8,10,-6,23};

        //Enter n value manually:
        System.out.println("Enter a value:");
        BufferedReader reader = new BufferedReader( new InputStreamReader(System.in));
        String numa = reader.readLine();
        int n = Integer.parseInt(numa);

        int res1 = searchIndex(new int[]{3, 1, 2, 6, 4, 2}, n);
        System.out.print(res1);


    }

    public static int searchIndex(int[] array, int n) {
        int res = 0;
        for (int i=0; i<array.length-1; i++) {
            if (array[i] == n) {
                res = i + 1;
                break;
            }

        }
        return res;
    }
}
