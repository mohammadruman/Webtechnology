//Multiplication of two matrix

import java.util.Scanner;

public class multiplicationmatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the dimensions of the matrices
        System.out.print("Enter the number of rows");
        int rows1 = scanner.nextInt();
        System.out.print("Enter the number of columns");
        int cols1 = scanner.nextInt();
        System.out.print("Enter the number of rows");
        int rows2 = scanner.nextInt();
        System.out.print("Enter the number of columns");
        int cols2 = scanner.nextInt();

       
        if (cols1 != rows2) {
            System.out.println("Matrices cannot be multiplied.");
            return;
            
        }

        // Input the elements of the matrices
        int[][] mat1 = new int[rows1][cols1];
        int[][] mat2 = new int[rows2][cols2];
        System.out.println("Enter the matrix:");
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols1; j++) {
                mat1[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Enter the  matrix:");
        for (int i = 0; i < rows2; i++) {
            for (int j = 0; j < cols2; j++) {
                mat2[i][j] = scanner.nextInt();
            }
        }

        // Multiply the matrices
        int[][] result = new int[rows1][cols2];
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                for (int k = 0; k < cols1; k++) {
                    result[i][j] += mat1[i][k] * mat2[k][j];
                }
            }
        }

        // Display the result matrix
        System.out.println("Result matrix:");
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
