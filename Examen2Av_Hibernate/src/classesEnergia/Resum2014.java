package classesEnergia;

import java.util.List;

import org.hibernate.Session;

public class Resum2014 {

	public static void main(String[] args) {

		Session sessio = SessionFactoryUtil.getSessionFactory().openSession();
		List<Pais> paisos = sessio.createQuery("from Pais").list();
		for (Pais p:paisos){
			System.out.println(p.getNom());
			double total = 0;
			for (ProduccioEnergia pe : p.getProduccioEnergias())
				if (pe.getAnyP()==2014){
					System.out.println("\tProducció de " + pe.getEnergia().getConcepte() + " l'any 2014: " + pe.getQuant());
					total += pe.getQuant().doubleValue();
				}
			System.out.println("\tTotal producció energies renovables any 2014: " + total);
			System.out.println();
		}
		sessio.close();
	}

}
