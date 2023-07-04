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

import com.ability.genero.server.model.preguntasClave;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the preguntas clave service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author DELL Villartech
 * @see preguntasClavePersistenceImpl
 * @see preguntasClaveUtil
 * @generated
 */
public interface preguntasClavePersistence extends BasePersistence<preguntasClave> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link preguntasClaveUtil} to access the preguntas clave persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the preguntas clave in the entity cache if it is enabled.
	*
	* @param preguntasClave the preguntas clave
	*/
	public void cacheResult(
		com.ability.genero.server.model.preguntasClave preguntasClave);

	/**
	* Caches the preguntas claves in the entity cache if it is enabled.
	*
	* @param preguntasClaves the preguntas claves
	*/
	public void cacheResult(
		java.util.List<com.ability.genero.server.model.preguntasClave> preguntasClaves);

	/**
	* Creates a new preguntas clave with the primary key. Does not add the preguntas clave to the database.
	*
	* @param id the primary key for the new preguntas clave
	* @return the new preguntas clave
	*/
	public com.ability.genero.server.model.preguntasClave create(int id);

	/**
	* Removes the preguntas clave with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the preguntas clave
	* @return the preguntas clave that was removed
	* @throws com.ability.genero.server.NoSuchpreguntasClaveException if a preguntas clave with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ability.genero.server.model.preguntasClave remove(int id)
		throws com.ability.genero.server.NoSuchpreguntasClaveException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.ability.genero.server.model.preguntasClave updateImpl(
		com.ability.genero.server.model.preguntasClave preguntasClave,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the preguntas clave with the primary key or throws a {@link com.ability.genero.server.NoSuchpreguntasClaveException} if it could not be found.
	*
	* @param id the primary key of the preguntas clave
	* @return the preguntas clave
	* @throws com.ability.genero.server.NoSuchpreguntasClaveException if a preguntas clave with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ability.genero.server.model.preguntasClave findByPrimaryKey(
		int id)
		throws com.ability.genero.server.NoSuchpreguntasClaveException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the preguntas clave with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the preguntas clave
	* @return the preguntas clave, or <code>null</code> if a preguntas clave with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ability.genero.server.model.preguntasClave fetchByPrimaryKey(
		int id) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the preguntas claves.
	*
	* @return the preguntas claves
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ability.genero.server.model.preguntasClave> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the preguntas claves.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of preguntas claves
	* @param end the upper bound of the range of preguntas claves (not inclusive)
	* @return the range of preguntas claves
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ability.genero.server.model.preguntasClave> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the preguntas claves.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of preguntas claves
	* @param end the upper bound of the range of preguntas claves (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of preguntas claves
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ability.genero.server.model.preguntasClave> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the preguntas claves from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of preguntas claves.
	*
	* @return the number of preguntas claves
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}