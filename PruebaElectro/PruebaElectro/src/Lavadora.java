
public class Lavadora extends Electrodomestico{ 
	 final int carga;
	
//CONSTRUCTORES "NO SE HEREDAN"
	public Lavadora(int preciobase, String color, char consumoenergetico, int peso, int carga) {
		super(preciobase, color, consumoenergetico, peso );
		this.carga=carga;
	}
	
	public Lavadora(int preciobase, int peso, int carga) {
		super(preciobase, peso );
		this.carga=5;	
	}

	//METODO GET 
	public int getCarga() {
		return this.carga;
	}
	//LLAMAR MET PADRE
	void precioFinaldos() {
		precioFinal();
		super.precioFinal();
		
		
	}
	
	/*
		if(this.peso )
		
		INCOMPLETO
		
	}*/
	
	
		                              	

}
