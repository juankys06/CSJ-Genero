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

import com.ability.genero.server.model.claseProceso;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the clase proceso service. This utility wraps {@link claseProcesoPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author DELL Villartech
 * @see claseProcesoPersistence
 * @see claseProcesoPersistenceImpl
 * @generated
 */
public class claseProcesoUtil {
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
	public static void clearCache(claseProceso claseProceso) {
		getPersistence().clearCache(claseProceso);
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
	public static List<claseProceso> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<claseProceso> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<claseProceso> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
	 */
	public static claseProceso update(claseProceso claseProceso, boolean merge)
		throws SystemException {
		return getPersistence().update(claseProceso, merge);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean, ServiceContext)
	 */
	public static claseProceso update(claseProceso claseProceso, boolean merge,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(claseProceso, merge, serviceContext);
	}

	/**
	* Caches the clase proceso in the entity cache if it is enabled.
	*
	* @param claseProceso the clase proceso
	*/
	public static void cacheResult(
		com.ability.genero.server.model.claseProceso claseProceso) {
		getPersistence().cacheResult(claseProceso);
	}

	/**
	* Caches the clase procesos in the entity cache if it is enabled.
	*
	* @param claseProcesos the clase procesos
	*/
	public static void cacheResult(
		java.util.List<com.ability.genero.server.model.claseProceso> claseProcesos) {
		getPersistence().cacheResult(claseProcesos);
	}

	/**
	* Creates a new clase proceso with the primary key. Does not add the clase proceso to the database.
	*
	* @param id the primary key for the new clase proceso
	* @return the new clase proceso
	*/
	public static com.ability.genero.server.model.claseProceso create(int id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the clase proceso with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the clase proceso
	* @return the clase proceso that was removed
	* @throws com.ability.genero.server.NoSuchclaseProcesoException if a clase proceso with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ability.genero.server.model.claseProceso remove(int id)
		throws com.ability.genero.server.NoSuchclaseProcesoException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().remove(id);
	}

	public static com.ability.genero.server.model.claseProceso updateImpl(
		com.ability.genero.server.model.claseProceso claseProceso, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(claseProceso, merge);
	}

	/**
	* Returns the clase proceso with the primary key or throws a {@link com.ability.genero.server.NoSuchclaseProcesoException} if it could not be found.
	*
	* @param id the primary key of the clase proceso
	* @return the clase proceso
	* @throws com.ability.genero.server.NoSuchclaseProcesoException if a clase proceso with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ability.genero.server.model.claseProceso findByPrimaryKey(
		int id)
		throws com.ability.genero.server.NoSuchclaseProcesoException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the clase proceso with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the clase proceso
	* @return the clase proceso, or <code>null</code> if a clase proceso with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ability.genero.server.model.claseProceso fetchByPrimaryKey(
		int id) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	* Returns all the clase procesos.
	*
	* @return the clase procesos
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ability.genero.server.model.claseProceso> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the clase procesos.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of clase procesos
	* @param end the upper bound of the range of clase procesos (not inclusive)
	* @return the range of clase procesos
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ability.genero.server.model.claseProceso> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the clase procesos.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of clase procesos
	* @param end the upper bound of the range of clase procesos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of clase procesos
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ability.genero.server.model.claseProceso> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the clase procesos from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of clase procesos.
	*
	* @return the number of clase procesos
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static claseProcesoPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (claseProcesoPersistence)PortletBeanLocatorUtil.locate(com.ability.genero.server.service.ClpSerializer.getServletContextName(),
					claseProcesoPersistence.class.getName());

			ReferenceRegistry.registerReference(claseProcesoUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated
	 */
	public void setPersistence(claseProcesoPersistence persistence) {
	}

	private static claseProcesoPersistence _persistence;
}