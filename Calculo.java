import java.util.Scanner;
public class  Calculo {

public static void main(String[] args) {
	
	int n1;
	int n2;
	
	String  operacao = "";
	
	int control=0;
	
	Scanner entrada = new Scanner(System.in);
	
	System.out.print("Digite a operação desejada (+, -, *, /): ");
	
	operacao = entrada.nextLine();

	System.out.println("Digite um valor: ");

	n1 = Integer.parseInt(entrada.nextLine());

	System.out.println("Digite um valor: ");

	n2 = Integer.parseInt(entrada.next());
	}
}