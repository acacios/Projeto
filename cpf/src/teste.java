import java.util.Scanner;

public class teste {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// ValidarCpf valida = new ValidarCpf();

		Scanner validar = new Scanner(System.in);
		System.out.println("digite o cpf");
		String coletarNome = validar.nextLine();

		boolean a = ValidarCpf.CPF(coletarNome);

		if (a == true) {
			System.out.println(" CPF -verdadeiro");
		} else {
			System.out.println(" CPF -falso");
		}

	}

}
