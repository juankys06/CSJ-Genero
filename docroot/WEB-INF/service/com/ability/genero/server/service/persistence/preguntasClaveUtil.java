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

import com.ability.genero.server.model.preguntasClave;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the preguntas clave service. This utility wraps {@link preguntasClavePersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author DELL Villartech
 * @see preguntasClavePersistence
 * @see preguntasClavePersistenceImpl
 * @generated
 */
public class preguntasClaveUtil {
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
	public static void clearCache(preguntasClave preguntasClave) {
		getPersistence().clearCache(preguntasClave);
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
	public static List<preguntasClave> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<preguntasClave> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<preguntasClave> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
	 */
	public static preguntasClave update(preguntasClave preguntasClave,
		boolean merge) throws SystemException {
		return getPersistence().update(preguntasClave, merge);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean, ServiceContext)
	 */
	public static preguntasClave update(preguntasClave preguntasClave,
		boolean merge, ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(preguntasClave, merge, serviceContext);
	}

	/**
	* Caches the preguntas clave in the entity cache if it is enabled.
	*
	* @param preguntasClave the preguntas clave
	*/
	public static void cacheResult(
		com.ability.genero.server.model.preguntasClave preguntasClave) {
		getPersistence().cacheResult(preguntasClave);
	}

	/**
	* Caches the preguntas claves in the entity cache if it is enabled.
	*
	* @param preguntasClaves the preguntas claves
	*/
	public static void cacheResult(
		java.util.List<com.ability.genero.server.model.preguntasClave> preguntasClaves) {
		getPersistence().cacheResult(preguntasClaves);
	}

	/**
	* Creates a new preguntas clave with the primary key. Does not add the preguntas clave to the database.
	*
	* @param id the primary key for the new preguntas clave
	* @return the new preguntas clave
	*/
	public static com.ability.genero.server.model.preguntasClave create(int id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the preguntas clave with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the preguntas clave
	* @return the preguntas clave that was removed
	* @throws com.ability.genero.server.NoSuchpreguntasClaveException if a preguntas clave with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ability.genero.server.model.preguntasClave remove(int id)
		throws com.ability.genero.server.NoSuchpreguntasClaveException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().remove(id);
	}

	public static com.ability.genero.server.model.preguntasClave updateImpl(
		com.ability.genero.server.model.preguntasClave preguntasClave,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(preguntasClave, merge);
	}

	/**
	* Returns the preguntas clave with the primary key or throws a {@link com.ability.genero.server.NoSuchpreguntasClaveException} if it could not be found.
	*
	* @param id the primary key of the preguntas clave
	* @return the preguntas clave
	* @throws com.ability.genero.server.NoSuchpreguntasClaveException if a preguntas clave with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ability.genero.server.model.preguntasClave findByPrimaryKey(
		int id)
		throws com.ability.genero.server.NoSuchpreguntasClaveException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the preguntas clave with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the preguntas clave
	* @return the preguntas clave, or <code>null</code> if a preguntas clave with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ability.genero.server.model.preguntasClave fetchByPrimaryKey(
		int id) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	* Returns all the preguntas claves.
	*
	* @return the preguntas claves
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ability.genero.server.model.preguntasClave> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the preguntas claves.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of preguntas claves
	* @param end the upper bound of the range of preguntas claves (not inclusive)
	* @return the range of preguntas claves
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ability.genero.server.model.preguntasClave> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the preguntas claves.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of preguntas claves
	* @param end the upper bound of the range of preguntas claves (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of preguntas claves
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ability.genero.server.model.preguntasClave> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the preguntas claves from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of preguntas claves.
	*
	* @return the number of preguntas claves
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static preguntasClavePersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (preguntasClavePersistence)PortletBeanLocatorUtil.locate(com.ability.genero.server.service.ClpSerializer.getServletContextName(),
					preguntasClavePersistence.class.getName());

			ReferenceRegistry.registerReference(preguntasClaveUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated
	 */
	public void setPersistence(preguntasClavePersistence persistence) {
	}

	private static preguntasClavePersistence _persistence;
}