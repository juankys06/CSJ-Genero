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

import com.ability.genero.server.model.entidad;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the entidad service. This utility wraps {@link entidadPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author DELL Villartech
 * @see entidadPersistence
 * @see entidadPersistenceImpl
 * @generated
 */
public class entidadUtil {
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
	public static void clearCache(entidad entidad) {
		getPersistence().clearCache(entidad);
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
	public static List<entidad> findWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<entidad> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<entidad> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
	 */
	public static entidad update(entidad entidad, boolean merge)
		throws SystemException {
		return getPersistence().update(entidad, merge);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean, ServiceContext)
	 */
	public static entidad update(entidad entidad, boolean merge,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(entidad, merge, serviceContext);
	}

	/**
	* Caches the entidad in the entity cache if it is enabled.
	*
	* @param entidad the entidad
	*/
	public static void cacheResult(
		com.ability.genero.server.model.entidad entidad) {
		getPersistence().cacheResult(entidad);
	}

	/**
	* Caches the entidads in the entity cache if it is enabled.
	*
	* @param entidads the entidads
	*/
	public static void cacheResult(
		java.util.List<com.ability.genero.server.model.entidad> entidads) {
		getPersistence().cacheResult(entidads);
	}

	/**
	* Creates a new entidad with the primary key. Does not add the entidad to the database.
	*
	* @param id the primary key for the new entidad
	* @return the new entidad
	*/
	public static com.ability.genero.server.model.entidad create(int id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the entidad with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the entidad
	* @return the entidad that was removed
	* @throws com.ability.genero.server.NoSuchentidadException if a entidad with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ability.genero.server.model.entidad remove(int id)
		throws com.ability.genero.server.NoSuchentidadException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().remove(id);
	}

	public static com.ability.genero.server.model.entidad updateImpl(
		com.ability.genero.server.model.entidad entidad, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(entidad, merge);
	}

	/**
	* Returns the entidad with the primary key or throws a {@link com.ability.genero.server.NoSuchentidadException} if it could not be found.
	*
	* @param id the primary key of the entidad
	* @return the entidad
	* @throws com.ability.genero.server.NoSuchentidadException if a entidad with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ability.genero.server.model.entidad findByPrimaryKey(
		int id)
		throws com.ability.genero.server.NoSuchentidadException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the entidad with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the entidad
	* @return the entidad, or <code>null</code> if a entidad with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ability.genero.server.model.entidad fetchByPrimaryKey(
		int id) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	* Returns all the entidads.
	*
	* @return the entidads
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ability.genero.server.model.entidad> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the entidads.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of entidads
	* @param end the upper bound of the range of entidads (not inclusive)
	* @return the range of entidads
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ability.genero.server.model.entidad> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the entidads.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of entidads
	* @param end the upper bound of the range of entidads (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of entidads
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ability.genero.server.model.entidad> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the entidads from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of entidads.
	*
	* @return the number of entidads
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static entidadPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (entidadPersistence)PortletBeanLocatorUtil.locate(com.ability.genero.server.service.ClpSerializer.getServletContextName(),
					entidadPersistence.class.getName());

			ReferenceRegistry.registerReference(entidadUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated
	 */
	public void setPersistence(entidadPersistence persistence) {
	}

	private static entidadPersistence _persistence;
}