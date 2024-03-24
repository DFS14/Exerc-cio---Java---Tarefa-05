package tarefa05;
import java.util.Scanner;
public class Exe02 {

public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.println("Digite um valor:");

int valor = scanner.nextInt();


if (valor % 2 == 0)
			
{System.out.println("O valor é positivo.");}
else
{System.out.println("O valor é negativo.");}


	scanner.close();

	}
}
