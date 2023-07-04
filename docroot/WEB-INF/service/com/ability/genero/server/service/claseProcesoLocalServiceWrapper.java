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
 * This class is a wrapper for {@link claseProcesoLocalService}.
 * </p>
 *
 * @author    DELL Villartech
 * @see       claseProcesoLocalService
 * @generated
 */
public class claseProcesoLocalServiceWrapper implements claseProcesoLocalService,
	ServiceWrapper<claseProcesoLocalService> {
	public claseProcesoLocalServiceWrapper(
		claseProcesoLocalService claseProcesoLocalService) {
		_claseProcesoLocalService = claseProcesoLocalService;
	}

	/**
	* Adds the clase proceso to the database. Also notifies the appropriate model listeners.
	*
	* @param claseProceso the clase proceso
	* @return the clase proceso that was added
	* @throws SystemException if a system exception occurred
	*/
	public com.ability.genero.server.model.claseProceso addclaseProceso(
		com.ability.genero.server.model.claseProceso claseProceso)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _claseProcesoLocalService.addclaseProceso(claseProceso);
	}

	/**
	* Creates a new clase proceso with the primary key. Does not add the clase proceso to the database.
	*
	* @param id the primary key for the new clase proceso
	* @return the new clase proceso
	*/
	public com.ability.genero.server.model.claseProceso createclaseProceso(
		int id) {
		return _claseProcesoLocalService.createclaseProceso(id);
	}

	/**
	* Deletes the clase proceso with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the clase proceso
	* @return the clase proceso that was removed
	* @throws PortalException if a clase proceso with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ability.genero.server.model.claseProceso deleteclaseProceso(
		int id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _claseProcesoLocalService.deleteclaseProceso(id);
	}

	/**
	* Deletes the clase proceso from the database. Also notifies the appropriate model listeners.
	*
	* @param claseProceso the clase proceso
	* @return the clase proceso that was removed
	* @throws SystemException if a system exception occurred
	*/
	public com.ability.genero.server.model.claseProceso deleteclaseProceso(
		com.ability.genero.server.model.claseProceso claseProceso)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _claseProcesoLocalService.deleteclaseProceso(claseProceso);
	}

	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _claseProcesoLocalService.dynamicQuery();
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
		return _claseProcesoLocalService.dynamicQuery(dynamicQuery);
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
		return _claseProcesoLocalService.dynamicQuery(dynamicQuery, start, end);
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
		return _claseProcesoLocalService.dynamicQuery(dynamicQuery, start, end,
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
		return _claseProcesoLocalService.dynamicQueryCount(dynamicQuery);
	}

	public com.ability.genero.server.model.claseProceso fetchclaseProceso(
		int id) throws com.liferay.portal.kernel.exception.SystemException {
		return _claseProcesoLocalService.fetchclaseProceso(id);
	}

	/**
	* Returns the clase proceso with the primary key.
	*
	* @param id the primary key of the clase proceso
	* @return the clase proceso
	* @throws PortalException if a clase proceso with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ability.genero.server.model.claseProceso getclaseProceso(int id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _claseProcesoLocalService.getclaseProceso(id);
	}

	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _claseProcesoLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the clase procesos.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of clase procesos
	* @param end the upper bound of the range of clase procesos (not inclusive)
	* @return the range of clase procesos
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ability.genero.server.model.claseProceso> getclaseProcesos(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _claseProcesoLocalService.getclaseProcesos(start, end);
	}

	/**
	* Returns the number of clase procesos.
	*
	* @return the number of clase procesos
	* @throws SystemException if a system exception occurred
	*/
	public int getclaseProcesosCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _claseProcesoLocalService.getclaseProcesosCount();
	}

	/**
	* Updates the clase proceso in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param claseProceso the clase proceso
	* @return the clase proceso that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.ability.genero.server.model.claseProceso updateclaseProceso(
		com.ability.genero.server.model.claseProceso claseProceso)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _claseProcesoLocalService.updateclaseProceso(claseProceso);
	}

	/**
	* Updates the clase proceso in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param claseProceso the clase proceso
	* @param merge whether to merge the clase proceso with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the clase proceso that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.ability.genero.server.model.claseProceso updateclaseProceso(
		com.ability.genero.server.model.claseProceso claseProceso, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _claseProcesoLocalService.updateclaseProceso(claseProceso, merge);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier() {
		return _claseProcesoLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_claseProcesoLocalService.setBeanIdentifier(beanIdentifier);
	}

	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _claseProcesoLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedService}
	 */
	public claseProcesoLocalService getWrappedclaseProcesoLocalService() {
		return _claseProcesoLocalService;
	}

	/**
	 * @deprecated Renamed to {@link #setWrappedService}
	 */
	public void setWrappedclaseProcesoLocalService(
		claseProcesoLocalService claseProcesoLocalService) {
		_claseProcesoLocalService = claseProcesoLocalService;
	}

	public claseProcesoLocalService getWrappedService() {
		return _claseProcesoLocalService;
	}

	public void setWrappedService(
		claseProcesoLocalService claseProcesoLocalService) {
		_claseProcesoLocalService = claseProcesoLocalService;
	}

	private claseProcesoLocalService _claseProcesoLocalService;
}