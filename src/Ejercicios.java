import java.util.ArrayList;
import java.util.Scanner;
//los ejercicios los hice basado en los ejemplos realizados en clase de(ejercicios de Exception y de Arraylist)
class MiClase
{
	int x;
	public MiClase(int x) {
		this.x = x;
	}
};

public class Ejercicios {

	//Devuelve la division entre 'a' y 'b'
	//Se deben manejar las excepciones en caso de dividir entre 0
	static int dividir(int a, int b)
	{
		try
		{
			return a/b;//se va a dividir si a/b es divisible, osea si b no es igual a 0
		}catch(ArithmeticException e)//con catch vamos a atrapar el error
		{
			e.printStackTrace();//cuando dividimos entre 0 imprimimos el error
			System.out.println("el usuario ingreso 0");//si b=0 tendremos el error 
			b=0;
		}
		return 0;
	}
	
	//Devuelve el valor almacenado en 'arreglo' en la posicion 'pos'
	//Se deben manejar las excepciones en caso la posicion se salga de los limites
	static int getNumero(int arreglo[], int pos)
	{
		try
		{
			return arreglo[pos];//nos devuelve el valor almacenado en "arreglo" en la posicion "pos"
		}catch(Exception e)//con catch atrapamos el error por si se sale de los limites
		{
			e.printStackTrace();//cuando se sale de los limites nos imprime el error
		}
		return 0;
	}
	
	//Devuelve la variable 'x' de 'mi_clase'
	//Se debe manejar las excepciones en caso que 'mi_clase' sea igual a null
	static int getX(MiClase mi_clase)
	{
		try
		{
			return mi_clase.x;//cuando no encuentra error nos devuelve la variable x
		}catch(Exception e)//con catch atrapamos el error en caso de que mi_clase sea igual a null
		{
			e.printStackTrace();//si mi_clase es igual a null nos imprime el error
		}
		return 0;
	}
	
	//Devuelve el promedio de todos los elementos de 'mi_lista'
	static int getPromedio(ArrayList<Integer> mi_lista)
	{//basado en ejercicios de: http://www.javamexico.org/foros/java_standard_edition/jtable_con_arraylist_como_lo_hago
		//en este caso ya tenemos la lista creada solo hacemos los pasos para sumar los numeros ne la lista
		//y luego sacar el promedio
		int prom = 0;
		int suma = 0;
		for(int i = 0; i<mi_lista.size(); i++)
		{
			suma = suma + mi_lista.get(i);
			prom = suma/mi_lista.size();
		}
		return prom;
	}
	
	//Devuelve el numero mayor almacenado en 'mi_lista'
	static int getMayor(ArrayList<Integer> mi_lista)
	{// basado en ejercicios de: http://puntocomnoesunlenguaje.blogspot.com/2013/02/arraylist-de-objetos-en-java.html
		int mayor = mi_lista.get(0);
		for(int i = 0; i<mi_lista.size(); i++)
		{
			if(mi_lista.get(i)>mayor)
			{
				mayor = mi_lista.get(i);
			}
		}
		return mayor;
	}
	
	//Devuelve true si 'mi_lista' contiene 'str' de lo contrario devuelve false
	static boolean existe(ArrayList<String> mi_lista, String str)
	{
		for(int i = 0; i<mi_lista.size(); i++)
		{
			if(mi_lista.get(i)==str)
			{
				return true;
			}
		}
		return false;
	}
	
	public static void main(String[] args)
	{ 
	}

}
