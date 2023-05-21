package br.com.geekuniversity.secao19;

import java.util.HashMap;
import java.util.Map;

import br.com.geekuniversity.secao11.Cliente;
import br.com.geekuniversity.secao11.Conta;

//HashMap
/*
 A classe HashMap implementa a interface Map e trabalha
 com chave/valor 
 Não aceita valores duplicados
  
 */
public class Programa49 {

	public static void main(String[] args) {
		
		Map<String, Conta> contas = new HashMap<String, Conta>();
		
		Cliente cli1 = new Cliente(18, "Luana", "Rua 1");
		Cliente cli2 = new Cliente(15, "Fadre", "Rua 2");
		
		Conta c1 = new Conta(1, 200, 300, cli1);
		Conta c2 = new Conta(2, 400, 700, cli2);
		
		contas.put("Pessoa física", c1);
		contas.put("Pessoa jurídica", c2);
		
		System.out.println(contas.size());
		
		System.out.println(contas.get("Pessoa física"));


	}

}
