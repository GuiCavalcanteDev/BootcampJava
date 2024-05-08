import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
		//TODO: Conhecer e importar a classe Scanner
		//Exibir as mensagens para o nosso usuario
		//Obter pela classe scanner os valores digitados no terminal
		//exibir a mensagem de conta criada
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite seu nome: ");
		String nomeCliente = scanner.nextLine();
		
		System.out.println("Por favor, digite o número da Agência: ");
		int numero = scanner.nextInt();
		
		System.out.println("Digite sua Agência: ");
		String agencia = scanner.nextLine();
		
		scanner.nextLine();
		
		System.out.println("Digite seu saldo:");
		double saldo = scanner.nextDouble();
		
		System.out.println("Olá " + nomeCliente +  ", obrigado por criar uma conta em nosso banco, sua agência é "+ agencia + " conta " + 
		numero + " e seu saldo " + saldo + " já está disponível para saque");
		
		
		scanner.close();
		
		
	}
}
