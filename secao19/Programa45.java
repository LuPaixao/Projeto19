package br.com.geekuniversity.secao19;

import java.util.ArrayList;
import java.util.Collections;

/*
 ARRAYS 
 
- Um array tem um tamanho fixo. Ou seja,  se criarmos um array com 5 elementos ele terá
  sempre no máximo 5 elementos.
  
 - Um array tem tipo de dado fixo. Ou seja, se crarmos um aaray de interiros ele 
  só podera ter interiros.
  
 - É difícil encontrar um determinado elemento de um array. Precisamos para isso
 varrer todo o array através do seu índice, caso não façamos busca peli índice. 
  
 */

//Colections (coleções)
/*
  - Java possui diversas classes/intereações que facilitam muito o trabalho quando
  se trata de coleções de dados. Essas clases/interfaces são chamadas de collections
  ou coleções.
 */

//Listas
/*
 - Aceitam repetição de valores
 - Possuem tamanho 'infinito' (depende da memória)
 - Podemos adicionar objetos de qualquer tipo ou valores
 - Se eu definir o tipo da lista "<String>", toda a lista irá tetr que ser String
 - for each for(String nome : nomes) {
			System.out.println(nome);
				}
- Collections.sort(nomes); Ordena por odem alfabética	
			
 */

public class Programa45 {

	public static void main(String[] args) {
		//ArrayList nomes = new ArrayList();Sem definirmos o tipo de dado, colocar qualquer tipo
		ArrayList<String> nomes = new ArrayList<String>(); //Definimos o tipo de dado
		nomes.add("Maria");
		nomes.add("Albuquerque");
		nomes.add("Angelina");
		nomes.add("Geek");
		nomes.add("Maria");
		
//		nomes.add(44);		
//		nomes.add(true);		
//		nomes.add(12.4);		
//		nomes.add('e');
		
		//System.out.println(nomes.get(0));
		//System.out.println(nomes.get(3));
		
		//System.out.println(nomes.size());
		
//		for(int i = 0; i < nomes.size(); i++) {
//			System.out.println(nomes.get(i));
//		}
		
		Collections.sort(nomes);//Ordena por odem alfabética
		
		for(String nome : nomes) {
			System.out.println(nome);
		}

		
	}
	
}
