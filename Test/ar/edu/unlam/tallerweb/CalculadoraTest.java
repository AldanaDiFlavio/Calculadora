package ar.edu.unlam.tallerweb;

import org.junit.Test;
import org.junit.Assert;



public class CalculadoraTest {

	@Test
	public void testQueSePuedaSumar() {
		Calculadora miCalculadora = new Calculadora();
		Integer cantidadEsperada=7;
		Integer cantidadObtenida= miCalculadora.sumar(3, 4);
		Assert.assertEquals(cantidadEsperada, cantidadObtenida);
	}

	@Test
	 public void testQueSePuedaMultiplicar(){
		Calculadora miCalculadora = new Calculadora();
		Integer cantidadEsperada=12;
		Integer cantidadObtenida=miCalculadora.multiplicar(3,4);
		Assert.assertEquals(cantidadEsperada, cantidadObtenida);
	}
	
	@Test
	public void testQueMuestreElUltimoResultado(){
		Calculadora miCalculadora = new Calculadora();
		miCalculadora.sumar(2,6);
		miCalculadora.multiplicar(4,7);
		miCalculadora.sumar(5, 8);
		Integer cantidadObtenida = miCalculadora.obtenerUltimoResultado();
		Integer cantidadEsperada= 13;
		Assert.assertEquals(cantidadEsperada, cantidadObtenida);
		
	}
}
