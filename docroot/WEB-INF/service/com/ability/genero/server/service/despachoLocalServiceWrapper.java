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
 * This class is a wrapper for {@link despachoLocalService}.
 * </p>
 *
 * @author    DELL Villartech
 * @see       despachoLocalService
 * @generated
 */
public class despachoLocalServiceWrapper implements despachoLocalService,
	ServiceWrapper<despachoLocalService> {
	public despachoLocalServiceWrapper(
		despachoLocalService despachoLocalService) {
		_despachoLocalService = despachoLocalService;
	}

	/**
	* Adds the despacho to the database. Also notifies the appropriate model listeners.
	*
	* @param despacho the despacho
	* @return the despacho that was added
	* @throws SystemException if a system exception occurred
	*/
	public com.ability.genero.server.model.despacho adddespacho(
		com.ability.genero.server.model.despacho despacho)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _despachoLocalService.adddespacho(despacho);
	}

	/**
	* Creates a new despacho with the primary key. Does not add the despacho to the database.
	*
	* @param id the primary key for the new despacho
	* @return the new despacho
	*/
	public com.ability.genero.server.model.despacho createdespacho(int id) {
		return _despachoLocalService.createdespacho(id);
	}

	/**
	* Deletes the despacho with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the despacho
	* @return the despacho that was removed
	* @throws PortalException if a despacho with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ability.genero.server.model.despacho deletedespacho(int id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _despachoLocalService.deletedespacho(id);
	}

	/**
	* Deletes the despacho from the database. Also notifies the appropriate model listeners.
	*
	* @param despacho the despacho
	* @return the despacho that was removed
	* @throws SystemException if a system exception occurred
	*/
	public com.ability.genero.server.model.despacho deletedespacho(
		com.ability.genero.server.model.despacho despacho)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _despachoLocalService.deletedespacho(despacho);
	}

	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _despachoLocalService.dynamicQuery();
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
		return _despachoLocalService.dynamicQuery(dynamicQuery);
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
		return _despachoLocalService.dynamicQuery(dynamicQuery, start, end);
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
		return _despachoLocalService.dynamicQuery(dynamicQuery, start, end,
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
		return _despachoLocalService.dynamicQueryCount(dynamicQuery);
	}

	public com.ability.genero.server.model.despacho fetchdespacho(int id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _despachoLocalService.fetchdespacho(id);
	}

	/**
	* Returns the despacho with the primary key.
	*
	* @param id the primary key of the despacho
	* @return the despacho
	* @throws PortalException if a despacho with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ability.genero.server.model.despacho getdespacho(int id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _despachoLocalService.getdespacho(id);
	}

	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _despachoLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the despachos.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of despachos
	* @param end the upper bound of the range of despachos (not inclusive)
	* @return the range of despachos
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ability.genero.server.model.despacho> getdespachos(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _despachoLocalService.getdespachos(start, end);
	}

	/**
	* Returns the number of despachos.
	*
	* @return the number of despachos
	* @throws SystemException if a system exception occurred
	*/
	public int getdespachosCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _despachoLocalService.getdespachosCount();
	}

	/**
	* Updates the despacho in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param despacho the despacho
	* @return the despacho that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.ability.genero.server.model.despacho updatedespacho(
		com.ability.genero.server.model.despacho despacho)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _despachoLocalService.updatedespacho(despacho);
	}

	/**
	* Updates the despacho in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param despacho the despacho
	* @param merge whether to merge the despacho with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the despacho that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.ability.genero.server.model.despacho updatedespacho(
		com.ability.genero.server.model.despacho despacho, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _despachoLocalService.updatedespacho(despacho, merge);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier() {
		return _despachoLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_despachoLocalService.setBeanIdentifier(beanIdentifier);
	}

	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _despachoLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	public java.util.List<com.ability.genero.server.model.despacho> findByDespachoCodigo(
		java.lang.String codigo)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _despachoLocalService.findByDespachoCodigo(codigo);
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedService}
	 */
	public despachoLocalService getWrappeddespachoLocalService() {
		return _despachoLocalService;
	}

	/**
	 * @deprecated Renamed to {@link #setWrappedService}
	 */
	public void setWrappeddespachoLocalService(
		despachoLocalService despachoLocalService) {
		_despachoLocalService = despachoLocalService;
	}

	public despachoLocalService getWrappedService() {
		return _despachoLocalService;
	}

	public void setWrappedService(despachoLocalService despachoLocalService) {
		_despachoLocalService = despachoLocalService;
	}

	private despachoLocalService _despachoLocalService;
}