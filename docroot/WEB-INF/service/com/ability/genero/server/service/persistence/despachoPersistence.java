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

import com.ability.genero.server.model.despacho;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the despacho service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author DELL Villartech
 * @see despachoPersistenceImpl
 * @see despachoUtil
 * @generated
 */
public interface despachoPersistence extends BasePersistence<despacho> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link despachoUtil} to access the despacho persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the despacho in the entity cache if it is enabled.
	*
	* @param despacho the despacho
	*/
	public void cacheResult(com.ability.genero.server.model.despacho despacho);

	/**
	* Caches the despachos in the entity cache if it is enabled.
	*
	* @param despachos the despachos
	*/
	public void cacheResult(
		java.util.List<com.ability.genero.server.model.despacho> despachos);

	/**
	* Creates a new despacho with the primary key. Does not add the despacho to the database.
	*
	* @param id the primary key for the new despacho
	* @return the new despacho
	*/
	public com.ability.genero.server.model.despacho create(int id);

	/**
	* Removes the despacho with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the despacho
	* @return the despacho that was removed
	* @throws com.ability.genero.server.NoSuchdespachoException if a despacho with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ability.genero.server.model.despacho remove(int id)
		throws com.ability.genero.server.NoSuchdespachoException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.ability.genero.server.model.despacho updateImpl(
		com.ability.genero.server.model.despacho despacho, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the despacho with the primary key or throws a {@link com.ability.genero.server.NoSuchdespachoException} if it could not be found.
	*
	* @param id the primary key of the despacho
	* @return the despacho
	* @throws com.ability.genero.server.NoSuchdespachoException if a despacho with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ability.genero.server.model.despacho findByPrimaryKey(int id)
		throws com.ability.genero.server.NoSuchdespachoException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the despacho with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the despacho
	* @return the despacho, or <code>null</code> if a despacho with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ability.genero.server.model.despacho fetchByPrimaryKey(int id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the despachos where codigoDespacho = &#63;.
	*
	* @param codigoDespacho the codigo despacho
	* @return the matching despachos
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ability.genero.server.model.despacho> findByporDespacho(
		java.lang.String codigoDespacho)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the despachos where codigoDespacho = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param codigoDespacho the codigo despacho
	* @param start the lower bound of the range of despachos
	* @param end the upper bound of the range of despachos (not inclusive)
	* @return the range of matching despachos
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ability.genero.server.model.despacho> findByporDespacho(
		java.lang.String codigoDespacho, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the despachos where codigoDespacho = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param codigoDespacho the codigo despacho
	* @param start the lower bound of the range of despachos
	* @param end the upper bound of the range of despachos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching despachos
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ability.genero.server.model.despacho> findByporDespacho(
		java.lang.String codigoDespacho, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first despacho in the ordered set where codigoDespacho = &#63;.
	*
	* @param codigoDespacho the codigo despacho
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching despacho
	* @throws com.ability.genero.server.NoSuchdespachoException if a matching despacho could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ability.genero.server.model.despacho findByporDespacho_First(
		java.lang.String codigoDespacho,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.ability.genero.server.NoSuchdespachoException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first despacho in the ordered set where codigoDespacho = &#63;.
	*
	* @param codigoDespacho the codigo despacho
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching despacho, or <code>null</code> if a matching despacho could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ability.genero.server.model.despacho fetchByporDespacho_First(
		java.lang.String codigoDespacho,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last despacho in the ordered set where codigoDespacho = &#63;.
	*
	* @param codigoDespacho the codigo despacho
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching despacho
	* @throws com.ability.genero.server.NoSuchdespachoException if a matching despacho could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ability.genero.server.model.despacho findByporDespacho_Last(
		java.lang.String codigoDespacho,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.ability.genero.server.NoSuchdespachoException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last despacho in the ordered set where codigoDespacho = &#63;.
	*
	* @param codigoDespacho the codigo despacho
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching despacho, or <code>null</code> if a matching despacho could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ability.genero.server.model.despacho fetchByporDespacho_Last(
		java.lang.String codigoDespacho,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the despachos before and after the current despacho in the ordered set where codigoDespacho = &#63;.
	*
	* @param id the primary key of the current despacho
	* @param codigoDespacho the codigo despacho
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next despacho
	* @throws com.ability.genero.server.NoSuchdespachoException if a despacho with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ability.genero.server.model.despacho[] findByporDespacho_PrevAndNext(
		int id, java.lang.String codigoDespacho,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.ability.genero.server.NoSuchdespachoException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the despachos.
	*
	* @return the despachos
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ability.genero.server.model.despacho> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the despachos.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of despachos
	* @param end the upper bound of the range of despachos (not inclusive)
	* @return the range of despachos
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ability.genero.server.model.despacho> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the despachos.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of despachos
	* @param end the upper bound of the range of despachos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of despachos
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ability.genero.server.model.despacho> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the despachos where codigoDespacho = &#63; from the database.
	*
	* @param codigoDespacho the codigo despacho
	* @throws SystemException if a system exception occurred
	*/
	public void removeByporDespacho(java.lang.String codigoDespacho)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the despachos from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of despachos where codigoDespacho = &#63;.
	*
	* @param codigoDespacho the codigo despacho
	* @return the number of matching despachos
	* @throws SystemException if a system exception occurred
	*/
	public int countByporDespacho(java.lang.String codigoDespacho)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of despachos.
	*
	* @return the number of despachos
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}