package com.example.demo.variables;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;

@Entity
@Table(name="jugador")
public class Jugador {
	
	@Id	
	@Column(name="id")	
	private Long Id;
	@NotEmpty
	private String nombre;
	@NotEmpty
	private String apellido;
	@NotNull
	private int numero;
	@NotEmpty
	private String posicion;
	
	public Long getId() {
		return Id;
	}
	public void setId(Long id) {
		Id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getPosicion() {
		return posicion;
	}
	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}
	
	
	

}
