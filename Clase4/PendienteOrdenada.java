/* ------------------------------------------------------------------------------------------------------
   Programación Orientada a Objetos

   Uso de métodos
   Fecha:
   @Author: Diana Aviles

   @Param: 4 coordenadas , calcula si son rectas parelelas o perpendiculares
   @Salidas: Suma,resta,multiplicacion y DIvisión

   PROGRAMA 4
   ---------------------------------------------------------------------------------------------------*/

public class PendienteOrdenada{

    public float RealizaPendiente(float x1, float y1, float x2, float y2){

	float pendiente=(y2-y1)/(x2-x1);

	return pendiente;

    }
}
