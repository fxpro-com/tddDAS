package exercicioCalculadora;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Calculadora {

	public double soma(double a, double b){
		return a + b;
	}

	public double subtracao(double a, double b){
		return a - b;
	}
	
	public double produto(double a, double b){
		return a*b;
	}
	
	public double divisao(double a, double b){
		return a/b;
	}
	
	public int restoDaDivisao(int a, int b){
		return a%b;
	}
}
