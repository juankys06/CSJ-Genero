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
 * This class is a wrapper for {@link tipoDecisionLocalService}.
 * </p>
 *
 * @author    DELL Villartech
 * @see       tipoDecisionLocalService
 * @generated
 */
public class tipoDecisionLocalServiceWrapper implements tipoDecisionLocalService,
	ServiceWrapper<tipoDecisionLocalService> {
	public tipoDecisionLocalServiceWrapper(
		tipoDecisionLocalService tipoDecisionLocalService) {
		_tipoDecisionLocalService = tipoDecisionLocalService;
	}

	/**
	* Adds the tipo decision to the database. Also notifies the appropriate model listeners.
	*
	* @param tipoDecision the tipo decision
	* @return the tipo decision that was added
	* @throws SystemException if a system exception occurred
	*/
	public com.ability.genero.server.model.tipoDecision addtipoDecision(
		com.ability.genero.server.model.tipoDecision tipoDecision)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tipoDecisionLocalService.addtipoDecision(tipoDecision);
	}

	/**
	* Creates a new tipo decision with the primary key. Does not add the tipo decision to the database.
	*
	* @param id the primary key for the new tipo decision
	* @return the new tipo decision
	*/
	public com.ability.genero.server.model.tipoDecision createtipoDecision(
		int id) {
		return _tipoDecisionLocalService.createtipoDecision(id);
	}

	/**
	* Deletes the tipo decision with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the tipo decision
	* @return the tipo decision that was removed
	* @throws PortalException if a tipo decision with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ability.genero.server.model.tipoDecision deletetipoDecision(
		int id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _tipoDecisionLocalService.deletetipoDecision(id);
	}

	/**
	* Deletes the tipo decision from the database. Also notifies the appropriate model listeners.
	*
	* @param tipoDecision the tipo decision
	* @return the tipo decision that was removed
	* @throws SystemException if a system exception occurred
	*/
	public com.ability.genero.server.model.tipoDecision deletetipoDecision(
		com.ability.genero.server.model.tipoDecision tipoDecision)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tipoDecisionLocalService.deletetipoDecision(tipoDecision);
	}

	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _tipoDecisionLocalService.dynamicQuery();
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
		return _tipoDecisionLocalService.dynamicQuery(dynamicQuery);
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
		return _tipoDecisionLocalService.dynamicQuery(dynamicQuery, start, end);
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
		return _tipoDecisionLocalService.dynamicQuery(dynamicQuery, start, end,
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
		return _tipoDecisionLocalService.dynamicQueryCount(dynamicQuery);
	}

	public com.ability.genero.server.model.tipoDecision fetchtipoDecision(
		int id) throws com.liferay.portal.kernel.exception.SystemException {
		return _tipoDecisionLocalService.fetchtipoDecision(id);
	}

	/**
	* Returns the tipo decision with the primary key.
	*
	* @param id the primary key of the tipo decision
	* @return the tipo decision
	* @throws PortalException if a tipo decision with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ability.genero.server.model.tipoDecision gettipoDecision(int id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _tipoDecisionLocalService.gettipoDecision(id);
	}

	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _tipoDecisionLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the tipo decisions.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of tipo decisions
	* @param end the upper bound of the range of tipo decisions (not inclusive)
	* @return the range of tipo decisions
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ability.genero.server.model.tipoDecision> gettipoDecisions(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tipoDecisionLocalService.gettipoDecisions(start, end);
	}

	/**
	* Returns the number of tipo decisions.
	*
	* @return the number of tipo decisions
	* @throws SystemException if a system exception occurred
	*/
	public int gettipoDecisionsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tipoDecisionLocalService.gettipoDecisionsCount();
	}

	/**
	* Updates the tipo decision in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param tipoDecision the tipo decision
	* @return the tipo decision that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.ability.genero.server.model.tipoDecision updatetipoDecision(
		com.ability.genero.server.model.tipoDecision tipoDecision)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tipoDecisionLocalService.updatetipoDecision(tipoDecision);
	}

	/**
	* Updates the tipo decision in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param tipoDecision the tipo decision
	* @param merge whether to merge the tipo decision with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the tipo decision that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.ability.genero.server.model.tipoDecision updatetipoDecision(
		com.ability.genero.server.model.tipoDecision tipoDecision, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tipoDecisionLocalService.updatetipoDecision(tipoDecision, merge);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier() {
		return _tipoDecisionLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_tipoDecisionLocalService.setBeanIdentifier(beanIdentifier);
	}

	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _tipoDecisionLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedService}
	 */
	public tipoDecisionLocalService getWrappedtipoDecisionLocalService() {
		return _tipoDecisionLocalService;
	}

	/**
	 * @deprecated Renamed to {@link #setWrappedService}
	 */
	public void setWrappedtipoDecisionLocalService(
		tipoDecisionLocalService tipoDecisionLocalService) {
		_tipoDecisionLocalService = tipoDecisionLocalService;
	}

	public tipoDecisionLocalService getWrappedService() {
		return _tipoDecisionLocalService;
	}

	public void setWrappedService(
		tipoDecisionLocalService tipoDecisionLocalService) {
		_tipoDecisionLocalService = tipoDecisionLocalService;
	}

	private tipoDecisionLocalService _tipoDecisionLocalService;
}