import java.util.Scanner;

public class Subtração
{
	public static void main(String[] args) {
	    Scanner scanner=new Scanner(System.in);
		System.out.println("Informe um número: ");
		int numeroUm=scanner.nextInt();
		System.out.println("O número escolhido é: "+numeroUm);
		
		System.out.println("Informe um número: ");
		int numeroDois=scanner.nextInt();
		System.out.println("O número escolhido é: "+numeroDois);
		
		int resultado=(numeroUm-numeroDois);
		System.out.println("O resultado é: "+resultado);
		
		scanner.close();
	}
}