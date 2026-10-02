import java.util.Scanner;
public class Ejer2online{


    public static void main(String[] arguments){

        boolean stop = false;
        Scanner sc = new Scanner(System.in);
        System.out.print("Cuantos alumnos hay en clase: ");
        int num_alumnos = sc.nextInt();

        for(int i = 0; i < num_alumnos; i ++){

        double nota;
        do{
            System.out.print("Dime la nota del alumno " + i + ": ");
            nota = sc.nextInt();
            if(nota<0 || nota > 10){
                System.out.print("Eror Try again: ");
            }

        }while (nota > 0 ||nota <10);



    }
}
}
