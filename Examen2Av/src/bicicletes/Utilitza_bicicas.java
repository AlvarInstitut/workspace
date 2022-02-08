package bicicletes;

import java.util.ArrayList;

import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;

public class Utilitza_bicicas {
	static ObjectContainer bd;
	public static void main(String[] args) {
		bd = Db4oEmbedded.openFile("Bicicas.db4o");
		
		MostraEstacions();
		
		prestar(1,9,15);
		tornar(2,2,11);
		
		MostraEstacions();
		
		bd.close();

	}

	private static void MostraEstacions() {

        ObjectSet<Estacio> llista = bd.queryByExample(new Estacio());

        for (Estacio e : llista){
        	int q=0;
        	for (Posicio p : e.getPosicios())
        		if (p.getBicicleta()!=null)
        			q++;
        	System.out.println(e.getNumEst()+ ".- " + e.getNomEst() + " (" + q + "/" + e.getPosicios().size() + ")");
        }
		
	}
	
	private static void prestar(int numEst, int numPos, int numUsu) {
		Estacio e = (Estacio) bd.queryByExample(new Estacio(numEst)).next();
		Posicio p = (Posicio) bd.queryByExample(new Posicio(e,numPos)).next();
		Usuari u = (Usuari) bd.queryByExample(new Usuari(numUsu)).next();
		System.out.println("Préstec: " + e.getNomEst() + " " + p.getNumP() + " a " + u.getNom() );
		Bicicleta b = p.getBicicleta();
		if (b!= null){
			Bicicleta b1 = (Bicicleta) bd.queryByExample(b).next();
			p.setBicicleta(null);
			b1.setPosicio(null);
			b1.setUsuari(u);
			u.setBicicleta(b1);
			bd.store(p);
			bd.store(b1);
			bd.store(u);
		}
	}

	private static void tornar(int numEst, int numPos, int numBici) {
		Estacio e = (Estacio) bd.queryByExample(new Estacio(numEst)).next();
		Posicio p = (Posicio) bd.queryByExample(new Posicio(e,numPos)).next();
		Bicicleta b = (Bicicleta) bd.queryByExample(new Bicicleta(numBici)).next();
		System.out.println("Tornar: " + e.getNomEst() + " " + p.getNumP() + " la " + b.getNumB() );
		Usuari u = b.getUsuari();
		if (p.getBicicleta()== null){
			Usuari u1 = (Usuari) bd.queryByExample(u).next();
			p.setBicicleta(b);
			b.setPosicio(p);
			b.setUsuari(null);
			u1.setBicicleta(null);
			bd.store(p);
			bd.store(b);
			bd.store(u1);
		}
	}

}
