import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;


public class Evaluar {

	@Test
	public void dividir() {
		assertEquals("Error ejecutando Ejercicios.dividir(4,2)", 2, Ejercicios.dividir(4,2));
		assertEquals("Error ejecutando Ejercicios.dividir(9,3)", 3, Ejercicios.dividir(9,3));
		assertEquals("Error ejecutando Ejercicios.dividir(4,0)", 0, Ejercicios.dividir(4,0));
	}
	
	@Test
	public void getNumero() {
		assertEquals("Error ejecutando getNumero(new int []{1,2,3},2)", 3, Ejercicios.getNumero(new int []{1,2,3},2));
		assertEquals("Error ejecutando getNumero(new int []{1,2,3,4},3)", 4, Ejercicios.getNumero(new int []{1,2,3,4},3));
		assertEquals("Error ejecutando getNumero(new int []{1,2,3},4)", 0, Ejercicios.getNumero(new int []{1,2,3},4));
		assertEquals("Error ejecutando Numero(new int []{1,2,3},-1)", 0, Ejercicios.getNumero(new int []{1,2,3},-1));
	}
	
	@Test
	public void getX() {
		assertEquals("Error ejecutando getX(new MiClase(10))", 10, Ejercicios.getX(new MiClase(10)));
		assertEquals("Error ejecutando getX(new MiClase(20))", 20, Ejercicios.getX(new MiClase(20)));
		assertEquals("Error ejecutando getX(null)", 0, Ejercicios.getX(null));
	}
	
	@Test
	public void getPromedio() {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		
		ArrayList<Integer> al2 = new ArrayList<Integer>();
		al2.add(1);
		al2.add(2);
		al2.add(3);
		al2.add(4);
		al2.add(5);
		
		assertEquals("Error ejecutando getPromedio(al)", 30, Ejercicios.getPromedio(al));
		assertEquals("Error ejecutando getPromedio(al2)", 3, Ejercicios.getPromedio(al2));
	}
	
	@Test
	public void getMayor() {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(50);
		al.add(40);
		
		ArrayList<Integer> al2 = new ArrayList<Integer>();
		al2.add(1);
		al2.add(2);
		al2.add(5);
		al2.add(3);
		al2.add(4);
		
		assertEquals("Error ejecutando getPromedio(al)", 50, Ejercicios.getMayor(al));
		assertEquals("Error ejecutando getPromedio(al2)", 5, Ejercicios.getMayor(al2));
	}
	
	@Test
	public void existe() {
		ArrayList<String> al = new ArrayList<String>();
		al.add("10");
		al.add("20");
		al.add("30");
		al.add("50");
		al.add("40");
		
		ArrayList<String> al2 = new ArrayList<String>();
		al2.add("1");
		al2.add("2");
		al2.add("5");
		al2.add("3");
		al2.add("4");
		
		assertEquals("Error ejecutando exite(al,10)", true, Ejercicios.existe(al,"10"));
		assertEquals("Error ejecutando exite(al,30)", true, Ejercicios.existe(al,"30"));
		assertEquals("Error ejecutando exite(al,70)", false, Ejercicios.existe(al,"70"));
		
		assertEquals("Error ejecutando exite(al,1)", true, Ejercicios.existe(al2,"1"));
		assertEquals("Error ejecutando exite(al,3)", true, Ejercicios.existe(al2,"3"));
		assertEquals("Error ejecutando exite(al,7)", false, Ejercicios.existe(al2,"7"));
	}

}
