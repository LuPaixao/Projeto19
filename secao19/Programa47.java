package br.com.geekuniversity.secao19;

import java.util.ArrayList;
import java.util.Collections;

import br.com.geekuniversity.secao11.Cliente;

public class Programa47 {

	public static void main(String[] args) {
		ArrayList<Cliente> clientes = new ArrayList<Cliente>();
		
		Cliente cli1 = new Cliente(23, "Roberto", "Rua 0");
		Cliente cli2 = new Cliente(45, "Robson", "Rua 2");
		Cliente cli3 = new Cliente(12, "Luana", "Rua 1");
		
		clientes.add(cli1);
		clientes.add(cli2);
		clientes.add(cli3);
		
		Collections.sort(clientes);
		
		for(Cliente cliente : clientes) {
			System.out.println(cliente);
		}
	}
}
