package br.com.caiofrota.modelutil.repositories;

import java.io.Serializable;

import org.hibernate.Session;

/**
 * Generic repository.
 * 
 * @author Caio Frota (contato@caiofrota.com.br)
 * @version 1.0
 * @since 1.0
 * 
 * @param <E>
 *            Entity.
 * @param <PK>
 *            Primary key.
 */
public interface GenericRepository<E, PK extends Serializable> extends Serializable {

	/**
	 * Persist a object.
	 * 
	 * @param obj
	 *            Object to persist.
	 */
	public void save(E obj);

	/**
	 * Update a object.
	 * 
	 * @param obj
	 *            Object to update.
	 */
	public void update(E obj);

	/**
	 * Find a object by primary key.
	 * 
	 * @param primaryKey
	 *            Primary key.
	 * @return Object.
	 */
	public E findByPrimaryKey(PK primaryKey);

	/**
	 * Remove a object.
	 * 
	 * @param obj
	 *            Object to remove.
	 */
	public void delete(E obj);

	/**
	 * Get the session.
	 * 
	 * @return Session.
	 */
	public Session getSession();

}
