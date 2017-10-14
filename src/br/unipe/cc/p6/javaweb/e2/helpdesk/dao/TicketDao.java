package br.unipe.cc.p6.javaweb.e2.helpdesk.dao;

import javax.persistence.EntityManager;

import br.unipe.cc.p6.javaweb.e2.helpdesk.model.Ticket;

public class TicketDao extends AbstractDao<Ticket> {

	public TicketDao(EntityManager entity) {
		super(entity);
	}

	public TicketDao(){
		super();
	}		
	
	@Override
	public Class<Ticket> entityClass() {
		return Ticket.class;
	}	
	
}
