package tarefa05;
import java.util.Scanner;
public class Exe07 {
public static void main(String[] args)  {
Scanner sc = new Scanner(System.in);
float valor1, valor2;

System.out.println("Digite o primeiro valor:");
valor1 = sc.nextFloat();

System.out.println("Digite o segundo valor:");
valor2 = sc.nextFloat();

if (valor1 != valor2) 
{
if (valor1 < valor2) 
{
System.out.println("Ordem crescente: " + valor1 + ", " + valor2);
}
else
{
System.out.println("Ordem crescente: " + valor2 + ", " + valor1);
}

} 
else 
{
System.out.println("Os valores não podem ser iguais.");
}

		sc.close();
	}
}