/**
 * Copyright (c) 2000-2012 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.ability.genero.server.service.persistence;

import com.ability.genero.server.model.tipoDecision;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the tipo decision service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author DELL Villartech
 * @see tipoDecisionPersistenceImpl
 * @see tipoDecisionUtil
 * @generated
 */
public interface tipoDecisionPersistence extends BasePersistence<tipoDecision> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link tipoDecisionUtil} to access the tipo decision persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the tipo decision in the entity cache if it is enabled.
	*
	* @param tipoDecision the tipo decision
	*/
	public void cacheResult(
		com.ability.genero.server.model.tipoDecision tipoDecision);

	/**
	* Caches the tipo decisions in the entity cache if it is enabled.
	*
	* @param tipoDecisions the tipo decisions
	*/
	public void cacheResult(
		java.util.List<com.ability.genero.server.model.tipoDecision> tipoDecisions);

	/**
	* Creates a new tipo decision with the primary key. Does not add the tipo decision to the database.
	*
	* @param id the primary key for the new tipo decision
	* @return the new tipo decision
	*/
	public com.ability.genero.server.model.tipoDecision create(int id);

	/**
	* Removes the tipo decision with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the tipo decision
	* @return the tipo decision that was removed
	* @throws com.ability.genero.server.NoSuchtipoDecisionException if a tipo decision with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ability.genero.server.model.tipoDecision remove(int id)
		throws com.ability.genero.server.NoSuchtipoDecisionException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.ability.genero.server.model.tipoDecision updateImpl(
		com.ability.genero.server.model.tipoDecision tipoDecision, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the tipo decision with the primary key or throws a {@link com.ability.genero.server.NoSuchtipoDecisionException} if it could not be found.
	*
	* @param id the primary key of the tipo decision
	* @return the tipo decision
	* @throws com.ability.genero.server.NoSuchtipoDecisionException if a tipo decision with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ability.genero.server.model.tipoDecision findByPrimaryKey(int id)
		throws com.ability.genero.server.NoSuchtipoDecisionException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the tipo decision with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the tipo decision
	* @return the tipo decision, or <code>null</code> if a tipo decision with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ability.genero.server.model.tipoDecision fetchByPrimaryKey(
		int id) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the tipo decisions.
	*
	* @return the tipo decisions
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ability.genero.server.model.tipoDecision> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the tipo decisions.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of tipo decisions
	* @param end the upper bound of the range of tipo decisions (not inclusive)
	* @return the range of tipo decisions
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ability.genero.server.model.tipoDecision> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the tipo decisions.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of tipo decisions
	* @param end the upper bound of the range of tipo decisions (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of tipo decisions
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ability.genero.server.model.tipoDecision> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the tipo decisions from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of tipo decisions.
	*
	* @return the number of tipo decisions
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}