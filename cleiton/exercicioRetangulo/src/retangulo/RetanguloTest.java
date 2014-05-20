package retangulo;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class RetanguloTest {

	Retangulo retangulo;
	Ponto pontoA,pontoB;
	
	@Before
	public void setUp() throws Exception {
		retangulo = new Retangulo();
		pontoA = new Ponto();
		pontoB = new Ponto();
	}

	@Test
	public void constroiRentagulotest() {
		assertTrue(retangulo.verificaSeEhRetangulo(0, 0, 1, 2) );
	}
	
	@Test
	public void calculoPerimetroTest(){
		assertEquals(6, retangulo.calculoPerimetro(0, 0, 1, 2),0.01);
	}
	
	@Test
	public void calculoAreaTest(){
		assertEquals(4, retangulo.calculoArea(0, 0, 1, 2),0.01);
	}
	
	@Test
	public void verificaSobrePosicaoTest(){
		pontoA.setXmax(2);
		pontoA.setXmin(0);
		pontoA.setYmax(1);
		pontoA.setYmin(0);
		pontoB.setXmax(1);
		pontoB.setXmin(0);
		pontoB.setYmax(1);
		pontoB.setYmin(0);
		
		assertTrue(retangulo.verificaSobrePosicao(pontoA,pontoB));
		
	}
	
}
