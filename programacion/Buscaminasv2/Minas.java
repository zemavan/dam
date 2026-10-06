package Buscaminasv2;
import java.util.Scanner;
import java.util.Random;

public class Minas{
    public static void main(String[] args){

    Greetings();
    int counter = 0;
    int level_game = userScanner("Choose dificulty from 1 to 3 where 1 is the easiest: ");

    int i_size = userScanner("matrix size for i: ");
    int j_size = userScanner("matrix size for j: ");

    int [][] matrix = new int[i_size][j_size];
    int random_row_cell_position = 0;
    int random_col_cell_position = 0;

    while(counter<level_game){
    random_row_cell_position = randomCellPostition(i_size);
    random_col_cell_position = randomCellPostition(j_size);

    matrix[random_row_cell_position][random_col_cell_position] = 1;
    counter++;
}

    char [][] user_matrix = new char [matrix.length][matrix[0].length];
    System.err.println("");
    System.out.print("CHAR matrix is below\n");
    LoopForCharrArraySymbol(user_matrix);
    Loop(matrix);

    int user_row_guess = userScanner("coordinates for i: ") - 1;
    int user_col_guess = userScanner("coordinates for j: ") - 1;

    if(random_row_cell_position == user_row_guess && random_col_cell_position == user_col_guess){
        user_matrix[user_row_guess][user_col_guess] = '*';
        Loop(user_matrix);
        Loop(matrix);
        System.out.println("Bomb: " + random_row_cell_position + " " + random_col_cell_position);
        System.out.println("User: " + user_row_guess + " " + user_col_guess);
        System.out.println("BOOM");
    }else{
        System.out.println("SAFE");
        user_matrix[user_row_guess][user_col_guess] = '+';
        Loop(user_matrix);
        Loop(matrix);
    }


    }
    public static void Loop(char[][] matrix){
        for(int i = 0; i<matrix.length; i++){
            for(int j = 0; j<matrix[i].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println("");
    }}
    public static void LoopForCharrArraySymbol(char[][] matrix){
        for(int i = 0; i<matrix.length; i++){
            for(int j = 0; j<matrix[i].length; j++){
                matrix[i][j] = '■';
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println("");
    }}
    public static void Loop(int [][] matrix){
        System.out.println("\n");

        System.out.println("MATRIX\n");
        for(int i = 0; i<matrix.length; i++){
            for(int j = 0; j<matrix[i].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println("");
    }}

    public static int userScanner(String text){
        Scanner sc = new Scanner(System.in);
        System.out.print(text);
        int output = sc.nextInt();
        return output;
    }
    public static int randomCellPostition(int size){
        Random random = new Random();
        int result = random.nextInt(size);
        return result;
    }
    public static void Greetings(){
        System.out.println("");
        System.out.println("    +++++++++++     ");
        System.out.print("WELCOME   TO   MINER\n");
        System.out.println("    +++++++++++     ");
        System.out.println("");
        System.out.println("");
    }

}
