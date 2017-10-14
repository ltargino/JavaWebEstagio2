package br.unipe.cc.p6.javaweb.e2.helpdesk.service;

import br.unipe.cc.p6.javaweb.e2.helpdesk.dao.SLADao;
import br.unipe.cc.p6.javaweb.e2.helpdesk.model.SLA;

public class SLAService extends AbstractService <SLADao,  SLA> {
	
	public SLAService() {
		super.setDao(new SLADao());
	}
	
}
