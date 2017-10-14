package br.unipe.cc.p6.javaweb.e2.helpdesk.service;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.unipe.cc.p6.javaweb.e2.helpdesk.dao.AbstractDao;
import br.unipe.cc.p6.javaweb.e2.helpdesk.model.AbstractEntity;

public abstract class AbstractService<DAO extends AbstractDao<Entity>, Entity extends AbstractEntity> {
	
	private EntityManagerFactory fac = Persistence.createEntityManagerFactory("persistence");
	
	private DAO dao;
	
	public void setDao(DAO dao){
		this.dao = dao;
	}
	
	public void inserir(Entity professor){

		EntityManager manager = fac.createEntityManager();
		try{
			manager.getTransaction().begin();
			this.dao.setManager(manager);
			this.dao.inserir(professor);
			manager.getTransaction().commit();
		}catch (Exception e){
			manager.getTransaction().rollback();
		}
		finally{
			manager.close();
		}
	
	}	
	
	public void atualizar(Entity professor){

		EntityManager manager = fac.createEntityManager();
		try{
			manager.getTransaction().begin();
			this.dao.setManager(manager);
			dao.atualizar(professor);
			manager.getTransaction().commit();
		}catch (Exception e){
			manager.getTransaction().rollback();
		}
		finally{
			manager.close();
		}
	
	}
	
	public List<Entity> listarCursos(){
		EntityManager manager = fac.createEntityManager();
		List<Entity> movimentos = new ArrayList<Entity>();
		try{
			this.dao.setManager(manager);
			movimentos = dao.listar();
		}catch (Exception e){
			manager.getTransaction().rollback();
			e.printStackTrace();
		}
		finally{
			manager.close();
		}
		return movimentos;
	
	}

	public void excluir(Entity entity) {
		EntityManager manager = fac.createEntityManager();
		try{
			manager.getTransaction().begin();
			this.dao.setManager(manager);
			dao.excluir(entity);
			manager.getTransaction().commit();
		}catch (Exception e){
			e.printStackTrace();
			manager.getTransaction().rollback();
			
		}
		finally{
			manager.close();
		}
	}
	
	public Entity buscar(Long id){
		Entity entity = null;
		EntityManager manager = fac.createEntityManager();
		try{
			this.dao.setManager(manager);
			entity = dao.buscarPorId(id);
		}catch (Exception e){
			manager.getTransaction().rollback();
			e.printStackTrace();
		}
		finally{
			manager.close();
		}
		return entity;
	}

}
