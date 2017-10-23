package br.unipe.cc.p6.javaweb.e2.helpdesk.dao;

import javax.persistence.EntityManager;

import br.unipe.cc.p6.javaweb.e2.helpdesk.model.Usuario;

public class UsuarioDao extends AbstractDao<Usuario> {

	public UsuarioDao(EntityManager entity) {
		super(entity);
	}

	public UsuarioDao(){
		super();
	}		
	
	@Override
	public Class<Usuario> entityClass() {
		return Usuario.class;
	}		
	
}
