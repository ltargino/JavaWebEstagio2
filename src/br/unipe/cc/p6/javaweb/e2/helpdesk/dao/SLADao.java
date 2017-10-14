package br.unipe.cc.p6.javaweb.e2.helpdesk.dao;

import javax.persistence.EntityManager;

import br.unipe.cc.p6.javaweb.e2.helpdesk.model.SLA;

public class SLADao extends AbstractDao<SLA> {

	public SLADao(EntityManager entity) {
		super(entity);
	}

	public SLADao(){
		super();
	}		
	
	@Override
	public Class<SLA> entityClass() {
		return SLA.class;
	}	
	
}
