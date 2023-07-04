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

import com.ability.genero.server.model.normasInteracionales;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the normas interacionales service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author DELL Villartech
 * @see normasInteracionalesPersistenceImpl
 * @see normasInteracionalesUtil
 * @generated
 */
public interface normasInteracionalesPersistence extends BasePersistence<normasInteracionales> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link normasInteracionalesUtil} to access the normas interacionales persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the normas interacionales in the entity cache if it is enabled.
	*
	* @param normasInteracionales the normas interacionales
	*/
	public void cacheResult(
		com.ability.genero.server.model.normasInteracionales normasInteracionales);

	/**
	* Caches the normas interacionaleses in the entity cache if it is enabled.
	*
	* @param normasInteracionaleses the normas interacionaleses
	*/
	public void cacheResult(
		java.util.List<com.ability.genero.server.model.normasInteracionales> normasInteracionaleses);

	/**
	* Creates a new normas interacionales with the primary key. Does not add the normas interacionales to the database.
	*
	* @param id the primary key for the new normas interacionales
	* @return the new normas interacionales
	*/
	public com.ability.genero.server.model.normasInteracionales create(int id);

	/**
	* Removes the normas interacionales with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the normas interacionales
	* @return the normas interacionales that was removed
	* @throws com.ability.genero.server.NoSuchnormasInteracionalesException if a normas interacionales with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ability.genero.server.model.normasInteracionales remove(int id)
		throws com.ability.genero.server.NoSuchnormasInteracionalesException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.ability.genero.server.model.normasInteracionales updateImpl(
		com.ability.genero.server.model.normasInteracionales normasInteracionales,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the normas interacionales with the primary key or throws a {@link com.ability.genero.server.NoSuchnormasInteracionalesException} if it could not be found.
	*
	* @param id the primary key of the normas interacionales
	* @return the normas interacionales
	* @throws com.ability.genero.server.NoSuchnormasInteracionalesException if a normas interacionales with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ability.genero.server.model.normasInteracionales findByPrimaryKey(
		int id)
		throws com.ability.genero.server.NoSuchnormasInteracionalesException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the normas interacionales with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the normas interacionales
	* @return the normas interacionales, or <code>null</code> if a normas interacionales with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ability.genero.server.model.normasInteracionales fetchByPrimaryKey(
		int id) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the normas interacionaleses.
	*
	* @return the normas interacionaleses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ability.genero.server.model.normasInteracionales> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the normas interacionaleses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of normas interacionaleses
	* @param end the upper bound of the range of normas interacionaleses (not inclusive)
	* @return the range of normas interacionaleses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ability.genero.server.model.normasInteracionales> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the normas interacionaleses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of normas interacionaleses
	* @param end the upper bound of the range of normas interacionaleses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of normas interacionaleses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ability.genero.server.model.normasInteracionales> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the normas interacionaleses from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of normas interacionaleses.
	*
	* @return the number of normas interacionaleses
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}