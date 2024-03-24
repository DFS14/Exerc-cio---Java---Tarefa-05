package tarefa05;
import java.util.Scanner;
public class Exe03 {
public static void main(String[] args) {
Scanner scanner = new 


Scanner(System.in);
System.out.print("Digite o número de maçãs compradas: ");

int quantidade = scanner.nextInt();

double preco;
double CustoTotalCompra;

	if (quantidade < 12) 
	{
			preco = 1.30;
	} else {
			preco = 1.00;
	}

CustoTotalCompra = quantidade * preco;
System.out.printf("O custo total da compra é: R$ %.2f%n", CustoTotalCompra);

scanner.close();

	}
}
