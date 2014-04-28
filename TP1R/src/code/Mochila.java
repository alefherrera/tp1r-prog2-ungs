package code;

import java.util.ArrayList;
import java.util.Arrays;

public class Mochila {

	private Integer maximo;
	private ArrayList<Integer> elementos;

	public Mochila(Integer[] elem, Integer max) {
		maximo = max;
		elementos = new ArrayList<Integer>(Arrays.asList(elem));
	}

	public ArrayList<ArrayList<Integer>> resolver_1a() {
		ArrayList<ArrayList<Integer>> solucion = new ArrayList<ArrayList<Integer>>();
		int numero = (int) (Math.pow(2, elementos.size()) - 1);
		int aux = 0;
		ArrayList<Integer> r;
		for (int i = 0; i < numero; i++) {
			aux++;
			r = binario_a_array(Integer.toBinaryString(aux));
			if (suma(r) == maximo)
				solucion.add(r);
		}
		return solucion;
	}

	public void resolver_1b() {
		resolver_1a();
	}

	// Suma todos los componentes de una lista
	public Integer suma(ArrayList<Integer> v) {
		Integer suma = 0;
		for (int i = 0; i < v.size(); i++) {
			suma += v.get(i);
		}
		return suma;
	}

	// Conversion de String del numero en binario a una lista
	public ArrayList<Integer> binario_a_array(String binario) {
		ArrayList<Integer> r = new ArrayList<Integer>();
		int max = binario.length() - 1;
		for (int i = max; i >= 0; i--) {
			if (binario.charAt(i) == '1')
				r.add(elementos.get(max - i));
		}
		return r;
	}

}