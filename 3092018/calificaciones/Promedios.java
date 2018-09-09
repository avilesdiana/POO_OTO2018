import java.util.Scanner;

public class Promedios{
    private int totalSuma;
    private float promedio;

    public void determinarPromedioClase(int totalCal){

	Scanner entrada =new Scanner(System.in);

	int contador=1;
	int calificaciones;
	int total=0;


	while(contador<=totalCal){

	    System.out.println("calificaciones"+contador);
	    calificaciones=entrada.nextInt();
	    total += calificaciones;
	    contador=contador +1;
	}

	totalSuma=total;
	promedio=totalSuma/totalCal;
	System.out.println(promedio >=8 ? "\nBuen grupo":"\nHay que mejorar");
    }

    public void imprimePromedio(){
	System.out.println("_____________________________");
	System.out.println("Promedio:"+promedio);

    }
    public void imprimeSumaTotal(){
	System.out.println("_____________________________");
	System.out.println("Suma:"+totalSuma);
    }


}
