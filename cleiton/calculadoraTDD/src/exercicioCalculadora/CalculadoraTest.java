package exercicioCalculadora;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CalculadoraTest {

	private Calculadora calculadora;
	
	@Before
	public void setUp() throws Exception {
		calculadora = new Calculadora();
	}

	@Test
	public void somaTest() {
		assertEquals(10, calculadora.soma(5,5),0.01);
	}
	
	@Test
	public void subtracaoTest() {
		assertEquals(0, calculadora.subtracao(5,5),0.01);
	}

}
