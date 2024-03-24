package tarefa05;
import java.util.Scanner;
public class Exe04 {
	
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
	        
	        
System.out.println("Calculando a Média");
	        
 System.out.print("Digite a nota da 1ª avaliação: ");
 float nota1 = scanner.nextFloat();
 
 System.out.print("Digite a nota da 2ª avaliação: ");
 float nota2 = scanner.nextFloat();

 float media = (nota1 + nota2) / 2;
 String resultado = media >= 6 ? "aprovado" : "não aprovado";

 
 
System.out.printf("A média do aluno é: %.2f. O aluno %s.%n", media, resultado);



	scanner.close();
    }
}
