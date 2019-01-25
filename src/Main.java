import java.awt.List;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

public class Main {

	public static void main(String[] args) {
		Ponto2D p1 = new Ponto2D(1,1);
		Ponto2D p2 = new Ponto2D(2,3);
		
		//EXERCICIO UM - Mover Ponto - Já Resolvido
		//SEM EXPRESSOES LAMBDA
		System.out.println(" ------------ Exercicio 1 ------------");
		System.out.println("Valores Originais de P1: "+p1.toString());
		System.out.println("Valores Originais de P2: "+p2.toString());
		
		System.out.println("Valores do ponto P1 após substração (1,3)"+ substractValues(p2, 1,3).toString());
		System.out.println("Valores do ponto P2 após adição (1,2)"+ addValues(p1,1,2).toString());
		
		System.out.println(" ------------ Final Exercicio 1 ------------");
		//EXERCICIO DOIS - Somar Coordenadas de Ponto
		Ponto2D a = new Ponto2D(4, 5);
		Ponto2D b = new Ponto2D(4,8);
		//Função Lambda para somar coordenadas de um ponto
		//a outro ponto
		
		Ponto2D sumCoordenadasPOO = somarPonto(a,b);
		System.out.println(sumCoordenadasPOO.toString());
		
		//UTILIZAÇÃO DE EXPRESSÃO LAMBDA
		Ponto sumCoordenadas = (aL , bL) -> somarPonto(aL, bL);
		System.out.println(sumCoordenadas.somarPonto(a, b));		
		
		
		//validar pontos de um segmento de reta utilizando a functional interface ValidarSegmento
		//expressao lambda de validação7
	//	ValidarSegmento  vs = ab -> valido(ab);
	//	SegmentoDeReta s = vs.valido(new SegmentoDeReta (x,p)) ?
//						new SegmentoDeReta(x , p) : 
//							new SegmentoDeReta ();	
//				System.out.println(s.toString());
	}
	
	
	public static Ponto2D addValues(Ponto2D p1, double toX, double toY) {
		return new Ponto2D (p1.getX()+toX,
		p1.getY()+toY);
	}
	
	public static Ponto2D substractValues(Ponto2D p1, double toX, double toY) {
		return new Ponto2D (p1.getX()-toX,
		p1.getY()-toY);
	}
	
	@FunctionalInterface
	public interface Ponto {
		
		Ponto2D somarPonto ( Ponto2D a, Ponto2D  b);

	};

	public static Ponto2D somarPonto(Ponto2D a, Ponto2D b) {
		return new Ponto2D (a.getX()+b.getX()
		, a.getY() + b.getY());
	};

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

