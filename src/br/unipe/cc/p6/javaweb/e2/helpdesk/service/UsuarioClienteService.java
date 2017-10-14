package br.unipe.cc.p6.javaweb.e2.helpdesk.service;

import br.unipe.cc.p6.javaweb.e2.helpdesk.dao.UsuarioClienteDao;
import br.unipe.cc.p6.javaweb.e2.helpdesk.model.Usuario;
import br.unipe.cc.p6.javaweb.e2.helpdesk.model.UsuarioCliente;

public class UsuarioClienteService extends AbstractService <UsuarioClienteDao,  UsuarioCliente> {
	
	public UsuarioClienteService() {
		super.setDao(new UsuarioClienteDao());
	}
	
	public Boolean validarUsuario (Usuario usuario) {
		return false;
	}
}