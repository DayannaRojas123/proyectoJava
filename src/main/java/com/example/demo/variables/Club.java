package com.example.demo.variables;

import java.util.List;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;

@Entity
@Table(name="club")
public class Club {

	@Id	
	@Column(name="id")	
	private Long Id;
	
	@NotEmpty
	private String nombre;

	@OneToOne //club tiene la foranea de entrenador
	//(el entrenador ya estara disponible)
	private Entrenador entrenador;
	
	@OneToMany //jugador tiene la foranea de id_club
	@JoinColumn(name = "id_club")
	private List<Jugador> jugador;
	
	@ManyToOne //club tiene la foranea de asociacion
	//(hay que consultar para cargar la asociacion)
	private Asociacion asociacion;
	
	@ManyToMany
	private List<Competicion> competicion;

	
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
	
	
}
