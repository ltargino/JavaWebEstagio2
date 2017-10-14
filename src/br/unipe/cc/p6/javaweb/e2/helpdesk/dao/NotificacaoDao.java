package br.unipe.cc.p6.javaweb.e2.helpdesk.dao;

import javax.persistence.EntityManager;

import br.unipe.cc.p6.javaweb.e2.helpdesk.model.Notificacao;

public class NotificacaoDao extends AbstractDao<Notificacao> {

	public NotificacaoDao(EntityManager entity) {
		super(entity);
	}

	public NotificacaoDao(){
		super();
	}	
	
	@Override
	public Class<Notificacao> entityClass() {
		return Notificacao.class;
	}
	
}
