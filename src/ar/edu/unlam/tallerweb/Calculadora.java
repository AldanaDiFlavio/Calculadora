package ar.edu.unlam.tallerweb;

public class Calculadora {
	Integer resultado=0;
	public Integer sumar(Integer numero1, Integer numero2) {
		return resultado = numero1 + numero2;
		
	}
	public Integer multiplicar(Integer numero1, Integer numero2) {
		
		return resultado=numero1*numero2;
	}

	public Integer obtenerUltimoResultado(){
		
		return resultado;
	}
}
