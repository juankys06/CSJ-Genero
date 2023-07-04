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

import com.ability.genero.server.model.generoUsuarioComite;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the genero usuario comite service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author DELL Villartech
 * @see generoUsuarioComitePersistenceImpl
 * @see generoUsuarioComiteUtil
 * @generated
 */
public interface generoUsuarioComitePersistence extends BasePersistence<generoUsuarioComite> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link generoUsuarioComiteUtil} to access the genero usuario comite persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the genero usuario comite in the entity cache if it is enabled.
	*
	* @param generoUsuarioComite the genero usuario comite
	*/
	public void cacheResult(
		com.ability.genero.server.model.generoUsuarioComite generoUsuarioComite);

	/**
	* Caches the genero usuario comites in the entity cache if it is enabled.
	*
	* @param generoUsuarioComites the genero usuario comites
	*/
	public void cacheResult(
		java.util.List<com.ability.genero.server.model.generoUsuarioComite> generoUsuarioComites);

	/**
	* Creates a new genero usuario comite with the primary key. Does not add the genero usuario comite to the database.
	*
	* @param id the primary key for the new genero usuario comite
	* @return the new genero usuario comite
	*/
	public com.ability.genero.server.model.generoUsuarioComite create(int id);

	/**
	* Removes the genero usuario comite with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the genero usuario comite
	* @return the genero usuario comite that was removed
	* @throws com.ability.genero.server.NoSuchUsuarioComiteException if a genero usuario comite with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ability.genero.server.model.generoUsuarioComite remove(int id)
		throws com.ability.genero.server.NoSuchUsuarioComiteException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.ability.genero.server.model.generoUsuarioComite updateImpl(
		com.ability.genero.server.model.generoUsuarioComite generoUsuarioComite,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the genero usuario comite with the primary key or throws a {@link com.ability.genero.server.NoSuchUsuarioComiteException} if it could not be found.
	*
	* @param id the primary key of the genero usuario comite
	* @return the genero usuario comite
	* @throws com.ability.genero.server.NoSuchUsuarioComiteException if a genero usuario comite with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ability.genero.server.model.generoUsuarioComite findByPrimaryKey(
		int id)
		throws com.ability.genero.server.NoSuchUsuarioComiteException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the genero usuario comite with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the genero usuario comite
	* @return the genero usuario comite, or <code>null</code> if a genero usuario comite with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ability.genero.server.model.generoUsuarioComite fetchByPrimaryKey(
		int id) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the genero usuario comites where userId = &#63;.
	*
	* @param userId the user ID
	* @return the matching genero usuario comites
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ability.genero.server.model.generoUsuarioComite> findByporUsuario(
		java.lang.String userId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the genero usuario comites where userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param userId the user ID
	* @param start the lower bound of the range of genero usuario comites
	* @param end the upper bound of the range of genero usuario comites (not inclusive)
	* @return the range of matching genero usuario comites
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ability.genero.server.model.generoUsuarioComite> findByporUsuario(
		java.lang.String userId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the genero usuario comites where userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param userId the user ID
	* @param start the lower bound of the range of genero usuario comites
	* @param end the upper bound of the range of genero usuario comites (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching genero usuario comites
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ability.genero.server.model.generoUsuarioComite> findByporUsuario(
		java.lang.String userId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first genero usuario comite in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching genero usuario comite
	* @throws com.ability.genero.server.NoSuchUsuarioComiteException if a matching genero usuario comite could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ability.genero.server.model.generoUsuarioComite findByporUsuario_First(
		java.lang.String userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.ability.genero.server.NoSuchUsuarioComiteException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first genero usuario comite in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching genero usuario comite, or <code>null</code> if a matching genero usuario comite could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ability.genero.server.model.generoUsuarioComite fetchByporUsuario_First(
		java.lang.String userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last genero usuario comite in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching genero usuario comite
	* @throws com.ability.genero.server.NoSuchUsuarioComiteException if a matching genero usuario comite could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ability.genero.server.model.generoUsuarioComite findByporUsuario_Last(
		java.lang.String userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.ability.genero.server.NoSuchUsuarioComiteException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last genero usuario comite in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching genero usuario comite, or <code>null</code> if a matching genero usuario comite could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ability.genero.server.model.generoUsuarioComite fetchByporUsuario_Last(
		java.lang.String userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the genero usuario comites before and after the current genero usuario comite in the ordered set where userId = &#63;.
	*
	* @param id the primary key of the current genero usuario comite
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next genero usuario comite
	* @throws com.ability.genero.server.NoSuchUsuarioComiteException if a genero usuario comite with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ability.genero.server.model.generoUsuarioComite[] findByporUsuario_PrevAndNext(
		int id, java.lang.String userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.ability.genero.server.NoSuchUsuarioComiteException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the genero usuario comites.
	*
	* @return the genero usuario comites
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ability.genero.server.model.generoUsuarioComite> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the genero usuario comites.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of genero usuario comites
	* @param end the upper bound of the range of genero usuario comites (not inclusive)
	* @return the range of genero usuario comites
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ability.genero.server.model.generoUsuarioComite> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the genero usuario comites.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of genero usuario comites
	* @param end the upper bound of the range of genero usuario comites (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of genero usuario comites
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ability.genero.server.model.generoUsuarioComite> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the genero usuario comites where userId = &#63; from the database.
	*
	* @param userId the user ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByporUsuario(java.lang.String userId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the genero usuario comites from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of genero usuario comites where userId = &#63;.
	*
	* @param userId the user ID
	* @return the number of matching genero usuario comites
	* @throws SystemException if a system exception occurred
	*/
	public int countByporUsuario(java.lang.String userId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of genero usuario comites.
	*
	* @return the number of genero usuario comites
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}