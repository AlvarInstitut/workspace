package classesEnergia;
// Generated 15/02/2017 10:10:18 by Hibernate Tools 5.2.0.Beta1

import java.util.HashSet;
import java.util.Set;

/**
 * Energia generated by hbm2java
 */
public class Energia implements java.io.Serializable {

	private int num;
	private String concepte;
	private String concept;
	private Set<ProduccioEnergia> produccioEnergias = new HashSet<ProduccioEnergia>(0);

	public Energia() {
	}

	public Energia(int num) {
		this.num = num;
	}

	public Energia(int num, String concepte, String concept, Set<ProduccioEnergia> produccioEnergias) {
		this.num = num;
		this.concepte = concepte;
		this.concept = concept;
		this.produccioEnergias = produccioEnergias;
	}

	public int getNum() {
		return this.num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getConcepte() {
		return this.concepte;
	}

	public void setConcepte(String concepte) {
		this.concepte = concepte;
	}

	public String getConcept() {
		return this.concept;
	}

	public void setConcept(String concept) {
		this.concept = concept;
	}

	public Set<ProduccioEnergia> getProduccioEnergias() {
		return this.produccioEnergias;
	}

	public void setProduccioEnergias(Set<ProduccioEnergia> produccioEnergias) {
		this.produccioEnergias = produccioEnergias;
	}

}
