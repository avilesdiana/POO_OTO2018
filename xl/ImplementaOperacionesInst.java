/* ------------------------------------------------------------------------------------------------------
   Programación Orientada a Objetos

   Uso de métodos
   Fecha:
   @Author: Diana Aviles


   PROGRAMA 6
   ---------------------------------------------------------------------------------------------------*/

public class ImplementaOperacionesInst {

    public static void main(String[] args){

	OperacionesInst ejecutaOperac =new OperacionesInst(4,5);//inicializar constructor

	System.out.println("_________________________________________");
	System.out.println("Suma,Resta,Multiplicacion,Division");
	System.out.println("By: Diana Aviles");
	System.out.println("_________________________________________\n");
	ejecutaOperac.RealizaSuma();
	ejecutaOperac.RealizaResta();
	ejecutaOperac.RealizaMultiplicacion();
	ejecutaOperac.RealizaDivision();
    }
}
