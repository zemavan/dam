import java.util.Scanner;
import java.util.Random;
public class Fichas{


public static int rowNum(){  // get num for row from user
    Scanner sc = new Scanner(System.in);
    System.out.print("num of table's rows: ");
    int i_size_for_gen_matrix = sc.nextInt();

        return i_size_for_gen_matrix;
}

public static int colNum(){ // get num for column from user
    Scanner sc = new Scanner(System.in);
    System.out.print("num of table's columns: ");
    int c_size_for_gen_matrix = sc.nextInt();

        return c_size_for_gen_matrix;
 }

public static int [][] matrixSize(int i_size_for_gen_matrix, int c_size_for_gen_matrix){ //matrix with users nums for column and row
    int [][] table = new int [i_size_for_gen_matrix][c_size_for_gen_matrix];
    for(int i = 0; i<table.length; i++){
        for(int j = 0; j<table[i].length; j++){
        table[i][j] = -1;
    }
}
        return table;
}


public static int randRow(int i_size_for_gen_matrix){    // Position of random row generator in size of row
    Random rand = new Random();
    int random_row = rand.nextInt(i_size_for_gen_matrix);

        return random_row;

}
public static int randCol(int c_size_for_gen_matrix){    // Position of random column generator in size of column
    Random rand = new Random();
    int random_col = rand.nextInt(c_size_for_gen_matrix);

        return random_col;

}
public static void loopForMatrix(int[][] table){
    for(int i = 0; i < table.length; i ++){
        for(int j = 0; j < table[i].length; j ++){
            System.out.print(table[i][j] + " ");
        }
        System.out.println("");
    }
}
public static int askForGuessCoordinatesRow(){
    Scanner sc = new Scanner(System.in);
    System.out.print("Coordinate i: ");
    int user_row_guess_coordinate = sc.nextInt() -1;

        return user_row_guess_coordinate;

}
public static int askForGuessCoordinatesColumn(){
    Scanner sc = new Scanner(System.in);
    System.out.print("Coordinate j: ");
    int user_column_guess_coordinate = sc.nextInt() -1;

        return user_column_guess_coordinate;

}

public static boolean safeOrBoom(
    int user_row_guess_coordinate, int user_col_guess_coordinate,
    int random_row, int random_col
    ){     // check if user is safe or dead based on choose rand nums gen and user's input for col and row
    if (user_row_guess_coordinate == random_row && user_col_guess_coordinate == random_col){
        System.out.println("BOOM!");
        return true;
    }
    else
    {
        System.out.println("SAFE");
        return false;

    }

}

public static int [][] userTryResult(int[][] table, int random_row, int random_col, int user_row_guess_coordinate, int user_column_guess_coordinate){ // put "1" in bomb coordinates from RandCol and RandRow into matrix

    if(user_row_guess_coordinate==random_row && user_column_guess_coordinate == random_col){
        table[user_row_guess_coordinate][user_column_guess_coordinate] = 1;
        return table;
    }
    else{
        table[user_row_guess_coordinate][user_column_guess_coordinate] = 0;
        return table;
    }



}

    public static void main(String[] arguments){
        boolean end = false;
        int row_size = rowNum();
        int column_size = colNum();

        int rand_row_position = randRow(row_size);
        int rand_col_position = randCol(column_size);

        int[][] table = matrixSize(row_size, column_size);
        do {
            // loopForMatrix(table);
            int user_row_guess = askForGuessCoordinatesRow();
            int user_column_guess = askForGuessCoordinatesColumn();
            userTryResult(table, rand_row_position, rand_col_position, user_row_guess, user_column_guess);
            loopForMatrix(table);
            System.out.println("");
            end = safeOrBoom(user_row_guess, user_column_guess, rand_row_position, rand_col_position);
            System.out.println("");

        } while (end == false);
        }
    }
