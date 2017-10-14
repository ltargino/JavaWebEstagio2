package br.unipe.cc.p6.javaweb.e2.helpdesk.dao;

import javax.persistence.EntityManager;

import br.unipe.cc.p6.javaweb.e2.helpdesk.model.UsuarioAdm;

public class UsuarioAdmDao extends AbstractDao<UsuarioAdm> {
	
	public UsuarioAdmDao(EntityManager entity) {
		super(entity);
	}

	public UsuarioAdmDao(){
		super();
	}		
	
	@Override
	public Class<UsuarioAdm> entityClass() {
		return UsuarioAdm.class;
	}	
	
}
