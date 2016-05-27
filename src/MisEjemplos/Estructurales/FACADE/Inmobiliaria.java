package MisEjemplos.Estructurales.FACADE;

public class Inmobiliaria {

	
	private AdministracionAlquiler alquiler;
	private VentaInmueble venta;
	private PagarCuentas pagar;
	
	private MuestraPropiedad propiedad;
	
	public Inmobiliaria(){
		
		alquiler = new AdministracionAlquiler();
		venta = new VentaInmueble();
		
		pagar = new PagarCuentas();
		propiedad = new MuestraPropiedad();
	}
	
	public void atencionCliente (Cliente c){
		
		System.out.println("Atendiendo a un cliente");

	}
	
	public void atencionPropietario(Propietario p){
		
		System.out.println("Atendiendo a un propietario");
	}
	
	public void atencionInteresado (Interesado i){
		
		System.out.println("Atendiendo a un interesado en una propiedad");
	}

	
	public void atencion ( Persona p){
		
		if( p instanceof Cliente){
			
			atencionCliente((Cliente) p);
		}else if (p instanceof Propietario){
			
			atencionPropietario((Propietario) p);
		}else{
			
			atencionInteresado((Interesado) p);
		}
	}

}

