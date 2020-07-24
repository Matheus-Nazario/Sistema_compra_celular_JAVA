package get_set_celular;
import java.util.Scanner;

class Impressao_celular {

	public static void main(String[] args) {
		
		Estrutura_celular estr_cel = new Estrutura_celular("Iphone", 2020);
		Scanner val = new Scanner(System.in);
		
		System.out.println("Qual é o valor do celular? ");
		int valor_cel = val.nextInt();
		
		estr_cel.setValor(valor_cel);
		estr_cel.status();
	
	}

}
