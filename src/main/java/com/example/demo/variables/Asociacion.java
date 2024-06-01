package com.example.demo.variables;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;

@Entity
@Table(name="asociacion")
public class Asociacion {
	
	@Id	
	@Column(name="id")	
	private Long Id;
	@NotEmpty
	private String nombre;
	@NotEmpty
	private String pais;
	@NotEmpty
	private String presidente;
	@NotEmpty
	private String siglas;

}
