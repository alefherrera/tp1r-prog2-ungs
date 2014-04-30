package code;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		Testeo1();
		Testeo2();
		//Testeo3();
	}
	
	public static void Testeo1()
	{
		Integer[] v = {1,2,3,4,5};
		Mochila mochila = new Mochila(v,10);
		ArrayList<ArrayList<Integer>> solucion1 = mochila.resolver_1a();
		System.out.println(solucion1.toString());
	}
	
	public static void Testeo2()
	{
		Integer[] v = {1,2,3,4,7,8,10,12,35,57,68};
		Mochila mochila2 = new Mochila(v,30);
		ArrayList<ArrayList<Integer>> solucion2 = mochila2.resolver_1a();
		System.out.println(solucion2.toString());
	}
	
	public static void Testeo3()
	{
		Integer[] extenso = new Integer[30];

		for (int i = 0; i < extenso.length; i++) extenso[i] = i;

		Mochila mochilaGrande = new Mochila (extenso, 40);
		ArrayList<ArrayList<Integer>> solucion3;
		long tI = System.currentTimeMillis();
		solucion3 = mochilaGrande.resolver_1a();
		long tF = System.currentTimeMillis();
		System.out.println((tF - tI) / 1000);
		System.out.println(solucion3.toString());
	}

}
