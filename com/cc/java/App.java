package com.cc.java;

public class App {

	static String preStr = "Das Ergebnis ist: ";
	
	public static void main( String[] args ) {
		
		RechnerInst rechnerInst = new RechnerInst(  );
		
		output( "Ergebnis: " + rechnerInst.summe( 1, 1 ) );		// Klasse wird initioert, also ist in der Klasse kein static nötig da es nicht IN der Klasse genutz wird
		output( "Ergebnis: " + rechnerInst.differenz( 5, 1 ) );
		output( "Ergebnis: " + rechnerInst.produkt( 2, 3 ) );
		output( "Ergebnis: " + rechnerInst.quotient( 2, 4 ) );
		
		output( "-------------------------" );

		output( preStr + RechnerStat.summe( 1, 1 ) );				// Klasse wird aufgerufen, also ist in der Klasse static nötig da es IN der Klasse genutz wird
		output( preStr + RechnerStat.differenz( 5, 1 ) );
		output( preStr + RechnerStat.produkt( 2, 3 ) );
		output( preStr + RechnerStat.quotient( 2, 4 ) );
		
		output( "-------------------------" );

		output( preStr + Math.PI );
		
	}
	
	static void output( String outStr ){
		System.out.println( outStr );
	}
	
	
} // EoC
