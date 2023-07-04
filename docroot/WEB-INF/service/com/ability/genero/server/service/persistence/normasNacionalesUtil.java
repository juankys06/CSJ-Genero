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

import com.ability.genero.server.model.normasNacionales;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the normas nacionales service. This utility wraps {@link normasNacionalesPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author DELL Villartech
 * @see normasNacionalesPersistence
 * @see normasNacionalesPersistenceImpl
 * @generated
 */
public class normasNacionalesUtil {
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
	public static void clearCache(normasNacionales normasNacionales) {
		getPersistence().clearCache(normasNacionales);
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
	public static List<normasNacionales> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<normasNacionales> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<normasNacionales> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
	 */
	public static normasNacionales update(normasNacionales normasNacionales,
		boolean merge) throws SystemException {
		return getPersistence().update(normasNacionales, merge);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean, ServiceContext)
	 */
	public static normasNacionales update(normasNacionales normasNacionales,
		boolean merge, ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(normasNacionales, merge, serviceContext);
	}

	/**
	* Caches the normas nacionales in the entity cache if it is enabled.
	*
	* @param normasNacionales the normas nacionales
	*/
	public static void cacheResult(
		com.ability.genero.server.model.normasNacionales normasNacionales) {
		getPersistence().cacheResult(normasNacionales);
	}

	/**
	* Caches the normas nacionaleses in the entity cache if it is enabled.
	*
	* @param normasNacionaleses the normas nacionaleses
	*/
	public static void cacheResult(
		java.util.List<com.ability.genero.server.model.normasNacionales> normasNacionaleses) {
		getPersistence().cacheResult(normasNacionaleses);
	}

	/**
	* Creates a new normas nacionales with the primary key. Does not add the normas nacionales to the database.
	*
	* @param id the primary key for the new normas nacionales
	* @return the new normas nacionales
	*/
	public static com.ability.genero.server.model.normasNacionales create(
		int id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the normas nacionales with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the normas nacionales
	* @return the normas nacionales that was removed
	* @throws com.ability.genero.server.NoSuchnormasNacionalesException if a normas nacionales with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ability.genero.server.model.normasNacionales remove(
		int id)
		throws com.ability.genero.server.NoSuchnormasNacionalesException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().remove(id);
	}

	public static com.ability.genero.server.model.normasNacionales updateImpl(
		com.ability.genero.server.model.normasNacionales normasNacionales,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(normasNacionales, merge);
	}

	/**
	* Returns the normas nacionales with the primary key or throws a {@link com.ability.genero.server.NoSuchnormasNacionalesException} if it could not be found.
	*
	* @param id the primary key of the normas nacionales
	* @return the normas nacionales
	* @throws com.ability.genero.server.NoSuchnormasNacionalesException if a normas nacionales with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ability.genero.server.model.normasNacionales findByPrimaryKey(
		int id)
		throws com.ability.genero.server.NoSuchnormasNacionalesException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the normas nacionales with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the normas nacionales
	* @return the normas nacionales, or <code>null</code> if a normas nacionales with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ability.genero.server.model.normasNacionales fetchByPrimaryKey(
		int id) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	* Returns all the normas nacionaleses.
	*
	* @return the normas nacionaleses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ability.genero.server.model.normasNacionales> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the normas nacionaleses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of normas nacionaleses
	* @param end the upper bound of the range of normas nacionaleses (not inclusive)
	* @return the range of normas nacionaleses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ability.genero.server.model.normasNacionales> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the normas nacionaleses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of normas nacionaleses
	* @param end the upper bound of the range of normas nacionaleses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of normas nacionaleses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ability.genero.server.model.normasNacionales> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the normas nacionaleses from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of normas nacionaleses.
	*
	* @return the number of normas nacionaleses
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static normasNacionalesPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (normasNacionalesPersistence)PortletBeanLocatorUtil.locate(com.ability.genero.server.service.ClpSerializer.getServletContextName(),
					normasNacionalesPersistence.class.getName());

			ReferenceRegistry.registerReference(normasNacionalesUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated
	 */
	public void setPersistence(normasNacionalesPersistence persistence) {
	}

	private static normasNacionalesPersistence _persistence;
}