package entities;

public class Banco {
	
	private int numeroConta;
	private String nome;
	private double value;
	
	public Banco(int numeroConta, String nome, double inicialDeposit) {
		this.numeroConta = numeroConta;
		this.nome = nome;
		depositar(inicialDeposit);
	}
	
	public Banco(int numeroConta, String nome) {
		this.numeroConta = numeroConta;
		this.nome = nome;
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getValue() {
		return value;
	}
	
	public void depositar(double value) {
		this.value += value;
	}
	
	public void retirar(double value) {
		this.value -= value + 5;
	}

	public String toString() {
		return numeroConta + ", Holder: " + nome + ", Balance: $ " + String.format("%.2f", value);
	}
}
