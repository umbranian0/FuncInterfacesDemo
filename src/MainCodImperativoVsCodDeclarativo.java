import java.util.stream.IntStream;

public class MainCodImperativoVsCodDeclarativo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Problema? Validar se um numero é primo
		System.out.println(ePrimo(1));
		System.out.println(ePrimo(3));
		
		
		//Exemplo de codigo funcional
		
	}
	/*
	public static boolean ePrimo(int num) {
		for(int i = 2 ; i < num ; i++)
			if(num % i == 0)
				return false;
		return num >1 ;
	}
	*/
	public static boolean ePrimo(int num) {
		//imutavilidade do codigo
		return num > 1 &&
				IntStream.range(2,num) // expressão que define o indice de começo, e final no numero introduzido
				.noneMatch( Index -> num % Index == 0); //Expressão lambda de verificação
	}
}
