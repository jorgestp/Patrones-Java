package MisEjemplos.Estructurales.FLYWEIGHT;

public class Main {

	
	static int var1=3;
	static int var2;
	 
	public static void main(String[] args) {

//		 double promedioAlumno=6;
//		 
//		 String [] nombre={"Juan","Maxi","Pedro"};
//		 String [] apellido={"Perez", "Fernandez", "Ruiz"};
//		 double promedio[]={6,8,9};
//		 
//		 Alumno alumno=new Alumno(promedioAlumno);
//		 
//		 for(int i=0; i<nombre.length; i++){
//			 
//			 alumno.setNombre(nombre[i]);
//			 alumno.setApellido(apellido[i]);
//			 alumno.setPromedio(promedio[i]);
//			 
//			 System.out.println(nombre[i] + " " + alumno.compara());
//		 }
		 
		 calculo();
		 
		 System.out.println(var1 + var2 + var1++);
		 
		
	}
	
	public static void calculo(){
		
		var2= ++var1 + ++var1;
	}

}
