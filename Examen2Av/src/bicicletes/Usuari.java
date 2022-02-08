package bicicletes;
// Generated 14/02/2017 00:11:33 by Hibernate Tools 5.2.0.Beta1

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Usuari generated by hbm2java
 */
public class Usuari implements java.io.Serializable {

	private int numUsu;
	private String dni;
	private String nom;
	private String adreca;
	private String telefon;
	private String iban;
	private Boolean penal;
	private Date dataPenal;
	private Bicicleta bicicleta;

	public Usuari() {
	}

	public Usuari(int numUsu) {
		this.numUsu = numUsu;
	}

	public Usuari(int numUsu, String dni, String nom, String adreca, String telefon, String iban, Boolean penal,
			Date dataPenal, Bicicleta bicicleta) {
		this.numUsu = numUsu;
		this.dni = dni;
		this.nom = nom;
		this.adreca = adreca;
		this.telefon = telefon;
		this.iban = iban;
		this.penal = penal;
		this.dataPenal = dataPenal;
		this.bicicleta = bicicleta;
	}

	public int getNumUsu() {
		return this.numUsu;
	}

	public void setNumUsu(int numUsu) {
		this.numUsu = numUsu;
	}

	public String getDni() {
		return this.dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNom() {
		return this.nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getAdreca() {
		return this.adreca;
	}

	public void setAdreca(String adreca) {
		this.adreca = adreca;
	}

	public String getTelefon() {
		return this.telefon;
	}

	public void setTelefon(String telefon) {
		this.telefon = telefon;
	}

	public String getIban() {
		return this.iban;
	}

	public void setIban(String iban) {
		this.iban = iban;
	}

	public Boolean getPenal() {
		return this.penal;
	}

	public void setPenal(Boolean penal) {
		this.penal = penal;
	}

	public Date getDataPenal() {
		return this.dataPenal;
	}

	public void setDataPenal(Date dataPenal) {
		this.dataPenal = dataPenal;
	}

	public Bicicleta getBicicleta() {
		return this.bicicleta;
	}

	public void setBicicleta(Bicicleta bicicleta) {
		this.bicicleta = bicicleta;
	}

}