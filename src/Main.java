import java.util.Comparator;

public class Main {
	
//	Runnable r  = new Runnable() {
//	public void run() {
//		System.out.println("Running");
//	}
//	};

		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		Ponto2D p = new Ponto2D(0,0);
			
		Ponto2D x = new Ponto2D(0,0);
		
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
		
		Compara <Ponto2D> comparador = ( a,b ) -> a.compara(a,b);
		
		
		System.out.println(comparador.compara(p, x));
		
		Ponto3D p3d1 = new Ponto3D(1.1,2.2 , 3.3);
		Ponto3D p3d2 = new Ponto3D(1.1,2.2 , 3.3);
		
		System.out.println(comparador.compara(p3d1, p3d2));
	
	
	}
	


}

