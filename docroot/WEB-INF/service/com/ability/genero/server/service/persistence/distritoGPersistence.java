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

import com.ability.genero.server.model.distritoG;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the distrito g service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author DELL Villartech
 * @see distritoGPersistenceImpl
 * @see distritoGUtil
 * @generated
 */
public interface distritoGPersistence extends BasePersistence<distritoG> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link distritoGUtil} to access the distrito g persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the distrito g in the entity cache if it is enabled.
	*
	* @param distritoG the distrito g
	*/
	public void cacheResult(com.ability.genero.server.model.distritoG distritoG);

	/**
	* Caches the distrito gs in the entity cache if it is enabled.
	*
	* @param distritoGs the distrito gs
	*/
	public void cacheResult(
		java.util.List<com.ability.genero.server.model.distritoG> distritoGs);

	/**
	* Creates a new distrito g with the primary key. Does not add the distrito g to the database.
	*
	* @param id the primary key for the new distrito g
	* @return the new distrito g
	*/
	public com.ability.genero.server.model.distritoG create(int id);

	/**
	* Removes the distrito g with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the distrito g
	* @return the distrito g that was removed
	* @throws com.ability.genero.server.NoSuchdistritoGException if a distrito g with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ability.genero.server.model.distritoG remove(int id)
		throws com.ability.genero.server.NoSuchdistritoGException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.ability.genero.server.model.distritoG updateImpl(
		com.ability.genero.server.model.distritoG distritoG, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the distrito g with the primary key or throws a {@link com.ability.genero.server.NoSuchdistritoGException} if it could not be found.
	*
	* @param id the primary key of the distrito g
	* @return the distrito g
	* @throws com.ability.genero.server.NoSuchdistritoGException if a distrito g with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ability.genero.server.model.distritoG findByPrimaryKey(int id)
		throws com.ability.genero.server.NoSuchdistritoGException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the distrito g with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the distrito g
	* @return the distrito g, or <code>null</code> if a distrito g with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ability.genero.server.model.distritoG fetchByPrimaryKey(int id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the distrito gs.
	*
	* @return the distrito gs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ability.genero.server.model.distritoG> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the distrito gs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of distrito gs
	* @param end the upper bound of the range of distrito gs (not inclusive)
	* @return the range of distrito gs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ability.genero.server.model.distritoG> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the distrito gs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of distrito gs
	* @param end the upper bound of the range of distrito gs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of distrito gs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ability.genero.server.model.distritoG> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the distrito gs from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of distrito gs.
	*
	* @return the number of distrito gs
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}