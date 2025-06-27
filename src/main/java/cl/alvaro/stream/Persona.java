package cl.alvaro.stream;

import java.util.Date;

public class Persona {
	private int rut;
	private String dv;
	private String nom;
	private Date fecha;
	
	public Persona(int rut, String dv, String nom, Date fecha) {
		this.rut = rut;
		this.dv = dv;
		this.nom = nom;
		this.fecha = fecha;
	}
	
	public int getRut() {
		return rut;
	}
	public void setRut(int rut) {
		this.rut = rut;
	}
	public String getDv() {
		return dv;
	}
	public void setDv(String dv) {
		this.dv = dv;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	
}
