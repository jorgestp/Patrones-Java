package Tuenti.Desafio1;

import java.awt.image.ImageProducer;
import java.util.*;

public class Almuerzo {
	
	
	
	private final int par=2;
	private final int impar=3;
	
	public Almuerzo(){
		
		
		
	}
	
	
	
	public  Collection<Integer> calculoMesas(List<Integer> input, int pos){
		
		List<Integer> exit=new LinkedList<>();
		
		int num=0;
		if(input.isEmpty()){
			
			
			throw new IllegalArgumentException("Imput está vacío");
		}
		
		if(pos>input.size()){
			
			return exit;
		}
		
		if(diferencia(input.get(pos))){
			
			int numMesas;
			
			numMesas= numMesasPar(input.get(pos));
		
			exit= (List<Integer>) calculoMesas(input, pos+1);
			
			exit.add(numMesas);
			
			return exit;
			
		}else{
			
				num++;
				
				num=num + numMesasPar(numMesasImpar(input.get(pos)));
				
				exit= (List<Integer>) calculoMesas(input, pos+1);
				
				return exit;
	
			
		}
			
	
	}
	
	
	private int numMesasPar(int comensales){
		
		
		
		return (comensales/par)-1;
	}
	
	private boolean diferencia(int comensales){
		
		return (((comensales)&par))==0;
	}
	
	private int numMesasImpar(int comensales){
		
		return comensales-impar;
	}

}
