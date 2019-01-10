
public class Ponto2D implements Compara{

	//Variables
	//utilidades do encapsulamento e não afectar as dependencias
	private double x;
	private double y;
	
	
	//Constructor
		//constructor default
	public Ponto2D() {
		//this(0.0,0.0);
		//this.setX();
	}
		//constructor with new variables/parameters, defining the dot
	public Ponto2D(double newX, double newY) {
		
	this.x = newX;
	this.y = newY;
	
	}
	
		//constructor for cloning
	public Ponto2D(Ponto2D p) {
		
	this.x = p.getX();
	this.y = p.getY();
//	setY(p.getY());
	}
	//acessores
	
	
	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double d) {
		//if(d <= 10) //defining condition to the setter
		this.y = d;
	}

	//comportamentos/metodos
	//a) Mover o ponto relativamente à sua posição original somando ou subtraindo às suas coordenados valores dados; 
		public void addValues (double toX , double toY) {
			this.x += toX; this.y += toY;
			//this.addValues(-toX, -toY);
		}
		public void subtractValues (double toX , double toY) {
			this.x -= toX; this.y -= toY;
		}
		// simple methods to add and subtract
		public void addY( double addY ) {
			this.y = y + addY;
		}
		
		public void addX(double addX) {
			this.x = x + addX;
		}
		
		public void removeY( double removeY ) {
			this.y = y - removeY;
		}
		
		public void removeX(double removeX) {
			this.x = x - removeX;
		}
	//b) Somar às coordenadas de ponto valores dados; 
	public void sumToCoordenates(Ponto2D p ) {
		this.addX(p.getX());
		this.addY(p.getY());
	}
	
	//C c) Somar as coordenadas do ponto dado às coordenadas dum ponto dado e devolver um novo ponto. 
	
	public Ponto2D p (Ponto2D p1, Ponto2D p2) {
		//criam um ponto novo
		Ponto2D p = new Ponto2D();
		//adding p1 X and Y to the new point
		p.addX( p1.getX() + p2.getX());
		p.addY( p1.getY() + p2.getY());
		
		return p;
	}
	
	//d) Determinar se o ponto é simétrico (i.e., se dista do eixo dos XX o mesmo que do eixo dos YY). 
	
	public boolean isSimetric() {
		boolean n;
		
		if (this.getX() == this.getY()) {
			n = true;
		}
		else {
			n = false;
		}
		
		return n;
	}
	//e) Verificar se ambas as coordenadas são positivas
	public boolean isPositive(Ponto2D p) {
		
		boolean n ;
		
		if(p.getX() > 0 && p.getY()>0) {
			n = true;
			
			//int o = 1;
		//o = this.getQuadrant(p);
		}
		else
			n = false;
		
		return n;
	}
	
	//f) Determinar a que quadrante pertence o ponto; 
	public int getQuadrant (Ponto2D p) {
		int quadrant;
		
		if( p.getX() > 0 && p.getY() > 0 )
			quadrant = 1;
		
		else if( p.getX() < 0 && p.getY() > 0 )
			quadrant = 2;
		
		else if ( p.getX() < 0 && p.getY() < 0 )
			quadrant = 3;
		
		else if ( p.getX() > 0 && p.getY() < 0 )
			quadrant = 4;
		else
			quadrant = 0;
		
		return quadrant;
		
	}
	
	//g) Criar os métodos complementares usuais: 
		//g.1. Verificar se 2 pontos são iguais.  
	public boolean isEqual (Ponto2D x) {
		boolean b;
		
		if(this.getX() == x.getX() && this.getY() == x.getY())
			b = true;
		else 
			b = false;
		
		return b;
	}
		//g.2. Converter o ponto para uma representação textual. 
	
	public void writePoint() {
		System.out.println(" X = " + this.getX() + ", Y" + this.getY());
	}
	
		@Override
	public String toString() {
		return "Ponto2D [x=" + x + ", y=" + y + "]";
	}
		
	//g.3. Criar uma cópia do ponto original.
	//podemos utilizar o contrutor de clone para o fazer
	public Ponto2D clonePoint(Ponto2D p) {
		
		Ponto2D clone = new Ponto2D(p);
	
		return clone;
	}
	
	//Functional interface
	@Override
	public boolean compara(Object a, Object b) {
		// TODO Auto-generated method stub
		return ((Ponto2D) a).isEqual((Ponto2D)b);
	}
	
	//h) Produzir a documentação sobre a classe Ponto2D 
	//done
	
	
}
