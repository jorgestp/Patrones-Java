package MisEjemplos.Estructurales.COMPOSITE;

import java.util.ArrayList;

public class Composite implements ISueldo {

	private ArrayList<ISueldo> sueldos=new ArrayList<ISueldo>();
	
	public double getSueldo() {
		
		double sum=0;
		for(int i=0; i<sueldos.size(); i++){
			
			sum=sum + sueldos.get(i).getSueldo();
			
		}
		return sum;
	}

	public void agrega(ISueldo p){
		sueldos.add(p);
	}
}
