package br.com.geekuniversity.secao19;

import java.util.ArrayList;
import java.util.Collections;

public class Programa46 {
	public static void main(String[] args) {
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		
		numeros.add(42);
		numeros.add(2);
		numeros.add(44);
		numeros.add(46);
		numeros.add(482);

		//System.out.println(numeros.get(0));
		
		Collections.sort(numeros);
		
		for(int i = 0; i < numeros.size(); i++) {
			System.out.println(numeros.get(i));
		}
	}

}
