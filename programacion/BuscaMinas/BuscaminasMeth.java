import java.util.Scanner;
import java.util.Random;
public class BuscaminasMeth{


public static int RowNum(){  // get num for row from user
    Scanner sc = new Scanner(System.in);
    System.out.print("num of table's rows: ");
    int i_size = sc.nextInt();

        return i_size;
}

public static int ColNum(){ // get num for column from user
    Scanner sc = new Scanner(System.in);
    System.out.print("num of table's columns: ");
    int c_size = sc.nextInt();

        return c_size;
 }

public static int [][] MatrixSize(int i_size, int c_size){ //matrix with users nums for column and row
    int row_num = i_size;
    int col_num = c_size;
    int [][] table = new int [row_num][col_num];

        return table;
}


public static int RandRow(int i_size){    // random row generator in size of row
    int row_rand_pos_bomb = i_size;

    Random rand = new Random();
    int random_row = rand.nextInt(row_rand_pos_bomb);

        return random_row;

}
public static int RandCol(int c_size){    // random column generator in size of column
    int col_rand_pos_bomb = c_size;

    Random rand = new Random();
    int random_col = rand.nextInt(col_rand_pos_bomb);

        return random_col;

}
public static void LoopForMatrix(int[][] a){

    for(int i = 0; i < a.length; i ++){
        for(int j = 0; j < a.length; j ++){
            System.out.print(a[i][j] + " ");
        }
        System.out.println("");
    }
}
public static int AskForGuessCoordinatesRow(){
    Scanner sc = new Scanner(System.in);
    System.out.print("Coordinate x: ");
    int row_guess_coordinate = sc.nextInt() -1;

        return row_guess_coordinate;

}
public static int AskForGuessCoordinatesColumn(){
    Scanner sc = new Scanner(System.in);
    System.out.print("Coordinate y: ");
    int column_guess_coordinate = sc.nextInt() -1;

        return column_guess_coordinate;

}

public static boolean SafeOrBoom(int row_user_guesser, int col_user_guesser, int random_row, int random_col){     // check if user is safe or dead based on choose rand nums gen and user's input for col and row


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
public static int [][] BombCoordinatesToShow(int[][] table, int random_row, int random_col){ // put "1" in bomb coordinates from RandCol and RandRow into matrix
    int row_coordinates = random_row;
    int col_coordinates = random_col;
    table[row_coordinates][col_coordinates] = 1;

        return table;

}


    public static void main(String[] arguments){
        boolean end = false;
        do {
        int size_row = RowNum();
        int size_column = ColNum();



        LoopForMatrix(MatrixSize(size_row,size_column));
        int user_guess_row = AskForGuessCoordinatesRow();
        int user_guess_col = AskForGuessCoordinatesColumn();

        int rand_row = RandRow(size_row);
        int rand_col = RandCol(size_column);

        int[][] table = MatrixSize(size_row, size_column);
        BombCoordinatesToShow(table, rand_row, rand_col);
        LoopForMatrix(BombCoordinatesToShow(table, rand_row, rand_col));
        end = SafeOrBoom(user_guess_row, user_guess_col, rand_row, rand_col);

        } while (end == false);
        }
    }
