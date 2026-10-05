import java.util.Scanner;
import java.util.Random;
public class BuscaminasMeth{


public static int rowNum(){  // get num for row from user
    Scanner sc = new Scanner(System.in);
    System.out.print("num of table's rows: ");
    int i_size = sc.nextInt();

        return i_size;
}

public static int colNum(){ // get num for column from user
    Scanner sc = new Scanner(System.in);
    System.out.print("num of table's columns: ");
    int c_size = sc.nextInt();

        return c_size;
 }

public static int [][] matrixSize(int i_size, int c_size){ //matrix with users nums for column and row
    int [][] table = new int [i_size][c_size];

        return table;
}


public static int randRow(int i_size){    // random row generator in size of row
    Random rand = new Random();
    int random_row = rand.nextInt(i_size);

        return random_row;

}
public static int randCol(int c_size){    // random column generator in size of column
    Random rand = new Random();
    int random_col = rand.nextInt(c_size);

        return random_col;

}
public static void loopForMatrix(int[][] a){
    for(int i = 0; i < a.length; i ++){
        for(int j = 0; j < a[i].length; j ++){
            System.out.print(a[i][j] + " ");
        }
        System.out.println("");
    }
}
public static int askForGuessCoordinatesRow(){
    Scanner sc = new Scanner(System.in);
    System.out.print("Coordinate x: ");
    int row_guess_coordinate = sc.nextInt() -1;

        return row_guess_coordinate;

}
public static int askForGuessCoordinatesColumn(){
    Scanner sc = new Scanner(System.in);
    System.out.print("Coordinate y: ");
    int column_guess_coordinate = sc.nextInt() -1;

        return column_guess_coordinate;

}

public static boolean safeOrBoom(int row_user_guesser, int col_user_guesser, int random_row, int random_col){     // check if user is safe or dead based on choose rand nums gen and user's input for col and row
    if (row_user_guesser == random_row && col_user_guesser == random_col){
        System.out.println("BOOM!");

        return true;
    }
    else
    {
        System.out.println("SAFE");

        return false;
    }

}
public static int [][] bombCoordinatesToShow(int[][] table, int random_row, int random_col, int row_guess_coordinate, int column_guess_coordinate){ // put "1" in bomb coordinates from RandCol and RandRow into matrix
    table[random_row][random_col] = 1;
    table[row_guess_coordinate][column_guess_coordinate] = 8;
        return table;

}


    public static void main(String[] arguments){
        boolean end = false;
        int size_row = rowNum();
        int size_column = colNum();

        do {

        loopForMatrix(matrixSize(size_row,size_column));
        int user_guess_row = askForGuessCoordinatesRow();
        int user_guess_col = askForGuessCoordinatesColumn();

        int rand_row = randRow(size_row);
        int rand_col = randCol(size_column);

        int[][] table = matrixSize(size_row, size_column);
        bombCoordinatesToShow(table, rand_row, rand_col, user_guess_col, user_guess_row);
        loopForMatrix(bombCoordinatesToShow(table, rand_row, rand_col,user_guess_col,user_guess_row));
        System.out.println("");
        end = safeOrBoom(user_guess_row, user_guess_col, rand_row, rand_col);



        } while (end == false);
        }
    }
