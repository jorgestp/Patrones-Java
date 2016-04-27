package Tuenti.Desafio1;

import java.util.LinkedList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		List<Integer> imput=new LinkedList<>();
		
		imput.add(6);
		
		Almuerzo almuezo=new Almuerzo();
		
		almuezo.calculoMesas(imput, 0);
		
		

	}

}
