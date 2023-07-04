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

import com.ability.genero.server.model.encuestaEnfoDife;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the encuesta enfo dife service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author DELL Villartech
 * @see encuestaEnfoDifePersistenceImpl
 * @see encuestaEnfoDifeUtil
 * @generated
 */
public interface encuestaEnfoDifePersistence extends BasePersistence<encuestaEnfoDife> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link encuestaEnfoDifeUtil} to access the encuesta enfo dife persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the encuesta enfo dife in the entity cache if it is enabled.
	*
	* @param encuestaEnfoDife the encuesta enfo dife
	*/
	public void cacheResult(
		com.ability.genero.server.model.encuestaEnfoDife encuestaEnfoDife);

	/**
	* Caches the encuesta enfo difes in the entity cache if it is enabled.
	*
	* @param encuestaEnfoDifes the encuesta enfo difes
	*/
	public void cacheResult(
		java.util.List<com.ability.genero.server.model.encuestaEnfoDife> encuestaEnfoDifes);

	/**
	* Creates a new encuesta enfo dife with the primary key. Does not add the encuesta enfo dife to the database.
	*
	* @param id the primary key for the new encuesta enfo dife
	* @return the new encuesta enfo dife
	*/
	public com.ability.genero.server.model.encuestaEnfoDife create(int id);

	/**
	* Removes the encuesta enfo dife with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the encuesta enfo dife
	* @return the encuesta enfo dife that was removed
	* @throws com.ability.genero.server.NoSuchencuestaEnfoDifeException if a encuesta enfo dife with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ability.genero.server.model.encuestaEnfoDife remove(int id)
		throws com.ability.genero.server.NoSuchencuestaEnfoDifeException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.ability.genero.server.model.encuestaEnfoDife updateImpl(
		com.ability.genero.server.model.encuestaEnfoDife encuestaEnfoDife,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the encuesta enfo dife with the primary key or throws a {@link com.ability.genero.server.NoSuchencuestaEnfoDifeException} if it could not be found.
	*
	* @param id the primary key of the encuesta enfo dife
	* @return the encuesta enfo dife
	* @throws com.ability.genero.server.NoSuchencuestaEnfoDifeException if a encuesta enfo dife with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ability.genero.server.model.encuestaEnfoDife findByPrimaryKey(
		int id)
		throws com.ability.genero.server.NoSuchencuestaEnfoDifeException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the encuesta enfo dife with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the encuesta enfo dife
	* @return the encuesta enfo dife, or <code>null</code> if a encuesta enfo dife with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ability.genero.server.model.encuestaEnfoDife fetchByPrimaryKey(
		int id) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the encuesta enfo difes.
	*
	* @return the encuesta enfo difes
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ability.genero.server.model.encuestaEnfoDife> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the encuesta enfo difes.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of encuesta enfo difes
	* @param end the upper bound of the range of encuesta enfo difes (not inclusive)
	* @return the range of encuesta enfo difes
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ability.genero.server.model.encuestaEnfoDife> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the encuesta enfo difes.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of encuesta enfo difes
	* @param end the upper bound of the range of encuesta enfo difes (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of encuesta enfo difes
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ability.genero.server.model.encuestaEnfoDife> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the encuesta enfo difes from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of encuesta enfo difes.
	*
	* @return the number of encuesta enfo difes
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}