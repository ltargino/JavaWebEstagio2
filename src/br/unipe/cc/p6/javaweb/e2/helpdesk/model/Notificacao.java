package br.unipe.cc.p6.javaweb.e2.helpdesk.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Notificacao extends AbstractEntity{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String Titulo;
	private String Descricao;
	
	@ManyToMany
	private List<Usuario> usuario;
	
	//constructor
	public Notificacao(Long id, String titulo, String descricao) {
		super();
		this.id = id;
		Titulo = titulo;
		Descricao = descricao;
	}
	
	public Notificacao() {
		
	}
	
	//gets e sets
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitulo() {
		return Titulo;
	}
	public void setTitulo(String titulo) {
		Titulo = titulo;
	}
	public String getDescricao() {
		return Descricao;
	}
	public void setDescricao(String descricao) {
		Descricao = descricao;
	}
	public List<Usuario> getUsuario() {
		return usuario;
	}
	public void setUsuario(List<Usuario> usuario) {
		this.usuario = usuario;
	}

	@Override
	public String toString() {
		return "Notificacao [id=" + id + ", Titulo=" + Titulo + ", Descricao=" + Descricao + ", usuario=" + usuario
				+ "]";
	}
		
}
