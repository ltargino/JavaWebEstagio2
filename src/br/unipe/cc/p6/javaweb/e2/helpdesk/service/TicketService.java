package br.unipe.cc.p6.javaweb.e2.helpdesk.service;

import br.unipe.cc.p6.javaweb.e2.helpdesk.dao.TicketDao;
import br.unipe.cc.p6.javaweb.e2.helpdesk.model.Ticket;

public class TicketService extends AbstractService <TicketDao,  Ticket> {
	
	public TicketService() {
		super.setDao(new TicketDao());
	}
	
}