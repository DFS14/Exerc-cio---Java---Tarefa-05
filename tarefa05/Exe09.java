package tarefa05;
import java.util.Scanner;
public class Exe09 {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
    

System.out.print("Digite o número de horas trabalhadas no mês: ");
int horasTrabalhadas = scanner.nextInt();

System.out.print("Digite o salário por hora: ");
float salarioHora = scanner.nextFloat();

int jornadaSemanal = 40;
int jornadaMensal = jornadaSemanal * 4; 

double salarioTotal = calcularSalarioTotal(horasTrabalhadas, salarioHora, jornadaMensal);
System.out.printf("O salário total do funcionário é: R$ %.2f%n", salarioTotal);

scanner.close();
}

//**************************************************************************************************************

public static double calcularSalarioTotal(int horasTrabalhadas, double salarioHora, int jornadaMensal) {
double salarioRegular = Math.min(horasTrabalhadas, jornadaMensal) * salarioHora;


double salarioHorasExtras = 0;
if (horasTrabalhadas > jornadaMensal) {
int horasExtras = horasTrabalhadas - jornadaMensal;
salarioHorasExtras = horasExtras * salarioHora * 1.5; // 50% de acréscimo nas horas extras
}


// Calcular o salário total************************************************************************************

return salarioRegular + salarioHorasExtras;

	}
}
