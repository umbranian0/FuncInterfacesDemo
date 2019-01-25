import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class MainExercicio {

	public static boolean ePar(int numero) {
		return  numero % 2 == 0 ;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// o problema consiste em analisar um conjunto de dados,
		//pretendendo-se obter o primeiro numero inteiro positivo, par 
		
		//Modelo tradicional com codigo imperativo
		//Modelo 1
		
		
		// Modelo 2
		List<Integer> lista = Arrays.asList(0 , 3 , -5 , 8, -9 , 10 );
		
		System.out.println(
				lista.stream()
		.filter(Sample -> Sample > 0)
		.filter(Sample -> ePar(Sample))
		.findFirst());
		
		//validar pontos de um segmento de reta utilizando a functional interface ValidarSegmento
		//expressao lambda de validação7
	//	ValidarSegmento  vs = ab -> valido(ab);
	//	SegmentoDeReta s = vs.valido(new SegmentoDeReta (x,p)) ?
//						new SegmentoDeReta(x , p) : 
//							new SegmentoDeReta ();	
//				System.out.println(s.toString());
	}


	public interface Validar {
		
		public static boolean ePar(int i) {
			return i % 2 == 0 ;
		};
		public static boolean MaiorQueZero (int i) {
			return i > 0 ;
		};
	}

}
