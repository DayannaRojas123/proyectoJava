package com.example.demo.variables;

import jakarta.persistence.*;

@Entity
@Table(name="competicion")
public class Competicion {
	
	@Id	
	@Column(name="id")	
	private Long Id;

}
