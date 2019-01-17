import java.awt.List;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
	
//	Runnable r  = new Runnable() {
//	public void run() {
//		System.out.println("Running");
//	}
//	};

		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		//validar pontos 
		IsValid <Ponto2D> i = (x, y) -> pontoValido(x,y);
		
		Ponto2D x = new Ponto2D(i.valido(4, 5));
			
		System.out.println(x.toString());
		
		Ponto2D p = new Ponto2D(4,8);
		
		
		
		//expressao lambda de validação7
		ValidarSegmento  vs = ab -> valido(ab);
		//validar pontos de um segmento de reta utilizando a functional interface ValidarSegmento
		SegmentoDeReta s = vs.valido(new SegmentoDeReta (x,p)) ?
				new SegmentoDeReta(x , p) : 
					new SegmentoDeReta ();
		
		
		System.out.println(s.toString());
		//x.addValues(-5, -3);
//		
//		System.out.println("ponto x = " + p.getX() + " y = " + p.getY());
//		
//		System.out.println(p.equals(x));
//		
//		System.out.println(p.isEqual(x));
//		
//		SegmentoDeReta r = new SegmentoDeReta(x,p);
//		
//		System.out.println(p.compara(x,p));
//		
		//comparador simples de classes 
		Compara <Ponto2D> comparador = ( a , b ) -> comparaClasses(a,b);
		
		//Podemos comparar diferentis tipos de objetos como Pontos2D (construidos anteriormennte)
		System.out.println(comparador.compara(p, x));
		//Ou comparar Pontos3D, esta função e muito simples mas podia ser mais rubusta e servir mais interfaces
		Ponto3D p3d1 = new Ponto3D(1.1,2.2 , 3.3);
		Ponto3D p3d2 = new Ponto3D(1.1,2.2 , 3.3);
		
		System.out.println(comparador.compara(p3d1, p3d2));
	
	
		//exemplo de uma stream com filtros usando expressoes lambda
		java.util.List<Integer> list = Arrays.asList(0,1,2,34,4,5,3);
		
		System.out.println(list.stream()
				.filter(Sample -> Sample % 2 == 0)
				.filter(Sample -> Sample >= 10)
		.findFirst()
		.get());
		
	}
	
	public static boolean comparaClasses(Object a, Object b) {
		// TODO Auto-generated method stub
		return a.getClass() == b.getClass();
	}

	public interface IsValid<Obj>{
		Ponto2D valido(int a, int b);
	}
	
	public static Ponto2D pontoValido(int a, int b) {

		
		if(a != 0 ||  b != 0)
		return new Ponto2D(a,b) ;
		
		return new Ponto2D();
	}
	
	public interface ValidarSegmento{
		boolean valido(SegmentoDeReta a );
	}
	public static boolean valido(SegmentoDeReta a) {
		if(a.getA().getX() ==  a.getB().getX()
				&& a.getB().getY() == a.getA().getY())
			return false;
		return true;
		
	}
}

