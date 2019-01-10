
public class Produto {
	private int codigo;
	private String nome;
	private double precoCompra;
	private double precoVenda;
	
	/**
	 * @param codigo
	 * @param nome
	 * @param precoCompra
	 * @param precoVenda
	 */
	public Produto(int codigo, String nome, double precoCompra, double precoVenda) {
		this.codigo = codigo;
		this.nome = nome;
		this.precoCompra = precoCompra;
		this.precoVenda = precoVenda;
	}
	public Produto() {
		
	}
	//clone constructor
	public Produto (Produto p) {
		this(p.getCodigo(),p.getNome(),p.getPrecoCompra(),p.getPrecoVenda());
	}
	
	//getters and setters not configured with best practices
	
	public int getCodigo() {
		return codigo;
	}

	public String getNome() {
		return nome;
	}

	public double getPrecoCompra() {
		return precoCompra;
	}

	public double getPrecoVenda() {
		return precoVenda;
	}
	
	//funcionalidades ou metodos
	
	
	
	

}
