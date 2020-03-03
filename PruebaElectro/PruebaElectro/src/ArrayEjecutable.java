import java.util.Scanner;

public class ArrayEjecutable {
	public static void main(String[] args) {
		Scanner entrada= new Scanner(System.in);
		String Electrodomésticos[]= new String[10];
		Electrodomésticos[0]="television";
		Electrodomésticos[1]="lavadora";
	    Electrodomésticos[2]="secadora";
	    Electrodomésticos[3]="lavaplatos";
	    Electrodomésticos[4]="cafetera";
	    Electrodomésticos[5]="radio";
		Electrodomésticos[6]="hervidor";
	    Electrodomésticos[7]="horno";
	    Electrodomésticos[8]="juguera";
	    Electrodomésticos[9]="refrigerador";
		
		for(int i=0; i<10; i++) {
			System.out.println("Electrodomesticos " + i + "=" + Electrodomésticos[i]);
		}
		//INCOMPLETO
	}

}
