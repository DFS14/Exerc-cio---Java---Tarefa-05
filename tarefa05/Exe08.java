package tarefa05;
import java.util.Scanner;
public class Exe08 {
public static void main(String[] args) {
	        
Scanner input = new Scanner(System.in);        
int horaInicio, horaFim, duracao;

System.out.println("Digite a hora de início do jogo (0-23):");
horaInicio = input.nextInt();

System.out.println("Digite a hora de fim do jogo (0-23):");
horaFim = input.nextInt();

if (horaInicio < horaFim) 
{            
	duracao = horaFim - horaInicio;
} 
else 
{
	duracao = (24 - horaInicio) + horaFim;
}

System.out.println("A duração do jogo foi de " + duracao + " hora(s).");

	    input.close();
	    }
}
