package MisEjemplos.BUILDER;

public class Main {

	public static void main(String[] args) {
		
		DirectorAuto director=new DirectorAuto();
		
		director.setAutobuilder(new FiatBuilder());
		
		director.Construct();
		
		Auto auto=director.getAuto();
		
		System.out.println(auto.getMarca());

	}

}
