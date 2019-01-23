
public class MainInterfacesFuncionaisComLambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//implementação da validação utilizando POO
		Ponto2D x1 = new Ponto2D(4, 5);
		Ponto2D p1 = new Ponto2D(4, 5);
		
		System.out.println("ponto x = " + x1.getX() + " y = " + x1.getY());
		System.out.println("ponto x = " + p1.getX() + " y = " + p1.getY());
		
		//metodo tradicional utilizando o metodo que o objeto têm definido na classe
		
		System.out.println(p1.comparaClasse(x1));
		
		
		//comparar pontos utilizando Expressão lambda 
		IsValid <Ponto2D> validaPonto = (x, y) -> pontoValido(x,y);
		
		validaPonto.valido(4, 5);
		
		
		//implementação da validação utilizando POO
		Ponto2D x = new Ponto2D(validaPonto.valido(4, 5));
		Ponto2D p = new Ponto2D(validaPonto.valido(4, 5));
		
		System.out.println(x.toString());
		System.out.println(p.toString());
		
		//comparador simples de classes 
		Compara <Ponto2D> comparadorClasses = ( a , b ) -> comparaClasses(a,b);
		
		//Podemos comparar diferentes tipos de objetos, como Pontos2D (construidos anteriormennte)
		System.out.println(comparadorClasses.compara(p, x));
	
		//Ou comparar Pontos3D, esta função e muito simples mas podia ser mais rubusta e servir mais interfaces
		Ponto3D p3d1 = new Ponto3D(1.1, 2.2 , 3.3);
		Ponto3D p3d2 = new Ponto3D(1.1, 2.2 , 3.3);

		System.out.println(comparadorClasses.compara(p3d1, p3d2));
		
		
	}
	//Functional interface
	@FunctionalInterface
	public interface IsValid<Obj>{
		Ponto2D valido(int a, int b);
	}
	
	public static Ponto2D pontoValido(int a, int b) {
		if(a != 0 ||  b != 0)
		return  new Ponto2D( a, b) ;
		
		return new Ponto2D();
	}
	

	public static boolean comparaClasses(Object a, Object b) {
		return a.getClass() == b.getClass();
		
	}
}
