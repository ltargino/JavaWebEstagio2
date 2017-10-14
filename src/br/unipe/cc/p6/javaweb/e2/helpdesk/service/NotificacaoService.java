package br.unipe.cc.p6.javaweb.e2.helpdesk.service;

import br.unipe.cc.p6.javaweb.e2.helpdesk.model.Notificacao;
import br.unipe.cc.p6.javaweb.e2.helpdesk.dao.NotificacaoDao;

public class NotificacaoService extends AbstractService <NotificacaoDao,  Notificacao> {
	
	public NotificacaoService() {
		super.setDao(new NotificacaoDao());
	}
	
}

