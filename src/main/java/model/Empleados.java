package model;

import java.util.Date;

public class Empleados {

	private Integer cedula;
	private String nombre;
	private Date fecha_nacimiento;
	private Integer sueldo;
	private String estado;
	
	public Empleados() {
		
	}
	 public Empleados(Integer cedula, String nombre, Date fecha_nacimiento, Integer sueldo, String estado) {
	        this.cedula = cedula;
	        this.nombre = nombre;
	        this.fecha_nacimiento = fecha_nacimiento;
	        this.sueldo = sueldo;
	        this.estado = estado;
	 }
	public Integer getCedula() {
		return cedula;
	}
	public void setCedula(Integer cedula) {
		this.cedula = cedula;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Date getFecha_nacimiento() {
		return fecha_nacimiento;
	}
	public void setFecha_nacimiento(Date fecha_nacimiento) {
		this.fecha_nacimiento = fecha_nacimiento;
	}
	public Integer getSueldo() {
		return sueldo;
	}
	public void setSueldo(Integer sueldo) {
		this.sueldo = sueldo;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	 
}
