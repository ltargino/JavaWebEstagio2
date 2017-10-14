package br.unipe.cc.p6.javaweb.e2.helpdesk.model;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name="id") 
public class UsuarioTecnico extends Usuario {
	
	private int nivel;

	//constructor
	public UsuarioTecnico(int nivel, String senha, String nome, String email) {
		super(senha, nome, email);
		this.nivel = nivel;
	}
	
	public UsuarioTecnico() {
		
	}

	//gets e sets
	public int getNivel() {
		return nivel;
	}

	public void setNivel(int nivel) {
		this.nivel = nivel;
	}

}
