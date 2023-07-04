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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the caso l v service. This utility wraps {@link casoLVPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author DELL Villartech
 * @see casoLVPersistence
 * @see casoLVPersistenceImpl
 * @generated
 */
public class casoLVUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
	 */
	public static void clearCache(casoLV casoLV) {
		getPersistence().clearCache(casoLV);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public long countWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<casoLV> findWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<casoLV> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<casoLV> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
	 */
	public static casoLV update(casoLV casoLV, boolean merge)
		throws SystemException {
		return getPersistence().update(casoLV, merge);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean, ServiceContext)
	 */
	public static casoLV update(casoLV casoLV, boolean merge,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(casoLV, merge, serviceContext);
	}

	/**
	* Caches the caso l v in the entity cache if it is enabled.
	*
	* @param casoLV the caso l v
	*/
	public static void cacheResult(
		com.ability.genero.server.model.casoLV casoLV) {
		getPersistence().cacheResult(casoLV);
	}

	/**
	* Caches the caso l vs in the entity cache if it is enabled.
	*
	* @param casoLVs the caso l vs
	*/
	public static void cacheResult(
		java.util.List<com.ability.genero.server.model.casoLV> casoLVs) {
		getPersistence().cacheResult(casoLVs);
	}

	/**
	* Creates a new caso l v with the primary key. Does not add the caso l v to the database.
	*
	* @param id the primary key for the new caso l v
	* @return the new caso l v
	*/
	public static com.ability.genero.server.model.casoLV create(int id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the caso l v with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the caso l v
	* @return the caso l v that was removed
	* @throws com.ability.genero.server.NoSuchcasoLVException if a caso l v with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ability.genero.server.model.casoLV remove(int id)
		throws com.ability.genero.server.NoSuchcasoLVException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().remove(id);
	}

	public static com.ability.genero.server.model.casoLV updateImpl(
		com.ability.genero.server.model.casoLV casoLV, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(casoLV, merge);
	}

	/**
	* Returns the caso l v with the primary key or throws a {@link com.ability.genero.server.NoSuchcasoLVException} if it could not be found.
	*
	* @param id the primary key of the caso l v
	* @return the caso l v
	* @throws com.ability.genero.server.NoSuchcasoLVException if a caso l v with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ability.genero.server.model.casoLV findByPrimaryKey(
		int id)
		throws com.ability.genero.server.NoSuchcasoLVException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the caso l v with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the caso l v
	* @return the caso l v, or <code>null</code> if a caso l v with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ability.genero.server.model.casoLV fetchByPrimaryKey(
		int id) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	* Returns all the caso l vs where despacho = &#63;.
	*
	* @param despacho the despacho
	* @return the matching caso l vs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ability.genero.server.model.casoLV> findByporDespacho(
		java.lang.String despacho)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByporDespacho(despacho);
	}

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
	public static java.util.List<com.ability.genero.server.model.casoLV> findByporDespacho(
		java.lang.String despacho, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByporDespacho(despacho, start, end);
	}

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
	public static java.util.List<com.ability.genero.server.model.casoLV> findByporDespacho(
		java.lang.String despacho, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByporDespacho(despacho, start, end, orderByComparator);
	}

	/**
	* Returns the first caso l v in the ordered set where despacho = &#63;.
	*
	* @param despacho the despacho
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching caso l v
	* @throws com.ability.genero.server.NoSuchcasoLVException if a matching caso l v could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ability.genero.server.model.casoLV findByporDespacho_First(
		java.lang.String despacho,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.ability.genero.server.NoSuchcasoLVException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByporDespacho_First(despacho, orderByComparator);
	}

	/**
	* Returns the first caso l v in the ordered set where despacho = &#63;.
	*
	* @param despacho the despacho
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching caso l v, or <code>null</code> if a matching caso l v could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ability.genero.server.model.casoLV fetchByporDespacho_First(
		java.lang.String despacho,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByporDespacho_First(despacho, orderByComparator);
	}

	/**
	* Returns the last caso l v in the ordered set where despacho = &#63;.
	*
	* @param despacho the despacho
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching caso l v
	* @throws com.ability.genero.server.NoSuchcasoLVException if a matching caso l v could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ability.genero.server.model.casoLV findByporDespacho_Last(
		java.lang.String despacho,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.ability.genero.server.NoSuchcasoLVException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByporDespacho_Last(despacho, orderByComparator);
	}

	/**
	* Returns the last caso l v in the ordered set where despacho = &#63;.
	*
	* @param despacho the despacho
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching caso l v, or <code>null</code> if a matching caso l v could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ability.genero.server.model.casoLV fetchByporDespacho_Last(
		java.lang.String despacho,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByporDespacho_Last(despacho, orderByComparator);
	}

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
	public static com.ability.genero.server.model.casoLV[] findByporDespacho_PrevAndNext(
		int id, java.lang.String despacho,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.ability.genero.server.NoSuchcasoLVException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByporDespacho_PrevAndNext(id, despacho,
			orderByComparator);
	}

	/**
	* Returns all the caso l vs where despacho = &#63; and anhio = &#63;.
	*
	* @param despacho the despacho
	* @param anhio the anhio
	* @return the matching caso l vs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ability.genero.server.model.casoLV> findByporAnhio(
		java.lang.String despacho, java.lang.String anhio)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByporAnhio(despacho, anhio);
	}

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
	public static java.util.List<com.ability.genero.server.model.casoLV> findByporAnhio(
		java.lang.String despacho, java.lang.String anhio, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByporAnhio(despacho, anhio, start, end);
	}

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
	public static java.util.List<com.ability.genero.server.model.casoLV> findByporAnhio(
		java.lang.String despacho, java.lang.String anhio, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByporAnhio(despacho, anhio, start, end,
			orderByComparator);
	}

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
	public static com.ability.genero.server.model.casoLV findByporAnhio_First(
		java.lang.String despacho, java.lang.String anhio,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.ability.genero.server.NoSuchcasoLVException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByporAnhio_First(despacho, anhio, orderByComparator);
	}

	/**
	* Returns the first caso l v in the ordered set where despacho = &#63; and anhio = &#63;.
	*
	* @param despacho the despacho
	* @param anhio the anhio
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching caso l v, or <code>null</code> if a matching caso l v could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ability.genero.server.model.casoLV fetchByporAnhio_First(
		java.lang.String despacho, java.lang.String anhio,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByporAnhio_First(despacho, anhio, orderByComparator);
	}

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
	public static com.ability.genero.server.model.casoLV findByporAnhio_Last(
		java.lang.String despacho, java.lang.String anhio,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.ability.genero.server.NoSuchcasoLVException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByporAnhio_Last(despacho, anhio, orderByComparator);
	}

	/**
	* Returns the last caso l v in the ordered set where despacho = &#63; and anhio = &#63;.
	*
	* @param despacho the despacho
	* @param anhio the anhio
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching caso l v, or <code>null</code> if a matching caso l v could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ability.genero.server.model.casoLV fetchByporAnhio_Last(
		java.lang.String despacho, java.lang.String anhio,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByporAnhio_Last(despacho, anhio, orderByComparator);
	}

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
	public static com.ability.genero.server.model.casoLV[] findByporAnhio_PrevAndNext(
		int id, java.lang.String despacho, java.lang.String anhio,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.ability.genero.server.NoSuchcasoLVException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByporAnhio_PrevAndNext(id, despacho, anhio,
			orderByComparator);
	}

	/**
	* Returns all the caso l vs where anhio = &#63;.
	*
	* @param anhio the anhio
	* @return the matching caso l vs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ability.genero.server.model.casoLV> findByporAnhioAdmin(
		java.lang.String anhio)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByporAnhioAdmin(anhio);
	}

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
	public static java.util.List<com.ability.genero.server.model.casoLV> findByporAnhioAdmin(
		java.lang.String anhio, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByporAnhioAdmin(anhio, start, end);
	}

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
	public static java.util.List<com.ability.genero.server.model.casoLV> findByporAnhioAdmin(
		java.lang.String anhio, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByporAnhioAdmin(anhio, start, end, orderByComparator);
	}

	/**
	* Returns the first caso l v in the ordered set where anhio = &#63;.
	*
	* @param anhio the anhio
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching caso l v
	* @throws com.ability.genero.server.NoSuchcasoLVException if a matching caso l v could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ability.genero.server.model.casoLV findByporAnhioAdmin_First(
		java.lang.String anhio,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.ability.genero.server.NoSuchcasoLVException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByporAnhioAdmin_First(anhio, orderByComparator);
	}

	/**
	* Returns the first caso l v in the ordered set where anhio = &#63;.
	*
	* @param anhio the anhio
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching caso l v, or <code>null</code> if a matching caso l v could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ability.genero.server.model.casoLV fetchByporAnhioAdmin_First(
		java.lang.String anhio,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByporAnhioAdmin_First(anhio, orderByComparator);
	}

	/**
	* Returns the last caso l v in the ordered set where anhio = &#63;.
	*
	* @param anhio the anhio
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching caso l v
	* @throws com.ability.genero.server.NoSuchcasoLVException if a matching caso l v could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ability.genero.server.model.casoLV findByporAnhioAdmin_Last(
		java.lang.String anhio,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.ability.genero.server.NoSuchcasoLVException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByporAnhioAdmin_Last(anhio, orderByComparator);
	}

	/**
	* Returns the last caso l v in the ordered set where anhio = &#63;.
	*
	* @param anhio the anhio
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching caso l v, or <code>null</code> if a matching caso l v could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ability.genero.server.model.casoLV fetchByporAnhioAdmin_Last(
		java.lang.String anhio,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByporAnhioAdmin_Last(anhio, orderByComparator);
	}

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
	public static com.ability.genero.server.model.casoLV[] findByporAnhioAdmin_PrevAndNext(
		int id, java.lang.String anhio,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.ability.genero.server.NoSuchcasoLVException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByporAnhioAdmin_PrevAndNext(id, anhio, orderByComparator);
	}

	/**
	* Returns all the caso l vs.
	*
	* @return the caso l vs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ability.genero.server.model.casoLV> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

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
	public static java.util.List<com.ability.genero.server.model.casoLV> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

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
	public static java.util.List<com.ability.genero.server.model.casoLV> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the caso l vs where despacho = &#63; from the database.
	*
	* @param despacho the despacho
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByporDespacho(java.lang.String despacho)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByporDespacho(despacho);
	}

	/**
	* Removes all the caso l vs where despacho = &#63; and anhio = &#63; from the database.
	*
	* @param despacho the despacho
	* @param anhio the anhio
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByporAnhio(java.lang.String despacho,
		java.lang.String anhio)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByporAnhio(despacho, anhio);
	}

	/**
	* Removes all the caso l vs where anhio = &#63; from the database.
	*
	* @param anhio the anhio
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByporAnhioAdmin(java.lang.String anhio)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByporAnhioAdmin(anhio);
	}

	/**
	* Removes all the caso l vs from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of caso l vs where despacho = &#63;.
	*
	* @param despacho the despacho
	* @return the number of matching caso l vs
	* @throws SystemException if a system exception occurred
	*/
	public static int countByporDespacho(java.lang.String despacho)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByporDespacho(despacho);
	}

	/**
	* Returns the number of caso l vs where despacho = &#63; and anhio = &#63;.
	*
	* @param despacho the despacho
	* @param anhio the anhio
	* @return the number of matching caso l vs
	* @throws SystemException if a system exception occurred
	*/
	public static int countByporAnhio(java.lang.String despacho,
		java.lang.String anhio)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByporAnhio(despacho, anhio);
	}

	/**
	* Returns the number of caso l vs where anhio = &#63;.
	*
	* @param anhio the anhio
	* @return the number of matching caso l vs
	* @throws SystemException if a system exception occurred
	*/
	public static int countByporAnhioAdmin(java.lang.String anhio)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByporAnhioAdmin(anhio);
	}

	/**
	* Returns the number of caso l vs.
	*
	* @return the number of caso l vs
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static casoLVPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (casoLVPersistence)PortletBeanLocatorUtil.locate(com.ability.genero.server.service.ClpSerializer.getServletContextName(),
					casoLVPersistence.class.getName());

			ReferenceRegistry.registerReference(casoLVUtil.class, "_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated
	 */
	public void setPersistence(casoLVPersistence persistence) {
	}

	private static casoLVPersistence _persistence;
}