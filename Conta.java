package br.com.geekuniversity.secao11;

public class Conta {
	private int numero;
	private float saldo; 
	private float limite;
	private Cliente cliente;
	
	public Conta(int numero, float saldo, float limite, Cliente cliente){
		this.numero = numero;
		this.saldo = saldo;
		this.limite = limite;
		this.cliente = cliente;
	}
	
	public Conta() {}
	
	
	//100
	//50
	//this.saldo = this.saldo - valor
	//50
	public void sacar(float valor) {
		if(valor <= this.saldo) {	
			this.saldo = this.saldo - valor;
			System.out.println("Saque foi realizado com sucesso!");
		}else if(valor <= (this.saldo + this.limite)){
			//calculadndo o valor excedente do saque
			//100 - 200 = -100
			float val_ret = this.saldo - valor;	
			if(val_ret < 0) {
				this.saldo = 0;
			}
			//System.out.println("Limite " + this.limite + "_ Val_ret " + val_ret);
			val_ret = this.limite + val_ret;
			this.limite = val_ret;
			System.out.println("Saque foi realizado com sucesso!");
		}else {
			System.out.println("Saldo insuficiente");
		}
		
	}	
	
	
	/**
	 * Método para realizar deposito
	 * 
	 * @param valor a ser depositado
	 */
	//Forma 1
//	public void depositar(float valor) {
//		synchronized (this) {
//			this.saldo = this.saldo + valor;
//		}	
//	}
	
	//Forma 2
	public   synchronized void depositar(float valor) {
		this.saldo = this.saldo + valor;
	}
	
	//Método getter do atributo saldo
	/**
	 * Método getter do atributo saldo
	 * 
	 * @return a soma do saldo + limite
	 */
	public float getSaldo() {
		return this.saldo + this.limite;
	}
	
	@Override
	public String toString() {		
		return "O saldo da conta é: " + this.getSaldo();
	}
	
	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Conta)) {
			return false;
		}else {
			Conta verificar = (Conta) obj;
			return verificar.getSaldo() == this.getSaldo();
		}
		
	}

}
