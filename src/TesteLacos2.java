import java.util.Scanner;

public class TesteLacos2 {

	public static void main(String[] args) {
		// Versão 2: Padrão de repetição (6 variaveis diferentes)
			
		Scanner leitor = new Scanner(System.in);
		double altura1, altura2, altura3, altura4, altura5, altura6, media;
		
		System.out.println("Por favor, insira a altura do 1 aluno: ");
		altura1 = leitor.nextDouble();
		System.out.println("Por favor, insira a altura do 2 aluno: ");
		altura2 = leitor.nextDouble();
		System.out.println("Por favor, insira a altura do 3 aluno: ");
		altura3 = leitor.nextDouble();
		System.out.println("Por favor, insira a altura do 4 aluno: ");
		altura4 = leitor.nextDouble();
		System.out.println("Por favor, insira a altura do 5 aluno: ");
		altura5 = leitor.nextDouble();
		System.out.println("Por favor, insira a altura do 6 aluno: ");
		altura6 = leitor.nextDouble();
		
		media = (altura1 + altura2 + altura3 + altura4 + altura5 + altura6)/6;
		System.out.println("A media de altura dos alunos é de " + media);
		
		leitor.close();
	}
}
