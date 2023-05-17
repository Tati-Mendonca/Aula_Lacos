import java.util.Scanner;

public class TesteLacos3 {
	public static void main(String[] args) {
		// Versão 2: Padrão de repetição (1 unica variavel mas ainda tenho padrão de repetição de coleta de dados dos alunos)
		
		Scanner leitor = new Scanner(System.in);
		double somaAltura = 0, media;
		
		System.out.println("Por favor, insira a altura do 1 aluno: ");
		somaAltura = somaAltura + leitor.nextDouble();
		System.out.println("Por favor, insira a altura do 2 aluno: ");
		somaAltura = somaAltura + leitor.nextDouble();
		System.out.println("Por favor, insira a altura do 3 aluno: ");
		somaAltura = somaAltura + leitor.nextDouble();
		System.out.println("Por favor, insira a altura do 4 aluno: ");
		somaAltura = somaAltura + leitor.nextDouble();
		System.out.println("Por favor, insira a altura do 5 aluno: ");
		somaAltura = somaAltura + leitor.nextDouble();
		System.out.println("Por favor, insira a altura do 6 aluno: ");
		somaAltura = somaAltura + leitor.nextDouble();
		
		media = somaAltura/6;
		System.out.println("A media de altura dos alunos é de " + media);
		
		leitor.close();
	}

}
