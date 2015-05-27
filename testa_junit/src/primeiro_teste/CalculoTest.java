package primeiro_teste;
import junit.framework.TestCase;

public class CalculoTest extends TestCase {

	public void testExecutaCalculo() {
		float PassaValor1 = 10;
		float PassaValor2 = 5;
		
		float RetornoEsperado = 15;

		float RetornoFeito = Calculo.ExecutaCalculo(PassaValor1, PassaValor2);

		assertEquals(RetornoEsperado, RetornoFeito, 0);

	}

}
