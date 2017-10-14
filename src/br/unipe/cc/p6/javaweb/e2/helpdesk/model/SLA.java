package br.unipe.cc.p6.javaweb.e2.helpdesk.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class SLA extends AbstractEntity{
	
	//atributos
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	//constructor
	public SLA(Long id) {
		super();
	}
	public SLA() {
		super();
	}

	//Gets e Sets
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

}
