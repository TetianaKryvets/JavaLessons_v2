package Arrays;

/**
 * User: tetiana.kryvets
 * Date: 7/30/17
 */
public class ArrayCopyInOppositeWay {
    public static void main(String[] args) {

        int size=5;
        int[][] array2dim = new int[size][size];

        fillArray(size, array2dim);
        System.out.println("-------");

        printArray(size, array2dim);
        System.out.println("-------");

        changeElementsByDiagonal(size, array2dim);
        printArray(size, array2dim);

    }

    private static void fillArray(int size, int[][] array2dim) {
        for (int i=0; i<=size-1; i++){
            for (int j=0; j<=size-1; j++) {
                array2dim[i][j] = i+1;
            }
        }
    }

    private static void changeElementsByDiagonal(int size, int[][] array2dim) {
        int tmp = 0;
        for (int i=0; i<=size-1; i++){
            for (int j=i+1; j<=size-1; j++) {
                tmp = array2dim[i][j];
                array2dim[i][j] = array2dim[j][i];
                array2dim[j][i] = tmp;
            }
        }
    }

    private static void printArray(int size, int[][] array2dim) {
        for (int i=0; i<=size-1; i++){
            for (int j=0; j<=size-1; j++) {

                System.out.print(array2dim[i][j]);
            }
            System.out.println();
        }
    }
}
