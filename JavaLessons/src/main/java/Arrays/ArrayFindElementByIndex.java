package Arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * User: tetiana.kryvets
 * Date: 9/11/17
 * Search element value by index
 */

//TASK: Search element value by index
public class ArrayFindElementByIndex {
    public static void main (String[] arg ) throws IOException {

        int[] array = {0,3,-6,12,8,10,-6,23};

        //Enter n value manually:
        System.out.println("Enter index of element:");
        BufferedReader reader = new BufferedReader( new InputStreamReader(System.in));
        String numa = reader.readLine();
        int n = Integer.parseInt(numa);

        int res1 = searchIndexByElementValue(array, n);
        System.out.print(res1);


    }

    public static int searchIndexByElementValue(int[] array, int n) {
        int res = 0;
        for (int i=0; i<array.length-1; i++) {
            if (i == n-1) {
                res = array[i];
                break;
            }

        }
        return res;
    }
}

