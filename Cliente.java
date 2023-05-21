//protected
package br.com.geekuniversity.secao11;
/*
 � o modificador default (padr�o)
 
 O modificador de acesso Protected faz com que o 
 elemento seja vis�vel somente dentro do mesmo pacote 
 onde o elemento foi declarado.
 */
public class Cliente implements Comparable{
	private int idade;
	private String nome;
	private String endereco;
	
	//Construtor
	public Cliente(int idade, String nome, String endereco) {
		this.idade = idade;
		this.nome = nome;
		this.endereco = endereco;
	}
	
	
	protected void dizer_oi() {
		System.out.println(this.nome + " Est� dizendo oi...");
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public String getEndereco() {
		return this.endereco;
	}
	
	@Override
	public String toString() {
		return this.nome;
	}


	@Override
	public int compareTo(Object outro) {
		Cliente aux = (Cliente)outro;
		if(this.idade < aux.idade){
			return -1;
		}else if(this.idade > aux.idade){
			return 1;
		}else {
			return 0;
		}
	}
}
