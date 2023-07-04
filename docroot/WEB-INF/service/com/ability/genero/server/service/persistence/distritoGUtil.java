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

import com.ability.genero.server.model.distritoG;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the distrito g service. This utility wraps {@link distritoGPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author DELL Villartech
 * @see distritoGPersistence
 * @see distritoGPersistenceImpl
 * @generated
 */
public class distritoGUtil {
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
	public static void clearCache(distritoG distritoG) {
		getPersistence().clearCache(distritoG);
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
	public static List<distritoG> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<distritoG> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<distritoG> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
	 */
	public static distritoG update(distritoG distritoG, boolean merge)
		throws SystemException {
		return getPersistence().update(distritoG, merge);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean, ServiceContext)
	 */
	public static distritoG update(distritoG distritoG, boolean merge,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(distritoG, merge, serviceContext);
	}

	/**
	* Caches the distrito g in the entity cache if it is enabled.
	*
	* @param distritoG the distrito g
	*/
	public static void cacheResult(
		com.ability.genero.server.model.distritoG distritoG) {
		getPersistence().cacheResult(distritoG);
	}

	/**
	* Caches the distrito gs in the entity cache if it is enabled.
	*
	* @param distritoGs the distrito gs
	*/
	public static void cacheResult(
		java.util.List<com.ability.genero.server.model.distritoG> distritoGs) {
		getPersistence().cacheResult(distritoGs);
	}

	/**
	* Creates a new distrito g with the primary key. Does not add the distrito g to the database.
	*
	* @param id the primary key for the new distrito g
	* @return the new distrito g
	*/
	public static com.ability.genero.server.model.distritoG create(int id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the distrito g with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the distrito g
	* @return the distrito g that was removed
	* @throws com.ability.genero.server.NoSuchdistritoGException if a distrito g with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ability.genero.server.model.distritoG remove(int id)
		throws com.ability.genero.server.NoSuchdistritoGException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().remove(id);
	}

	public static com.ability.genero.server.model.distritoG updateImpl(
		com.ability.genero.server.model.distritoG distritoG, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(distritoG, merge);
	}

	/**
	* Returns the distrito g with the primary key or throws a {@link com.ability.genero.server.NoSuchdistritoGException} if it could not be found.
	*
	* @param id the primary key of the distrito g
	* @return the distrito g
	* @throws com.ability.genero.server.NoSuchdistritoGException if a distrito g with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ability.genero.server.model.distritoG findByPrimaryKey(
		int id)
		throws com.ability.genero.server.NoSuchdistritoGException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the distrito g with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the distrito g
	* @return the distrito g, or <code>null</code> if a distrito g with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ability.genero.server.model.distritoG fetchByPrimaryKey(
		int id) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	* Returns all the distrito gs.
	*
	* @return the distrito gs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ability.genero.server.model.distritoG> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the distrito gs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of distrito gs
	* @param end the upper bound of the range of distrito gs (not inclusive)
	* @return the range of distrito gs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ability.genero.server.model.distritoG> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the distrito gs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of distrito gs
	* @param end the upper bound of the range of distrito gs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of distrito gs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ability.genero.server.model.distritoG> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the distrito gs from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of distrito gs.
	*
	* @return the number of distrito gs
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static distritoGPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (distritoGPersistence)PortletBeanLocatorUtil.locate(com.ability.genero.server.service.ClpSerializer.getServletContextName(),
					distritoGPersistence.class.getName());

			ReferenceRegistry.registerReference(distritoGUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated
	 */
	public void setPersistence(distritoGPersistence persistence) {
	}

	private static distritoGPersistence _persistence;
}