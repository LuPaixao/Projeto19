package br.com.geekuniversity.secao19;

import java.util.Collection;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

//Conjuntos
/*
 - Os conjuntos s�o implementados com a interface Set, e uma das calsses
 que implementamos esta interface � a HashSet 
 A maioria das cole��es possuem os mesmos m�todos j� conhecidos 
 e utilizados com a listas, mas os comportamentos desses objetos
 � um pouco diferente
 
 A perfomance tamb�m � melhor em conjuntos do que em listas
 
 Caracteristicas dos conjuntos: 
 
- Conjuntos n�o aceitam repeti��o de valores ou itens
- A ordem de inser��o n�o � respeitada
- N�o aceita ordena��o
-N�o possue indice
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
				System.out.println("O nome n�o pode ser repetido.");
				i--;
			}
		}
		
		System.out.println("N conjunto nomes temos " + nomes.size() + " elemnetos.");
		
		for(String nome : nomes) {
			System.out.println(nome);
		}
		
		teclado.close();
		
		//System.out.println(nomes.add("Marcio"));//dar false pq j� existe

//		System.out.println(nomes.contains("Maria"));
//		
//		for(String nome : nomes) {
//			System.out.println(nome);
//		}
	}
}
