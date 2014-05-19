package romanos;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ConversorRomanotest {

	ConversorRomano conversor;
	
	@Before
	public void setUp() throws Exception {
		conversor = new ConversorRomano();
	}

	@Test
	public void converteParaRomanoTest() {
		assertEquals("I",conversor.converterParaRomano(1));
		assertEquals("II",conversor.converterParaRomano(2));
		assertEquals("III",conversor.converterParaRomano(3));
		assertEquals("C",conversor.converterParaRomano(100));
		assertEquals("C",conversor.converterParaRomano(100));
		assertEquals("CD",conversor.converterParaRomano(400));
		assertEquals("D",conversor.converterParaRomano(500));
		assertEquals("CM",conversor.converterParaRomano(900));
		assertEquals("M",conversor.converterParaRomano(1000));
	}

}
