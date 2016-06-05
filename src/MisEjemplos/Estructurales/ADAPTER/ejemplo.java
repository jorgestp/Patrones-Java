package MisEjemplos.Estructurales.ADAPTER;

public class ejemplo {

	private int m , n;
	
	public void f(){
		
		m = (m-2) % n;
		
		System.out.print(m + " ");
	}
	
	public void g(){
		
		int m = 0;
		int n= 8;
		int i = 0;
		
		while(i++<n){
			
			f();
		}
				
	}
	
}
