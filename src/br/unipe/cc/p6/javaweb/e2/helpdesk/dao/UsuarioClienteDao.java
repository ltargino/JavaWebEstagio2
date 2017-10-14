package br.unipe.cc.p6.javaweb.e2.helpdesk.dao;

import javax.persistence.EntityManager;

import br.unipe.cc.p6.javaweb.e2.helpdesk.model.UsuarioCliente;

public class UsuarioClienteDao extends AbstractDao<UsuarioCliente> {

	public UsuarioClienteDao(EntityManager entity) {
		super(entity);
	}

	public UsuarioClienteDao(){
		super();
	}		
	
	@Override
	public Class<UsuarioCliente> entityClass() {
		return UsuarioCliente.class;
	}		
	
}
