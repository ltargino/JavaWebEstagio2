package br.unipe.cc.p6.javaweb.e2.helpdesk.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.unipe.cc.p6.javaweb.e2.helpdesk.model.AbstractEntity;

public abstract class AbstractDao<Entity extends AbstractEntity>{

	private EntityManager manager;
	
	public abstract Class<Entity> entityClass();
	
	public AbstractDao(EntityManager manager) {
		this.manager = manager;
	}
	
	public AbstractDao(){
		
	}
	
	public void setManager(EntityManager manager){
		this.manager = manager;
	}

	public void inserir(Entity entity){
		manager.persist(entity);
	}
	
	public void atualizar(Entity entity){
		manager.merge(entity);
	}
	
	public void excluir(Entity entity){
		entity = manager.find(entityClass(), entity.getId());
		manager.remove(entity);
	}
	
	public Entity buscarPorId(Long id){
		return manager.find(entityClass(), id);
	}
	
	@SuppressWarnings("unchecked")
	public List<Entity> listar(){
		Query query =  manager.createQuery("select c from "+ entityClass().getSimpleName()+" c");
		return  query.getResultList();
		
	}
	
}
