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

package com.ability.genero.server.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * <p>
 * This class is a wrapper for {@link categoriaLocalService}.
 * </p>
 *
 * @author    DELL Villartech
 * @see       categoriaLocalService
 * @generated
 */
public class categoriaLocalServiceWrapper implements categoriaLocalService,
	ServiceWrapper<categoriaLocalService> {
	public categoriaLocalServiceWrapper(
		categoriaLocalService categoriaLocalService) {
		_categoriaLocalService = categoriaLocalService;
	}

	/**
	* Adds the categoria to the database. Also notifies the appropriate model listeners.
	*
	* @param categoria the categoria
	* @return the categoria that was added
	* @throws SystemException if a system exception occurred
	*/
	public com.ability.genero.server.model.categoria addcategoria(
		com.ability.genero.server.model.categoria categoria)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _categoriaLocalService.addcategoria(categoria);
	}

	/**
	* Creates a new categoria with the primary key. Does not add the categoria to the database.
	*
	* @param id the primary key for the new categoria
	* @return the new categoria
	*/
	public com.ability.genero.server.model.categoria createcategoria(int id) {
		return _categoriaLocalService.createcategoria(id);
	}

	/**
	* Deletes the categoria with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the categoria
	* @return the categoria that was removed
	* @throws PortalException if a categoria with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ability.genero.server.model.categoria deletecategoria(int id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _categoriaLocalService.deletecategoria(id);
	}

	/**
	* Deletes the categoria from the database. Also notifies the appropriate model listeners.
	*
	* @param categoria the categoria
	* @return the categoria that was removed
	* @throws SystemException if a system exception occurred
	*/
	public com.ability.genero.server.model.categoria deletecategoria(
		com.ability.genero.server.model.categoria categoria)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _categoriaLocalService.deletecategoria(categoria);
	}

	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _categoriaLocalService.dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _categoriaLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _categoriaLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _categoriaLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _categoriaLocalService.dynamicQueryCount(dynamicQuery);
	}

	public com.ability.genero.server.model.categoria fetchcategoria(int id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _categoriaLocalService.fetchcategoria(id);
	}

	/**
	* Returns the categoria with the primary key.
	*
	* @param id the primary key of the categoria
	* @return the categoria
	* @throws PortalException if a categoria with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ability.genero.server.model.categoria getcategoria(int id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _categoriaLocalService.getcategoria(id);
	}

	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _categoriaLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the categorias.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of categorias
	* @param end the upper bound of the range of categorias (not inclusive)
	* @return the range of categorias
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ability.genero.server.model.categoria> getcategorias(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _categoriaLocalService.getcategorias(start, end);
	}

	/**
	* Returns the number of categorias.
	*
	* @return the number of categorias
	* @throws SystemException if a system exception occurred
	*/
	public int getcategoriasCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _categoriaLocalService.getcategoriasCount();
	}

	/**
	* Updates the categoria in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param categoria the categoria
	* @return the categoria that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.ability.genero.server.model.categoria updatecategoria(
		com.ability.genero.server.model.categoria categoria)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _categoriaLocalService.updatecategoria(categoria);
	}

	/**
	* Updates the categoria in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param categoria the categoria
	* @param merge whether to merge the categoria with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the categoria that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.ability.genero.server.model.categoria updatecategoria(
		com.ability.genero.server.model.categoria categoria, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _categoriaLocalService.updatecategoria(categoria, merge);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier() {
		return _categoriaLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_categoriaLocalService.setBeanIdentifier(beanIdentifier);
	}

	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _categoriaLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedService}
	 */
	public categoriaLocalService getWrappedcategoriaLocalService() {
		return _categoriaLocalService;
	}

	/**
	 * @deprecated Renamed to {@link #setWrappedService}
	 */
	public void setWrappedcategoriaLocalService(
		categoriaLocalService categoriaLocalService) {
		_categoriaLocalService = categoriaLocalService;
	}

	public categoriaLocalService getWrappedService() {
		return _categoriaLocalService;
	}

	public void setWrappedService(categoriaLocalService categoriaLocalService) {
		_categoriaLocalService = categoriaLocalService;
	}

	private categoriaLocalService _categoriaLocalService;
}