import java.util.Scanner;
public class Ejer2online{


    public static void main(String[] arguments){


        Scanner sc = new Scanner(System.in);
        int students;
        System.out.print("Cantidad de alumnos: ");
        students = sc.nextInt();

        int i = 1;
        double total = 0;
        double nota;
        double max_note = 0;
        double min_note = 10;
        double media;
        int aprobados = 0;
        int suspensos = 0;


        while(i<=students){

            System.out.println("Nota del alumno " + i + ": ");

            do{
                nota = sc.nextFloat();
                if(nota<0 || nota > 10)
                {
                System.out.print("Nota es incorrecta. Try again: ");
                }

            } while(nota<0 || nota>10);

            i++;
            total += nota;

            if(nota>max_note){
                max_note = nota;

            }if(nota<min_note){
                min_note = nota;
            }

            if(nota>=5){
                aprobados++;
            }
            if(nota<5){
                suspensos++;
            }

        }
        media = total / students;
        System.out.println("Max note : " +max_note);
        System.out.println("Min note : " +min_note);
        System.out.println("Media: "+media);
        System.out.println("Aprobados: "+aprobados);
        System.out.println("Suspensos: "+suspensos);
    }
}
