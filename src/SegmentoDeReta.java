
// https://www.todamateria.com.br/segmento-de-reta/
// https://www.matematica.pt/geogebra/9-ano-declive-reta-2.php

//estrutura --> é definida na classe do objeto, sendo essa classe igual para todos os objetos do tipo
//estado --> é a definição do estado que objeto está

//Encapsulamento
//o encapsulamento, serve para proteger as variaveis, e de forma a não depender das variaveis
//monta-se , 1º declaramos as variaves como privadas, 2º vamos aos get e sets, 3º temos que pensar nas referencias que os getters mandam.
//"nao permitir cavalor de troia, nao enviar referencias"

//Separar camadas computacionais
//separaão de camadas, nao devemos fazer prints num metodo

//uso de variaveis / metodo ESTATICOS
//para definir um atributo ESTATICO, a sua atribuição é feita utilizando o nome da class 
//ex: Ponto2D.setX(3), sendo ele partilhado para os outros obejtos
//um metodo estatico não pode usar campos das instancias, agora um objeto pode utilizar metodos estaticos
//uma classe com metodos estáticos pode ser utilizada sem criar objetos da classe.

//variaveis de instancia
//

//private 
//pode ser acedido a partir de um metodo publico

public class SegmentoDeReta implements GetComprimento {

	// ATRIBUTOS

	private Ponto2D a, b;  // 2 pontos
	
	// ACESSORES

	// ---- Nota: matematicamente, num segmento de reta nao faz sentido  
	// ---- falar de origem e destino. Por isso mantem-se a designacao a e b.
	
	public Ponto2D getA() {
		return a.clonePoint(a); // retorna um ponto
	}

	public Ponto2D getB() {
		return b.clonePoint(b);  // retorna o outro ponto
	}

	// CONSTRUTORES
	
	// ----> com parâmetros
	public SegmentoDeReta(Ponto2D a, Ponto2D b) {
		super();
		this.a = new Ponto2D();
		this.b = new Ponto2D();
		this.a.setX(a.getX()); this.a.setY(a.getY());
		this.b.setX(b.getX()); this.b.setY(b.getY());
	}
	
	// ----> default
	public SegmentoDeReta() {
		this(new Ponto2D(), new Ponto2D());
	}
	
	// ----> cópia
	public SegmentoDeReta(SegmentoDeReta p) {
		this(p.getA(), p.getB());
	}
	

	// COMPORTAMENTOS
	
	public double comprimento() {
		return Math.sqrt(Math.pow((a.getX() - b.getX()),2) + 
				         Math.pow((a.getY() - b.getY()),2));
	}
	
	public double declive() {
		/* https://brainly.com.br/tarefa/220376 */
		return (a.getY() - b.getY()) / (a.getX() - b.getX());
	}

	
	public boolean consecutivos(SegmentoDeReta s) {
		//Segmentos Consecutivos: quando possuem um ponto em comum
		return a.equals(s.getA()) || a.equals(s.getB()) ||
			   b.equals(s.getA()) || b.equals(s.getB());
	}
	
	public boolean colineares(SegmentoDeReta s) {
		// nao implementado
		return false;
	}
	
	public boolean congruentes(SegmentoDeReta s) {
		// Segmentos Congruentes: quando dois segmentos apresentam a mesma medida
		return this.comprimento() == s.comprimento();
	}
	
	
	public boolean adjacentes(SegmentoDeReta s) {
		// nao implementado
		return false;
	}
	
	public Ponto2D pontoMedio() {
		/* https://pt.wikipedia.org/wiki/Ponto_m%C3%A9dio */
		return new Ponto2D((a.getX()+b.getX())/2,
						   (a.getY()+b.getY())/2);
	}
	
	public boolean paralelos(SegmentoDeReta s) {
		return this.declive() == s.declive();
	}

	
	// MÉTODOS COMPLEMENTARES

	// ----> toString()

	@Override
	public String toString() {
		//retirar o "\n" no toString() do Ponto2D
		return "["+a.toString() + "," + b.toString()+"]";
	}
	// ----> clone()
	public SegmentoDeReta clone() {
		return new SegmentoDeReta(this);
	}
	
	// ----> equals()
	public boolean equals(SegmentoDeReta s) {
		if (s != null) 
			return a.equals(s.getA()) && b.equals(s.getB())  ||
				   a.equals(s.getB()) && b.equals(s.getA());
		else return false;
	}

	@Override
	public double comprimento(Object r) {
		// TODO Auto-generated method stub
		return comprimento();
	}
}
