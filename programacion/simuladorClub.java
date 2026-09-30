import java.util.Scanner;
public class simuladorClub {

// membresia 50 $ al mes.
// precio original 70 $ al mes.
// precio descuento
        public static void mostrarBienvenida(){
            System.out.println("Bienvenidos al sistema");
        }

        public static int esMayorEdad(int edad){


        if (edad >= 18){
             return edad;
        }
        else{
            return 0;

        }
        }
        public static int caclularDescuentoTotal(int precioOriginal, int precioDescuento){
            int total =  precioOriginal - precioDescuento;
            return total;
        }
        public static int calcularAhorroMembresia(int)

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Edad: ");
        int edad = sc.nextInt();
    }
}
