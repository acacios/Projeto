package segundo_teste;
/**   
 *O teste que verifica se o m�todo adiciona(int valor) faz o que deveria estar fazendo � fornecido abaixo. 
 *Neste c�digo h� duas senten�as import.
 * A primeira permite o uso da chamada assertEquals no corpo do m�todo de teste testAdiciona(). 
 * A outra senten�a import declara a anota��o Test. � o emprego desta anota��o que identifica m�todos de teste. 
 * Na classe ValorTest h� apenas um m�todo acompanhado desta anota��o e, portanto, h� um �nico teste de unidade
 *  implementado por meio do m�todo testAdiciona. Todos os m�todos de teste devem possuir esta assinatura, ou seja,
 *   devem ser p�blicos, retornar void e n�o recebem nenhum valor como argumento. N�o � necess�rio usar o prefixo
 *    test,   *conforme empregado, qualquer nome de m�todo pode ser empregado. 
 *    
 *    
 * O m�todo assertEquals(int,int) empregado apenas verifica se o valor esperado 3 � aquele retornado pela 
 * opera��o v1.getValor(). H� significativa sobrecarga deste m�todo (veja detalhes aqui).
Conforme comentado acima, @Test indica que o m�todo que segue � um teste de unidade, 
qualquer que seja o nome do m�todo. 
Contudo, deve ser p�blico, retornar void e n�o deve receber nenhum valor como argumento.
 � o conte�do deste m�todo que exercita o c�digo a ser testado e, adicionalmente, verifica se o 
 resultado obtido � o esperado.
Neste exemplo, uma inst�ncia de Valor � criada, o valor 1 atributo � inst�ncia e, em seguida, adicionado o valor 2. Em conseq��ncia, � esperado que a propriedade da inst�ncia criada possua o valor 3. � exatamente este resultado esperado que � testado pelo m�todo assertEquals. 
 *    
 *    
 *    
 *    
 * **/
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ValorTest {

	@Test
	public void testAdiciona() {
		Valor v1 = new Valor();
		v1.setValor(1);
		v1.adiciona(2);
		assertEquals(3, v1.getValor());
	}

}
