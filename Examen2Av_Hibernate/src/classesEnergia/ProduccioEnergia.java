package classesEnergia;
// Generated 15/02/2017 10:10:18 by Hibernate Tools 5.2.0.Beta1

import java.math.BigDecimal;

/**
 * ProduccioEnergia generated by hbm2java
 */
public class ProduccioEnergia implements java.io.Serializable {

	private int idPe;
	private Energia energia;
	private Pais pais;
	private Integer anyP;
	private BigDecimal quant;

	public ProduccioEnergia() {
	}

	public ProduccioEnergia(int idPe) {
		this.idPe = idPe;
	}

	public ProduccioEnergia(int idPe, Energia energia, Pais pais, Integer anyP, BigDecimal quant) {
		this.idPe = idPe;
		this.energia = energia;
		this.pais = pais;
		this.anyP = anyP;
		this.quant = quant;
	}

	public int getIdPe() {
		return this.idPe;
	}

	public void setIdPe(int idPe) {
		this.idPe = idPe;
	}

	public Energia getEnergia() {
		return this.energia;
	}

	public void setEnergia(Energia energia) {
		this.energia = energia;
	}

	public Pais getPais() {
		return this.pais;
	}

	public void setPais(Pais pais) {
		this.pais = pais;
	}

	public Integer getAnyP() {
		return this.anyP;
	}

	public void setAnyP(Integer anyP) {
		this.anyP = anyP;
	}

	public BigDecimal getQuant() {
		return this.quant;
	}

	public void setQuant(BigDecimal quant) {
		this.quant = quant;
	}

}
