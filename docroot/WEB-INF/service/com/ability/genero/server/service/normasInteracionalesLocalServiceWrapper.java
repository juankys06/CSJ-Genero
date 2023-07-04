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
 * This class is a wrapper for {@link normasInteracionalesLocalService}.
 * </p>
 *
 * @author    DELL Villartech
 * @see       normasInteracionalesLocalService
 * @generated
 */
public class normasInteracionalesLocalServiceWrapper
	implements normasInteracionalesLocalService,
		ServiceWrapper<normasInteracionalesLocalService> {
	public normasInteracionalesLocalServiceWrapper(
		normasInteracionalesLocalService normasInteracionalesLocalService) {
		_normasInteracionalesLocalService = normasInteracionalesLocalService;
	}

	/**
	* Adds the normas interacionales to the database. Also notifies the appropriate model listeners.
	*
	* @param normasInteracionales the normas interacionales
	* @return the normas interacionales that was added
	* @throws SystemException if a system exception occurred
	*/
	public com.ability.genero.server.model.normasInteracionales addnormasInteracionales(
		com.ability.genero.server.model.normasInteracionales normasInteracionales)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _normasInteracionalesLocalService.addnormasInteracionales(normasInteracionales);
	}

	/**
	* Creates a new normas interacionales with the primary key. Does not add the normas interacionales to the database.
	*
	* @param id the primary key for the new normas interacionales
	* @return the new normas interacionales
	*/
	public com.ability.genero.server.model.normasInteracionales createnormasInteracionales(
		int id) {
		return _normasInteracionalesLocalService.createnormasInteracionales(id);
	}

	/**
	* Deletes the normas interacionales with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the normas interacionales
	* @return the normas interacionales that was removed
	* @throws PortalException if a normas interacionales with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ability.genero.server.model.normasInteracionales deletenormasInteracionales(
		int id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _normasInteracionalesLocalService.deletenormasInteracionales(id);
	}

	/**
	* Deletes the normas interacionales from the database. Also notifies the appropriate model listeners.
	*
	* @param normasInteracionales the normas interacionales
	* @return the normas interacionales that was removed
	* @throws SystemException if a system exception occurred
	*/
	public com.ability.genero.server.model.normasInteracionales deletenormasInteracionales(
		com.ability.genero.server.model.normasInteracionales normasInteracionales)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _normasInteracionalesLocalService.deletenormasInteracionales(normasInteracionales);
	}

	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _normasInteracionalesLocalService.dynamicQuery();
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
		return _normasInteracionalesLocalService.dynamicQuery(dynamicQuery);
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
		return _normasInteracionalesLocalService.dynamicQuery(dynamicQuery,
			start, end);
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
		return _normasInteracionalesLocalService.dynamicQuery(dynamicQuery,
			start, end, orderByComparator);
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
		return _normasInteracionalesLocalService.dynamicQueryCount(dynamicQuery);
	}

	public com.ability.genero.server.model.normasInteracionales fetchnormasInteracionales(
		int id) throws com.liferay.portal.kernel.exception.SystemException {
		return _normasInteracionalesLocalService.fetchnormasInteracionales(id);
	}

	/**
	* Returns the normas interacionales with the primary key.
	*
	* @param id the primary key of the normas interacionales
	* @return the normas interacionales
	* @throws PortalException if a normas interacionales with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ability.genero.server.model.normasInteracionales getnormasInteracionales(
		int id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _normasInteracionalesLocalService.getnormasInteracionales(id);
	}

	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _normasInteracionalesLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the normas interacionaleses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of normas interacionaleses
	* @param end the upper bound of the range of normas interacionaleses (not inclusive)
	* @return the range of normas interacionaleses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ability.genero.server.model.normasInteracionales> getnormasInteracionaleses(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _normasInteracionalesLocalService.getnormasInteracionaleses(start,
			end);
	}

	/**
	* Returns the number of normas interacionaleses.
	*
	* @return the number of normas interacionaleses
	* @throws SystemException if a system exception occurred
	*/
	public int getnormasInteracionalesesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _normasInteracionalesLocalService.getnormasInteracionalesesCount();
	}

	/**
	* Updates the normas interacionales in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param normasInteracionales the normas interacionales
	* @return the normas interacionales that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.ability.genero.server.model.normasInteracionales updatenormasInteracionales(
		com.ability.genero.server.model.normasInteracionales normasInteracionales)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _normasInteracionalesLocalService.updatenormasInteracionales(normasInteracionales);
	}

	/**
	* Updates the normas interacionales in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param normasInteracionales the normas interacionales
	* @param merge whether to merge the normas interacionales with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the normas interacionales that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.ability.genero.server.model.normasInteracionales updatenormasInteracionales(
		com.ability.genero.server.model.normasInteracionales normasInteracionales,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _normasInteracionalesLocalService.updatenormasInteracionales(normasInteracionales,
			merge);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier() {
		return _normasInteracionalesLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_normasInteracionalesLocalService.setBeanIdentifier(beanIdentifier);
	}

	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _normasInteracionalesLocalService.invokeMethod(name,
			parameterTypes, arguments);
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedService}
	 */
	public normasInteracionalesLocalService getWrappednormasInteracionalesLocalService() {
		return _normasInteracionalesLocalService;
	}

	/**
	 * @deprecated Renamed to {@link #setWrappedService}
	 */
	public void setWrappednormasInteracionalesLocalService(
		normasInteracionalesLocalService normasInteracionalesLocalService) {
		_normasInteracionalesLocalService = normasInteracionalesLocalService;
	}

	public normasInteracionalesLocalService getWrappedService() {
		return _normasInteracionalesLocalService;
	}

	public void setWrappedService(
		normasInteracionalesLocalService normasInteracionalesLocalService) {
		_normasInteracionalesLocalService = normasInteracionalesLocalService;
	}

	private normasInteracionalesLocalService _normasInteracionalesLocalService;
}