package br.com.geekuniversity.secao19;

import java.util.Collection;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

//Conjuntos
/*
 - Os conjuntos são implementados com a interface Set, e uma das calsses
 que implementamos esta interface é a HashSet 
 A maioria das coleções possuem os mesmos métodos já conhecidos 
 e utilizados com a listas, mas os comportamentos desses objetos
 é um pouco diferente
 
 A perfomance também é melhor em conjuntos do que em listas
 
 Caracteristicas dos conjuntos: 
 
- Conjuntos não aceitam repetição de valores ou itens
- A ordem de inserção não é respeitada
- Não aceita ordenação
-Não possue indice
 */

public class Programa48 {
	public static void main(String[] args) {
		Set<String> nomes = new HashSet<String>();
		Scanner teclado = new Scanner(System.in);
		boolean res;
		
//		nomes.add("Maria");
//		nomes.add("Felicite");
//		nomes.add("Ronaldo");
//		nomes.add("Marcio");
//		nomes.add("Cobra");
		
		for(int i = 0; i < 5; i++) {
			System.out.println("Informe o " + (i + 1) + "/5 nome: ");
			String nome = teclado.nextLine();
			res = nomes.add(nome);
			if(!res) {
				System.out.println("O nome não pode ser repetido.");
				i--;
			}
		}
		
		System.out.println("N conjunto nomes temos " + nomes.size() + " elemnetos.");
		
		for(String nome : nomes) {
			System.out.println(nome);
		}
		
		teclado.close();
		
		//System.out.println(nomes.add("Marcio"));//dar false pq já existe

//		System.out.println(nomes.contains("Maria"));
//		
//		for(String nome : nomes) {
//			System.out.println(nome);
//		}
	}
}
