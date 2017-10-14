package br.unipe.cc.p6.javaweb.e2.helpdesk.dao;

import javax.persistence.EntityManager;

import br.unipe.cc.p6.javaweb.e2.helpdesk.model.UsuarioTecnico;

public class UsuarioTecnicoDao extends AbstractDao<UsuarioTecnico> {

	public UsuarioTecnicoDao(EntityManager entity) {
		super(entity);
	}

	public UsuarioTecnicoDao(){
		super();
	}		
	
	@Override
	public Class<UsuarioTecnico> entityClass() {
		return UsuarioTecnico.class;
	}	
	
}
