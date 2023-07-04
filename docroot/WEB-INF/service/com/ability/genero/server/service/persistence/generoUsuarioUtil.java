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

import com.ability.genero.server.model.generoUsuario;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the genero usuario service. This utility wraps {@link generoUsuarioPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author DELL Villartech
 * @see generoUsuarioPersistence
 * @see generoUsuarioPersistenceImpl
 * @generated
 */
public class generoUsuarioUtil {
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
	public static void clearCache(generoUsuario generoUsuario) {
		getPersistence().clearCache(generoUsuario);
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
	public static List<generoUsuario> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<generoUsuario> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<generoUsuario> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
	 */
	public static generoUsuario update(generoUsuario generoUsuario,
		boolean merge) throws SystemException {
		return getPersistence().update(generoUsuario, merge);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean, ServiceContext)
	 */
	public static generoUsuario update(generoUsuario generoUsuario,
		boolean merge, ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(generoUsuario, merge, serviceContext);
	}

	/**
	* Caches the genero usuario in the entity cache if it is enabled.
	*
	* @param generoUsuario the genero usuario
	*/
	public static void cacheResult(
		com.ability.genero.server.model.generoUsuario generoUsuario) {
		getPersistence().cacheResult(generoUsuario);
	}

	/**
	* Caches the genero usuarios in the entity cache if it is enabled.
	*
	* @param generoUsuarios the genero usuarios
	*/
	public static void cacheResult(
		java.util.List<com.ability.genero.server.model.generoUsuario> generoUsuarios) {
		getPersistence().cacheResult(generoUsuarios);
	}

	/**
	* Creates a new genero usuario with the primary key. Does not add the genero usuario to the database.
	*
	* @param id the primary key for the new genero usuario
	* @return the new genero usuario
	*/
	public static com.ability.genero.server.model.generoUsuario create(int id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the genero usuario with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the genero usuario
	* @return the genero usuario that was removed
	* @throws com.ability.genero.server.NoSuchUsuarioException if a genero usuario with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ability.genero.server.model.generoUsuario remove(int id)
		throws com.ability.genero.server.NoSuchUsuarioException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().remove(id);
	}

	public static com.ability.genero.server.model.generoUsuario updateImpl(
		com.ability.genero.server.model.generoUsuario generoUsuario,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(generoUsuario, merge);
	}

	/**
	* Returns the genero usuario with the primary key or throws a {@link com.ability.genero.server.NoSuchUsuarioException} if it could not be found.
	*
	* @param id the primary key of the genero usuario
	* @return the genero usuario
	* @throws com.ability.genero.server.NoSuchUsuarioException if a genero usuario with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ability.genero.server.model.generoUsuario findByPrimaryKey(
		int id)
		throws com.ability.genero.server.NoSuchUsuarioException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the genero usuario with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the genero usuario
	* @return the genero usuario, or <code>null</code> if a genero usuario with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ability.genero.server.model.generoUsuario fetchByPrimaryKey(
		int id) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	* Returns the genero usuario where userId = &#63; or throws a {@link com.ability.genero.server.NoSuchUsuarioException} if it could not be found.
	*
	* @param userId the user ID
	* @return the matching genero usuario
	* @throws com.ability.genero.server.NoSuchUsuarioException if a matching genero usuario could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ability.genero.server.model.generoUsuario findByporUsuario(
		java.lang.String userId)
		throws com.ability.genero.server.NoSuchUsuarioException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByporUsuario(userId);
	}

	/**
	* Returns the genero usuario where userId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param userId the user ID
	* @return the matching genero usuario, or <code>null</code> if a matching genero usuario could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ability.genero.server.model.generoUsuario fetchByporUsuario(
		java.lang.String userId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByporUsuario(userId);
	}

	/**
	* Returns the genero usuario where userId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param userId the user ID
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching genero usuario, or <code>null</code> if a matching genero usuario could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ability.genero.server.model.generoUsuario fetchByporUsuario(
		java.lang.String userId, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByporUsuario(userId, retrieveFromCache);
	}

	/**
	* Returns all the genero usuarios.
	*
	* @return the genero usuarios
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ability.genero.server.model.generoUsuario> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the genero usuarios.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of genero usuarios
	* @param end the upper bound of the range of genero usuarios (not inclusive)
	* @return the range of genero usuarios
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ability.genero.server.model.generoUsuario> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the genero usuarios.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of genero usuarios
	* @param end the upper bound of the range of genero usuarios (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of genero usuarios
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ability.genero.server.model.generoUsuario> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes the genero usuario where userId = &#63; from the database.
	*
	* @param userId the user ID
	* @return the genero usuario that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static com.ability.genero.server.model.generoUsuario removeByporUsuario(
		java.lang.String userId)
		throws com.ability.genero.server.NoSuchUsuarioException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().removeByporUsuario(userId);
	}

	/**
	* Removes all the genero usuarios from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of genero usuarios where userId = &#63;.
	*
	* @param userId the user ID
	* @return the number of matching genero usuarios
	* @throws SystemException if a system exception occurred
	*/
	public static int countByporUsuario(java.lang.String userId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByporUsuario(userId);
	}

	/**
	* Returns the number of genero usuarios.
	*
	* @return the number of genero usuarios
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static generoUsuarioPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (generoUsuarioPersistence)PortletBeanLocatorUtil.locate(com.ability.genero.server.service.ClpSerializer.getServletContextName(),
					generoUsuarioPersistence.class.getName());

			ReferenceRegistry.registerReference(generoUsuarioUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated
	 */
	public void setPersistence(generoUsuarioPersistence persistence) {
	}

	private static generoUsuarioPersistence _persistence;
}