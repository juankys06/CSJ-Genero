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

import com.ability.genero.server.model.generoUsuario;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the genero usuario service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author DELL Villartech
 * @see generoUsuarioPersistenceImpl
 * @see generoUsuarioUtil
 * @generated
 */
public interface generoUsuarioPersistence extends BasePersistence<generoUsuario> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link generoUsuarioUtil} to access the genero usuario persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the genero usuario in the entity cache if it is enabled.
	*
	* @param generoUsuario the genero usuario
	*/
	public void cacheResult(
		com.ability.genero.server.model.generoUsuario generoUsuario);

	/**
	* Caches the genero usuarios in the entity cache if it is enabled.
	*
	* @param generoUsuarios the genero usuarios
	*/
	public void cacheResult(
		java.util.List<com.ability.genero.server.model.generoUsuario> generoUsuarios);

	/**
	* Creates a new genero usuario with the primary key. Does not add the genero usuario to the database.
	*
	* @param id the primary key for the new genero usuario
	* @return the new genero usuario
	*/
	public com.ability.genero.server.model.generoUsuario create(int id);

	/**
	* Removes the genero usuario with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the genero usuario
	* @return the genero usuario that was removed
	* @throws com.ability.genero.server.NoSuchUsuarioException if a genero usuario with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ability.genero.server.model.generoUsuario remove(int id)
		throws com.ability.genero.server.NoSuchUsuarioException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.ability.genero.server.model.generoUsuario updateImpl(
		com.ability.genero.server.model.generoUsuario generoUsuario,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the genero usuario with the primary key or throws a {@link com.ability.genero.server.NoSuchUsuarioException} if it could not be found.
	*
	* @param id the primary key of the genero usuario
	* @return the genero usuario
	* @throws com.ability.genero.server.NoSuchUsuarioException if a genero usuario with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ability.genero.server.model.generoUsuario findByPrimaryKey(
		int id)
		throws com.ability.genero.server.NoSuchUsuarioException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the genero usuario with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the genero usuario
	* @return the genero usuario, or <code>null</code> if a genero usuario with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ability.genero.server.model.generoUsuario fetchByPrimaryKey(
		int id) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the genero usuario where userId = &#63; or throws a {@link com.ability.genero.server.NoSuchUsuarioException} if it could not be found.
	*
	* @param userId the user ID
	* @return the matching genero usuario
	* @throws com.ability.genero.server.NoSuchUsuarioException if a matching genero usuario could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ability.genero.server.model.generoUsuario findByporUsuario(
		java.lang.String userId)
		throws com.ability.genero.server.NoSuchUsuarioException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the genero usuario where userId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param userId the user ID
	* @return the matching genero usuario, or <code>null</code> if a matching genero usuario could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ability.genero.server.model.generoUsuario fetchByporUsuario(
		java.lang.String userId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the genero usuario where userId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param userId the user ID
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching genero usuario, or <code>null</code> if a matching genero usuario could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ability.genero.server.model.generoUsuario fetchByporUsuario(
		java.lang.String userId, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the genero usuarios.
	*
	* @return the genero usuarios
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ability.genero.server.model.generoUsuario> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the genero usuarios.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of genero usuarios
	* @param end the upper bound of the range of genero usuarios (not inclusive)
	* @return the range of genero usuarios
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ability.genero.server.model.generoUsuario> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the genero usuarios.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of genero usuarios
	* @param end the upper bound of the range of genero usuarios (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of genero usuarios
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ability.genero.server.model.generoUsuario> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the genero usuario where userId = &#63; from the database.
	*
	* @param userId the user ID
	* @return the genero usuario that was removed
	* @throws SystemException if a system exception occurred
	*/
	public com.ability.genero.server.model.generoUsuario removeByporUsuario(
		java.lang.String userId)
		throws com.ability.genero.server.NoSuchUsuarioException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the genero usuarios from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of genero usuarios where userId = &#63;.
	*
	* @param userId the user ID
	* @return the number of matching genero usuarios
	* @throws SystemException if a system exception occurred
	*/
	public int countByporUsuario(java.lang.String userId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of genero usuarios.
	*
	* @return the number of genero usuarios
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}