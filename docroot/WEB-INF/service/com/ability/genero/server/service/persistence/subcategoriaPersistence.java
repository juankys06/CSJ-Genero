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

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the subcategoria service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author DELL Villartech
 * @see subcategoriaPersistenceImpl
 * @see subcategoriaUtil
 * @generated
 */
public interface subcategoriaPersistence extends BasePersistence<subcategoria> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link subcategoriaUtil} to access the subcategoria persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the subcategoria in the entity cache if it is enabled.
	*
	* @param subcategoria the subcategoria
	*/
	public void cacheResult(
		com.ability.genero.server.model.subcategoria subcategoria);

	/**
	* Caches the subcategorias in the entity cache if it is enabled.
	*
	* @param subcategorias the subcategorias
	*/
	public void cacheResult(
		java.util.List<com.ability.genero.server.model.subcategoria> subcategorias);

	/**
	* Creates a new subcategoria with the primary key. Does not add the subcategoria to the database.
	*
	* @param id the primary key for the new subcategoria
	* @return the new subcategoria
	*/
	public com.ability.genero.server.model.subcategoria create(int id);

	/**
	* Removes the subcategoria with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the subcategoria
	* @return the subcategoria that was removed
	* @throws com.ability.genero.server.NoSuchsubcategoriaException if a subcategoria with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ability.genero.server.model.subcategoria remove(int id)
		throws com.ability.genero.server.NoSuchsubcategoriaException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.ability.genero.server.model.subcategoria updateImpl(
		com.ability.genero.server.model.subcategoria subcategoria, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the subcategoria with the primary key or throws a {@link com.ability.genero.server.NoSuchsubcategoriaException} if it could not be found.
	*
	* @param id the primary key of the subcategoria
	* @return the subcategoria
	* @throws com.ability.genero.server.NoSuchsubcategoriaException if a subcategoria with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ability.genero.server.model.subcategoria findByPrimaryKey(int id)
		throws com.ability.genero.server.NoSuchsubcategoriaException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the subcategoria with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the subcategoria
	* @return the subcategoria, or <code>null</code> if a subcategoria with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ability.genero.server.model.subcategoria fetchByPrimaryKey(
		int id) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the subcategorias where idCategoria = &#63;.
	*
	* @param idCategoria the id categoria
	* @return the matching subcategorias
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ability.genero.server.model.subcategoria> findBysubCatXCat(
		int idCategoria)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.ability.genero.server.model.subcategoria> findBysubCatXCat(
		int idCategoria, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.ability.genero.server.model.subcategoria> findBysubCatXCat(
		int idCategoria, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first subcategoria in the ordered set where idCategoria = &#63;.
	*
	* @param idCategoria the id categoria
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching subcategoria
	* @throws com.ability.genero.server.NoSuchsubcategoriaException if a matching subcategoria could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ability.genero.server.model.subcategoria findBysubCatXCat_First(
		int idCategoria,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.ability.genero.server.NoSuchsubcategoriaException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first subcategoria in the ordered set where idCategoria = &#63;.
	*
	* @param idCategoria the id categoria
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching subcategoria, or <code>null</code> if a matching subcategoria could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ability.genero.server.model.subcategoria fetchBysubCatXCat_First(
		int idCategoria,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last subcategoria in the ordered set where idCategoria = &#63;.
	*
	* @param idCategoria the id categoria
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching subcategoria
	* @throws com.ability.genero.server.NoSuchsubcategoriaException if a matching subcategoria could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ability.genero.server.model.subcategoria findBysubCatXCat_Last(
		int idCategoria,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.ability.genero.server.NoSuchsubcategoriaException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last subcategoria in the ordered set where idCategoria = &#63;.
	*
	* @param idCategoria the id categoria
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching subcategoria, or <code>null</code> if a matching subcategoria could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ability.genero.server.model.subcategoria fetchBysubCatXCat_Last(
		int idCategoria,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.ability.genero.server.model.subcategoria[] findBysubCatXCat_PrevAndNext(
		int id, int idCategoria,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.ability.genero.server.NoSuchsubcategoriaException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the subcategorias.
	*
	* @return the subcategorias
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ability.genero.server.model.subcategoria> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.ability.genero.server.model.subcategoria> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.ability.genero.server.model.subcategoria> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the subcategorias where idCategoria = &#63; from the database.
	*
	* @param idCategoria the id categoria
	* @throws SystemException if a system exception occurred
	*/
	public void removeBysubCatXCat(int idCategoria)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the subcategorias from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of subcategorias where idCategoria = &#63;.
	*
	* @param idCategoria the id categoria
	* @return the number of matching subcategorias
	* @throws SystemException if a system exception occurred
	*/
	public int countBysubCatXCat(int idCategoria)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of subcategorias.
	*
	* @return the number of subcategorias
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}