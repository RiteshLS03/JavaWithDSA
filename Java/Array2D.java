import java.util.*;

public class Array2D {

    public static boolean searchElement(int matrix[][],int key){

        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                if(matrix[i][j] == key){
                    System.out.print("The key found at " + "(" + i + "," + j + ")");
                    return true;
                }
                // System.out.println();
            }
        }

        System.out.println("The " + key + " not found in the 2D array");
        return false;
    }
    public static void main(String args[]){
        int matrix[][] = new int[3][3];

        int n = matrix.length , m = matrix[0].length;

        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                matrix[i][j] = sc.nextInt();
                // matrix[j][i] = sc.nextInt();

            }
        }


        // output 

        for(int i = 0; i < n ; i++){
            for(int j = 0;j < m; j++){
                System.out.print(matrix[i][j] + " ");
            }
            // System.err.println();
            System.out.println();
        }

        searchElement(matrix,6);

    }
}
