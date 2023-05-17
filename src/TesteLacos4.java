import java.util.Scanner;

public class TesteLacos4 {

	public static void main(String[] args) {
		// Usando estrutura de repetição WHILE
				
		Scanner leitor = new Scanner(System.in);
		double somaAltura = 0, media;
		int aluno = 1;                                                      //Valor inicial
		
		while (aluno <= 6) {                                               //Condição verdadeira
			System.out.println("Por favor, insira a altura do " + aluno + " aluno: ");
			somaAltura = somaAltura + leitor.nextDouble();
			aluno++; //a cada volta acrescenta 1 na variavel aluno
		}
		
//		System.out.println("Por favor, insira a altura do 1 aluno: ");
//		somaAltura = somaAltura + leitor.nextDouble();
//		System.out.println("Por favor, insira a altura do 2 aluno: ");
//		somaAltura = somaAltura + leitor.nextDouble();
//		System.out.println("Por favor, insira a altura do 3 aluno: ");
//		somaAltura = somaAltura + leitor.nextDouble();
//		System.out.println("Por favor, insira a altura do 4 aluno: ");
//		somaAltura = somaAltura + leitor.nextDouble();
//		System.out.println("Por favor, insira a altura do 5 aluno: ");
//		somaAltura = somaAltura + leitor.nextDouble();
//		System.out.println("Por favor, insira a altura do 6 aluno: ");
//		somaAltura = somaAltura + leitor.nextDouble();
		
		media = somaAltura/6;
		System.out.println("A media de altura dos alunos é de " + media);
		
		leitor.close();

	}

}
