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

import com.ability.genero.server.model.normasNacionales;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the normas nacionales service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author DELL Villartech
 * @see normasNacionalesPersistenceImpl
 * @see normasNacionalesUtil
 * @generated
 */
public interface normasNacionalesPersistence extends BasePersistence<normasNacionales> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link normasNacionalesUtil} to access the normas nacionales persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the normas nacionales in the entity cache if it is enabled.
	*
	* @param normasNacionales the normas nacionales
	*/
	public void cacheResult(
		com.ability.genero.server.model.normasNacionales normasNacionales);

	/**
	* Caches the normas nacionaleses in the entity cache if it is enabled.
	*
	* @param normasNacionaleses the normas nacionaleses
	*/
	public void cacheResult(
		java.util.List<com.ability.genero.server.model.normasNacionales> normasNacionaleses);

	/**
	* Creates a new normas nacionales with the primary key. Does not add the normas nacionales to the database.
	*
	* @param id the primary key for the new normas nacionales
	* @return the new normas nacionales
	*/
	public com.ability.genero.server.model.normasNacionales create(int id);

	/**
	* Removes the normas nacionales with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the normas nacionales
	* @return the normas nacionales that was removed
	* @throws com.ability.genero.server.NoSuchnormasNacionalesException if a normas nacionales with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ability.genero.server.model.normasNacionales remove(int id)
		throws com.ability.genero.server.NoSuchnormasNacionalesException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.ability.genero.server.model.normasNacionales updateImpl(
		com.ability.genero.server.model.normasNacionales normasNacionales,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the normas nacionales with the primary key or throws a {@link com.ability.genero.server.NoSuchnormasNacionalesException} if it could not be found.
	*
	* @param id the primary key of the normas nacionales
	* @return the normas nacionales
	* @throws com.ability.genero.server.NoSuchnormasNacionalesException if a normas nacionales with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ability.genero.server.model.normasNacionales findByPrimaryKey(
		int id)
		throws com.ability.genero.server.NoSuchnormasNacionalesException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the normas nacionales with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the normas nacionales
	* @return the normas nacionales, or <code>null</code> if a normas nacionales with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ability.genero.server.model.normasNacionales fetchByPrimaryKey(
		int id) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the normas nacionaleses.
	*
	* @return the normas nacionaleses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ability.genero.server.model.normasNacionales> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the normas nacionaleses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of normas nacionaleses
	* @param end the upper bound of the range of normas nacionaleses (not inclusive)
	* @return the range of normas nacionaleses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ability.genero.server.model.normasNacionales> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the normas nacionaleses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of normas nacionaleses
	* @param end the upper bound of the range of normas nacionaleses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of normas nacionaleses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ability.genero.server.model.normasNacionales> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the normas nacionaleses from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of normas nacionaleses.
	*
	* @return the number of normas nacionaleses
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}