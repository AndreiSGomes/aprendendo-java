import java.util.Scanner;

public class Contador {
	public static void main(String[] args) {
		
		Scanner terminal = new Scanner(System.in);
		
		System.out.print("Digite o primeiro parâmetro: ");
		int parametroUm = terminal.nextInt();
		System.out.print("Digite o segundo parâmetro: ");
		int parametroDois = terminal.nextInt();
		
		terminal.close();
		
		try {
			//chamando o método contendo a lógica de contagem
			contar(parametroUm, parametroDois);
		
		}catch (ParametrosInvalidosException exception) {
			//imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
			System.out.printf("%nO SEGUNDO parâmetro deve ser MAIOR que o PRIMEIRO!");
		}
		
	}
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		//validar se parametroUm é MAIOR que parametroDois e lançar a exceção
		if(parametroUm > parametroDois) {
			throw new ParametrosInvalidosException();
		}
		
		//realizar o for para imprimir os números com base na variável contagem
		int contagem = parametroDois - parametroUm;
		for(int i = 0; i < contagem; i++) {
			System.out.printf("%d - ", i+1);
		}
	}
}