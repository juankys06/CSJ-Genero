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

import com.ability.genero.server.model.ciudades;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the ciudades service. This utility wraps {@link ciudadesPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author DELL Villartech
 * @see ciudadesPersistence
 * @see ciudadesPersistenceImpl
 * @generated
 */
public class ciudadesUtil {
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
	public static void clearCache(ciudades ciudades) {
		getPersistence().clearCache(ciudades);
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
	public static List<ciudades> findWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<ciudades> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<ciudades> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
	 */
	public static ciudades update(ciudades ciudades, boolean merge)
		throws SystemException {
		return getPersistence().update(ciudades, merge);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean, ServiceContext)
	 */
	public static ciudades update(ciudades ciudades, boolean merge,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(ciudades, merge, serviceContext);
	}

	/**
	* Caches the ciudades in the entity cache if it is enabled.
	*
	* @param ciudades the ciudades
	*/
	public static void cacheResult(
		com.ability.genero.server.model.ciudades ciudades) {
		getPersistence().cacheResult(ciudades);
	}

	/**
	* Caches the ciudadeses in the entity cache if it is enabled.
	*
	* @param ciudadeses the ciudadeses
	*/
	public static void cacheResult(
		java.util.List<com.ability.genero.server.model.ciudades> ciudadeses) {
		getPersistence().cacheResult(ciudadeses);
	}

	/**
	* Creates a new ciudades with the primary key. Does not add the ciudades to the database.
	*
	* @param codigo the primary key for the new ciudades
	* @return the new ciudades
	*/
	public static com.ability.genero.server.model.ciudades create(
		java.lang.String codigo) {
		return getPersistence().create(codigo);
	}

	/**
	* Removes the ciudades with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param codigo the primary key of the ciudades
	* @return the ciudades that was removed
	* @throws com.ability.genero.server.NoSuchciudadesException if a ciudades with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ability.genero.server.model.ciudades remove(
		java.lang.String codigo)
		throws com.ability.genero.server.NoSuchciudadesException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().remove(codigo);
	}

	public static com.ability.genero.server.model.ciudades updateImpl(
		com.ability.genero.server.model.ciudades ciudades, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(ciudades, merge);
	}

	/**
	* Returns the ciudades with the primary key or throws a {@link com.ability.genero.server.NoSuchciudadesException} if it could not be found.
	*
	* @param codigo the primary key of the ciudades
	* @return the ciudades
	* @throws com.ability.genero.server.NoSuchciudadesException if a ciudades with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ability.genero.server.model.ciudades findByPrimaryKey(
		java.lang.String codigo)
		throws com.ability.genero.server.NoSuchciudadesException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPrimaryKey(codigo);
	}

	/**
	* Returns the ciudades with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param codigo the primary key of the ciudades
	* @return the ciudades, or <code>null</code> if a ciudades with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ability.genero.server.model.ciudades fetchByPrimaryKey(
		java.lang.String codigo)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(codigo);
	}

	/**
	* Returns all the ciudadeses.
	*
	* @return the ciudadeses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ability.genero.server.model.ciudades> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the ciudadeses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of ciudadeses
	* @param end the upper bound of the range of ciudadeses (not inclusive)
	* @return the range of ciudadeses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ability.genero.server.model.ciudades> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the ciudadeses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of ciudadeses
	* @param end the upper bound of the range of ciudadeses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of ciudadeses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ability.genero.server.model.ciudades> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the ciudadeses from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of ciudadeses.
	*
	* @return the number of ciudadeses
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static ciudadesPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (ciudadesPersistence)PortletBeanLocatorUtil.locate(com.ability.genero.server.service.ClpSerializer.getServletContextName(),
					ciudadesPersistence.class.getName());

			ReferenceRegistry.registerReference(ciudadesUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated
	 */
	public void setPersistence(ciudadesPersistence persistence) {
	}

	private static ciudadesPersistence _persistence;
}