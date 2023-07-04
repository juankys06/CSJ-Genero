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

import com.ability.genero.server.model.generoUsuarioComite;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the genero usuario comite service. This utility wraps {@link generoUsuarioComitePersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author DELL Villartech
 * @see generoUsuarioComitePersistence
 * @see generoUsuarioComitePersistenceImpl
 * @generated
 */
public class generoUsuarioComiteUtil {
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
	public static void clearCache(generoUsuarioComite generoUsuarioComite) {
		getPersistence().clearCache(generoUsuarioComite);
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
	public static List<generoUsuarioComite> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<generoUsuarioComite> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<generoUsuarioComite> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
	 */
	public static generoUsuarioComite update(
		generoUsuarioComite generoUsuarioComite, boolean merge)
		throws SystemException {
		return getPersistence().update(generoUsuarioComite, merge);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean, ServiceContext)
	 */
	public static generoUsuarioComite update(
		generoUsuarioComite generoUsuarioComite, boolean merge,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence()
				   .update(generoUsuarioComite, merge, serviceContext);
	}

	/**
	* Caches the genero usuario comite in the entity cache if it is enabled.
	*
	* @param generoUsuarioComite the genero usuario comite
	*/
	public static void cacheResult(
		com.ability.genero.server.model.generoUsuarioComite generoUsuarioComite) {
		getPersistence().cacheResult(generoUsuarioComite);
	}

	/**
	* Caches the genero usuario comites in the entity cache if it is enabled.
	*
	* @param generoUsuarioComites the genero usuario comites
	*/
	public static void cacheResult(
		java.util.List<com.ability.genero.server.model.generoUsuarioComite> generoUsuarioComites) {
		getPersistence().cacheResult(generoUsuarioComites);
	}

	/**
	* Creates a new genero usuario comite with the primary key. Does not add the genero usuario comite to the database.
	*
	* @param id the primary key for the new genero usuario comite
	* @return the new genero usuario comite
	*/
	public static com.ability.genero.server.model.generoUsuarioComite create(
		int id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the genero usuario comite with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the genero usuario comite
	* @return the genero usuario comite that was removed
	* @throws com.ability.genero.server.NoSuchUsuarioComiteException if a genero usuario comite with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ability.genero.server.model.generoUsuarioComite remove(
		int id)
		throws com.ability.genero.server.NoSuchUsuarioComiteException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().remove(id);
	}

	public static com.ability.genero.server.model.generoUsuarioComite updateImpl(
		com.ability.genero.server.model.generoUsuarioComite generoUsuarioComite,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(generoUsuarioComite, merge);
	}

	/**
	* Returns the genero usuario comite with the primary key or throws a {@link com.ability.genero.server.NoSuchUsuarioComiteException} if it could not be found.
	*
	* @param id the primary key of the genero usuario comite
	* @return the genero usuario comite
	* @throws com.ability.genero.server.NoSuchUsuarioComiteException if a genero usuario comite with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ability.genero.server.model.generoUsuarioComite findByPrimaryKey(
		int id)
		throws com.ability.genero.server.NoSuchUsuarioComiteException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the genero usuario comite with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the genero usuario comite
	* @return the genero usuario comite, or <code>null</code> if a genero usuario comite with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ability.genero.server.model.generoUsuarioComite fetchByPrimaryKey(
		int id) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	* Returns all the genero usuario comites where userId = &#63;.
	*
	* @param userId the user ID
	* @return the matching genero usuario comites
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ability.genero.server.model.generoUsuarioComite> findByporUsuario(
		java.lang.String userId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByporUsuario(userId);
	}

	/**
	* Returns a range of all the genero usuario comites where userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param userId the user ID
	* @param start the lower bound of the range of genero usuario comites
	* @param end the upper bound of the range of genero usuario comites (not inclusive)
	* @return the range of matching genero usuario comites
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ability.genero.server.model.generoUsuarioComite> findByporUsuario(
		java.lang.String userId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByporUsuario(userId, start, end);
	}

	/**
	* Returns an ordered range of all the genero usuario comites where userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param userId the user ID
	* @param start the lower bound of the range of genero usuario comites
	* @param end the upper bound of the range of genero usuario comites (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching genero usuario comites
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ability.genero.server.model.generoUsuarioComite> findByporUsuario(
		java.lang.String userId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByporUsuario(userId, start, end, orderByComparator);
	}

	/**
	* Returns the first genero usuario comite in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching genero usuario comite
	* @throws com.ability.genero.server.NoSuchUsuarioComiteException if a matching genero usuario comite could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ability.genero.server.model.generoUsuarioComite findByporUsuario_First(
		java.lang.String userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.ability.genero.server.NoSuchUsuarioComiteException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByporUsuario_First(userId, orderByComparator);
	}

	/**
	* Returns the first genero usuario comite in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching genero usuario comite, or <code>null</code> if a matching genero usuario comite could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ability.genero.server.model.generoUsuarioComite fetchByporUsuario_First(
		java.lang.String userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByporUsuario_First(userId, orderByComparator);
	}

	/**
	* Returns the last genero usuario comite in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching genero usuario comite
	* @throws com.ability.genero.server.NoSuchUsuarioComiteException if a matching genero usuario comite could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ability.genero.server.model.generoUsuarioComite findByporUsuario_Last(
		java.lang.String userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.ability.genero.server.NoSuchUsuarioComiteException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByporUsuario_Last(userId, orderByComparator);
	}

	/**
	* Returns the last genero usuario comite in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching genero usuario comite, or <code>null</code> if a matching genero usuario comite could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ability.genero.server.model.generoUsuarioComite fetchByporUsuario_Last(
		java.lang.String userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByporUsuario_Last(userId, orderByComparator);
	}

	/**
	* Returns the genero usuario comites before and after the current genero usuario comite in the ordered set where userId = &#63;.
	*
	* @param id the primary key of the current genero usuario comite
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next genero usuario comite
	* @throws com.ability.genero.server.NoSuchUsuarioComiteException if a genero usuario comite with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ability.genero.server.model.generoUsuarioComite[] findByporUsuario_PrevAndNext(
		int id, java.lang.String userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.ability.genero.server.NoSuchUsuarioComiteException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByporUsuario_PrevAndNext(id, userId, orderByComparator);
	}

	/**
	* Returns all the genero usuario comites.
	*
	* @return the genero usuario comites
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ability.genero.server.model.generoUsuarioComite> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the genero usuario comites.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of genero usuario comites
	* @param end the upper bound of the range of genero usuario comites (not inclusive)
	* @return the range of genero usuario comites
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ability.genero.server.model.generoUsuarioComite> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the genero usuario comites.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of genero usuario comites
	* @param end the upper bound of the range of genero usuario comites (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of genero usuario comites
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ability.genero.server.model.generoUsuarioComite> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the genero usuario comites where userId = &#63; from the database.
	*
	* @param userId the user ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByporUsuario(java.lang.String userId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByporUsuario(userId);
	}

	/**
	* Removes all the genero usuario comites from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of genero usuario comites where userId = &#63;.
	*
	* @param userId the user ID
	* @return the number of matching genero usuario comites
	* @throws SystemException if a system exception occurred
	*/
	public static int countByporUsuario(java.lang.String userId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByporUsuario(userId);
	}

	/**
	* Returns the number of genero usuario comites.
	*
	* @return the number of genero usuario comites
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static generoUsuarioComitePersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (generoUsuarioComitePersistence)PortletBeanLocatorUtil.locate(com.ability.genero.server.service.ClpSerializer.getServletContextName(),
					generoUsuarioComitePersistence.class.getName());

			ReferenceRegistry.registerReference(generoUsuarioComiteUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated
	 */
	public void setPersistence(generoUsuarioComitePersistence persistence) {
	}

	private static generoUsuarioComitePersistence _persistence;
}