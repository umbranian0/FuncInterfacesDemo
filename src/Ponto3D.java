
public class Ponto3D extends Ponto2D{
//	atributos

	//variaveis de instancia
	private double z;
	
	//variaveis de classe ( variaveis globais?)
	
	
	//construtores
	public Ponto3D() {
		super();
		
		// TODO Auto-generated constructor stub
	}

	public Ponto3D(double newX, double newY, double newZ) {
		super(newX, newY);
		this.z = newZ;
		// TODO Auto-generated constructor stub
	}

	public Ponto3D(Ponto3D p) {
		this(p.getX(), p.getY(), p.getZ());
		// TODO Auto-generated constructor stub
	}

	//acessores
	public double getZ() {
		return z;
	}

	public void setZ(double z) {
		this.z = z;
	}


	//metodos
	
	
	
	//to string
	@Override
	public String toString() {
		
		//a chamada do super vai trazer o to string da classe mae, tranzendo mensagens nao coerentes para a classe filho
		return super.toString() 
				+ "Ponto3D [z=" + z + "]";
	}
}
