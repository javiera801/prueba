
public class Television extends Electrodomestico {

	//ATRIBUTOS
	private double resolucion;
	private boolean sintonizadorTDT;
	
	public Television(int preciobase, String color, char consumoenergetico, int peso, int carga, double resolucion, boolean sintonizadorTDT) {
		super(preciobase, color, consumoenergetico, peso );
		this.resolucion=resolucion;
		this.sintonizadorTDT=sintonizadorTDT;
        }
	public Television(int peso, int preciobase, double resolucion, String sintonizadorTDT) {
	super (peso, preciobase);
	this.resolucion=20;
	this.sintonizadorTDT=false;
	}
	
// METODO GET
	public double getResolucion() {
		return this.resolucion;
	}
	public boolean getSintonizadorTDT() {
		return this.sintonizadorTDT;
	}
	
	//METODO PRECIOFINAL3 INCOMPLETO
	public int precioFinal() {
		int preciotres = 0;
		
		if(this.resolucion >= 40) {
			
		}
		
		if(sintonizadorTDT==true) {
		//	preciotres= + 50%;
			
		}
		return preciotres;
	}
	
	
}
