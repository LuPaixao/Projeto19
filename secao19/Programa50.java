package br.com.geekuniversity.secao19;
//Mapas

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/*
 Os mapas s�o representados em Java pela interface Map
 e mapeia seus elementos utilizando o conceito chave/valor
 //KeySet retorna as chaves
  * 
  Mapas s�o conhecidos como se fossem ou representassem 3 cole��es
  	Cole��es de chaves, cole��es de valores, cole��es de associa��es
 */
public class Programa50 {
	
	public static void main(String[] args) {
		
		Map<Integer, String> pessoas = new HashMap<Integer, String>();
		
		pessoas.put(21, "Luana");
		pessoas.put(31, "Carlos");
		pessoas.put(44, "Pedro");
		
		//Cole��o de chaves
		//System.out.println("Chaves: " + pessoas.keySet());
		
		//Cole��o de valores
		//System.out.println("Valores: " + pessoas.values());
		
		//Cole��es de associa��es
		//System.out.println("Associa��o: " + pessoas.entrySet());
		
		
		//Forma 1
		//for disponibilizado a apartir do java8
		pessoas.keySet().forEach(idade ->{
			System.out.println(pessoas.get(idade));
		});
		
		
		//Forma 2
		//Iterar na cole��o de chaves
		Set<Integer> chaves = pessoas.keySet();
		for(Integer idade: chaves) {
			System.out.println(idade);
		}
		
		
		//Forma 1
		//Iterar na cole��o de valores
		Collection<String> valores = pessoas.values();
		for(String nome : valores) {									
			System.out.println(nome);
		}
		
		//Forma2
		pessoas.values().forEach(nome -> {
			System.out.println(nome);
		});
		
		//Iterar a cole��o de associa��es
		//Forma1
		Set<Entry<Integer, String>> associacoes = pessoas.entrySet();
		for(Entry<Integer, String> associacao: associacoes) {
			System.out.println(associacao.getKey() + " - " + associacao.getValue());
		}
		
		//Forma2
		pessoas.entrySet().forEach(associacao -> {
			System.out.println(associacao.getKey() + " - " + associacao.getValue());
		});
	}

}
