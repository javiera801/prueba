import java.util.Scanner;

public class ArrayEjecutable {
	public static void main(String[] args) {
		Scanner entrada= new Scanner(System.in);
		String Electrodom�sticos[]= new String[10];
		Electrodom�sticos[0]="television";
		Electrodom�sticos[1]="lavadora";
	    Electrodom�sticos[2]="secadora";
	    Electrodom�sticos[3]="lavaplatos";
	    Electrodom�sticos[4]="cafetera";
	    Electrodom�sticos[5]="radio";
		Electrodom�sticos[6]="hervidor";
	    Electrodom�sticos[7]="horno";
	    Electrodom�sticos[8]="juguera";
	    Electrodom�sticos[9]="refrigerador";
		
		for(int i=0; i<10; i++) {
			System.out.println("Electrodomesticos " + i + "=" + Electrodom�sticos[i]);
		}
		//INCOMPLETO
	}

}
