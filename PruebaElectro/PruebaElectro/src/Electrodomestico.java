
public class Electrodomestico {

	//ATRIBUTOS ELECTRODOMESTICO
	//DATOS CONSTANTES(final) ========FALTA 
	private  int preciobase;
	private String color;
	private char consumoenergetico;
	private int peso;
	
	//costructor por defecto
	public Electrodomestico() {
	this.color = "Blanco";	
	this.consumoenergetico = 'F';	
	this.peso = 5;	
	this.preciobase = 100;	
	}
	
	
	//Un constructor con el precio y peso. El resto por defecto.
	public Electrodomestico(int preciobase, int peso) {
		this.preciobase=preciobase;
		this.color="blanco";
		this.consumoenergetico='F';
		this.peso=peso;
	}
	
	
	//Un constructor con todos los atributos
	public Electrodomestico(int preciobase, String color, char consumoenergetico, int peso) {
		
		this.preciobase=preciobase;
		
		this.color=comprobarcolor(color);
		
		this.consumoenergetico=consumoEnergetico(consumoenergetico);
		
		this.peso=peso;
	}
	
	
	
	//METODO QUE MUESTRA LOS DATOS
	public void MostrarDatos() {
		System.out.println("EL PRECIO ES: "+ preciobase);
		System.out.println("EL COLOR ES: " + color);
		System.out.println("CONSUMO ENERGETICO: " + consumoenergetico);
		System.out.println("PESO PRODUCTO: " + peso);
	}
	
	
    
    //METODOget
    public int getpreciobase() {
    	return this.preciobase;
    }
    public String getcolor() {
    	return this.color;
    }
    public char getconsumoenergetico() {
    	return this.consumoenergetico;
    }
    public int getpeso() {
    	return this.peso;
    }
    
	
	//metodos 
	
	 public String comprobarcolor(String color){
			if(color == "Negro" || color == "Azul"
					|| color == "Gris" || color == "Rojo") {
					return color;
				} else {
					return "Blanco";}
	}
	 
	public char consumoEnergetico(char consumoenergetico) {
		boolean igual=false;
		
		switch (consumoenergetico) {
		case 'A':
		      igual=true;
		      this.preciobase=100;
		break;
		case 'B':
			igual=true;
			this.preciobase=80;
			break;
		case 'C':
			igual=true;
			this.preciobase=60;
			break;
		case 'D':
			igual=true;
			this.preciobase=50;
			break;
		case 'E':
			igual=true;
			this.preciobase=30;
			break;
		case 'F':
			igual=true;
			this.preciobase=10;
		}
		if(igual) {
			this.consumoenergetico = consumoenergetico;
		}
		return consumoenergetico;
		
			
		}
		
	public int precioFinal() {
		int preciouno=0;
		this.consumoEnergetico(consumoenergetico);
		
		if(this.peso >=0 && this.peso <= 19) {
			preciouno=10;
		}else if(this.peso >=20 && this.peso <=49) {
			preciouno=50;
		}else if(this.peso >=50 && this.peso <=79) {
			preciouno=80;
		}else {
			preciouno=100;
		}
		
		this.preciobase  = preciobase+preciouno;
		return this.preciobase;
	
			
	}
	

}
