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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the despacho service. This utility wraps {@link despachoPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author DELL Villartech
 * @see despachoPersistence
 * @see despachoPersistenceImpl
 * @generated
 */
public class despachoUtil {
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
	public static void clearCache(despacho despacho) {
		getPersistence().clearCache(despacho);
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
	public static List<despacho> findWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<despacho> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<despacho> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
	 */
	public static despacho update(despacho despacho, boolean merge)
		throws SystemException {
		return getPersistence().update(despacho, merge);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean, ServiceContext)
	 */
	public static despacho update(despacho despacho, boolean merge,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(despacho, merge, serviceContext);
	}

	/**
	* Caches the despacho in the entity cache if it is enabled.
	*
	* @param despacho the despacho
	*/
	public static void cacheResult(
		com.ability.genero.server.model.despacho despacho) {
		getPersistence().cacheResult(despacho);
	}

	/**
	* Caches the despachos in the entity cache if it is enabled.
	*
	* @param despachos the despachos
	*/
	public static void cacheResult(
		java.util.List<com.ability.genero.server.model.despacho> despachos) {
		getPersistence().cacheResult(despachos);
	}

	/**
	* Creates a new despacho with the primary key. Does not add the despacho to the database.
	*
	* @param id the primary key for the new despacho
	* @return the new despacho
	*/
	public static com.ability.genero.server.model.despacho create(int id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the despacho with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the despacho
	* @return the despacho that was removed
	* @throws com.ability.genero.server.NoSuchdespachoException if a despacho with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ability.genero.server.model.despacho remove(int id)
		throws com.ability.genero.server.NoSuchdespachoException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().remove(id);
	}

	public static com.ability.genero.server.model.despacho updateImpl(
		com.ability.genero.server.model.despacho despacho, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(despacho, merge);
	}

	/**
	* Returns the despacho with the primary key or throws a {@link com.ability.genero.server.NoSuchdespachoException} if it could not be found.
	*
	* @param id the primary key of the despacho
	* @return the despacho
	* @throws com.ability.genero.server.NoSuchdespachoException if a despacho with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ability.genero.server.model.despacho findByPrimaryKey(
		int id)
		throws com.ability.genero.server.NoSuchdespachoException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the despacho with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the despacho
	* @return the despacho, or <code>null</code> if a despacho with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ability.genero.server.model.despacho fetchByPrimaryKey(
		int id) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	* Returns all the despachos where codigoDespacho = &#63;.
	*
	* @param codigoDespacho the codigo despacho
	* @return the matching despachos
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ability.genero.server.model.despacho> findByporDespacho(
		java.lang.String codigoDespacho)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByporDespacho(codigoDespacho);
	}

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
	public static java.util.List<com.ability.genero.server.model.despacho> findByporDespacho(
		java.lang.String codigoDespacho, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByporDespacho(codigoDespacho, start, end);
	}

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
	public static java.util.List<com.ability.genero.server.model.despacho> findByporDespacho(
		java.lang.String codigoDespacho, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByporDespacho(codigoDespacho, start, end,
			orderByComparator);
	}

	/**
	* Returns the first despacho in the ordered set where codigoDespacho = &#63;.
	*
	* @param codigoDespacho the codigo despacho
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching despacho
	* @throws com.ability.genero.server.NoSuchdespachoException if a matching despacho could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ability.genero.server.model.despacho findByporDespacho_First(
		java.lang.String codigoDespacho,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.ability.genero.server.NoSuchdespachoException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByporDespacho_First(codigoDespacho, orderByComparator);
	}

	/**
	* Returns the first despacho in the ordered set where codigoDespacho = &#63;.
	*
	* @param codigoDespacho the codigo despacho
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching despacho, or <code>null</code> if a matching despacho could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ability.genero.server.model.despacho fetchByporDespacho_First(
		java.lang.String codigoDespacho,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByporDespacho_First(codigoDespacho, orderByComparator);
	}

	/**
	* Returns the last despacho in the ordered set where codigoDespacho = &#63;.
	*
	* @param codigoDespacho the codigo despacho
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching despacho
	* @throws com.ability.genero.server.NoSuchdespachoException if a matching despacho could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ability.genero.server.model.despacho findByporDespacho_Last(
		java.lang.String codigoDespacho,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.ability.genero.server.NoSuchdespachoException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByporDespacho_Last(codigoDespacho, orderByComparator);
	}

	/**
	* Returns the last despacho in the ordered set where codigoDespacho = &#63;.
	*
	* @param codigoDespacho the codigo despacho
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching despacho, or <code>null</code> if a matching despacho could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ability.genero.server.model.despacho fetchByporDespacho_Last(
		java.lang.String codigoDespacho,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByporDespacho_Last(codigoDespacho, orderByComparator);
	}

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
	public static com.ability.genero.server.model.despacho[] findByporDespacho_PrevAndNext(
		int id, java.lang.String codigoDespacho,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.ability.genero.server.NoSuchdespachoException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByporDespacho_PrevAndNext(id, codigoDespacho,
			orderByComparator);
	}

	/**
	* Returns all the despachos.
	*
	* @return the despachos
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ability.genero.server.model.despacho> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

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
	public static java.util.List<com.ability.genero.server.model.despacho> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

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
	public static java.util.List<com.ability.genero.server.model.despacho> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the despachos where codigoDespacho = &#63; from the database.
	*
	* @param codigoDespacho the codigo despacho
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByporDespacho(java.lang.String codigoDespacho)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByporDespacho(codigoDespacho);
	}

	/**
	* Removes all the despachos from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of despachos where codigoDespacho = &#63;.
	*
	* @param codigoDespacho the codigo despacho
	* @return the number of matching despachos
	* @throws SystemException if a system exception occurred
	*/
	public static int countByporDespacho(java.lang.String codigoDespacho)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByporDespacho(codigoDespacho);
	}

	/**
	* Returns the number of despachos.
	*
	* @return the number of despachos
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static despachoPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (despachoPersistence)PortletBeanLocatorUtil.locate(com.ability.genero.server.service.ClpSerializer.getServletContextName(),
					despachoPersistence.class.getName());

			ReferenceRegistry.registerReference(despachoUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated
	 */
	public void setPersistence(despachoPersistence persistence) {
	}

	private static despachoPersistence _persistence;
}