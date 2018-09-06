import java.util.Scanner;

public class numdiez{

  public static void main(String[] args) {

    System.out.println("\033[H\033[2J");
    System.out.flush(); // Limpiar pantalla

    Scanner entrada= new Scanner(System.in);

     int arreglo[]=new int[9];
    int suma;

    for(int i=0; i<9; i++){
      System.out.println("Ingrese el valor "+ (i+1));
      arreglo[i]=entrada.nextInt();
      arreglo[i]*=2;
    }

    for(int i=0; i<9; i++){
      System.out.println("Valores: "+arreglo[i]);
    }

     Operacion ejecuta = new Operacion();
     suma=ejecuta.Suma(arreglo);
  System.out.println("total: "+suma);



  }
}
