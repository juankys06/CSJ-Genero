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

import com.ability.genero.server.model.casoLV;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the caso l v service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author DELL Villartech
 * @see casoLVPersistenceImpl
 * @see casoLVUtil
 * @generated
 */
public interface casoLVPersistence extends BasePersistence<casoLV> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link casoLVUtil} to access the caso l v persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the caso l v in the entity cache if it is enabled.
	*
	* @param casoLV the caso l v
	*/
	public void cacheResult(com.ability.genero.server.model.casoLV casoLV);

	/**
	* Caches the caso l vs in the entity cache if it is enabled.
	*
	* @param casoLVs the caso l vs
	*/
	public void cacheResult(
		java.util.List<com.ability.genero.server.model.casoLV> casoLVs);

	/**
	* Creates a new caso l v with the primary key. Does not add the caso l v to the database.
	*
	* @param id the primary key for the new caso l v
	* @return the new caso l v
	*/
	public com.ability.genero.server.model.casoLV create(int id);

	/**
	* Removes the caso l v with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the caso l v
	* @return the caso l v that was removed
	* @throws com.ability.genero.server.NoSuchcasoLVException if a caso l v with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ability.genero.server.model.casoLV remove(int id)
		throws com.ability.genero.server.NoSuchcasoLVException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.ability.genero.server.model.casoLV updateImpl(
		com.ability.genero.server.model.casoLV casoLV, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the caso l v with the primary key or throws a {@link com.ability.genero.server.NoSuchcasoLVException} if it could not be found.
	*
	* @param id the primary key of the caso l v
	* @return the caso l v
	* @throws com.ability.genero.server.NoSuchcasoLVException if a caso l v with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ability.genero.server.model.casoLV findByPrimaryKey(int id)
		throws com.ability.genero.server.NoSuchcasoLVException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the caso l v with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the caso l v
	* @return the caso l v, or <code>null</code> if a caso l v with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ability.genero.server.model.casoLV fetchByPrimaryKey(int id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the caso l vs where despacho = &#63;.
	*
	* @param despacho the despacho
	* @return the matching caso l vs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ability.genero.server.model.casoLV> findByporDespacho(
		java.lang.String despacho)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the caso l vs where despacho = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param despacho the despacho
	* @param start the lower bound of the range of caso l vs
	* @param end the upper bound of the range of caso l vs (not inclusive)
	* @return the range of matching caso l vs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ability.genero.server.model.casoLV> findByporDespacho(
		java.lang.String despacho, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the caso l vs where despacho = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param despacho the despacho
	* @param start the lower bound of the range of caso l vs
	* @param end the upper bound of the range of caso l vs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching caso l vs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ability.genero.server.model.casoLV> findByporDespacho(
		java.lang.String despacho, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first caso l v in the ordered set where despacho = &#63;.
	*
	* @param despacho the despacho
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching caso l v
	* @throws com.ability.genero.server.NoSuchcasoLVException if a matching caso l v could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ability.genero.server.model.casoLV findByporDespacho_First(
		java.lang.String despacho,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.ability.genero.server.NoSuchcasoLVException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first caso l v in the ordered set where despacho = &#63;.
	*
	* @param despacho the despacho
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching caso l v, or <code>null</code> if a matching caso l v could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ability.genero.server.model.casoLV fetchByporDespacho_First(
		java.lang.String despacho,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last caso l v in the ordered set where despacho = &#63;.
	*
	* @param despacho the despacho
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching caso l v
	* @throws com.ability.genero.server.NoSuchcasoLVException if a matching caso l v could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ability.genero.server.model.casoLV findByporDespacho_Last(
		java.lang.String despacho,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.ability.genero.server.NoSuchcasoLVException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last caso l v in the ordered set where despacho = &#63;.
	*
	* @param despacho the despacho
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching caso l v, or <code>null</code> if a matching caso l v could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ability.genero.server.model.casoLV fetchByporDespacho_Last(
		java.lang.String despacho,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the caso l vs before and after the current caso l v in the ordered set where despacho = &#63;.
	*
	* @param id the primary key of the current caso l v
	* @param despacho the despacho
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next caso l v
	* @throws com.ability.genero.server.NoSuchcasoLVException if a caso l v with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ability.genero.server.model.casoLV[] findByporDespacho_PrevAndNext(
		int id, java.lang.String despacho,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.ability.genero.server.NoSuchcasoLVException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the caso l vs where despacho = &#63; and anhio = &#63;.
	*
	* @param despacho the despacho
	* @param anhio the anhio
	* @return the matching caso l vs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ability.genero.server.model.casoLV> findByporAnhio(
		java.lang.String despacho, java.lang.String anhio)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the caso l vs where despacho = &#63; and anhio = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param despacho the despacho
	* @param anhio the anhio
	* @param start the lower bound of the range of caso l vs
	* @param end the upper bound of the range of caso l vs (not inclusive)
	* @return the range of matching caso l vs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ability.genero.server.model.casoLV> findByporAnhio(
		java.lang.String despacho, java.lang.String anhio, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the caso l vs where despacho = &#63; and anhio = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param despacho the despacho
	* @param anhio the anhio
	* @param start the lower bound of the range of caso l vs
	* @param end the upper bound of the range of caso l vs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching caso l vs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ability.genero.server.model.casoLV> findByporAnhio(
		java.lang.String despacho, java.lang.String anhio, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first caso l v in the ordered set where despacho = &#63; and anhio = &#63;.
	*
	* @param despacho the despacho
	* @param anhio the anhio
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching caso l v
	* @throws com.ability.genero.server.NoSuchcasoLVException if a matching caso l v could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ability.genero.server.model.casoLV findByporAnhio_First(
		java.lang.String despacho, java.lang.String anhio,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.ability.genero.server.NoSuchcasoLVException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first caso l v in the ordered set where despacho = &#63; and anhio = &#63;.
	*
	* @param despacho the despacho
	* @param anhio the anhio
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching caso l v, or <code>null</code> if a matching caso l v could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ability.genero.server.model.casoLV fetchByporAnhio_First(
		java.lang.String despacho, java.lang.String anhio,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last caso l v in the ordered set where despacho = &#63; and anhio = &#63;.
	*
	* @param despacho the despacho
	* @param anhio the anhio
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching caso l v
	* @throws com.ability.genero.server.NoSuchcasoLVException if a matching caso l v could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ability.genero.server.model.casoLV findByporAnhio_Last(
		java.lang.String despacho, java.lang.String anhio,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.ability.genero.server.NoSuchcasoLVException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last caso l v in the ordered set where despacho = &#63; and anhio = &#63;.
	*
	* @param despacho the despacho
	* @param anhio the anhio
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching caso l v, or <code>null</code> if a matching caso l v could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ability.genero.server.model.casoLV fetchByporAnhio_Last(
		java.lang.String despacho, java.lang.String anhio,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the caso l vs before and after the current caso l v in the ordered set where despacho = &#63; and anhio = &#63;.
	*
	* @param id the primary key of the current caso l v
	* @param despacho the despacho
	* @param anhio the anhio
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next caso l v
	* @throws com.ability.genero.server.NoSuchcasoLVException if a caso l v with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ability.genero.server.model.casoLV[] findByporAnhio_PrevAndNext(
		int id, java.lang.String despacho, java.lang.String anhio,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.ability.genero.server.NoSuchcasoLVException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the caso l vs where anhio = &#63;.
	*
	* @param anhio the anhio
	* @return the matching caso l vs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ability.genero.server.model.casoLV> findByporAnhioAdmin(
		java.lang.String anhio)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the caso l vs where anhio = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param anhio the anhio
	* @param start the lower bound of the range of caso l vs
	* @param end the upper bound of the range of caso l vs (not inclusive)
	* @return the range of matching caso l vs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ability.genero.server.model.casoLV> findByporAnhioAdmin(
		java.lang.String anhio, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the caso l vs where anhio = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param anhio the anhio
	* @param start the lower bound of the range of caso l vs
	* @param end the upper bound of the range of caso l vs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching caso l vs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ability.genero.server.model.casoLV> findByporAnhioAdmin(
		java.lang.String anhio, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first caso l v in the ordered set where anhio = &#63;.
	*
	* @param anhio the anhio
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching caso l v
	* @throws com.ability.genero.server.NoSuchcasoLVException if a matching caso l v could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ability.genero.server.model.casoLV findByporAnhioAdmin_First(
		java.lang.String anhio,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.ability.genero.server.NoSuchcasoLVException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first caso l v in the ordered set where anhio = &#63;.
	*
	* @param anhio the anhio
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching caso l v, or <code>null</code> if a matching caso l v could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ability.genero.server.model.casoLV fetchByporAnhioAdmin_First(
		java.lang.String anhio,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last caso l v in the ordered set where anhio = &#63;.
	*
	* @param anhio the anhio
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching caso l v
	* @throws com.ability.genero.server.NoSuchcasoLVException if a matching caso l v could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ability.genero.server.model.casoLV findByporAnhioAdmin_Last(
		java.lang.String anhio,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.ability.genero.server.NoSuchcasoLVException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last caso l v in the ordered set where anhio = &#63;.
	*
	* @param anhio the anhio
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching caso l v, or <code>null</code> if a matching caso l v could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ability.genero.server.model.casoLV fetchByporAnhioAdmin_Last(
		java.lang.String anhio,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the caso l vs before and after the current caso l v in the ordered set where anhio = &#63;.
	*
	* @param id the primary key of the current caso l v
	* @param anhio the anhio
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next caso l v
	* @throws com.ability.genero.server.NoSuchcasoLVException if a caso l v with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ability.genero.server.model.casoLV[] findByporAnhioAdmin_PrevAndNext(
		int id, java.lang.String anhio,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.ability.genero.server.NoSuchcasoLVException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the caso l vs.
	*
	* @return the caso l vs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ability.genero.server.model.casoLV> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the caso l vs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of caso l vs
	* @param end the upper bound of the range of caso l vs (not inclusive)
	* @return the range of caso l vs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ability.genero.server.model.casoLV> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the caso l vs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of caso l vs
	* @param end the upper bound of the range of caso l vs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of caso l vs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ability.genero.server.model.casoLV> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the caso l vs where despacho = &#63; from the database.
	*
	* @param despacho the despacho
	* @throws SystemException if a system exception occurred
	*/
	public void removeByporDespacho(java.lang.String despacho)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the caso l vs where despacho = &#63; and anhio = &#63; from the database.
	*
	* @param despacho the despacho
	* @param anhio the anhio
	* @throws SystemException if a system exception occurred
	*/
	public void removeByporAnhio(java.lang.String despacho,
		java.lang.String anhio)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the caso l vs where anhio = &#63; from the database.
	*
	* @param anhio the anhio
	* @throws SystemException if a system exception occurred
	*/
	public void removeByporAnhioAdmin(java.lang.String anhio)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the caso l vs from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of caso l vs where despacho = &#63;.
	*
	* @param despacho the despacho
	* @return the number of matching caso l vs
	* @throws SystemException if a system exception occurred
	*/
	public int countByporDespacho(java.lang.String despacho)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of caso l vs where despacho = &#63; and anhio = &#63;.
	*
	* @param despacho the despacho
	* @param anhio the anhio
	* @return the number of matching caso l vs
	* @throws SystemException if a system exception occurred
	*/
	public int countByporAnhio(java.lang.String despacho, java.lang.String anhio)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of caso l vs where anhio = &#63;.
	*
	* @param anhio the anhio
	* @return the number of matching caso l vs
	* @throws SystemException if a system exception occurred
	*/
	public int countByporAnhioAdmin(java.lang.String anhio)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of caso l vs.
	*
	* @return the number of caso l vs
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}