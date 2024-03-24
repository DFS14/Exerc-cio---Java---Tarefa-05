package tarefa05;
import java.util.Scanner;
public class Exe11 {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

System.out.print("Digite o número da conta do cliente: ");
String numeroConta = scanner.nextLine();

System.out.print("Digite o saldo da conta: R$ ");
float saldo = scanner.nextFloat();
System.out.print("Digite o total de débitos: R$ ");
float debito = scanner.nextFloat();
System.out.print("Digite o total de créditos: R$ ");
float credito = scanner.nextFloat();

double saldoAtual = calcularSaldoAtual(saldo, debito, credito);

System.out.printf("O saldo atual da conta %s é: R$ %.2f\n", numeroConta, saldoAtual);

if (saldoAtual >= 0) 
{
System.out.println("Saldo Positivo");
} 
else 
{
System.out.println("Saldo Negativo");
}

	scanner.close();
}

public static double calcularSaldoAtual(double saldo, double debito, double credito) {
    return saldo - debito + credito;
}
}
