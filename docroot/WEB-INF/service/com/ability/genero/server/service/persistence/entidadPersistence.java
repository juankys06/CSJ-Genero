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

import com.ability.genero.server.model.entidad;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the entidad service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author DELL Villartech
 * @see entidadPersistenceImpl
 * @see entidadUtil
 * @generated
 */
public interface entidadPersistence extends BasePersistence<entidad> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link entidadUtil} to access the entidad persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the entidad in the entity cache if it is enabled.
	*
	* @param entidad the entidad
	*/
	public void cacheResult(com.ability.genero.server.model.entidad entidad);

	/**
	* Caches the entidads in the entity cache if it is enabled.
	*
	* @param entidads the entidads
	*/
	public void cacheResult(
		java.util.List<com.ability.genero.server.model.entidad> entidads);

	/**
	* Creates a new entidad with the primary key. Does not add the entidad to the database.
	*
	* @param id the primary key for the new entidad
	* @return the new entidad
	*/
	public com.ability.genero.server.model.entidad create(int id);

	/**
	* Removes the entidad with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the entidad
	* @return the entidad that was removed
	* @throws com.ability.genero.server.NoSuchentidadException if a entidad with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ability.genero.server.model.entidad remove(int id)
		throws com.ability.genero.server.NoSuchentidadException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.ability.genero.server.model.entidad updateImpl(
		com.ability.genero.server.model.entidad entidad, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the entidad with the primary key or throws a {@link com.ability.genero.server.NoSuchentidadException} if it could not be found.
	*
	* @param id the primary key of the entidad
	* @return the entidad
	* @throws com.ability.genero.server.NoSuchentidadException if a entidad with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ability.genero.server.model.entidad findByPrimaryKey(int id)
		throws com.ability.genero.server.NoSuchentidadException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the entidad with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the entidad
	* @return the entidad, or <code>null</code> if a entidad with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ability.genero.server.model.entidad fetchByPrimaryKey(int id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the entidads.
	*
	* @return the entidads
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ability.genero.server.model.entidad> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the entidads.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of entidads
	* @param end the upper bound of the range of entidads (not inclusive)
	* @return the range of entidads
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ability.genero.server.model.entidad> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the entidads.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of entidads
	* @param end the upper bound of the range of entidads (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of entidads
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ability.genero.server.model.entidad> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the entidads from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of entidads.
	*
	* @return the number of entidads
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}