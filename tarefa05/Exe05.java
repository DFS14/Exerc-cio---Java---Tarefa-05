package tarefa05;
import java.util.Scanner;
public class Exe05 {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

int anoAtual = 2024; 

java.time.Year.now().getValue();

               
System.out.print("Digite o ano de nascimento: ");
int anoNascimento = scanner.nextInt();
int idade = anoAtual - anoNascimento;
    
if ((anoAtual - anoNascimento) >= 18) 
    {
  System.out.println("Você pode votar este ano.");
    } 
else 
    {
  System.out.println("Você não pode votar este ano.");
    }
    
System.out.println("A idade do eleitor é: " + idade + " anos.");

    scanner.close();
    }
}