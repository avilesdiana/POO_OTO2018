import java.util.Scanner;

public class raicesdowhile{

public static void main(String[] args) {

     double valor,i=0;
     double x1;
     Scanner entrada= new Scanner (System.in);

    System.out.println("\033[H\033[2J");
    System.out.flush(); // Limpiar pantalla

    System.out.println("______________________________________________");

     System.out.println("Escribe el valor de la raiz mas cercana: ");
     valor=entrada.nextInt();

     do{


     x1=Math.pow((5*(valor)-5),0.5);
     System.out.println("______________________________________________");
     System.out.println("Valor de la Raiz:: "+x1);

     if((x1-valor)<0.00001){

       System.out.println("______________________________________________");
       System.out.println("El valor de la raiz es:: "+x1+" en la iteracion: "+i);
       break;
     }
            valor=x1;
            i++;

    }while(i<=50);
 }
}
