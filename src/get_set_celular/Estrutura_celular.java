package get_set_celular;

public class Estrutura_celular {
	
	private String modelo;
	private int ano_fabircacao;
	private int valor;
	
	
	public Estrutura_celular (String model, int ano_fabr) {
		
		this.setModelo(model);
		this.setAno_fabircacao(ano_fabr);
			
	}
	
	
	public String getModelo() {
			return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public int getAno_fabircacao() {
		return ano_fabircacao;
	}
	public void setAno_fabircacao(int ano_fabircacao) {
		this.ano_fabircacao = ano_fabircacao;
	}
	
	public int getValor() {
		return valor;
	}
	public void setValor(int valor) {
		this.valor = valor;
	}
	

	
	public void status() {
	
		System.out.println("O Modelo: " + getModelo());
		System.out.println("Fabricação: "+ getAno_fabircacao());
		System.out.println("O Valor: " + getValor());
	
	}
	
}
 