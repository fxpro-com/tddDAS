package exercicio_kata;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculadoraCordaTest {

	
	private CalculadoraCorda calculadoraCorda = new CalculadoraCorda();
	
	@Test
	public void test() {
		calculadoraCorda.Add("");
		
		assertEquals(0, calculadoraCorda.Add(""));
	}

}
