package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class NumeroAleatorio {
	List<Integer> numeros;
	Random r = new Random();
	Integer max;
	
	public NumeroAleatorio() {
		numeros =  new ArrayList<Integer>();
		preenche();
		max = 100;
	}
	public NumeroAleatorio(Integer max) {
		numeros =  new ArrayList<Integer>();
		preenche();
		this.max = max;
	}

	/*preenche uma lista com números de 0 a 100*/
	private void preenche() {
		for (int i = 0; i < max; i++) {
			numeros.add(i);
		}
	}

	/*retorna um valor de uma posição aleatória da lista*/
    public int gera() {
		return numeros.remove(r.nextInt(numeros.size()));
	}
	
	/*retorna um valor aleatório de 0 a size*/
	int gera(int size) {
		return r.nextInt(size);
	}
}
