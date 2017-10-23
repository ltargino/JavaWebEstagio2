package br.unipe.cc.p6.javaweb.e2.helpdesk.service;

import br.unipe.cc.p6.javaweb.e2.helpdesk.dao.UsuarioDao;
import br.unipe.cc.p6.javaweb.e2.helpdesk.model.Usuario;

public class UsuarioService extends AbstractService <UsuarioDao,  Usuario>{

	public UsuarioService() {
		super.setDao(new UsuarioDao());
	}
	
}
