package br.unipe.cc.p6.javaweb.e2.helpdesk.dao;

import javax.persistence.EntityManager;

import br.unipe.cc.p6.javaweb.e2.helpdesk.model.Departamento;

public class DepartamentoDao extends AbstractDao<Departamento> {

	public DepartamentoDao(EntityManager entity) {
		super(entity);
	}

	public DepartamentoDao(){
		super();
	}
	
	@Override
	public Class<Departamento> entityClass() {
		return Departamento.class;
	}
	
}
