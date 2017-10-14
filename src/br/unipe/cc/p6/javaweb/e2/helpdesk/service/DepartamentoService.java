package br.unipe.cc.p6.javaweb.e2.helpdesk.service;

import br.unipe.cc.p6.javaweb.e2.helpdesk.dao.DepartamentoDao;
import br.unipe.cc.p6.javaweb.e2.helpdesk.model.Departamento;

public class DepartamentoService extends AbstractService<DepartamentoDao, Departamento> {
	
	public DepartamentoService() {
		super.setDao(new DepartamentoDao());
	}
	
}
