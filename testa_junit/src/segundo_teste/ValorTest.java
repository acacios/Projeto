package segundo_teste;
/**   
 *O teste que verifica se o método adiciona(int valor) faz o que deveria estar fazendo é fornecido abaixo. 
 *Neste código há duas sentenças import.
 * A primeira permite o uso da chamada assertEquals no corpo do método de teste testAdiciona(). 
 * A outra sentença import declara a anotação Test. É o emprego desta anotação que identifica métodos de teste. 
 * Na classe ValorTest há apenas um método acompanhado desta anotação e, portanto, há um único teste de unidade
 *  implementado por meio do método testAdiciona. Todos os métodos de teste devem possuir esta assinatura, ou seja,
 *   devem ser públicos, retornar void e não recebem nenhum valor como argumento. Não é necessário usar o prefixo
 *    test,   *conforme empregado, qualquer nome de método pode ser empregado. 
 *    
 *    
 * O método assertEquals(int,int) empregado apenas verifica se o valor esperado 3 é aquele retornado pela 
 * operação v1.getValor(). Há significativa sobrecarga deste método (veja detalhes aqui).
Conforme comentado acima, @Test indica que o método que segue é um teste de unidade, 
qualquer que seja o nome do método. 
Contudo, deve ser público, retornar void e não deve receber nenhum valor como argumento.
 É o conteúdo deste método que exercita o código a ser testado e, adicionalmente, verifica se o 
 resultado obtido é o esperado.
Neste exemplo, uma instância de Valor é criada, o valor 1 atributo à instância e, em seguida, adicionado o valor 2. Em conseqüência, é esperado que a propriedade da instância criada possua o valor 3. É exatamente este resultado esperado que é testado pelo método assertEquals. 
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
