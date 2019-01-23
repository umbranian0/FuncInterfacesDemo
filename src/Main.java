import java.awt.List;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Ponto2D x = new Ponto2D(4, 5);

		Ponto2D p = new Ponto2D(4,8);
	
		//expressao lambda de validação7
		ValidarSegmento  vs = ab -> valido(ab);
		//validar pontos de um segmento de reta utilizando a functional interface ValidarSegmento
		SegmentoDeReta s = vs.valido(new SegmentoDeReta (x,p)) ?
				new SegmentoDeReta(x , p) : 
					new SegmentoDeReta ();
			
		System.out.println(s.toString());

		
	
		//exemplo de uma stream com filtros usando expressoes lambda
		//Stream é um iterador
		java.util.List<Integer> list = Arrays.asList(0,1,2,34,4,5,3);
		
		System.out.println(list.stream()
				.filter(Sample -> Sample % 2 == 0)
				.filter(Sample -> Sample >= 10)
		.findFirst()
		);
		
		
	}



	//Functional interface
	@FunctionalInterface
	public interface ValidarSegmento{
		boolean valido(SegmentoDeReta a );
	}
	//definição do metodo valido, para validar segmentos de Reta
	public static boolean valido(SegmentoDeReta a) {
		if(a.getA().getX() ==  a.getB().getX()
				&& a.getB().getY() == a.getA().getY())
			return false;
		return true;
		
	}
}

