import java.util.Random;
import java.util.Scanner;
public class Ejeronline{
    public static int Rand(){   // utilizacion de biblioteca random
        Random ran = new Random();
        int random_num = ran.nextInt(10);
            return random_num;

    }
    public static int [][] Matrix(int a, int b){ // matrix con dos parametros para rellenar la los vectores
        // y con metodo anterior de Random y impirmir el resultado
        int [][] mat = new int [a][b];

        for(int i = 0; i < a; i ++){
            for(int j = 0; j < b; j ++){
                mat[i][j] = Rand();
                System.out.print(mat[i][j] + " ");
            }
            System.out.println(" ");
        }

            return mat;
    }

    public static void TotalSumFilas(int [][] mat){ // suma de filas (j)
        // eligo vector de filas que es 1 y empiezo el bucle donde el valor de cada posicion j se le suma a la variable TOTAL por cada fila
        //

        for(int i = 0; i < mat[1].length; i++){
            int total = 0;

            for (int j = 0; j < mat[0].length; j++ ){
                total += mat[i][j];


            }
            System.out.println("suma de " + (i+1) + " fila: " + total);

        }

        System.out.println("");
    }
    public static void TotalSumColumnas(int [][] mat){ //j

        for(int j = 0; j < mat[0].length; j++){
            int total = 0;

            for (int i = 0; i < mat[1].length; i++ ){
                total += mat[i][j];


            }
            System.out.println("suma de " + (j+1) + " columna: " + total);

            }

    }
    public static void main(String[] arguments){
        int [][] res = Matrix(3,3);
        TotalSumFilas(res);
        TotalSumColumnas(res);


    }
}
