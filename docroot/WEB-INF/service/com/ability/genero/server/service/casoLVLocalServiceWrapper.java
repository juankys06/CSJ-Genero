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
 * This class is a wrapper for {@link casoLVLocalService}.
 * </p>
 *
 * @author    DELL Villartech
 * @see       casoLVLocalService
 * @generated
 */
public class casoLVLocalServiceWrapper implements casoLVLocalService,
	ServiceWrapper<casoLVLocalService> {
	public casoLVLocalServiceWrapper(casoLVLocalService casoLVLocalService) {
		_casoLVLocalService = casoLVLocalService;
	}

	/**
	* Adds the caso l v to the database. Also notifies the appropriate model listeners.
	*
	* @param casoLV the caso l v
	* @return the caso l v that was added
	* @throws SystemException if a system exception occurred
	*/
	public com.ability.genero.server.model.casoLV addcasoLV(
		com.ability.genero.server.model.casoLV casoLV)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _casoLVLocalService.addcasoLV(casoLV);
	}

	/**
	* Creates a new caso l v with the primary key. Does not add the caso l v to the database.
	*
	* @param id the primary key for the new caso l v
	* @return the new caso l v
	*/
	public com.ability.genero.server.model.casoLV createcasoLV(int id) {
		return _casoLVLocalService.createcasoLV(id);
	}

	/**
	* Deletes the caso l v with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the caso l v
	* @return the caso l v that was removed
	* @throws PortalException if a caso l v with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ability.genero.server.model.casoLV deletecasoLV(int id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _casoLVLocalService.deletecasoLV(id);
	}

	/**
	* Deletes the caso l v from the database. Also notifies the appropriate model listeners.
	*
	* @param casoLV the caso l v
	* @return the caso l v that was removed
	* @throws SystemException if a system exception occurred
	*/
	public com.ability.genero.server.model.casoLV deletecasoLV(
		com.ability.genero.server.model.casoLV casoLV)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _casoLVLocalService.deletecasoLV(casoLV);
	}

	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _casoLVLocalService.dynamicQuery();
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
		return _casoLVLocalService.dynamicQuery(dynamicQuery);
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
		return _casoLVLocalService.dynamicQuery(dynamicQuery, start, end);
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
		return _casoLVLocalService.dynamicQuery(dynamicQuery, start, end,
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
		return _casoLVLocalService.dynamicQueryCount(dynamicQuery);
	}

	public com.ability.genero.server.model.casoLV fetchcasoLV(int id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _casoLVLocalService.fetchcasoLV(id);
	}

	/**
	* Returns the caso l v with the primary key.
	*
	* @param id the primary key of the caso l v
	* @return the caso l v
	* @throws PortalException if a caso l v with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ability.genero.server.model.casoLV getcasoLV(int id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _casoLVLocalService.getcasoLV(id);
	}

	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _casoLVLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the caso l vs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of caso l vs
	* @param end the upper bound of the range of caso l vs (not inclusive)
	* @return the range of caso l vs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ability.genero.server.model.casoLV> getcasoLVs(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _casoLVLocalService.getcasoLVs(start, end);
	}

	/**
	* Returns the number of caso l vs.
	*
	* @return the number of caso l vs
	* @throws SystemException if a system exception occurred
	*/
	public int getcasoLVsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _casoLVLocalService.getcasoLVsCount();
	}

	/**
	* Updates the caso l v in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param casoLV the caso l v
	* @return the caso l v that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.ability.genero.server.model.casoLV updatecasoLV(
		com.ability.genero.server.model.casoLV casoLV)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _casoLVLocalService.updatecasoLV(casoLV);
	}

	/**
	* Updates the caso l v in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param casoLV the caso l v
	* @param merge whether to merge the caso l v with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the caso l v that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.ability.genero.server.model.casoLV updatecasoLV(
		com.ability.genero.server.model.casoLV casoLV, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _casoLVLocalService.updatecasoLV(casoLV, merge);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier() {
		return _casoLVLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_casoLVLocalService.setBeanIdentifier(beanIdentifier);
	}

	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _casoLVLocalService.invokeMethod(name, parameterTypes, arguments);
	}

	public java.util.List<com.ability.genero.server.model.casoLV> findByDespacho(
		java.lang.String despacho)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _casoLVLocalService.findByDespacho(despacho);
	}

	public java.util.List<com.ability.genero.server.model.casoLV> findByDespachoAnhio(
		java.lang.String despacho, java.lang.String anhio)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _casoLVLocalService.findByDespachoAnhio(despacho, anhio);
	}

	public java.util.List<com.ability.genero.server.model.casoLV> findByDespachoAnhioAdmin(
		java.lang.String anhio)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _casoLVLocalService.findByDespachoAnhioAdmin(anhio);
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedService}
	 */
	public casoLVLocalService getWrappedcasoLVLocalService() {
		return _casoLVLocalService;
	}

	/**
	 * @deprecated Renamed to {@link #setWrappedService}
	 */
	public void setWrappedcasoLVLocalService(
		casoLVLocalService casoLVLocalService) {
		_casoLVLocalService = casoLVLocalService;
	}

	public casoLVLocalService getWrappedService() {
		return _casoLVLocalService;
	}

	public void setWrappedService(casoLVLocalService casoLVLocalService) {
		_casoLVLocalService = casoLVLocalService;
	}

	private casoLVLocalService _casoLVLocalService;
}