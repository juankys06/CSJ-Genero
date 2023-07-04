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

import com.ability.genero.server.model.juresprudenciaInternacional;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the juresprudencia internacional service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author DELL Villartech
 * @see juresprudenciaInternacionalPersistenceImpl
 * @see juresprudenciaInternacionalUtil
 * @generated
 */
public interface juresprudenciaInternacionalPersistence extends BasePersistence<juresprudenciaInternacional> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link juresprudenciaInternacionalUtil} to access the juresprudencia internacional persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the juresprudencia internacional in the entity cache if it is enabled.
	*
	* @param juresprudenciaInternacional the juresprudencia internacional
	*/
	public void cacheResult(
		com.ability.genero.server.model.juresprudenciaInternacional juresprudenciaInternacional);

	/**
	* Caches the juresprudencia internacionals in the entity cache if it is enabled.
	*
	* @param juresprudenciaInternacionals the juresprudencia internacionals
	*/
	public void cacheResult(
		java.util.List<com.ability.genero.server.model.juresprudenciaInternacional> juresprudenciaInternacionals);

	/**
	* Creates a new juresprudencia internacional with the primary key. Does not add the juresprudencia internacional to the database.
	*
	* @param id the primary key for the new juresprudencia internacional
	* @return the new juresprudencia internacional
	*/
	public com.ability.genero.server.model.juresprudenciaInternacional create(
		int id);

	/**
	* Removes the juresprudencia internacional with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the juresprudencia internacional
	* @return the juresprudencia internacional that was removed
	* @throws com.ability.genero.server.NoSuchjuresprudenciaInternacionalException if a juresprudencia internacional with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ability.genero.server.model.juresprudenciaInternacional remove(
		int id)
		throws com.ability.genero.server.NoSuchjuresprudenciaInternacionalException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.ability.genero.server.model.juresprudenciaInternacional updateImpl(
		com.ability.genero.server.model.juresprudenciaInternacional juresprudenciaInternacional,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the juresprudencia internacional with the primary key or throws a {@link com.ability.genero.server.NoSuchjuresprudenciaInternacionalException} if it could not be found.
	*
	* @param id the primary key of the juresprudencia internacional
	* @return the juresprudencia internacional
	* @throws com.ability.genero.server.NoSuchjuresprudenciaInternacionalException if a juresprudencia internacional with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ability.genero.server.model.juresprudenciaInternacional findByPrimaryKey(
		int id)
		throws com.ability.genero.server.NoSuchjuresprudenciaInternacionalException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the juresprudencia internacional with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the juresprudencia internacional
	* @return the juresprudencia internacional, or <code>null</code> if a juresprudencia internacional with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ability.genero.server.model.juresprudenciaInternacional fetchByPrimaryKey(
		int id) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the juresprudencia internacionals.
	*
	* @return the juresprudencia internacionals
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ability.genero.server.model.juresprudenciaInternacional> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the juresprudencia internacionals.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of juresprudencia internacionals
	* @param end the upper bound of the range of juresprudencia internacionals (not inclusive)
	* @return the range of juresprudencia internacionals
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ability.genero.server.model.juresprudenciaInternacional> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the juresprudencia internacionals.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of juresprudencia internacionals
	* @param end the upper bound of the range of juresprudencia internacionals (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of juresprudencia internacionals
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ability.genero.server.model.juresprudenciaInternacional> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the juresprudencia internacionals from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of juresprudencia internacionals.
	*
	* @return the number of juresprudencia internacionals
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}