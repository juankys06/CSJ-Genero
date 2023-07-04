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
 * This class is a wrapper for {@link especialidadLocalService}.
 * </p>
 *
 * @author    DELL Villartech
 * @see       especialidadLocalService
 * @generated
 */
public class especialidadLocalServiceWrapper implements especialidadLocalService,
	ServiceWrapper<especialidadLocalService> {
	public especialidadLocalServiceWrapper(
		especialidadLocalService especialidadLocalService) {
		_especialidadLocalService = especialidadLocalService;
	}

	/**
	* Adds the especialidad to the database. Also notifies the appropriate model listeners.
	*
	* @param especialidad the especialidad
	* @return the especialidad that was added
	* @throws SystemException if a system exception occurred
	*/
	public com.ability.genero.server.model.especialidad addespecialidad(
		com.ability.genero.server.model.especialidad especialidad)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _especialidadLocalService.addespecialidad(especialidad);
	}

	/**
	* Creates a new especialidad with the primary key. Does not add the especialidad to the database.
	*
	* @param id the primary key for the new especialidad
	* @return the new especialidad
	*/
	public com.ability.genero.server.model.especialidad createespecialidad(
		int id) {
		return _especialidadLocalService.createespecialidad(id);
	}

	/**
	* Deletes the especialidad with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the especialidad
	* @return the especialidad that was removed
	* @throws PortalException if a especialidad with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ability.genero.server.model.especialidad deleteespecialidad(
		int id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _especialidadLocalService.deleteespecialidad(id);
	}

	/**
	* Deletes the especialidad from the database. Also notifies the appropriate model listeners.
	*
	* @param especialidad the especialidad
	* @return the especialidad that was removed
	* @throws SystemException if a system exception occurred
	*/
	public com.ability.genero.server.model.especialidad deleteespecialidad(
		com.ability.genero.server.model.especialidad especialidad)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _especialidadLocalService.deleteespecialidad(especialidad);
	}

	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _especialidadLocalService.dynamicQuery();
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
		return _especialidadLocalService.dynamicQuery(dynamicQuery);
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
		return _especialidadLocalService.dynamicQuery(dynamicQuery, start, end);
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
		return _especialidadLocalService.dynamicQuery(dynamicQuery, start, end,
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
		return _especialidadLocalService.dynamicQueryCount(dynamicQuery);
	}

	public com.ability.genero.server.model.especialidad fetchespecialidad(
		int id) throws com.liferay.portal.kernel.exception.SystemException {
		return _especialidadLocalService.fetchespecialidad(id);
	}

	/**
	* Returns the especialidad with the primary key.
	*
	* @param id the primary key of the especialidad
	* @return the especialidad
	* @throws PortalException if a especialidad with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ability.genero.server.model.especialidad getespecialidad(int id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _especialidadLocalService.getespecialidad(id);
	}

	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _especialidadLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the especialidads.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of especialidads
	* @param end the upper bound of the range of especialidads (not inclusive)
	* @return the range of especialidads
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ability.genero.server.model.especialidad> getespecialidads(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _especialidadLocalService.getespecialidads(start, end);
	}

	/**
	* Returns the number of especialidads.
	*
	* @return the number of especialidads
	* @throws SystemException if a system exception occurred
	*/
	public int getespecialidadsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _especialidadLocalService.getespecialidadsCount();
	}

	/**
	* Updates the especialidad in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param especialidad the especialidad
	* @return the especialidad that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.ability.genero.server.model.especialidad updateespecialidad(
		com.ability.genero.server.model.especialidad especialidad)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _especialidadLocalService.updateespecialidad(especialidad);
	}

	/**
	* Updates the especialidad in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param especialidad the especialidad
	* @param merge whether to merge the especialidad with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the especialidad that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.ability.genero.server.model.especialidad updateespecialidad(
		com.ability.genero.server.model.especialidad especialidad, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _especialidadLocalService.updateespecialidad(especialidad, merge);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier() {
		return _especialidadLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_especialidadLocalService.setBeanIdentifier(beanIdentifier);
	}

	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _especialidadLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedService}
	 */
	public especialidadLocalService getWrappedespecialidadLocalService() {
		return _especialidadLocalService;
	}

	/**
	 * @deprecated Renamed to {@link #setWrappedService}
	 */
	public void setWrappedespecialidadLocalService(
		especialidadLocalService especialidadLocalService) {
		_especialidadLocalService = especialidadLocalService;
	}

	public especialidadLocalService getWrappedService() {
		return _especialidadLocalService;
	}

	public void setWrappedService(
		especialidadLocalService especialidadLocalService) {
		_especialidadLocalService = especialidadLocalService;
	}

	private especialidadLocalService _especialidadLocalService;
}