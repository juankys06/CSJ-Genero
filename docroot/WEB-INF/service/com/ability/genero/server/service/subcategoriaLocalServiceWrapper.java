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
 * This class is a wrapper for {@link subcategoriaLocalService}.
 * </p>
 *
 * @author    DELL Villartech
 * @see       subcategoriaLocalService
 * @generated
 */
public class subcategoriaLocalServiceWrapper implements subcategoriaLocalService,
	ServiceWrapper<subcategoriaLocalService> {
	public subcategoriaLocalServiceWrapper(
		subcategoriaLocalService subcategoriaLocalService) {
		_subcategoriaLocalService = subcategoriaLocalService;
	}

	/**
	* Adds the subcategoria to the database. Also notifies the appropriate model listeners.
	*
	* @param subcategoria the subcategoria
	* @return the subcategoria that was added
	* @throws SystemException if a system exception occurred
	*/
	public com.ability.genero.server.model.subcategoria addsubcategoria(
		com.ability.genero.server.model.subcategoria subcategoria)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _subcategoriaLocalService.addsubcategoria(subcategoria);
	}

	/**
	* Creates a new subcategoria with the primary key. Does not add the subcategoria to the database.
	*
	* @param id the primary key for the new subcategoria
	* @return the new subcategoria
	*/
	public com.ability.genero.server.model.subcategoria createsubcategoria(
		int id) {
		return _subcategoriaLocalService.createsubcategoria(id);
	}

	/**
	* Deletes the subcategoria with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the subcategoria
	* @return the subcategoria that was removed
	* @throws PortalException if a subcategoria with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ability.genero.server.model.subcategoria deletesubcategoria(
		int id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _subcategoriaLocalService.deletesubcategoria(id);
	}

	/**
	* Deletes the subcategoria from the database. Also notifies the appropriate model listeners.
	*
	* @param subcategoria the subcategoria
	* @return the subcategoria that was removed
	* @throws SystemException if a system exception occurred
	*/
	public com.ability.genero.server.model.subcategoria deletesubcategoria(
		com.ability.genero.server.model.subcategoria subcategoria)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _subcategoriaLocalService.deletesubcategoria(subcategoria);
	}

	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _subcategoriaLocalService.dynamicQuery();
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
		return _subcategoriaLocalService.dynamicQuery(dynamicQuery);
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
		return _subcategoriaLocalService.dynamicQuery(dynamicQuery, start, end);
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
		return _subcategoriaLocalService.dynamicQuery(dynamicQuery, start, end,
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
		return _subcategoriaLocalService.dynamicQueryCount(dynamicQuery);
	}

	public com.ability.genero.server.model.subcategoria fetchsubcategoria(
		int id) throws com.liferay.portal.kernel.exception.SystemException {
		return _subcategoriaLocalService.fetchsubcategoria(id);
	}

	/**
	* Returns the subcategoria with the primary key.
	*
	* @param id the primary key of the subcategoria
	* @return the subcategoria
	* @throws PortalException if a subcategoria with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ability.genero.server.model.subcategoria getsubcategoria(int id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _subcategoriaLocalService.getsubcategoria(id);
	}

	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _subcategoriaLocalService.getPersistedModel(primaryKeyObj);
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
	public java.util.List<com.ability.genero.server.model.subcategoria> getsubcategorias(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _subcategoriaLocalService.getsubcategorias(start, end);
	}

	/**
	* Returns the number of subcategorias.
	*
	* @return the number of subcategorias
	* @throws SystemException if a system exception occurred
	*/
	public int getsubcategoriasCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _subcategoriaLocalService.getsubcategoriasCount();
	}

	/**
	* Updates the subcategoria in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param subcategoria the subcategoria
	* @return the subcategoria that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.ability.genero.server.model.subcategoria updatesubcategoria(
		com.ability.genero.server.model.subcategoria subcategoria)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _subcategoriaLocalService.updatesubcategoria(subcategoria);
	}

	/**
	* Updates the subcategoria in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param subcategoria the subcategoria
	* @param merge whether to merge the subcategoria with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the subcategoria that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.ability.genero.server.model.subcategoria updatesubcategoria(
		com.ability.genero.server.model.subcategoria subcategoria, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _subcategoriaLocalService.updatesubcategoria(subcategoria, merge);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier() {
		return _subcategoriaLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_subcategoriaLocalService.setBeanIdentifier(beanIdentifier);
	}

	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _subcategoriaLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	public java.util.List<com.ability.genero.server.model.subcategoria> findBysubCatXCat(
		int idCategoria)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _subcategoriaLocalService.findBysubCatXCat(idCategoria);
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedService}
	 */
	public subcategoriaLocalService getWrappedsubcategoriaLocalService() {
		return _subcategoriaLocalService;
	}

	/**
	 * @deprecated Renamed to {@link #setWrappedService}
	 */
	public void setWrappedsubcategoriaLocalService(
		subcategoriaLocalService subcategoriaLocalService) {
		_subcategoriaLocalService = subcategoriaLocalService;
	}

	public subcategoriaLocalService getWrappedService() {
		return _subcategoriaLocalService;
	}

	public void setWrappedService(
		subcategoriaLocalService subcategoriaLocalService) {
		_subcategoriaLocalService = subcategoriaLocalService;
	}

	private subcategoriaLocalService _subcategoriaLocalService;
}