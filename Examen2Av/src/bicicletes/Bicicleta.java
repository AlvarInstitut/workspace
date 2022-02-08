package bicicletes;


import java.util.Date;


public class Bicicleta implements java.io.Serializable {


	private static final long serialVersionUID = 8220858151519655997L;

	private int numB;
	private Usuari usuari;
	private String model;
	private Date dataF;
	private Boolean avariada;
	private Date dataPr;
	private Posicio posicio;

	public Bicicleta() {
	}

	public Bicicleta(int numB) {
		this.numB = numB;
	}

	public Bicicleta(int numB, Usuari usuari, String model, Date dataF, Boolean avariada, Date dataPr,
			Posicio posicio) {
		this.numB = numB;
		this.usuari = usuari;
		this.model = model;
		this.dataF = dataF;
		this.avariada = avariada;
		this.dataPr = dataPr;
		this.posicio = posicio;
	}

	public int getNumB() {
		return this.numB;
	}

	public void setNumB(int numB) {
		this.numB = numB;
	}

	public Usuari getUsuari() {
		return this.usuari;
	}

	public void setUsuari(Usuari usuari) {
		this.usuari = usuari;
	}

	public String getModel() {
		return this.model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public Date getDataF() {
		return this.dataF;
	}

	public void setDataF(Date dataF) {
		this.dataF = dataF;
	}

	public Boolean getAvariada() {
		return this.avariada;
	}

	public void setAvariada(Boolean avariada) {
		this.avariada = avariada;
	}

	public Date getDataPr() {
		return this.dataPr;
	}

	public void setDataPr(Date dataPr) {
		this.dataPr = dataPr;
	}

	public Posicio getPosicio() {
		return this.posicio;
	}

	public void setPosicio(Posicio posicio) {
		this.posicio = posicio;
	}

}
