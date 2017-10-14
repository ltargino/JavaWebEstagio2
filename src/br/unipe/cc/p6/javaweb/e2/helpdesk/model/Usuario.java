package br.unipe.cc.p6.javaweb.e2.helpdesk.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Usuario extends AbstractEntity{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	protected Long id;
	protected String senha;
	protected String nome;
	protected String email;	
	
	@ManyToMany
	protected List<Notificacao> notificacao;
	
	@OneToMany
	protected List<Ticket> ticket;
	
	//constructor
	public Usuario(String senha, String nome, String email) {
		super();
		this.senha = senha;
		this.nome = nome;
		this.email = email;
	}
	
	public Usuario() {
		
	}
	
	//gets e sets
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public List<Notificacao> getNotificacao() {
		return notificacao;
	}

	public void setNotificacao(List<Notificacao> notificacao) {
		this.notificacao = notificacao;
	}

	public List<Ticket> getTicket() {
		return ticket;
	}

	public void setTicket(List<Ticket> ticket) {
		this.ticket = ticket;
	}	
	

}
