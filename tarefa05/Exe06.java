package tarefa05;
import java.util.Scanner;
public class Exe06 {

public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
     
System.out.print("Digite o primeiro valor: ");
float valor1 = scanner.nextFloat();
    
System.out.print("Digite o segundo valor: ");
float valor2 = scanner.nextFloat();

 
 if (valor1 != valor2) 
{
 float maiorValor = valor1 > valor2 ? valor1 : valor2;
System.out.println("O maior valor é: " + maiorValor);
} 
 else 
{
System.out.println("Os valores não devem ser iguais.");
}

     scanner.close();
 }
}