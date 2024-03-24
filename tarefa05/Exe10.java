package tarefa05;
import java.util.Scanner;
public class Exe10 {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

System.out.print("Insira o salário fixo do vendedor: R$ ");
float salarioFixo = scanner.nextFloat();

System.out.print("Insira o valor total das vendas efetuadas pelo vendedor: R$ ");
float totalVendas = scanner.nextFloat();
double salarioTotal = calcularSalarioTotal(salarioFixo, totalVendas);

System.out.printf("O salário total do vendedor é: R$ %.2f%n", salarioTotal);

	scanner.close();
}

//******************************************************************************************************************

public static double calcularSalarioTotal(double salarioFixo, double totalVendas) {
	

	final double Limite_Comissao = 1500.00;
	final double Comissao_Baixa = 0.03; // 3%
	final double Comissao_Alta = 0.05; // 5%


double comissao;

if (totalVendas <= Limite_Comissao) 
{
comissao = totalVendas * Comissao_Baixa;
} 
else 
{
comissao = (Limite_Comissao * Comissao_Baixa) + ((totalVendas - Limite_Comissao) * Comissao_Alta);
}

		return salarioFixo + comissao;
	}
}



