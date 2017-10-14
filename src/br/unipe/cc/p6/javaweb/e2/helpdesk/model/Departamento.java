package br.unipe.cc.p6.javaweb.e2.helpdesk.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Departamento extends AbstractEntity{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nome;
	
	private String descricao;
	
	@OneToMany
	private List<UsuarioCliente> usuarioClientes;
	
	public Departamento() {}
	
	//constructor
	public Departamento(String nome, String descricao, List<UsuarioCliente> usuarioClientes) {
		super();
		this.nome = nome;
		this.descricao = descricao;
		this.usuarioClientes = usuarioClientes;
	}
	
	//gets e sets
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public List<UsuarioCliente> getUsuariosTecnicos() {
		return usuarioClientes;
	}

	public void setUsuariosTecnicos(List<UsuarioCliente> usuarioClientes) {
		this.usuarioClientes = usuarioClientes;
	}

	@Override
	public String toString() {
		return "Departamento [id=" + id + ", nome=" + nome + ", descricao=" + descricao + ", usuarioClientes="
				+ usuarioClientes + "]";
	}

}
