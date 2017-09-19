package Arrays;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * User: tetiana.kryvets
 * Date: 7/30/17
 */
public class ArrayCopyInOppositeWay {
    public static void main(String[] args) {

        int size=5;
        int[][] array2dim = new int[size][size];

        for (int i=0; i<=size-1; i++){
            for (int j=0; j<=size-1; j++) {
                array2dim[i][j] = i+1;
            }
        }

        for (int i=0; i<=size-1; i++){
            for (int j=0; j<=size-1; j++) {
                System.out.print(array2dim[i][j]);
            }
            System.out.println();
            System.out.println("---------------------------------------------");
        }

        //Надо отобразить по диагонали
        //todo: напутала с индексами
        int tmp =0;
        for (int i=0; i<=size-1; i++){
            for (int j=0; j<=size-1; j++) {
                //if (array2dim[m][n]!=array2dim[n][m]) {
                tmp = array2dim[i][j];
                array2dim[i][j] = array2dim[j][i];
                array2dim[j][i] = tmp;

                System.out.print(array2dim[i][j]);
               // }
            }
            System.out.println();
        }

//        for (int i=0; i<=size-1; i++){
//            for (int j=0; j<=size-1; j++) {
//                System.out.print(array2dim[i][j]);
//            }
//            System.out.println();
//        }

        //todo: вывводит исходную матрицу
        System.out.println("---------------------------------------------");
        System.out.println(Arrays.deepToString(array2dim));



//        //Enter n value manually:
//        System.out.println("Enter a value:");
//        BufferedReader reader = new BufferedReader( new InputStreamReader(System.in));
//        String numa = reader.readLine();
//        int n = Integer.parseInt(numa);


    }
}
