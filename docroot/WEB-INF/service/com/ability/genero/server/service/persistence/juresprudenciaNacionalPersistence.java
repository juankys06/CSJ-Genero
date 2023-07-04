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

import com.ability.genero.server.model.juresprudenciaNacional;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the juresprudencia nacional service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author DELL Villartech
 * @see juresprudenciaNacionalPersistenceImpl
 * @see juresprudenciaNacionalUtil
 * @generated
 */
public interface juresprudenciaNacionalPersistence extends BasePersistence<juresprudenciaNacional> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link juresprudenciaNacionalUtil} to access the juresprudencia nacional persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the juresprudencia nacional in the entity cache if it is enabled.
	*
	* @param juresprudenciaNacional the juresprudencia nacional
	*/
	public void cacheResult(
		com.ability.genero.server.model.juresprudenciaNacional juresprudenciaNacional);

	/**
	* Caches the juresprudencia nacionals in the entity cache if it is enabled.
	*
	* @param juresprudenciaNacionals the juresprudencia nacionals
	*/
	public void cacheResult(
		java.util.List<com.ability.genero.server.model.juresprudenciaNacional> juresprudenciaNacionals);

	/**
	* Creates a new juresprudencia nacional with the primary key. Does not add the juresprudencia nacional to the database.
	*
	* @param id the primary key for the new juresprudencia nacional
	* @return the new juresprudencia nacional
	*/
	public com.ability.genero.server.model.juresprudenciaNacional create(int id);

	/**
	* Removes the juresprudencia nacional with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the juresprudencia nacional
	* @return the juresprudencia nacional that was removed
	* @throws com.ability.genero.server.NoSuchjuresprudenciaNacionalException if a juresprudencia nacional with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ability.genero.server.model.juresprudenciaNacional remove(int id)
		throws com.ability.genero.server.NoSuchjuresprudenciaNacionalException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.ability.genero.server.model.juresprudenciaNacional updateImpl(
		com.ability.genero.server.model.juresprudenciaNacional juresprudenciaNacional,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the juresprudencia nacional with the primary key or throws a {@link com.ability.genero.server.NoSuchjuresprudenciaNacionalException} if it could not be found.
	*
	* @param id the primary key of the juresprudencia nacional
	* @return the juresprudencia nacional
	* @throws com.ability.genero.server.NoSuchjuresprudenciaNacionalException if a juresprudencia nacional with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ability.genero.server.model.juresprudenciaNacional findByPrimaryKey(
		int id)
		throws com.ability.genero.server.NoSuchjuresprudenciaNacionalException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the juresprudencia nacional with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the juresprudencia nacional
	* @return the juresprudencia nacional, or <code>null</code> if a juresprudencia nacional with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ability.genero.server.model.juresprudenciaNacional fetchByPrimaryKey(
		int id) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the juresprudencia nacionals.
	*
	* @return the juresprudencia nacionals
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ability.genero.server.model.juresprudenciaNacional> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the juresprudencia nacionals.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of juresprudencia nacionals
	* @param end the upper bound of the range of juresprudencia nacionals (not inclusive)
	* @return the range of juresprudencia nacionals
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ability.genero.server.model.juresprudenciaNacional> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the juresprudencia nacionals.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of juresprudencia nacionals
	* @param end the upper bound of the range of juresprudencia nacionals (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of juresprudencia nacionals
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ability.genero.server.model.juresprudenciaNacional> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the juresprudencia nacionals from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of juresprudencia nacionals.
	*
	* @return the number of juresprudencia nacionals
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}