package kule;

public class Kula {

	public static void resavanjeKula(int n, char pocetni, char pomocni, char krajnji) {
		
		if (n==0) {
			System.out.println("Zadatak je Zavrsen!");
			return;
		}
		
		if(n==1) {
			System.out.println("Prebaci 1 sa "+pocetni+" na "+krajnji);
			return;
		}
		
		Kula.resavanjeKula(n-1, pocetni, krajnji, pomocni);
		System.out.println("Prebaci "+n+" sa "+ pocetni + " na "+krajnji);
		Kula.resavanjeKula(n-1, pomocni, pocetni, krajnji);
		
	
	
	
	}
	

}
