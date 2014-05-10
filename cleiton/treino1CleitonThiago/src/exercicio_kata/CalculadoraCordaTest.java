package exercicio_kata;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculadoraCordaTest {

	
	private CalculadoraCorda calculadoraCorda = new CalculadoraCorda();
	
	@Test
	public void verificaStringNulaTest() {
		calculadoraCorda.Add("");
		assertEquals(0, calculadoraCorda.Add(""));
	}
	
	@Test
	public void verificaUmParametroTest() {
		calculadoraCorda.Add("1");
		assertEquals(1, calculadoraCorda.Add("1"));
	}
	
	@Test
	public void verificaDoisParametroTest() {
		calculadoraCorda.Add("2");
		calculadoraCorda.Add("3");
		assertEquals(1, calculadoraCorda.Add("1"));
		assertEquals(2, calculadoraCorda.Add("2"));
	}
	
	@Test
	public void verificaProdutoTest() {
		assertEquals(6, calculadoraCorda.produto());
	}

}
