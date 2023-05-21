package br.com.geekuniversity.secao19;

import java.util.ArrayList;
import java.util.Collections;

/*
 ARRAYS 
 
- Um array tem um tamanho fixo. Ou seja,  se criarmos um array com 5 elementos ele ter�
  sempre no m�ximo 5 elementos.
  
 - Um array tem tipo de dado fixo. Ou seja, se crarmos um aaray de interiros ele 
  s� podera ter interiros.
  
 - � dif�cil encontrar um determinado elemento de um array. Precisamos para isso
 varrer todo o array atrav�s do seu �ndice, caso n�o fa�amos busca peli �ndice. 
  
 */

//Colections (cole��es)
/*
  - Java possui diversas classes/interea��es que facilitam muito o trabalho quando
  se trata de cole��es de dados. Essas clases/interfaces s�o chamadas de collections
  ou cole��es.
 */

//Listas
/*
 - Aceitam repeti��o de valores
 - Possuem tamanho 'infinito' (depende da mem�ria)
 - Podemos adicionar objetos de qualquer tipo ou valores
 - Se eu definir o tipo da lista "<String>", toda a lista ir� tetr que ser String
 - for each for(String nome : nomes) {
			System.out.println(nome);
				}
- Collections.sort(nomes); Ordena por odem alfab�tica	
			
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
		
		Collections.sort(nomes);//Ordena por odem alfab�tica
		
		for(String nome : nomes) {
			System.out.println(nome);
		}

		
	}
	
}
