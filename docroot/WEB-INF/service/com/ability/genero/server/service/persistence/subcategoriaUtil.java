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

import com.ability.genero.server.model.subcategoria;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the subcategoria service. This utility wraps {@link subcategoriaPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author DELL Villartech
 * @see subcategoriaPersistence
 * @see subcategoriaPersistenceImpl
 * @generated
 */
public class subcategoriaUtil {
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
	public static void clearCache(subcategoria subcategoria) {
		getPersistence().clearCache(subcategoria);
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
	public static List<subcategoria> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<subcategoria> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<subcategoria> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
	 */
	public static subcategoria update(subcategoria subcategoria, boolean merge)
		throws SystemException {
		return getPersistence().update(subcategoria, merge);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean, ServiceContext)
	 */
	public static subcategoria update(subcategoria subcategoria, boolean merge,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(subcategoria, merge, serviceContext);
	}

	/**
	* Caches the subcategoria in the entity cache if it is enabled.
	*
	* @param subcategoria the subcategoria
	*/
	public static void cacheResult(
		com.ability.genero.server.model.subcategoria subcategoria) {
		getPersistence().cacheResult(subcategoria);
	}

	/**
	* Caches the subcategorias in the entity cache if it is enabled.
	*
	* @param subcategorias the subcategorias
	*/
	public static void cacheResult(
		java.util.List<com.ability.genero.server.model.subcategoria> subcategorias) {
		getPersistence().cacheResult(subcategorias);
	}

	/**
	* Creates a new subcategoria with the primary key. Does not add the subcategoria to the database.
	*
	* @param id the primary key for the new subcategoria
	* @return the new subcategoria
	*/
	public static com.ability.genero.server.model.subcategoria create(int id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the subcategoria with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the subcategoria
	* @return the subcategoria that was removed
	* @throws com.ability.genero.server.NoSuchsubcategoriaException if a subcategoria with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ability.genero.server.model.subcategoria remove(int id)
		throws com.ability.genero.server.NoSuchsubcategoriaException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().remove(id);
	}

	public static com.ability.genero.server.model.subcategoria updateImpl(
		com.ability.genero.server.model.subcategoria subcategoria, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(subcategoria, merge);
	}

	/**
	* Returns the subcategoria with the primary key or throws a {@link com.ability.genero.server.NoSuchsubcategoriaException} if it could not be found.
	*
	* @param id the primary key of the subcategoria
	* @return the subcategoria
	* @throws com.ability.genero.server.NoSuchsubcategoriaException if a subcategoria with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ability.genero.server.model.subcategoria findByPrimaryKey(
		int id)
		throws com.ability.genero.server.NoSuchsubcategoriaException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the subcategoria with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the subcategoria
	* @return the subcategoria, or <code>null</code> if a subcategoria with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ability.genero.server.model.subcategoria fetchByPrimaryKey(
		int id) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	* Returns all the subcategorias where idCategoria = &#63;.
	*
	* @param idCategoria the id categoria
	* @return the matching subcategorias
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ability.genero.server.model.subcategoria> findBysubCatXCat(
		int idCategoria)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findBysubCatXCat(idCategoria);
	}

	/**
	* Returns a range of all the subcategorias where idCategoria = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param idCategoria the id categoria
	* @param start the lower bound of the range of subcategorias
	* @param end the upper bound of the range of subcategorias (not inclusive)
	* @return the range of matching subcategorias
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ability.genero.server.model.subcategoria> findBysubCatXCat(
		int idCategoria, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findBysubCatXCat(idCategoria, start, end);
	}

	/**
	* Returns an ordered range of all the subcategorias where idCategoria = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param idCategoria the id categoria
	* @param start the lower bound of the range of subcategorias
	* @param end the upper bound of the range of subcategorias (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching subcategorias
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ability.genero.server.model.subcategoria> findBysubCatXCat(
		int idCategoria, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findBysubCatXCat(idCategoria, start, end, orderByComparator);
	}

	/**
	* Returns the first subcategoria in the ordered set where idCategoria = &#63;.
	*
	* @param idCategoria the id categoria
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching subcategoria
	* @throws com.ability.genero.server.NoSuchsubcategoriaException if a matching subcategoria could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ability.genero.server.model.subcategoria findBysubCatXCat_First(
		int idCategoria,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.ability.genero.server.NoSuchsubcategoriaException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findBysubCatXCat_First(idCategoria, orderByComparator);
	}

	/**
	* Returns the first subcategoria in the ordered set where idCategoria = &#63;.
	*
	* @param idCategoria the id categoria
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching subcategoria, or <code>null</code> if a matching subcategoria could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ability.genero.server.model.subcategoria fetchBysubCatXCat_First(
		int idCategoria,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchBysubCatXCat_First(idCategoria, orderByComparator);
	}

	/**
	* Returns the last subcategoria in the ordered set where idCategoria = &#63;.
	*
	* @param idCategoria the id categoria
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching subcategoria
	* @throws com.ability.genero.server.NoSuchsubcategoriaException if a matching subcategoria could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ability.genero.server.model.subcategoria findBysubCatXCat_Last(
		int idCategoria,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.ability.genero.server.NoSuchsubcategoriaException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findBysubCatXCat_Last(idCategoria, orderByComparator);
	}

	/**
	* Returns the last subcategoria in the ordered set where idCategoria = &#63;.
	*
	* @param idCategoria the id categoria
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching subcategoria, or <code>null</code> if a matching subcategoria could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ability.genero.server.model.subcategoria fetchBysubCatXCat_Last(
		int idCategoria,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchBysubCatXCat_Last(idCategoria, orderByComparator);
	}

	/**
	* Returns the subcategorias before and after the current subcategoria in the ordered set where idCategoria = &#63;.
	*
	* @param id the primary key of the current subcategoria
	* @param idCategoria the id categoria
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next subcategoria
	* @throws com.ability.genero.server.NoSuchsubcategoriaException if a subcategoria with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ability.genero.server.model.subcategoria[] findBysubCatXCat_PrevAndNext(
		int id, int idCategoria,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.ability.genero.server.NoSuchsubcategoriaException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findBysubCatXCat_PrevAndNext(id, idCategoria,
			orderByComparator);
	}

	/**
	* Returns all the subcategorias.
	*
	* @return the subcategorias
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ability.genero.server.model.subcategoria> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the subcategorias.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of subcategorias
	* @param end the upper bound of the range of subcategorias (not inclusive)
	* @return the range of subcategorias
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ability.genero.server.model.subcategoria> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the subcategorias.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of subcategorias
	* @param end the upper bound of the range of subcategorias (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of subcategorias
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ability.genero.server.model.subcategoria> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the subcategorias where idCategoria = &#63; from the database.
	*
	* @param idCategoria the id categoria
	* @throws SystemException if a system exception occurred
	*/
	public static void removeBysubCatXCat(int idCategoria)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeBysubCatXCat(idCategoria);
	}

	/**
	* Removes all the subcategorias from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of subcategorias where idCategoria = &#63;.
	*
	* @param idCategoria the id categoria
	* @return the number of matching subcategorias
	* @throws SystemException if a system exception occurred
	*/
	public static int countBysubCatXCat(int idCategoria)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countBysubCatXCat(idCategoria);
	}

	/**
	* Returns the number of subcategorias.
	*
	* @return the number of subcategorias
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static subcategoriaPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (subcategoriaPersistence)PortletBeanLocatorUtil.locate(com.ability.genero.server.service.ClpSerializer.getServletContextName(),
					subcategoriaPersistence.class.getName());

			ReferenceRegistry.registerReference(subcategoriaUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated
	 */
	public void setPersistence(subcategoriaPersistence persistence) {
	}

	private static subcategoriaPersistence _persistence;
}