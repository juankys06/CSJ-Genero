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
 * The utility for the juresprudencia nacional local service. This utility wraps {@link com.ability.genero.server.service.impl.juresprudenciaNacionalLocalServiceImpl} and is the primary access point for service operations in application layer code running on the local server.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author DELL Villartech
 * @see juresprudenciaNacionalLocalService
 * @see com.ability.genero.server.service.base.juresprudenciaNacionalLocalServiceBaseImpl
 * @see com.ability.genero.server.service.impl.juresprudenciaNacionalLocalServiceImpl
 * @generated
 */
public class juresprudenciaNacionalLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.ability.genero.server.service.impl.juresprudenciaNacionalLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the juresprudencia nacional to the database. Also notifies the appropriate model listeners.
	*
	* @param juresprudenciaNacional the juresprudencia nacional
	* @return the juresprudencia nacional that was added
	* @throws SystemException if a system exception occurred
	*/
	public static com.ability.genero.server.model.juresprudenciaNacional addjuresprudenciaNacional(
		com.ability.genero.server.model.juresprudenciaNacional juresprudenciaNacional)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addjuresprudenciaNacional(juresprudenciaNacional);
	}

	/**
	* Creates a new juresprudencia nacional with the primary key. Does not add the juresprudencia nacional to the database.
	*
	* @param id the primary key for the new juresprudencia nacional
	* @return the new juresprudencia nacional
	*/
	public static com.ability.genero.server.model.juresprudenciaNacional createjuresprudenciaNacional(
		int id) {
		return getService().createjuresprudenciaNacional(id);
	}

	/**
	* Deletes the juresprudencia nacional with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the juresprudencia nacional
	* @return the juresprudencia nacional that was removed
	* @throws PortalException if a juresprudencia nacional with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ability.genero.server.model.juresprudenciaNacional deletejuresprudenciaNacional(
		int id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deletejuresprudenciaNacional(id);
	}

	/**
	* Deletes the juresprudencia nacional from the database. Also notifies the appropriate model listeners.
	*
	* @param juresprudenciaNacional the juresprudencia nacional
	* @return the juresprudencia nacional that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static com.ability.genero.server.model.juresprudenciaNacional deletejuresprudenciaNacional(
		com.ability.genero.server.model.juresprudenciaNacional juresprudenciaNacional)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().deletejuresprudenciaNacional(juresprudenciaNacional);
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

	public static com.ability.genero.server.model.juresprudenciaNacional fetchjuresprudenciaNacional(
		int id) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchjuresprudenciaNacional(id);
	}

	/**
	* Returns the juresprudencia nacional with the primary key.
	*
	* @param id the primary key of the juresprudencia nacional
	* @return the juresprudencia nacional
	* @throws PortalException if a juresprudencia nacional with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ability.genero.server.model.juresprudenciaNacional getjuresprudenciaNacional(
		int id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getjuresprudenciaNacional(id);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the juresprudencia nacionals.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of juresprudencia nacionals
	* @param end the upper bound of the range of juresprudencia nacionals (not inclusive)
	* @return the range of juresprudencia nacionals
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ability.genero.server.model.juresprudenciaNacional> getjuresprudenciaNacionals(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getjuresprudenciaNacionals(start, end);
	}

	/**
	* Returns the number of juresprudencia nacionals.
	*
	* @return the number of juresprudencia nacionals
	* @throws SystemException if a system exception occurred
	*/
	public static int getjuresprudenciaNacionalsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getjuresprudenciaNacionalsCount();
	}

	/**
	* Updates the juresprudencia nacional in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param juresprudenciaNacional the juresprudencia nacional
	* @return the juresprudencia nacional that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static com.ability.genero.server.model.juresprudenciaNacional updatejuresprudenciaNacional(
		com.ability.genero.server.model.juresprudenciaNacional juresprudenciaNacional)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updatejuresprudenciaNacional(juresprudenciaNacional);
	}

	/**
	* Updates the juresprudencia nacional in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param juresprudenciaNacional the juresprudencia nacional
	* @param merge whether to merge the juresprudencia nacional with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the juresprudencia nacional that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static com.ability.genero.server.model.juresprudenciaNacional updatejuresprudenciaNacional(
		com.ability.genero.server.model.juresprudenciaNacional juresprudenciaNacional,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .updatejuresprudenciaNacional(juresprudenciaNacional, merge);
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

	public static void clearService() {
		_service = null;
	}

	public static juresprudenciaNacionalLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					juresprudenciaNacionalLocalService.class.getName());

			if (invokableLocalService instanceof juresprudenciaNacionalLocalService) {
				_service = (juresprudenciaNacionalLocalService)invokableLocalService;
			}
			else {
				_service = new juresprudenciaNacionalLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(juresprudenciaNacionalLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated
	 */
	public void setService(juresprudenciaNacionalLocalService service) {
	}

	private static juresprudenciaNacionalLocalService _service;
}