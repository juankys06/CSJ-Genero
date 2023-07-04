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
 * This class is a wrapper for {@link distritoGLocalService}.
 * </p>
 *
 * @author    DELL Villartech
 * @see       distritoGLocalService
 * @generated
 */
public class distritoGLocalServiceWrapper implements distritoGLocalService,
	ServiceWrapper<distritoGLocalService> {
	public distritoGLocalServiceWrapper(
		distritoGLocalService distritoGLocalService) {
		_distritoGLocalService = distritoGLocalService;
	}

	/**
	* Adds the distrito g to the database. Also notifies the appropriate model listeners.
	*
	* @param distritoG the distrito g
	* @return the distrito g that was added
	* @throws SystemException if a system exception occurred
	*/
	public com.ability.genero.server.model.distritoG adddistritoG(
		com.ability.genero.server.model.distritoG distritoG)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _distritoGLocalService.adddistritoG(distritoG);
	}

	/**
	* Creates a new distrito g with the primary key. Does not add the distrito g to the database.
	*
	* @param id the primary key for the new distrito g
	* @return the new distrito g
	*/
	public com.ability.genero.server.model.distritoG createdistritoG(int id) {
		return _distritoGLocalService.createdistritoG(id);
	}

	/**
	* Deletes the distrito g with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the distrito g
	* @return the distrito g that was removed
	* @throws PortalException if a distrito g with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ability.genero.server.model.distritoG deletedistritoG(int id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _distritoGLocalService.deletedistritoG(id);
	}

	/**
	* Deletes the distrito g from the database. Also notifies the appropriate model listeners.
	*
	* @param distritoG the distrito g
	* @return the distrito g that was removed
	* @throws SystemException if a system exception occurred
	*/
	public com.ability.genero.server.model.distritoG deletedistritoG(
		com.ability.genero.server.model.distritoG distritoG)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _distritoGLocalService.deletedistritoG(distritoG);
	}

	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _distritoGLocalService.dynamicQuery();
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
		return _distritoGLocalService.dynamicQuery(dynamicQuery);
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
		return _distritoGLocalService.dynamicQuery(dynamicQuery, start, end);
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
		return _distritoGLocalService.dynamicQuery(dynamicQuery, start, end,
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
		return _distritoGLocalService.dynamicQueryCount(dynamicQuery);
	}

	public com.ability.genero.server.model.distritoG fetchdistritoG(int id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _distritoGLocalService.fetchdistritoG(id);
	}

	/**
	* Returns the distrito g with the primary key.
	*
	* @param id the primary key of the distrito g
	* @return the distrito g
	* @throws PortalException if a distrito g with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ability.genero.server.model.distritoG getdistritoG(int id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _distritoGLocalService.getdistritoG(id);
	}

	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _distritoGLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the distrito gs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of distrito gs
	* @param end the upper bound of the range of distrito gs (not inclusive)
	* @return the range of distrito gs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ability.genero.server.model.distritoG> getdistritoGs(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _distritoGLocalService.getdistritoGs(start, end);
	}

	/**
	* Returns the number of distrito gs.
	*
	* @return the number of distrito gs
	* @throws SystemException if a system exception occurred
	*/
	public int getdistritoGsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _distritoGLocalService.getdistritoGsCount();
	}

	/**
	* Updates the distrito g in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param distritoG the distrito g
	* @return the distrito g that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.ability.genero.server.model.distritoG updatedistritoG(
		com.ability.genero.server.model.distritoG distritoG)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _distritoGLocalService.updatedistritoG(distritoG);
	}

	/**
	* Updates the distrito g in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param distritoG the distrito g
	* @param merge whether to merge the distrito g with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the distrito g that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.ability.genero.server.model.distritoG updatedistritoG(
		com.ability.genero.server.model.distritoG distritoG, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _distritoGLocalService.updatedistritoG(distritoG, merge);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier() {
		return _distritoGLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_distritoGLocalService.setBeanIdentifier(beanIdentifier);
	}

	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _distritoGLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedService}
	 */
	public distritoGLocalService getWrappeddistritoGLocalService() {
		return _distritoGLocalService;
	}

	/**
	 * @deprecated Renamed to {@link #setWrappedService}
	 */
	public void setWrappeddistritoGLocalService(
		distritoGLocalService distritoGLocalService) {
		_distritoGLocalService = distritoGLocalService;
	}

	public distritoGLocalService getWrappedService() {
		return _distritoGLocalService;
	}

	public void setWrappedService(distritoGLocalService distritoGLocalService) {
		_distritoGLocalService = distritoGLocalService;
	}

	private distritoGLocalService _distritoGLocalService;
}