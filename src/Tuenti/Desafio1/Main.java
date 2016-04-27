package Tuenti.Desafio1;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		List<Integer> imput=new LinkedList<>();
		
		imput.add(7);
		
		Almuerzo almuezo=new Almuerzo();
		
		
		
		List<Integer> salida=(List<Integer>) almuezo.calculoMesas(imput, 0);
		Iterator<Integer> it=salida.iterator();
		
		int pos=0;
		while(it.hasNext()){
			
			Integer i=it.next();
			pos++;
			System.out.println(" # Case " +  " ; " + i);
		}
			
		
		

	}

}
