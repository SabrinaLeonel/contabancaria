package model;

public class ContaPoupanca extends Conta{

	private int aniversario;

	public ContaPoupanca(int numero, int agencia, int tipo, String titular, float saldo, int aniversario) {
		super(numero, agencia, tipo, titular, saldo);
		this.aniversario = aniversario;
	}

	public int getAniversario() {
		return aniversario;
	}

	public void setAniversario(int aniversario) {
		this.aniversario = aniversario;
	}
	
    @Override
	public void visualizar() {
		super.visualizar();
		System.out.println("Aniversário da conta: " + this.aniversario);
	}
    
    public boolean sacar(float valor) {
    	
        if (this.getSaldo() < valor) {
        	
            System.out.println("\n Saldo Insuficiente!");
            return false;
        }
        
        this.setSaldo(this.getSaldo() - valor);
        return true;
    }

    public void depositar(float valor) {
    	
        this.setSaldo(this.getSaldo() + valor);
    }
}