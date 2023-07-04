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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * The utility for the caso l v local service. This utility wraps {@link com.ability.genero.server.service.impl.casoLVLocalServiceImpl} and is the primary access point for service operations in application layer code running on the local server.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author DELL Villartech
 * @see casoLVLocalService
 * @see com.ability.genero.server.service.base.casoLVLocalServiceBaseImpl
 * @see com.ability.genero.server.service.impl.casoLVLocalServiceImpl
 * @generated
 */
public class casoLVLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.ability.genero.server.service.impl.casoLVLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the caso l v to the database. Also notifies the appropriate model listeners.
	*
	* @param casoLV the caso l v
	* @return the caso l v that was added
	* @throws SystemException if a system exception occurred
	*/
	public static com.ability.genero.server.model.casoLV addcasoLV(
		com.ability.genero.server.model.casoLV casoLV)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addcasoLV(casoLV);
	}

	/**
	* Creates a new caso l v with the primary key. Does not add the caso l v to the database.
	*
	* @param id the primary key for the new caso l v
	* @return the new caso l v
	*/
	public static com.ability.genero.server.model.casoLV createcasoLV(int id) {
		return getService().createcasoLV(id);
	}

	/**
	* Deletes the caso l v with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the caso l v
	* @return the caso l v that was removed
	* @throws PortalException if a caso l v with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ability.genero.server.model.casoLV deletecasoLV(int id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deletecasoLV(id);
	}

	/**
	* Deletes the caso l v from the database. Also notifies the appropriate model listeners.
	*
	* @param casoLV the caso l v
	* @return the caso l v that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static com.ability.genero.server.model.casoLV deletecasoLV(
		com.ability.genero.server.model.casoLV casoLV)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().deletecasoLV(casoLV);
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery);
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
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery, start, end);
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
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	public static com.ability.genero.server.model.casoLV fetchcasoLV(int id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchcasoLV(id);
	}

	/**
	* Returns the caso l v with the primary key.
	*
	* @param id the primary key of the caso l v
	* @return the caso l v
	* @throws PortalException if a caso l v with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ability.genero.server.model.casoLV getcasoLV(int id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getcasoLV(id);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
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
	public static java.util.List<com.ability.genero.server.model.casoLV> getcasoLVs(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getcasoLVs(start, end);
	}

	/**
	* Returns the number of caso l vs.
	*
	* @return the number of caso l vs
	* @throws SystemException if a system exception occurred
	*/
	public static int getcasoLVsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getcasoLVsCount();
	}

	/**
	* Updates the caso l v in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param casoLV the caso l v
	* @return the caso l v that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static com.ability.genero.server.model.casoLV updatecasoLV(
		com.ability.genero.server.model.casoLV casoLV)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updatecasoLV(casoLV);
	}

	/**
	* Updates the caso l v in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param casoLV the caso l v
	* @param merge whether to merge the caso l v with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the caso l v that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static com.ability.genero.server.model.casoLV updatecasoLV(
		com.ability.genero.server.model.casoLV casoLV, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updatecasoLV(casoLV, merge);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public static java.lang.String getBeanIdentifier() {
		return getService().getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public static void setBeanIdentifier(java.lang.String beanIdentifier) {
		getService().setBeanIdentifier(beanIdentifier);
	}

	public static java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return getService().invokeMethod(name, parameterTypes, arguments);
	}

	public static java.util.List<com.ability.genero.server.model.casoLV> findByDespacho(
		java.lang.String despacho)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().findByDespacho(despacho);
	}

	public static java.util.List<com.ability.genero.server.model.casoLV> findByDespachoAnhio(
		java.lang.String despacho, java.lang.String anhio)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().findByDespachoAnhio(despacho, anhio);
	}

	public static java.util.List<com.ability.genero.server.model.casoLV> findByDespachoAnhioAdmin(
		java.lang.String anhio)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().findByDespachoAnhioAdmin(anhio);
	}

	public static void clearService() {
		_service = null;
	}

	public static casoLVLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					casoLVLocalService.class.getName());

			if (invokableLocalService instanceof casoLVLocalService) {
				_service = (casoLVLocalService)invokableLocalService;
			}
			else {
				_service = new casoLVLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(casoLVLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated
	 */
	public void setService(casoLVLocalService service) {
	}

	private static casoLVLocalService _service;
}