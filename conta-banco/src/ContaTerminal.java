import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numeroConta;
		String agencia, nomeCliente;
		double saldo = 0;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Ol�, insira suas informa��es abaixo. ");
		System.out.print("Nome: ");
		nomeCliente = input.nextLine();
		System.out.print("Ag�ncia: ");
		agencia = input.nextLine();
		System.out.print("N�mero da conta: ");
		numeroConta = input.nextInt();
		System.out.print("Saldo: ");
		saldo = input.nextDouble();
		
		System.out.printf("%nOl� %s, obrigado por criar uma conta em nosso banco.%n", nomeCliente.toUpperCase());
		System.out.println("Verifique se suas informa��es est�o corretas");
		System.out.printf("AGENCIA: %s\nCONTA: %d\nSALDO: R$%.2f", agencia, numeroConta, saldo);
	}

}
