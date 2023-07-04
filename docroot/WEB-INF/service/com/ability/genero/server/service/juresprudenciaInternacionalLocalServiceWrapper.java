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
 * This class is a wrapper for {@link juresprudenciaInternacionalLocalService}.
 * </p>
 *
 * @author    DELL Villartech
 * @see       juresprudenciaInternacionalLocalService
 * @generated
 */
public class juresprudenciaInternacionalLocalServiceWrapper
	implements juresprudenciaInternacionalLocalService,
		ServiceWrapper<juresprudenciaInternacionalLocalService> {
	public juresprudenciaInternacionalLocalServiceWrapper(
		juresprudenciaInternacionalLocalService juresprudenciaInternacionalLocalService) {
		_juresprudenciaInternacionalLocalService = juresprudenciaInternacionalLocalService;
	}

	/**
	* Adds the juresprudencia internacional to the database. Also notifies the appropriate model listeners.
	*
	* @param juresprudenciaInternacional the juresprudencia internacional
	* @return the juresprudencia internacional that was added
	* @throws SystemException if a system exception occurred
	*/
	public com.ability.genero.server.model.juresprudenciaInternacional addjuresprudenciaInternacional(
		com.ability.genero.server.model.juresprudenciaInternacional juresprudenciaInternacional)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _juresprudenciaInternacionalLocalService.addjuresprudenciaInternacional(juresprudenciaInternacional);
	}

	/**
	* Creates a new juresprudencia internacional with the primary key. Does not add the juresprudencia internacional to the database.
	*
	* @param id the primary key for the new juresprudencia internacional
	* @return the new juresprudencia internacional
	*/
	public com.ability.genero.server.model.juresprudenciaInternacional createjuresprudenciaInternacional(
		int id) {
		return _juresprudenciaInternacionalLocalService.createjuresprudenciaInternacional(id);
	}

	/**
	* Deletes the juresprudencia internacional with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the juresprudencia internacional
	* @return the juresprudencia internacional that was removed
	* @throws PortalException if a juresprudencia internacional with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ability.genero.server.model.juresprudenciaInternacional deletejuresprudenciaInternacional(
		int id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _juresprudenciaInternacionalLocalService.deletejuresprudenciaInternacional(id);
	}

	/**
	* Deletes the juresprudencia internacional from the database. Also notifies the appropriate model listeners.
	*
	* @param juresprudenciaInternacional the juresprudencia internacional
	* @return the juresprudencia internacional that was removed
	* @throws SystemException if a system exception occurred
	*/
	public com.ability.genero.server.model.juresprudenciaInternacional deletejuresprudenciaInternacional(
		com.ability.genero.server.model.juresprudenciaInternacional juresprudenciaInternacional)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _juresprudenciaInternacionalLocalService.deletejuresprudenciaInternacional(juresprudenciaInternacional);
	}

	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _juresprudenciaInternacionalLocalService.dynamicQuery();
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
		return _juresprudenciaInternacionalLocalService.dynamicQuery(dynamicQuery);
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
		return _juresprudenciaInternacionalLocalService.dynamicQuery(dynamicQuery,
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
		return _juresprudenciaInternacionalLocalService.dynamicQuery(dynamicQuery,
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
		return _juresprudenciaInternacionalLocalService.dynamicQueryCount(dynamicQuery);
	}

	public com.ability.genero.server.model.juresprudenciaInternacional fetchjuresprudenciaInternacional(
		int id) throws com.liferay.portal.kernel.exception.SystemException {
		return _juresprudenciaInternacionalLocalService.fetchjuresprudenciaInternacional(id);
	}

	/**
	* Returns the juresprudencia internacional with the primary key.
	*
	* @param id the primary key of the juresprudencia internacional
	* @return the juresprudencia internacional
	* @throws PortalException if a juresprudencia internacional with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ability.genero.server.model.juresprudenciaInternacional getjuresprudenciaInternacional(
		int id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _juresprudenciaInternacionalLocalService.getjuresprudenciaInternacional(id);
	}

	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _juresprudenciaInternacionalLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the juresprudencia internacionals.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of juresprudencia internacionals
	* @param end the upper bound of the range of juresprudencia internacionals (not inclusive)
	* @return the range of juresprudencia internacionals
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ability.genero.server.model.juresprudenciaInternacional> getjuresprudenciaInternacionals(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _juresprudenciaInternacionalLocalService.getjuresprudenciaInternacionals(start,
			end);
	}

	/**
	* Returns the number of juresprudencia internacionals.
	*
	* @return the number of juresprudencia internacionals
	* @throws SystemException if a system exception occurred
	*/
	public int getjuresprudenciaInternacionalsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _juresprudenciaInternacionalLocalService.getjuresprudenciaInternacionalsCount();
	}

	/**
	* Updates the juresprudencia internacional in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param juresprudenciaInternacional the juresprudencia internacional
	* @return the juresprudencia internacional that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.ability.genero.server.model.juresprudenciaInternacional updatejuresprudenciaInternacional(
		com.ability.genero.server.model.juresprudenciaInternacional juresprudenciaInternacional)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _juresprudenciaInternacionalLocalService.updatejuresprudenciaInternacional(juresprudenciaInternacional);
	}

	/**
	* Updates the juresprudencia internacional in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param juresprudenciaInternacional the juresprudencia internacional
	* @param merge whether to merge the juresprudencia internacional with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the juresprudencia internacional that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.ability.genero.server.model.juresprudenciaInternacional updatejuresprudenciaInternacional(
		com.ability.genero.server.model.juresprudenciaInternacional juresprudenciaInternacional,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _juresprudenciaInternacionalLocalService.updatejuresprudenciaInternacional(juresprudenciaInternacional,
			merge);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier() {
		return _juresprudenciaInternacionalLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_juresprudenciaInternacionalLocalService.setBeanIdentifier(beanIdentifier);
	}

	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _juresprudenciaInternacionalLocalService.invokeMethod(name,
			parameterTypes, arguments);
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedService}
	 */
	public juresprudenciaInternacionalLocalService getWrappedjuresprudenciaInternacionalLocalService() {
		return _juresprudenciaInternacionalLocalService;
	}

	/**
	 * @deprecated Renamed to {@link #setWrappedService}
	 */
	public void setWrappedjuresprudenciaInternacionalLocalService(
		juresprudenciaInternacionalLocalService juresprudenciaInternacionalLocalService) {
		_juresprudenciaInternacionalLocalService = juresprudenciaInternacionalLocalService;
	}

	public juresprudenciaInternacionalLocalService getWrappedService() {
		return _juresprudenciaInternacionalLocalService;
	}

	public void setWrappedService(
		juresprudenciaInternacionalLocalService juresprudenciaInternacionalLocalService) {
		_juresprudenciaInternacionalLocalService = juresprudenciaInternacionalLocalService;
	}

	private juresprudenciaInternacionalLocalService _juresprudenciaInternacionalLocalService;
}