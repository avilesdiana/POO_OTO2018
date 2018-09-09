/* ------------------------------------------------------------------------------------------------------
   Programación Orientada a Objetos


   Fecha: 29/08/2018
   @Author: Diana Aviles

   Instancias

   PROGRAMA 7
   ---------------------------------------------------------------------------------------------------*/

public class OperacionesBanco{

    private int a;
    //variable de instancia, puede usarse o modificarse // en cualquier momento

    public OperacionesBanco(int saldoinicial) {
	a=saldoinicial;
    }



    public int RealizaCompra(int compraRealizada){

	int  resultado= a - compraRealizada ;

	return resultado;

    }

}
